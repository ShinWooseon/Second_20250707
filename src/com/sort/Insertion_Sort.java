package com.sort;

import java.util.*;

public class Insertion_Sort {

	public static void main(String[] args) {
		InputMathRandom im = new InputMathRandom(40);
		int[] arr = im.arr;

		for (int i = 1; i < arr.length; i++) {
			int tmp = arr[i];
			int j = i - 1;
			while (j >= 0 && tmp < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = tmp;
		}
		
		System.out.print("整列後 : ");
		for (int tmp : arr) {
			System.out.printf("%3d", tmp);
		}

		
	}

}
