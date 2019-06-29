package com.programmingbit.algotour.service;

/**
 * @author somdutt
 *
 */
public abstract class Sort {

	public abstract void sort(Integer[] arr);

	public void printArray(Integer[] arr) {
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
		//TODO	
	}
}
