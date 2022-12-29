package com.yash.Java8;

import java.util.Arrays;
import java.util.Scanner;

public class MedianQuery {

    public static void main(String args[] ) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number N");
        int N = scanner.nextInt();
        

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the number Q");
        int Q = scanner.nextInt();
       

        while (Q > 0) {
            int L = scanner.nextInt();
            int R = scanner.nextInt();
            System.out.println(findMedianOfSubArray(arr, L, R));
            Q--;
        }
    }

    private static int findMedianOfSubArray(int[] arr, int L, int R) {
        int[] temp = new int[R - L + 1];
        int j = 0;
        for (int i = L - 1; i < R; i++) {
            temp[j] = arr[i];
            j++;
        }

        Arrays.sort(temp);

        return temp[(temp.length - 1) / 2];
    }
}