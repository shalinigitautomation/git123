package Testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void method1()
	{
		System.out.println("Method1");
	
	}
	@Test
	public void method2()
	{
		System.out.println( "method2");
	}
	
	@BeforeTest
	
	public void before()
	{
		System.out.println("Run me first");
	}

}
