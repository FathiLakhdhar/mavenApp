package fis.ch.test.my_app_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase {

	
	@BeforeTest
	public void beforeTest(){
		System.out.println("BeforeTest");
		int x=1/0;
	}
	
	@Test
	public void f(){
		System.out.println("f()");
		int x=1/0;
	}
	@Test
	public void fn(){
		System.out.println("fn()");
	}
}
