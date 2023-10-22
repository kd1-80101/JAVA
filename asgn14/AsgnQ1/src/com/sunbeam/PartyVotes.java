package com.sunbeam;

public class PartyVotes {
	private String name;
	private int vote;

	public PartyVotes() {

	}

	public PartyVotes(String name, int vote) {
		super();
		this.name = name;
		this.vote = vote;
	}

	@Override
	public String toString() {
		return "PartyVotes [name=" + name + ", vote=" + vote + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVote() {
		return vote;
	}

	public void setVote(int vote) {
		this.vote = vote;
	}

}
