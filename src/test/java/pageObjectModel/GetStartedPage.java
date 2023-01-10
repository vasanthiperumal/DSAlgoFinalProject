
package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetStartedPage {

	public WebDriver driver;
	
	By getStart=By.xpath ("//button[@class='btn']");
	By msg=By.	xpath("//div[@class='alert alert-primary']");
	
	public GetStartedPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnGetStarted() {
	 driver.findElement(getStart).isDisplayed();
	 driver.findElement(getStart).click();
	}
	
	public String alertMessage() {
		String message =driver.findElement(msg).getText();
		return message;
	}

}
