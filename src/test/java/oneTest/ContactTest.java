package oneTest;

import org.testng.annotations.Test;

public class ContactTest 
{
	@Test
	public void createContactTest()
	{
	//	System.out.println(test.getParameter("browser"));
		String URL=System.getProperty("url");
		String BROWSER= System.getProperty("browser");
		String USERNAME= System.getProperty("username");
		String PASSWORD= System.getProperty("password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("Execute create contact test");
	}

	@Test
	public void modifyContactTest()
	{
		System.out.println("Execute modify contact test");
	}
	@Test
	public void deleteContactTest()
	{
		System.out.println("Execute delete contact test");
	}

}
