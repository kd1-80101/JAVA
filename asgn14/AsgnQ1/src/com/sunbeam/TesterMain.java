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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CandidateDao cand;
		ArrayList<Candidate> list = new ArrayList<Candidate>();
		ArrayList<PartyVotes> list1 = new ArrayList<PartyVotes>();
		int choice = 1;
		int cnt;
		int id;

		do {
			choice = menu(sc);
			switch (choice) {
			case 1:
				try {

					cand = new CandidateDao();
					System.out.println("Enter information of candidate to add:");
					System.out.println("Enter the name :");
					String name = sc.next();
					System.out.println("Enter the  party name :");
					String pname = sc.next();
					System.out.println("Enter the number of votes :");
					int votes = sc.nextInt();
					cnt = cand.addNewCandidate(name,pname,votes); // working
					System.out.println("rows uffected :" + cnt);
				} catch (Exception e) {

					e.printStackTrace();
				}
				break;
			case 2:
				try {

					cand = new CandidateDao();
					System.out.println("Enter the ID to delete :");
					id = sc.nextInt();
					cnt = cand.deleteCandidateInfo(id); // working
					System.out.println("rows affected :" + cnt);
				} catch (Exception e) {

					e.printStackTrace();
				}
				break;

			case 3:
				try {

					cand = new CandidateDao();
					System.out.print("Enter the ID to update : ");
					id = sc.nextInt();
					cnt = cand.updateCandidateInfo(id, sc); // working
					System.out.println("rows affected :" + cnt);
				} catch (Exception e) {

					e.printStackTrace();
				}
				break;

			case 4:
				try {

					cand = new CandidateDao();
					list = cand.getAllCandidates();// working
					System.out.println("Displaying All Candidates of all parties :");
					list.forEach(s -> System.out.println(s));
				} catch (Exception e) {

					e.printStackTrace();
				}
				break;

			case 5:
				try {

					cand = new CandidateDao();
					System.out.println("Enter party name :");
					String party = sc.next();
					list = cand.getAllCandidatesOfGivenParty(party); // working
					System.out.println("Displaying All Candidates of given party :");
					list.forEach(s -> System.out.println(s));
				} catch (Exception e) {

					e.printStackTrace();
				}
				break;

			case 6:
				try {

					cand = new CandidateDao();
					System.out.println("Enter Candidate ID to increment Vote");
					id = sc.nextInt();
					cnt = cand.incrementCandidateVotes(id);
					System.out.println("rows affected :" + cnt);
				} catch (Exception e) {

					e.printStackTrace();
				}
				break;

			case 7:
				try {
					cand = new CandidateDao();
					System.out.println("Displaying Total of votes of all parties");
					list1 = cand.getPartywiseVoteCount();
					list1.forEach(s -> System.out.println(s));
				} catch (Exception e) {

					e.printStackTrace();
				}

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
