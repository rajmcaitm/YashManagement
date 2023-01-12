package com.yash.streamApi;

import java.util.HashMap;
import java.util.TreeMap;

public class PrintAllPairsWithDiffK {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 2, 5, 4, 3, 1 };
		int key = 2;
		System.out.println(printAllPairsWithDiffKey(arr, key));
		System.out.println(printAllPairsWithDiffKeyEle(arr, key));
	}

	private static int printAllPairsWithDiffKey(int[] arr, int key) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] - arr[j] == key) {
					count++;
				}
			}

		}
		return count;
	}

	private static HashMap<Integer, Integer> printAllPairsWithDiffKeyEle(int[] arr, int key) {
		HashMap<Integer, Integer> map = new HashMap<>();
		TreeMap<Integer, Integer> treemap = new TreeMap<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] - arr[j] == key || arr[j] - arr[i] == key) {
					map.put(arr[i], arr[j]);
					
				}
			}

		}
		return map;
	}

}
