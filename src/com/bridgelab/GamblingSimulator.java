package com.bridgelab;

import java.util.Scanner;

public class GamblingSimulator {

	static int AMOUNT_OF_STAKE = 100;
	static int BET_AMOUNT = 1;
	static int WON = 1;
	static int LOST = 0;
	static int TOTAL_AMOUNT = 0;
	static int TOTAL_AMOUNT_DIFF_IN_MONTH = 0;

	public static void main(String[] args) {
		System.out.println("---------Welcome To Gambling Simulator---------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Starting amount of stake is " + AMOUNT_OF_STAKE);
		System.out.println("Amount to bet after every play " + BET_AMOUNT);
		for (int i = 1; i <= 20; i++) {
			int InHandcash = AMOUNT_OF_STAKE;
			while (InHandcash > 50 && InHandcash < 150) {
				int play = (int) Math.floor(Math.random() * 10) % 2;
				System.out.println("Gamblers play:" + play);

				switch (play) {
				case 1:
					InHandcash = InHandcash + BET_AMOUNT;
					System.out.println("Total current cash gambler has " + InHandcash);
					break;
				case 0:
					InHandcash = InHandcash - BET_AMOUNT;
					System.out.println("Total current cash gambler has " + InHandcash);
					break;
				default:
					System.out.println("default");
				}
				if (play == 1) {
					System.out.println("Player won the current play");
				} else {
					System.out.println("Player lost the current play");
				}

			}
			if (InHandcash == 150 || InHandcash == 50) {
				System.out.println("Player would like to resign for current day" + i);

			}
			if (InHandcash > 100) {
				int amountWonPerDay = InHandcash - AMOUNT_OF_STAKE;
				System.out.println("Player won day" + i + " RS " + amountWonPerDay);

			} else if (InHandcash < 100) {
				int amountLostPerDay = AMOUNT_OF_STAKE - InHandcash;
				System.out.println("Player lost day" + i + " RS " + amountLostPerDay);

			}
			TOTAL_AMOUNT = TOTAL_AMOUNT + InHandcash;
		}
		System.out.println("Total amount player has after 20 days as per day included = " + TOTAL_AMOUNT + " $");
		TOTAL_AMOUNT_DIFF_IN_MONTH = TOTAL_AMOUNT - AMOUNT_OF_STAKE * 20;
		if (TOTAL_AMOUNT_DIFF_IN_MONTH > 0) {
			System.out.println("Total cash gambler won " + TOTAL_AMOUNT_DIFF_IN_MONTH + " $");
		} else {
			System.out.println("Total cash gambler lost in that month " + TOTAL_AMOUNT_DIFF_IN_MONTH + " $");
		}
	}

}
