package stepDefinition;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObjectModel.DataStructurePage;

public class DataStructureStepDefinition extends Util{
	
		@Given("The user is in the Home page after logged in")
		public void the_user_is_in_the_home_page_after_logged_in() {
			// Assert.assertEquals(title, driver.getTitle());
		   	 dp=new DataStructurePage(driver);
		}

		@Given("the home page is diplayed with title {string}")
		public void the_home_page_is_diplayed_with_title(String string) {
		   
		}
		/*
		 * @When("The user clicks {string} button below the {string}") public void
		 * the_user_clicks_button_below_the(String string, String string2) {
		 * dp.clickGetStDataSt(); }
		 */
		

@When("The user clicks  {string} button below the {string}")
public void the_user_clicks_button_below_the(String string, String string2) {
    
    
    dp.clickGetStDataSt();
}

		@Then("The user should land in {string}")
		public void the_user_should_land_in(String string) {
		   
		}

		@When("The user clicks {string} button")
		public void the_user_clicks_button(String string) {
		    dp.clickTimeComplexity();
		}

		@Then("The user should be redirected to {string} of Data structures-Introduction")
		public void the_user_should_be_redirected_to_of_data_structures_introduction(String string) {
		   
		}

		@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
		public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		   dp.clickTryHere();
		}

		@When("user enter the Python code")
		public void user_enter_the_python_code(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
		    // For automatic transformation, change DataTable to one of
		    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		    // Double, Byte, Short, Long, BigInteger or BigDecimal.
		    //
		    // For other transformations you can register a DataTableType.
			Thread.sleep(5000);
		    dp.enterTestCode();
		  
		}

		@When("clicks run button")
		public void clicks_run_button() {
			  dp.clickRunBtn();
		}

		@When("user is navigated to home page {string}")
		public void user_is_navigated_to_home_page(String url) throws InterruptedException {
			Thread.sleep(5000);
		   driver.get(url);
		}
	}


