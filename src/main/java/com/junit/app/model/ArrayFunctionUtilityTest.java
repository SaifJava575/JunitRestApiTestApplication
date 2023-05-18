package com.junit.app.model;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ArrayFunctionUtilityTest {
	
	public static int kthSmallest(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++)
			pq.add(arr[i]);
		for (int i = 1; i < k; i++)
			pq.poll();
		return pq.poll();
	}
	
	public static int majorityElement(int arr[], int size) {
		int max = size / 2, ans = -1;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < size; i++) {
			if (map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i]) + 1);
			else
				map.put(arr[i], 1);
			if (max < map.get(arr[i])) {
				max = map.get(arr[i]);
				ans = arr[i];
			}
		}
		return ans;
	}
	
	public static int maxProduct(int[] arr, int n) {
		int maxLeft = 1, maxRight = 1;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (maxLeft == 0)
				maxLeft = 1;
			if (maxRight == 0)
				maxRight = 1;
			maxLeft *= arr[i];
			maxRight *= arr[n - 1 - i];
			max = Math.max(max, Math.max(maxLeft, maxRight));
		}
		return max;
	}

}
