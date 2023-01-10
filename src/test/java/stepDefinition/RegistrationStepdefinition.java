package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import pageObjectModel.RegistrationPage;

public class RegistrationStepdefinition extends Util {
	

	@Given("The user opens Chrome Browser and Enter the Register page url {string}")
	public void the_user_opens_chrome_browser_and_enter_the_register_page_url(String url) {
		rp=new RegistrationPage(driver);
	  	driver.get(url);
	}
	

	@Then("^The user enter the (.*) ,(.*) and (.*)$")
	public void the_user_enter_the_user_name_password_and_confirm_password(String username,String pswd,String confpswd) throws InterruptedException {
		
	   Thread.sleep(5000);
	   rp.enterUserName(username);
	   rp.enterPassword(pswd);
	   rp.enterConfirmPswd(confpswd);
	  
	}
	@And("click on Register")
	public void click_on_register() throws InterruptedException {
	    rp.clickOnRegister();
	    Thread.sleep(500);
	    
	}
	@Then("It should open home page with an Alert messege {string}")
	public void it_should_open_home_page_with_an_alert_messege(String mesg) {
	    String actualmesg=rp.alert();
	    System.out.println("******************"+actualmesg+"*******************************");
	    System.out.println("******************"+mesg+"*******************************");
	    Assert.assertTrue(actualmesg.contains(mesg));
	    System.out.println("******************"+actualmesg+"*******************************");

	}
	@Then("click on signout")
	public void click_on_signout() {
	   rp.clickOnSignout(); 
	}
	@Then("click on signIn")
	public void click_on_sign_in() {
	    rp.clickOnSignin();
	}

	@And("The user should navigate to login page as title {string}")
	public void the_user_should_navigate_to_login_page_as_title(String title) {
		String actualtitle=driver.getTitle();
		System.out.println("******************"+actualtitle+"*******************************");
		System.out.println("******************"+title+"*******************************");
	    Assert.assertEquals(title, actualtitle);
	    
	    
	}
	
}
