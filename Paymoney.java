package com.labsession.first_problem;

public class Paymoney {
	public int num_of_days(int transactions[], int target) {

		for (int i = 0; i < transactions.length; i++) {
			if (transactions[i] > target || transactions[i] == target)
				return i + 1;
			else
				target = target - transactions[i];
		}
		return -1;

		/*
		 * int sum = 0; int i = 0; while (sum < target && i < transactions.length) { sum
		 * = sum + transactions[i]; i++; } if (sum < target) return -1; return i;
		 */

	}

}
