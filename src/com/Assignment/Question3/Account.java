package com.Assignment.Question3;

public class Account implements OnlineAccount, Comparable<Account> {
	
	private int noOfRegularMovies;
	private int noOfExclusiveMovies;
	private String ownerName;
	

	public Account(int noOfRegularMovies, int noOfExclusiveMovies, String ownerName) {
		super();
		this.noOfRegularMovies = noOfRegularMovies;
		this.noOfExclusiveMovies = noOfExclusiveMovies;
		this.ownerName = ownerName;
	}
	
	public int monthlyCost() {
		return (basePrice + (this.noOfRegularMovies*regularMoviePrice) + (this.noOfExclusiveMovies*exclusiveMoviePrice));
	}


	@Override
	public String toString() {
		return "Owner is "+this.ownerName+" and Monthly Cost is "+this.monthlyCost()+" USD";
	}

	@Override
	public int compareTo(Account acc) {
		return this.monthlyCost() - acc.monthlyCost();
	}

}
