package com.java8.problems.hackerank;

import java.util.Comparator;

public class PlayerCheckerComparator {
}
class Player {

	int score;
	String name;

	Player(String name, int score){
		this.name = name;
		this.score = score;
	}

}
class Checker implements Comparator<Player> {

	@Override
	public int compare(Player p1, Player p2) {

		if (p1.score == p2.score) {
			return p1.name.compareTo(p2.name);
		} else if (p1.score < p2.score) {
			return -1;
		} else {
			return 1;
		}
	}
}