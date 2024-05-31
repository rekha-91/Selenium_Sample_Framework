package package1;

import org.testng.annotations.Test;

public class ContactTest1 
{
	@Test
	public void createContactTest()
	{
		String URL= System.getProperty("url");
		String BROWSER= System.getProperty("browser");
		String USERNAME= System.getProperty("username");
		String PASSWORD= System.getProperty("password");
		System.out.println("Execute create contact test");
	}

	@Test
	public void modifyContactTest()
	{
		System.out.println("Execute modify contact test");
	}

}
