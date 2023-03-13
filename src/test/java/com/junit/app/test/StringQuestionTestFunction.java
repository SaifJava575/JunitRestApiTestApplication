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
		boolean res=StringCodingQuestion.isRotated("amazon", "azonam");
		Assert.assertTrue(res);
	}
	
	@Test
	@DisplayName("Addition Test Methods")
	public void addTest() {
		Assert.assertEquals(30,JunitFunctionDeclaration.add(10, 20));
	}
	
	@Test
	@DisplayName(" Longest Common Substring Test methods")
	public void testLongestCommonSubstring() {
		Assert.assertEquals(4, JunitFunctionDeclaration.longestCommonSubstr("ABCDGH", "ACDGHR"));	
	}
	 @Test
	 @DisplayName("IP Check Test Api Function")
	public void ipCheckTest() {
		boolean res=JunitFunctionDeclaration.checkIp("0.0.34.0");
		Assert.assertTrue(res);
		Assert.assertTrue("Valid Ip Address", res);
	}
	 
	 @Test
	 @DisplayName("Remove Duplicate Adjacent Character")
	 public void removeDuplicateTest() {
		 String msg=JunitFunctionDeclaration.removeDuplicate("Saifuddin");
		 Assert.assertEquals("Saifuin", msg);
	 }
	 
	 @Test
	 @DisplayName("Non repeating charater Junit Testing Methods")
	 public void nonRepeatingChar() {
		 String actualRes=StringCodingQuestion.nonRepeatingCharater("hellow");
		 Assert.assertEquals("h", actualRes);
	 }
	 
	 @Test
	 @DisplayName("Multiply Two String methods test")
	 public void multiplyTest() {
		 String res=StringCodingQuestion.multiplyTwoString("33", "10");
		 Assert.assertEquals("330", res);
	 }
	 
	 @Test
	 @DisplayName("Implement Two String strstr function test")
	 public void strstrTest() {
		 int res=StringCodingQuestion.strstr("GeeksForGeeks", "For");
		 Assert.assertEquals(5, res);
	 }
	 
	 @Test
	 @DisplayName("Test the Factorial number test")
	 public void factorialTest() {
		 int res=StringCodingQuestion.fact(4);
		 Assert.assertEquals(24, res);
	 }
	 
	 @Test
	 @DisplayName(" Convrert Roman to Integer number Testing methods ")
	 public void romanToInteger() {
		 int res=StringCodingQuestion.romanToDecimal("CDLIX");
		 Assert.assertEquals(459, res);
	 }
	 
	 @Test
	 @DisplayName("Check the valid Substring length function test")
	 public void validSubstring() {
		 int res=StringCodingQuestion.findMaxLen("()(())");
		 Assert.assertEquals(6, res);
	 }
	 
	 @Test
	 @DisplayName("Iso morphic String function Test")
	 public void isomorphicString() {
		 boolean actualResult=StringCodingQuestion.areIsomorphic("aab", "xxy");
		 Assert.assertTrue(actualResult);
		 Assert.assertTrue("Two String are isomorphic", actualResult);
	 }
	 
	 @Test
	 @DisplayName("Remove Duplicate Character Function Test..........")
	 public void removeDuplicateCharacterTest() {
		 String actualRes=StringCodingQuestion.removeDuplicate("saifuddin");
		 Assert.assertEquals("saifudn",actualRes);
	 }
	 
	 @Test
	 @DisplayName("Longest SubString Distinct Character Function Unit Testing")
	 public void longestDistinctSubString() {
		 int actualRes=StringCodingQuestion.longestSubstrDistinctChars("geeksforgeeks");
		 Assert.assertEquals(7, actualRes);
	 }
	 
	 @Test
	 @DisplayName("Longest Prefix and Suffix length test")
	 public void lspTest() {
		 int actualRes=StringCodingQuestion.lps("saifudsai");
		 Assert.assertEquals(3, actualRes);
	 }
	 
	 @Test
	 @DisplayName("Two String check rotation Test")
	 public void rotationTest() {
		 boolean actualResult=StringCodingQuestion.areRotations("geeksforgeeks", "geeksforgeeks");
		 Assert.assertTrue(actualResult);
	 }
	 
}
