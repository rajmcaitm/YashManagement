package com.yash.tech;

import java.util.Arrays;

class SplitArrayIntoSubArr {
	public static void main(String[] args) {

		int[] original = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int splitSize = 3;

		/*
		 * expected Output [0, 1, 2] [3, 4, 5] [6, 7, 8] [9]
		 */
		int[][] finaArray = splitArray(original, splitSize);
		for (int i = 0; i < finaArray.length; i++) {
			System.err.println(Arrays.toString(finaArray[i]));
		}
	}

	public static int[][] splitArray(int[] arrayToSplit, int chunkSize) {
		if (chunkSize <= 0) {
			return null;
		}

		int rest = arrayToSplit.length % chunkSize;
		int chunks = arrayToSplit.length / chunkSize + (rest > 0 ? 1 : 0);
		int[][] arrays = new int[chunks][];
		for (int i = 0; i < (rest > 0 ? chunks - 1 : chunks); i++) {
			arrays[i] = Arrays.copyOfRange(arrayToSplit, i * chunkSize, i * chunkSize + chunkSize);
		}
		if (rest > 0) {
			arrays[chunks - 1] = Arrays.copyOfRange(arrayToSplit, (chunks - 1) * chunkSize, (chunks - 1) * chunkSize + rest);
		}
		return arrays;
	}
}
