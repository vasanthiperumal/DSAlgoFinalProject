package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.ArrayPage;


public class ArrayStepDefinition extends Util{
	
	@Given("The user is in the Home page after logged into dsAlgo")
	public void the_user_is_in_the_home_page_after_logged_into_ds_algo() {
		ap =new ArrayPage(driver);
	   
	}
	@Given("the home page is diplayed with title {string} for Array flow")
	public void the_home_page_is_diplayed_with_title_for_array_flow(String string) {
	   
	   
	}
	@When("The user clicks  {string} button below the {string} Page")
	public void the_user_clicks_button_below_the_page(String string, String string2) {
		ap.clickArrayGetStDataSt();
	   
	}
	@Then("The user should navidates to {string}")
	public void the_user_should_navidates_to(String string) {
	   
	   
	}
	@When("The user taps {string} button")
	public void the_user_taps_button(String string) {
	   
		ap.clickArraysInPython();
	}
	@Then("The user should be redirected to {string} of Arrays Page")
	public void the_user_should_be_redirected_to_of_arrays_page(String string) {
	   
	   
	}
	@Then("The user should be redirected to a Array page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_array_page_having_an_try_editor_with_a_run_button_to_test() {
		 ap.clickArrayTryHere();
	   
	}
	@When("user enter the Python code of Array Page")
	public void user_enter_the_python_code_of_array_page(io.cucumber.datatable.DataTable dataTable) {
	   
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		ap.enterArrayTestCode();
	}
	@When("clicks run button for Array Page")
	public void clicks_run_button_for_array_page() {
		 ap.clickArrayRunBtn();
	   
	}
	@When("user is navigated to home page {string} from Array Page")
	public void user_is_navigated_to_home_page_from_array_page(String url) {
		 driver.get(url);
	   
	}
	
}
