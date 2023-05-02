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
	@DisplayName("Test The vowel reverse of String")
	public void vowelReverseOfString() {
		Assert.assertEquals("Sehol", StringCodingQuestion.modify("Sohel"));
		Assert.assertEquals("Siufiddan", StringCodingQuestion.modify("Saifuddin"));
		Assert.assertNotEquals("Saifiddan", StringCodingQuestion.modify("Saifuddin"));
		Assert.assertNotSame("Sujan", StringCodingQuestion.modify("Saifuddin"));
		Assert.assertNotNull(StringCodingQuestion.modify("Sujan"));
		
	}
}
