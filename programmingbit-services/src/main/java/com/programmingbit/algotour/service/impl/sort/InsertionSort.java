package com.programmingbit.algotour.service.impl.sort;

import com.programmingbit.algotour.service.Sort;

/**
 * @author somdutt
 *
 */
public class InsertionSort extends Sort {

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
	
	public static void main(String[] args) {
		InsertionSort sort = new InsertionSort();
		Integer[] arr = new Integer[]{3,8,9,1,3,4,7};
		sort.printArray(arr);
		sort.sort(arr);
		sort.printArray(arr);
	}

}
