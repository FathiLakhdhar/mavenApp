package fis.ch.test.my_app_test;

import org.testng.annotations.Test;

public class TestCaseA {

	@Test
    public void A()
    {
		int x=1/0;
    }
	
	@Test
    public void B()
    {
		int x=1/0;
        System.out.println("test A : Case 2");
    }
}
