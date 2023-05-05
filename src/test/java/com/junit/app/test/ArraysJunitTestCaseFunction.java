package com.junit.app.test;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junit.app.model.ArraysJunitTestQuestion;

public class ArraysJunitTestCaseFunction {

	@Test
	@DisplayName("MaxMum SUmSubArray Sum Function Test")
	public void maxSumSubArraysTest() {
		int Arr[] = { 1, 2, 3, -2, 5 };
		long actual = ArraysJunitTestQuestion.maxSubarraySum(Arr, Arr.length);
		Assert.assertEquals(9, actual);
		Assert.assertNotEquals(8, actual);

	}
	
	@Test
	@DisplayName("Min Jumps  Function Test")
	public void minJumpsTest() {
		int Arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} ;
		long actual = ArraysJunitTestQuestion.minJumps(Arr);
		Assert.assertEquals(3, actual);
		Assert.assertNotEquals(8, actual);

	}

}
