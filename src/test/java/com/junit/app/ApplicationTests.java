package com.junit.app;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.junit.app.model.Addition;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void addTest() {
		Assert.assertEquals(30,Addition.add(10, 20));
	}

}
