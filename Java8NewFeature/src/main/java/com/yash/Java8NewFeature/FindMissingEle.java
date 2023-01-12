package com.yash.Java8NewFeature;

public class FindMissingEle {

	public static void main(String[] args) {

		int arr[] = { 10, 7, 1, 2, 4, 11, 5, 6, 9, 3, 12 };
		int length = arr.length;
		findMissing(arr, length);
        System.out.println(getMissingNo(arr, length));

	}

	// Function to find the missing number
	public static void findMissing(int arr[], int length) {
		int temp[] = new int[length + 1];
		for (int i = 0; i <= length; i++) {
			temp[i] = 0;
		}

		for (int i = 0; i < length; i++) {
			temp[arr[i] - 1] = 1;
		}

		int ans = 0;
		for (int i = 0; i <= length; i++) {
			if (temp[i] == 0)
				ans = i + 1;
		}
		System.out.println(ans);
	}
	
	
	//Second approach // Function to find the missing number
    public static int getMissingNo(int[] nums, int n)
    {
        int sum = ((n + 1) * (n + 2)) / 2;
        for (int i = 0; i < n; i++)
            sum -= nums[i];
        return sum;
    }
}
