package com.kh.run;

public class BubbleSortRun {

	public static void main(String[] args) {
		int[] arr = { 22, 30, 68, 1, 13, 87, 99 };
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {// 사이클이 돌아가는 for문
			for (int j = 1; j < arr.length; j++) {// 자기들끼리 들어가는 for문
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
