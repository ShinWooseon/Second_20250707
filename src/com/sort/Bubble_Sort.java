package com.sort;

public class Bubble_Sort {

	public static void main(String[] args) {

		// int型の配列宣言
		int[] k = new int[40];

		// 乱数を利用し、配列を初期化
		for (int i = 0; i < k.length; i++) {
			k[i] = (int) (Math.random() * 100);
		}
		
		// 配列確認用の出力for文
		for (int tmp : k) {
			System.out.printf("%3d", tmp);
		}
		
		System.out.println();

		// roundは配列のサイズ-1分だけ進行
		for (int i = 0; i < k.length - 1; i++) {
			// 各round別、比較回数は配列のサイズから現在のround(i)値とー1を引き算した分だけ比較する
			for (int j = 0; j < k.length - i - 1; j++) {
				// 現在の要素が次の要素より大きい場合、要素の位置を交換する。
				if (k[j] > k[j + 1]) {
					swap(k, j, j + 1);
				}
			}
		}
		
		System.out.println();
		
		// 配列確認用の出力for文
		for (int i = 0; i < k.length; i++) {
			if (i % 5 == 0 && i != 0) {
				System.out.println();
			}
			System.out.printf("%5d", k[i]);
		}
	}

	private static void swap(int[] k, int i, int j) {
		int temp = k[i];
		k[i] = k[j];
		k[j] = temp;
	}
}
