package com.programmingbit.algotour;

import com.programmingbit.algotour.service.ISort;
import com.programmingbit.algotour.service.impl.sort.InsertionSort;

public class Client {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {8,1,3,5,9,7,2,0,6};
		ISort sort = new InsertionSort();
		System.out.println("Before:");
		sort.printArray(arr);
		sort.sort(arr);
		System.out.println("After:");
		sort.printArray(arr);
		
	}
}
