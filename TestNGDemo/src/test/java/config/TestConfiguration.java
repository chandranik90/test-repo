package config;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestConfiguration {
	@BeforeClass
	public void initPage(){
		System.out.println("Before Class");
	}

	@AfterClass(alwaysRun = true)
	public void closePage(){
		System.out.println("After Class\n\n");
	}
}
