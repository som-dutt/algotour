package com.programmingbit.algotour.service.impl.sort;

import com.programmingbit.algotour.service.AbstractSort;

public class MergeSort extends AbstractSort {

	@Override
	public void sort(Integer[] arr) {
		mergeSortUtil(arr, 0, arr.length - 1);
	}

	public void mergeSortUtil(Integer[] arr, int low, int high) {
		if (low < high) {
			int mid = low + (high - low) / 2;
			mergeSortUtil(arr, low, mid);
			mergeSortUtil(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}

	public void merge(Integer[] arr, int low, int mid, int high) {
		int n1 = mid - low + 1;
		int n2 = high - mid;
		Integer[] left = new Integer[n1];
		Integer[] right = new Integer[n2];
		for (int i = 0; i < n1; i++) {
			left[i] = arr[low + i];
		}
		for (int j = 0; j < n2; j++) {
			right[j] = arr[mid + j + 1];
		}
		int i = 0, j = 0, k = low;
		while (i < n1 && j < n2) {
			if (left[i] < right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
			}
		}
		while (i < n1) {
			arr[k++] = left[i++];
		}
		while (j < n2) {
			arr[k++] = right[j++];
		}
	}

}
