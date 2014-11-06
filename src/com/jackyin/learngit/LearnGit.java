package com.jackyin.learngit;

public class LearnGit {
	private int mushroom = 0;
	
	public LearnGit(int mushroom) {
		this.mushroom = mushroom;
	}
	
	public static void main(String[] args) {
	  System.out.println("I'm learning Git!");
	  LearnGit learnGit = new LearnGit(3);
	  System.out.println("mushroom = " + learnGit.mushroom);
  }
}
