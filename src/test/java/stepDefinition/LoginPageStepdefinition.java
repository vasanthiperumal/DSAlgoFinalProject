package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjectModel.*;


public class LoginPageStepdefinition extends Util{

@Given("The user opens Chrome Browser and Enter the Login page url {string}")
public void the_user_opens_chrome_browser_and_enter_the_login_page_url(String url) {
    
    lp=new LoginPage(driver);
  	driver.get(url);
}

@When("^User enter (.*) and (.*)$")
public void User_enter_username_and_password(String username, String password) throws InterruptedException{
	 Thread.sleep(5000);
    lp.enterUserName(username);
	lp.enterPassword(password);
    
}

@When("click on Login")
public void click_on_login() {
	lp.clickOnLogin();
}

@Then("it should open a Home page with {string}")
public void it_should_open_a_home_page(String message) {
	String actualmesg=lp.alert();
	   Assert.assertTrue(message.contains(actualmesg));
}
	
}
