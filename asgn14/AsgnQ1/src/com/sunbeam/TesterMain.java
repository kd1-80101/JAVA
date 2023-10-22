package com.sunbeam;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class TesterMain {
	public static int menu(Scanner sc) {
		int choice;
		System.out.println("Menu");
		System.out.println("1.Add New Candidate");
		System.out.println("2.Delete Candidate");
		System.out.println("3.Update Candidate");
		System.out.println("4.Display all Candidates");
		System.out.println("5.Display all Candidates of specific party");
		System.out.println("6.Increment Candidate Votes");
		System.out.println("7.Display Vote Count of all Parties");
		System.out.println("0.Exit");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		CandidateDao cand = new CandidateDao();
		ArrayList<Candidate> list = new ArrayList<Candidate>();
		ArrayList<PartyVotes> list1 = new ArrayList<PartyVotes>();
		int choice = 1;
		int cnt;
		int id;

		do {
			choice = menu(sc);
			switch (choice) {
			case 1:
				cnt = cand.addNewCandidate(sc); // working
				System.out.println("rows uffected :" + cnt);
				break;
			case 2:
				System.out.println("Enter the ID to delete :");
				id = sc.nextInt();
				cnt = cand.deleteCandidateInfo(id); // working
				System.out.println("rows affected :" + cnt);

				break;

			case 3:
				System.out.print("Enter the ID to update : ");
				id = sc.nextInt();
				cnt = cand.updateCandidateInfo(id, sc); // working
				System.out.println("rows affected :" + cnt);

				break;

			case 4:
				list = cand.getAllCandidates();// working
				System.out.println("Displaying All Candidates of all parties :");
				list.forEach(s -> System.out.println(s));
				break;

			case 5:
				System.out.println("Enter party name :");
				String party = sc.next();
				list = cand.getAllCandidatesOfGivenParty(party); // working
				System.out.println("Displaying All Candidates of given party :");
				list.forEach(s -> System.out.println(s));

				break;

			case 6:
				System.out.println("Enter Candidate ID to increment Vote");
				id = sc.nextInt();
				cnt = cand.incrementCandidateVotes(id);
				System.out.println("rows affected :" + cnt);
				break;

			case 7:
				System.out.println("Displaying Total of votes of all parties");
				list1 = cand.getPartywiseVoteCount();
				list1.forEach(s -> System.out.println(s));

				break;

			case 0:
				System.out.println("THANKS FOR USING OUR APPLICATION...:)");
				break;

			default:
				System.out.println("Wrong Choice");
				break;
			}
		} while (choice != 0);

	}

}
