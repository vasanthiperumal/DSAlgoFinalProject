package stepDefinition;

import static stepDefinition.DriverManager.getDriver;
import org.openqa.selenium.WebDriver;

import pageObjectModel.ArrayPage;
import pageObjectModel.DataStructurePage;
import pageObjectModel.GetStartedPage;
import pageObjectModel.LoginPage;
import pageObjectModel.RegistrationPage;


public class Util {
	
	public static WebDriver driver;
	public static GetStartedPage gp;
	public static RegistrationPage rp;
	public static LoginPage lp;
	public static DataStructurePage dp;
	public static ArrayPage ap;
	

	static
	{
		driver=getDriver();
	}
    

}
