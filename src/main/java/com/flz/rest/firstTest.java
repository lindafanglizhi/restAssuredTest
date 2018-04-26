package com.flz.rest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class firstTest {
	@Parameters({ "first-name" })
	@Test(groups = { "windows.checkintestsample" })
	public void testSingleString(String firstName) {
	  System.out.println("我从外面引入的名字" + firstName);
	  assert "linda".equals(firstName);
	}

	@Test(groups = { "functest", "checkintest" })
	  public void testMethod1() {
		System.out.println("test method1");
	  }
	 
	@Test(groups = {"functest", "checkintest"} )
	  public void testMethod2() {
		  System.out.println("test method2");
	  }
	 
 @Test(groups = { "functest" })
	  public void testMethod3() {
		  System.out.println("test method3");
	  }
 @Test(groups = { "windows.checkintest" })
 public void testWindowsOnly() {
	 System.out.println("test windows.checkintest");
 }

 @Test(groups = {"linux.checkintest"} )
 public void testLinuxOnly() {
	 System.out.println("test linux.checkintest");
 }

 @Test(groups = { "windows.functest"} )
 public void testWindowsToo() {
	 System.out.println("test windows.functest");
 }


	@Test(groups = { "correcttest" })
	public void f() {
		System.out.println("test1");
	}
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite");
  }

}
