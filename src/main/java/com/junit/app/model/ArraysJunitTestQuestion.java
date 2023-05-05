package com.junit.app.model;

public class ArraysJunitTestQuestion {

	public static long maxSubarraySum(int arr[], int n) {
		long max = Long.MIN_VALUE;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += (long) arr[i];
			if (sum > max)
				max = sum;

			if (sum < 0)
				sum = 0;
		}
		return max;
	}
	
	public static int minJumps(int[] arr) {
		int n = arr.length;
		int count = 0;
		for (int i = 1; i < n; i++)
			arr[i] = Math.max(arr[i] + i, arr[i - 1]);

		int i = 0;
		while (i < n - 1) {
			if (arr[i] <= i)
				return -1;
			i = arr[i];
			count++;
		}
		return count;
	}

}
