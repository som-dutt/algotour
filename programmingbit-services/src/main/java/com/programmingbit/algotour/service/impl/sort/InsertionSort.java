package com.programmingbit.algotour.service.impl.sort;

import com.programmingbit.algotour.service.AbstractSort;

/**
 * @author somdutt
 *
 */
public class InsertionSort extends AbstractSort {

	@Override
	public void sort(Integer[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			int key = arr[i];
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}

	}
}
