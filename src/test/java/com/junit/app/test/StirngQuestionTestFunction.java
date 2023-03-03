package com.junit.app.test;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junit.app.model.StringCodingQuestion;

public class StirngQuestionTestFunction {

	
	@Test
	@DisplayName("Roatate String Test Function")
	public void rotateStringTest() {
		boolean res=StringCodingQuestion.isRotated("amazon", "azonam");
		Assert.assertTrue(res);
	}
}
