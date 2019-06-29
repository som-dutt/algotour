package com.programmingbit.algotour.service.impl.sort;

import com.programmingbit.algotour.service.AbstractSort;

public class QuickSort extends AbstractSort {

	@Override
	public void sort(Integer[] arr) {
		quickSortUtil(arr, 0, arr.length - 1);
	}

	public void quickSortUtil(Integer[] arr, int low, int high) {
		if (low < high) {
			int mid = partition(arr, low, high);
			quickSortUtil(arr, low, mid - 1);
			quickSortUtil(arr, mid + 1, high);
		}
	}

	public int partition(Integer[] arr, int low, int high) {
		int i = 0, j = -1;
		int pivot = high;
		for (; i < high; i++) {
			if (arr[i] <= arr[pivot]) {
				j++;
				swap(arr, i, j);
			}
		}
		swap(arr, j + 1, pivot);
		return j + 1;
	}

	public void swap(Integer[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
