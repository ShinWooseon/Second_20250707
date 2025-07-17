package com.sort;

public class Selection_Sort {

	public static void main(String[] args) {
		int[] arr = new int[20];
		// math.radom()メソッドを利用、擬似乱数をarr配列に入力
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 40);
		}

		System.out.print("整列前 :");
		for (int temp : arr) {
			System.out.printf("%3d", temp);
		}

		for (int i = 0; i < arr.length - 1; i++) {
			int minIdx = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			}
			swap(arr, i, minIdx);
		}
		System.out.println();
		System.out.print("整列前 :");
		for (int temp : arr) {
			System.out.printf("%3d", temp);
		}
	}

	private static void swap(int[] k, int i, int j) {
		int temp = k[i];
		k[i] = k[j];
		k[j] = temp;
	}

}
