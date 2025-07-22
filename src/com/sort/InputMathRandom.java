package com.sort;

public class InputMathRandom {
	public static int[] arr;
	public InputMathRandom(int num) {
		// int型の配列宣言
		 arr = new int[num];

		// 乱数を利用し、配列を初期化
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}

		// 配列確認用の出力for文
		System.out.print("整列前 : ");
		for (int tmp : arr) {
			System.out.printf("%3d", tmp);
		}

		System.out.println();

	}
}
