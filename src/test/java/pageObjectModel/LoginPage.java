package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	By username=By.id("id_username");
	By password=By.id("id_password");
	By login=By.xpath("//input[@value='Login']");
	By alert=By.xpath("//div[@class='alert alert-primary']");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	public void enterUserName(String userName) {
		driver.findElement(username).sendKeys(userName);
	}
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnLogin() {
			
			driver.findElement(login).isDisplayed();
			driver.findElement(login).click();
			
		}
	public String alert() {
		String message=driver.findElement(alert).getText();
		return message;
	}
}
