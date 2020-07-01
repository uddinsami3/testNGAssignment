package com.testng.testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.testng.assignment.Calculator;
import com.testng.assignment.TestData;

public class TestCase1_DataProvider {
//static int n1 = 3;
//static int n2 = 5;
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * additionTest(3 , 5); }
	 */
	@Test(enabled = true, groups = { "add",
			"calculator" }, dataProvider = "getData", dataProviderClass = TestData.class)
	public void additionTest(String n1, String n2) {
		Reporter.log("running the method addtionTest" , true);
		// int n1 = Integer.parseInt(n1);
		int result = Calculator.add(Integer.parseInt(n1), Integer.parseInt(n2));
		Assert.assertNotNull(result, "result is null");
		Assert.assertEquals(result, (Integer.parseInt(n1) + Integer.parseInt(n2)));
		System.out.println("Sum is " + result);
		Reporter.log("addtionTest is completed" , true);
		// Reporter.log("The test case has failed");
	}

	@Test(enabled = true, groups = { "subtract",
			"calculator" }, dataProvider = "getData", dataProviderClass = TestData.class)
	public void subtractionTest(String n1, String n2) {
		// int n1 = Integer.parseInt(n1);
		Reporter.log("running the method subtractionTest" , true);
		int result = Calculator.sub(Integer.parseInt(n1), Integer.parseInt(n2));
		Assert.assertNotNull(result, "result is null");
		Assert.assertEquals(result, (Integer.parseInt(n1) - Integer.parseInt(n2)));
		System.out.println("subtraction is " + result);
		Reporter.log("running the method subtractionTest" , true);
	}

	@Test(enabled = true, groups = { "multiply",
			"calculator" }, dataProvider = "getData", dataProviderClass = TestData.class)
	public void multiplicationTest(String n1, String n2) {
		// int n1 = Integer.parseInt(n1);
		Reporter.log("running the method multiplicationTest" , true);
		int result = Calculator.mul(Integer.parseInt(n1), Integer.parseInt(n2));
		Assert.assertNotNull(result, "result is null");
		Assert.assertEquals(result, (Integer.parseInt(n1) * Integer.parseInt(n2)));
		System.out.println("multiplication is " + result);
		Reporter.log("running the method multiplicationTest" , true);
		// Reporter.log("The test case has failed");
	}

	@Test(enabled = true, groups = { "divide",
			"calculator" }, dataProvider = "getData", dataProviderClass = TestData.class)
	public void divisionTest(String n1, String n2) {
		Reporter.log("running the method divisionTest" , true);
		// int n1 = Integer.parseInt(n1);
		float result = Calculator.divInt(Integer.parseInt(n2), Integer.parseInt(n1));
		Assert.assertNotNull(result, "result is null");
		Assert.assertEquals(result, (Integer.parseInt(n2) / Integer.parseInt(n1)));
		Assert.assertNotEquals(result, 0);
		System.out.println("division is " + result);
		// Reporter.log("The test case has failed");
		Reporter.log("running the method divisionTest" , true);
	}

}
