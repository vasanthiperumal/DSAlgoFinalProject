package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

	WebDriver driver;
	By uName=By.id("id_username");
	By pwd=By.id("id_password1");
	By cpwd=By.id("id_password2");
	By register=By.xpath("//input[@value='Register']");
	By alert=By.xpath("//div[@class='alert alert-primary']");
	By signout=By.xpath("//a[text()='Sign out']");
	By signin=By.xpath("//div[@class='navbar-nav'][2]/ul/a[3]");
	By login=By.xpath("//input[@value='Login']");
	
	public RegistrationPage(WebDriver driver) {
		this.driver=driver;
	}
	public void enterUserName(String userName) {
		driver.findElement(uName).sendKeys(userName);
	}
	public void enterPassword(String pswd) {
		driver.findElement(pwd).sendKeys(pswd);
	}
	public void enterConfirmPswd(String cpswd) {
		driver.findElement(cpwd).sendKeys(cpswd);
	}
	
	public void clickOnRegister() {
		driver.findElement(register).isEnabled();
		driver.findElement(register).click();
	}
	public String alert() {
		String mesg=driver.findElement(alert).getText();
		return mesg;
	}
	public void clickOnSignout() {
		driver.findElement(signout).isDisplayed();
		driver.findElement(signout).click();
	}
	public void clickOnSignin() {
		driver.findElement(signin).isDisplayed();
		driver.findElement(signin).click();
	}
	public void clickOnLogin() {
		
		driver.findElement(login).isDisplayed();
		driver.findElement(login).click();
		
	}

}
