package com.sunbeam;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class CandidateDao implements AutoCloseable {
	private Connection conn;

	public CandidateDao() throws SQLException {
		conn = DbUtil.getConnection();
	}

	@Override
	public void close() {
		if (conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

	// add new candidate
	public int addNewCandidate(String name, String pname, int votes) throws SQLException {
		String sql = "insert into candidates values(default,?,?,?)";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			
			stmt.setString(1, name);
			stmt.setString(2, pname);
			stmt.setInt(3, votes);
			int cnt = stmt.executeUpdate();
			return cnt;
		}

	}

	// update given candidate
	public int updateCandidateInfo(int candidateId, Scanner sc) throws SQLException {
		String sql = "update candidates set name=?, party=? where id=?";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			System.out.println("Enter information of candidate to add:");
			System.out.println("Enter the name :");
			String name = sc.next();
			System.out.println("Enter the  party name :");
			String pname = sc.next();
			stmt.setString(1, name);
			stmt.setString(2, pname);
			stmt.setInt(3, candidateId);
			int cnt = stmt.executeUpdate();
			return cnt;
		}

	}

	// delete given candidate
	public int deleteCandidateInfo(int candidateID) throws SQLException {
		String sql = "delete from candidates where id=?";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, candidateID);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}

	// get all candidates
	public ArrayList<Candidate> getAllCandidates() throws SQLException {
		ArrayList<Candidate> list = new ArrayList<Candidate>();
		String sql = "select * from candidates ";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int votes = rs.getInt("votes");
					Candidate c = new Candidate(id, name, party, votes);
					list.add(c);
				}
			}
		}
		return list;
	}

// increment candidate votes
	public int incrementCandidateVotes(int candidateId) throws SQLException {
		String sql = "update candidates set votes=votes+1 where id=?";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, candidateId);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}

	// get all candidates of given party
	public ArrayList<Candidate> getAllCandidatesOfGivenParty(String wantedParty) throws SQLException {
		ArrayList<Candidate> list = new ArrayList<Candidate>();
		String sql = "select * from candidates where party=?";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, wantedParty);
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int votes = rs.getInt("votes");
					Candidate c = new Candidate(id, name, party, votes);
					list.add(c);
				}
			}
			return list;
		}
	}

	// get partywise vote count
	public ArrayList<PartyVotes> getPartywiseVoteCount() throws SQLException {
		ArrayList<PartyVotes> list = new ArrayList<PartyVotes>();
		String sql = "select party,sum(votes) totalvotes from candidates group by party";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					String pname = rs.getString("party");
					int votes = rs.getInt("totalvotes");
					PartyVotes p = new PartyVotes(pname, votes);
					list.add(p);
				}
			}
			return list;
		}
	}
}
