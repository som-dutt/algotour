package com.programmingbit.algotour.service.impl.sort;

import com.programmingbit.algotour.service.AbstractSort;

public class HeapSort extends AbstractSort {

	@Override
	public void sort(Integer[] arr) {
		buildMaxHeap(arr, arr.length);
		for (int i = arr.length - 1; i >= 0; i--) {
			swap(arr, 0, i);
			maxHeapify(arr, 0, i);
		}
	}

	public void buildMaxHeap(Integer[] arr, int n) {
		for (int i = n / 2 - 1; i >= 0; i--) {
			maxHeapify(arr, i, n);
		}
	}

	public void maxHeapify(Integer[] arr, int i, int n) {
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		if (left < n && arr[left] > arr[largest]) {
			largest = left;
		}
		if (right < n && arr[right] > arr[largest]) {
			largest = right;
		}
		if (largest != i) {
			swap(arr, i, largest);
			maxHeapify(arr, largest, n);
		}
	}

	public void swap(Integer[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
