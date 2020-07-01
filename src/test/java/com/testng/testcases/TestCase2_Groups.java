package com.testng.testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.testng.assignment.Calculator;
import com.testng.assignment.TestData;

public class TestCase2_Groups {
	static String n1 = "3";
	static String n2 = "5";
		/*
		 * public static void main(String[] args) { // TODO Auto-generated method stub
		 * additionTest(3 , 5); }
		 */
		@Test(enabled = true, groups = { "add",
				"calculator" })
		public void additionTest() {
			// int n1 = Integer.parseInt(n1);
			Reporter.log("running the method addtionTest" , true);
			int result = Calculator.add(Integer.parseInt(n1), Integer.parseInt(n2));
			Assert.assertNotNull(result, "result is null");
			Assert.assertEquals(result, (Integer.parseInt(n1) + Integer.parseInt(n2)));
			System.out.println("Sum is " + result);
			Reporter.log("running the method addtionTest" , true);
			// Reporter.log("The test case has failed");
		}

		@Test(enabled = true, groups = { "subtract",
				"calculator" })
		public void subtractionTest() {
			// int n1 = Integer.parseInt(n1);
			Reporter.log("running the method subtractionTest" , true);
			int result = Calculator.sub(Integer.parseInt(n1), Integer.parseInt(n2));
			Assert.assertNotNull(result, "result is null");
			Assert.assertEquals(result, (Integer.parseInt(n1) - Integer.parseInt(n2)));
			System.out.println("subtraction is " + result);
			// Reporter.log("The test case has failed");
			Reporter.log("running the method subtractionTest" , true);
		}

		@Test(enabled = true, groups = { "multiply",
				"calculator" })
		public void multiplicationTest() {
			// int n1 = Integer.parseInt(n1);
			Reporter.log("running the method multiplicationTest" , true);
			int result = Calculator.mul(Integer.parseInt(n1), Integer.parseInt(n2));
			Assert.assertNotNull(result, "result is null");
			Assert.assertEquals(result, (Integer.parseInt(n1) * Integer.parseInt(n2)));
			System.out.println("multiplication is " + result);
			// Reporter.log("The test case has failed");
			Reporter.log("running the method multiplicationTest" , true);
		}

		@Test(enabled = true, groups = { "divide",
				"calculator" })
		public void divisionTest() {
			// int n1 = Integer.parseInt(n1);
			Reporter.log("running the method divisionTest" , true);
			float result = Calculator.divInt(Integer.parseInt(n2), Integer.parseInt(n1));
			Assert.assertNotNull(result, "result is null");
			Assert.assertEquals(result, (Integer.parseInt(n2) / Integer.parseInt(n1)));
			System.out.println("division is " + result);
			// Reporter.log("The test case has failed");
			Reporter.log("running the method divisionTest" , true);
		}

}
