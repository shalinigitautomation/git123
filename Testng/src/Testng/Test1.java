package Testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test1 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}
	@Test
	public void test()
	{
		System.out.println("hello");
		System.out.println("hello");

	
	}
	
	@AfterTest
	public void after()
	{
		System.out.println("Run me last");
	}
	
	@Test
	
	public void test2()
	{
		System.out.println("hi");	
	}
	
	@Test
	public void Name1()
	
	{
		System.out.println("Selenium1");
	}
	@Test
	public void Name2()
	{
		System.out.println("Selenium2");
	}
	

}
