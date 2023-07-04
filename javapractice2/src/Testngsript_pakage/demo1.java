package Testngsript_pakage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo1 {
	@Test
	public void test1()
	{
		Reporter.log("hi",true);
	}
	@Test
	public void test2()
	{
		Reporter.log("hello",true);
	}	
	}

