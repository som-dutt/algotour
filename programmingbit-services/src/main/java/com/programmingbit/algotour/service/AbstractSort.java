package com.programmingbit.algotour.service;

/**
 * @author somdutt
 *
 */
public abstract class AbstractSort implements ISort {

	@Override
	public void printArray(Integer[] arr) {
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}
