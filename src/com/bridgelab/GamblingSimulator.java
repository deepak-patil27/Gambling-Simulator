package com.bridgelab;

public class GamblingSimulator {
	static double INITIAL_STAKE = 100;
	static double STAKE_BET = 1;
	public static int stake = 0;

	public static void winOrLose() {

		if (Math.random() < 0.5) {
			INITIAL_STAKE++;
			System.out.println("\nPlayer Win");
			;
		} else {
			INITIAL_STAKE--;
			System.out.println("\nPlayer Lose");

		}
	}

	public static void main(String[] args) {
		System.out.println("---------Welcome To Gambling Simulator---------");
		System.out.println();
		System.out.println("Amount of stake is -> " + INITIAL_STAKE);
		System.out.println("Amount to bet after every game -> " + STAKE_BET);
		winOrLose();
		System.out.println("\nAvailable Amount of Stake -> " + INITIAL_STAKE );

	}
}
