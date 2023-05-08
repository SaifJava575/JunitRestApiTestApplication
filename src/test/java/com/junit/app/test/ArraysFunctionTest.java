package com.junit.app.test;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junit.app.model.ArrayFunctionUtilityTest;

public class ArraysFunctionTest {

	@Test
	@DisplayName("Kth Smallest Element Test")
	public void kthSmallestElementTest() {
		int arr[] = { 7, 10, 4, 3, 20, 15 };
		int actual = ArrayFunctionUtilityTest.kthSmallest(arr, 3);
		Assert.assertEquals(7, actual);
	}
	
	@Test
	@DisplayName("Majority  Element Test")
	public void majorityElementTest() {
		int A[] = { 3, 1, 3, 3, 2 };
		int actual = ArrayFunctionUtilityTest.majorityElement(A, A.length);
		Assert.assertEquals(3, actual);
	}
}
