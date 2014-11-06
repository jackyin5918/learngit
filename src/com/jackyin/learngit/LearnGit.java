package com.jackyin.learngit;

public class LearnGit {
	private int mushroomA = 0;
	
	public LearnGit(int mushroom) {
		this.mushroomA = mushroom;
	}
	
	public static void main(String[] args) {
	  System.out.println("I'm learning Git!");
	  LearnGit learnGit = new LearnGit(3);
	  System.out.println("mushroom = " + learnGit.mushroomA);
  }
}
