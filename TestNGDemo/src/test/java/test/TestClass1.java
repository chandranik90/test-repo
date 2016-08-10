package test;

import java.lang.reflect.Method;

import org.testng.annotations.*;

import config.TestConfiguration;

/**
 * Test Class of Welcome Page
 *
 */
public class TestClass1 extends TestConfiguration {
	private int param1;
	private int param2;
	@Factory(dataProvider = "staticDataProvider", dataProviderClass = DataProviderClass.class)
	public TestClass1(int param1, int param2){
		this.param1 = param1;
		this.param2 = param2;
	}
	
	
	@Test
	public void testMethod_1(){
		System.out.println("Test Class 1 - Test Method 1 - Parameters = " + param1 + ", " + param2);
	}
	
	@Test
	public void testMethod_2(){
		System.out.println("Test Class 1 - Test Method 2 - Parameters = ");
	}
/*	
	@DataProvider(name = "dataProviderDependsOnMethod")
	public Object[][] dataProviderForMethod(Method callingMethod){
		String methodName = callingMethod.getName();
		if(methodName.equals("testMethod_1")){
			return new Object[][]{
				{"firstString", new Integer(7)},
				{"secondString", new Integer(88)}
			};
		}
		else{
			return new Object[][]{
				{"thirdString", new Integer(-7)},
				{"fourthString", new Integer(-88)}
			};
		}
	}*/
	
	
	
	
	
	
	//@Factory(dataProvider = "staticDataProvider", dataProviderClass = DataProviderClass.class)
	
/*	
	@Parameters({"testParameter"})
	@Test
	public void testParameterFromSuite(@Optional("default value") String testParameter){
		System.out.println("Parameter Value = " + testParameter);
	}
	*/
/*	
	@DataProvider(name = "testDataProvider")
	public Object[][] testDataMethod(){
		return new Object[][]{
			{"firstString", new Integer(7)},
			{"secondString", new Integer(88)},
			{"thirdString", new Integer(-4)}
		};
	}
*/	
	/*
	@DataProvider(name = "dataProviderDependsOnMethod")
	public Object[][] dataProviderForMethod(Method callingMethod){
		String methodName = callingMethod.getName();
		if(methodName.equals("firstMethod")){
			return new Object[][]{
				{"firstString", new Integer(7)},
				{"secondString", new Integer(88)}
			};
		}
		else{
			return new Object[][]{
				{"thirdString", new Integer(-7)},
				{"fourthString", new Integer(-88)}
			};
		}
	}*/

/*	
	@Test(dataProvider = "testDataProvider")	// From current class
	public void testParameterFromDataProvider(String stringParameter, Integer intParameter){
		System.out.println("String parameter value = " + stringParameter);
		System.out.println("Integer parameter value = " + intParameter);
	}
*/	
/*	
	@Test(dataProvider = "staticDataProvider", dataProviderClass = DataProviderClass.class)
	public void testParameterFromDataProvider(String stringParameter, Integer intParameter){
		System.out.println("String parameter value = " + stringParameter);
		System.out.println("Integer parameter value = " + intParameter);
	}
*/	
	/*
	@Test(dataProvider = "dataProviderDependsOnMethod", groups = {"A"})
	public void firstMethod(String stringParameter, Integer intParameter){
		System.out.println("First method String parameter value = " + stringParameter);
		System.out.println("First method Integer parameter value = " + intParameter);
	}
	
	@Test(dataProvider = "dataProviderDependsOnMethod", groups = {"B"})
	public void secondMethod(String stringParameter, Integer intParameter){
		System.out.println("Second method String parameter value = " + stringParameter);
		System.out.println("Second method Integer parameter value = " + intParameter);
	}*/
/*	
	private int parameterFromFactory;
	public TestWelcomePage(int parameterFromFactory){
		this.parameterFromFactory = parameterFromFactory;
	}
	
	@Test
	public void factoryTestMethod(){
		System.out.println("Parameter value = " + parameterFromFactory);
	}
	*/
	/// http://testng.org/doc/documentation-main.html
}
