package com.qa.learningselenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTestTwo {
	
	@Test
	public void differentGroupFirstTest() {
		System.out.println("Different group test");
	}
	
	@Test(groups = "functional")
	public void differentGroupSecondTest() {
		System.out.println("Different group second test");
	}

}
