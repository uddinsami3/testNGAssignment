package com.testng.testcases;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.testng.assignment.Calculator;

public class TestCase3_Parameters {
	@Test(enabled = true, groups = { "inverse", "calculator" })
	@Parameters("n1")
	public void inverseTest(@Optional("3") String n1) {
// int n1 = Integer.parseInt(n1);
		double result = Calculator.inverse(Integer.parseInt(n1));
		Assert.assertEquals(result, (double)1 / Integer.parseInt(n1));
		Assert.assertTrue(result == (double)1 / Integer.parseInt(n1), "Values did not match");
		System.out.println("inverse is " + result);
// Reporter.log("The test case has failed");
	}
	
	@Test(enabled = true, groups = { "inverse", "calculator" })
	@Parameters("n1")
	public void negateTest(@Optional("3") String n1) {
// int n1 = Integer.parseInt(n1);
		int result = Calculator.negate(Integer.parseInt(n1));
		Assert.assertEquals(result, (-1) * Integer.parseInt(n1));
		System.out.println("negate is " + result);
// Reporter.log("The test case has failed");
	}
}
