package com.junit.app.test;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junit.app.model.StringCodingQuestion;

public class UnitTestingFile {
	
	@Test
	@DisplayName("Test the methods roman to inetger convertion")
	public void romantoIntegertest() {
		int res=StringCodingQuestion.romanToDecimal("CDLIX");
		Assert.assertEquals(459, res);
	}

}
