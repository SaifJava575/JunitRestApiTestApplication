package com.junit.app.test;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junit.app.model.JunitFunctionDeclaration;
import com.junit.app.model.StringCodingQuestion;

public class StringQuestionTestFunction {

	@Test
	@DisplayName("Roatate String Test Function")
	public void rotateStringTest() {
		boolean res = StringCodingQuestion.isRotated("amazon", "azonam");
		Assert.assertTrue(res);
	}

	@Test
	@DisplayName("Addition Test Methods")
	public void addTest() {
		Assert.assertEquals(30, JunitFunctionDeclaration.add(10, 20));
	}

	@Test
	@DisplayName(" Longest Common Substring Test methods")
	public void testLongestCommonSubstring() {
		Assert.assertEquals(4, JunitFunctionDeclaration.longestCommonSubstr("ABCDGH", "ACDGHR"));
	}

	@Test
	@DisplayName("IP Check Test Api Function")
	public void ipCheckTest() {
		boolean res = JunitFunctionDeclaration.checkIp("0.0.34.0");
		Assert.assertTrue(res);
		Assert.assertTrue("Valid Ip Address", res);
	}

	@Test
	@DisplayName("Remove Duplicate Adjacent Character")
	public void removeDuplicateTest() {
		String msg = JunitFunctionDeclaration.removeDuplicate("Saifuddin");
		Assert.assertEquals("Saifuin", msg);
	}

	@Test
	@DisplayName("Non repeating charater Junit Testing Methods")
	public void nonRepeatingChar() {
		String actualRes = StringCodingQuestion.nonRepeatingCharater("hellow");
		Assert.assertEquals("h", actualRes);
	}

	@Test
	@DisplayName("Multiply Two String methods test")
	public void multiplyTest() {
		String res = StringCodingQuestion.multiplyTwoString("33", "10");
		Assert.assertEquals("330", res);
	}

	@Test
	@DisplayName("Implement Two String strstr function test")
	public void strstrTest() {
		int res = StringCodingQuestion.strstr("GeeksForGeeks", "For");
		Assert.assertEquals(5, res);
	}

	@Test
	@DisplayName("Test the Factorial number test")
	public void factorialTest() {
		int res = StringCodingQuestion.fact(4);
		Assert.assertEquals(24, res);
	}

	@Test
	@DisplayName(" Convrert Roman to Integer number Testing methods ")
	public void romanToInteger() {
		int res = StringCodingQuestion.romanToDecimal("CDLIX");
		Assert.assertEquals(459, res);
	}

	@Test
	@DisplayName("Check the valid Substring length function test")
	public void validSubstring() {
		int res = StringCodingQuestion.findMaxLen("()(())");
		Assert.assertEquals(6, res);
	}

	@Test
	@DisplayName("Iso morphic String function Test")
	public void isomorphicString() {
		boolean actualResult = StringCodingQuestion.areIsomorphic("aab", "xxy");
		Assert.assertTrue(actualResult);
		Assert.assertTrue("Two String are isomorphic", actualResult);
	}

	@Test
	@DisplayName("Remove Duplicate Character Function Test..........")
	public void removeDuplicateCharacterTest() {
		String actualRes = StringCodingQuestion.removeDuplicate("saifuddin");
		Assert.assertEquals("saifudn", actualRes);
	}

	@Test
	@DisplayName("Longest SubString Distinct Character Function Unit Testing")
	public void longestDistinctSubString() {
		int actualRes = StringCodingQuestion.longestSubstrDistinctChars("geeksforgeeks");
		Assert.assertEquals(7, actualRes);
	}

	@Test
	@DisplayName("Longest Prefix and Suffix length test")
	public void lspTest() {
		int actualRes = StringCodingQuestion.lps("saifudsai");
		Assert.assertEquals(3, actualRes);
	}

	@Test
	@DisplayName("Two String check rotation Test")
	public void rotationTest() {
		boolean actualResult = StringCodingQuestion.areRotations("geeksforgeeks", "geeksforgeeks");
		Assert.assertTrue(actualResult);
	}

	@Test
	@DisplayName("Test the Longest Repeating Sub String ")
	public void test_LongestRepeatingharacter() {
		int length = StringCodingQuestion.LongestRepeatingSubsequence("axxxy");
		Assert.assertEquals(2, length);
	}

	@Test
	@DisplayName("Test the longest Valid Parenthesis ")
	public void maxlength() {
		int actualRes = StringCodingQuestion.maxLength("(()()(");
		Assert.assertEquals(4, actualRes);
	}

	@Test
	@DisplayName("Test the largest Number Function")
	public void test_largestNumber() {
		String actualResult = StringCodingQuestion.largestNumber("1234567");
		Assert.assertEquals("7654321", actualResult);
	}

	@Test
	@DisplayName(" K unique Character SubString Test")
	public void longestKuniqCharacter() {
		int actualResult = StringCodingQuestion.longestkSubstr("aabacbebebe", 3);
		Assert.assertEquals(7, actualResult);
	}

	@Test
	@DisplayName("First Repeat Character test Function")
	public void test_ReeatChar() {
		String str = StringCodingQuestion.firstRepChar("geeksforgeeks");
		Assert.assertEquals("e", str);
	}

	@Test
	@DisplayName("Second Repeat Character Test Function")
	public void second_repeat_String_Test() {
		String arr[] = { "geek", "for", "geek", "for", "geek", "aaa" };
		int n = arr.length;
		String actualRes = StringCodingQuestion.secFrequent(arr, n);
		Assert.assertEquals("for", actualRes);
	}

	@Test
	@DisplayName("Test The binary SubString Function")
	public void test_binary_SubString() {
		int actualRes = StringCodingQuestion.binarySubstring(5, "01101");
		Assert.assertEquals(3, actualRes);
	}

	@Test
	@DisplayName("Test the Remove Consective Character Function")
	public void test_remove_character() {
		String actualRes = StringCodingQuestion.removeConsecutiveCharacter("aaabbbaaaaaaaaac");
		Assert.assertEquals("abac", actualRes);
	}

}
