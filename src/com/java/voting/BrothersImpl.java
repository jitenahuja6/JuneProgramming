package com.java.voting;

import java.util.ArrayList;
import java.util.Scanner;

public class BrothersImpl {
	public static void main(String[] args) {

		ArrayList<Brothers> bro = new ArrayList<Brothers>();
		bro.add(new Brothers("Sibu", 27));
		bro.add(new Brothers("Toton", 25));
		bro.add(new Brothers("Navin", 29));
		System.out.println("Please enter your name");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		Brothers b = null;
		for (Brothers bros : bro) {
			if (bros.getName().equalsIgnoreCase(name)) {
				b = bros;
				break;
			}
		}
		if (b != null) {
			boolean k = true;
			while (k != false) {
				System.out.println("Please enter yes or no to vote");
				String response = sc.nextLine();
				switch (response.toLowerCase()) {
				case "yes":
					System.out.println("Thanks for Voting");
					k = false;
					break;
				case "no":
					System.out.println("User decided not to vote");
					k = false;
					break;
				default:
					System.out.println("Wrong choice ! Please enter yes or no");
				}

			}

		} else {
			System.out.println("You cant vote as your name is not in voting listfdfdf");
		}
	}
}
