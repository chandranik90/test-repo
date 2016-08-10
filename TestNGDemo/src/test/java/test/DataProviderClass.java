package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider(name = "dateProvider_1")
	public static Object [][] createDate(){
		return new Object[][]{
			{"value 1 1", "value 1 2"},
			{"value 2 1", "value 2 2"},
			{"value 3 1", "value 3 2"},
			{"value 4 1", "value 4 2"},
			{"value 5 1", "value 5 2"}
		};
	}
	
	
	
	
	
	@DataProvider(name = "staticDataProvider")
	public static Object[][] testDataMethod(){
		/*Properties prop = new Properties();
		InputStream is = null;
		try{
			try {
				is = new FileInputStream("src/test/resources/properties/test.properties");
				prop.load(is);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} finally {
				is.close();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		Object [][] returnedArray = new Object[prop.size()][2];
		
		int k = 0;
		for (Object i : prop.keySet()){
			returnedArray[k][0] = (String)i;
			returnedArray[k][1] = prop.getProperty((String)i);
			k++;
		}
		
		return returnedArray;*/
		
		return new Object[][]{
			{"another first string", new Integer(7)},
			{"another second string", new Integer(88)}
		};
	}
}
