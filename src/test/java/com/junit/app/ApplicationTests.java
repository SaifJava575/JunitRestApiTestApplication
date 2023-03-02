package com.junit.app;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.junit.app.model.JunitFunctionDeclaration;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
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
		boolean res=JunitFunctionDeclaration.checkIp("192.23.34.0");
		Assert.assertTrue(res);
		Assert.assertTrue("Valid Ip Address", res);
	}
	 
	 @Test
	 @DisplayName("Remove Duplicate Adjacent Character")
	 public void removeDuplicateTest() {
		 String msg=JunitFunctionDeclaration.removeDuplicate("Saifuddin");
		 Assert.assertEquals("Saifuin", msg);
	 }

}
