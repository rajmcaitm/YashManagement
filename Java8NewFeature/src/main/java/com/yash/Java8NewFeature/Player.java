package com.yash.Java8NewFeature;

class Player {

	// private member variables
	private int id;
	private String name;
	private double average;
	private int rank;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", average=" + average + ", rank=" + rank + "]";
	}

	public Player(int id, String name, double average, int rank) {
		super();
		this.id = id;
		this.name = name;
		this.average = average;
		this.rank = rank;
	}

}