package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjectModel.GetStartedPage;



public class GetStartedStepdefinition extends Util{
	


	@And("The user opens Browser and Enter the Get Started page url {string}")
	public void The_user_opens_Browser_and_Enter_the_Get_Started_page_url(String url) {
		 gp=new GetStartedPage(driver);
	   driver.get(url);
	}
	@When("User clicks on Get Started button")
	public void user_clicks_on_get_started_button() {
	    gp.clickOnGetStarted();
	    
	}

	@Then("It should navigates to home page with title {string}")
	public void it_should_navigates_to_home_page_with_title(String msg) {
		String actualmesg=gp.alertMessage();
		   Assert.assertTrue(msg.contains(actualmesg));
	}

	
}
