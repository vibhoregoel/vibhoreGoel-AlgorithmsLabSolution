package com.labsession.second_problem;

public class MergeSortDenomination {
	void sort(int denomination[], int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			sort(denomination, low, mid);
			sort(denomination, mid + 1, high);
			merge(denomination, low, mid, high);
		}
	}

	private void merge(int[] denomination, int low, int mid, int high) {
		int i = low;
		int k = low;
		int j = mid + 1;
		int auxarray[] = new int[high + 1];
		while (i <= mid && j <= high) {
			if (denomination[i] < denomination[j]) {
				auxarray[k] = denomination[j];
				k++;
				j++;
			} else {
				auxarray[k] = denomination[i];
				k++;
				i++;
			}
		}
		while (i <= mid) {
			auxarray[k] = denomination[i];
			k++;
			i++;
		}
		while (j <= high) {
			auxarray[k] = denomination[j];
			k++;
			j++;

		}
		for (int p = low; p <= high; p++)
			denomination[p] = auxarray[p];
	}

}
