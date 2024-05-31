package package2;

import org.testng.annotations.Test;

public class OrgTest1
{

	@Test
	public void createOrgTest()
	{
		String URL= System.getProperty("url");
		String BROWSER= System.getProperty("browser");
		String USERNAME= System.getProperty("username");
		String PASSWORD= System.getProperty("password");
		System.out.println("Execute create organization test");
	}

	@Test
	public void modifyOrgTest()
	{
		System.out.println("Execute modify organization test");
	}


}
