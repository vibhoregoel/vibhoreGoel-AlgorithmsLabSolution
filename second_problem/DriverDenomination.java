package com.labsession.second_problem;

import java.util.Scanner;

public class DriverDenomination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denomination");
		int size = sc.nextInt();
		int denomination[] = new int[size];
		System.out.println();
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			denomination[i] = sc.nextInt();
		}
		System.out.println();
		MergeSortDenomination msd = new MergeSortDenomination();
		msd.sort(denomination, 0, size - 1);
		System.out.println("Enter the amount you want to pay");
		int amt = sc.nextInt();
		Currency cy = new Currency();
		cy.numOfDenominations(denomination, amt);

		sc.close();
	}

}
