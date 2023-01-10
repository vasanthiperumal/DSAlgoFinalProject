package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ArrayPage {
	
	WebDriver driver;
	By getstAr=By.xpath("//a[@href='array']");
	
	By arraysInPython=By.xpath("//a[text()='Arrays in Python']");
	By tryHere=By.xpath("//a[@href='/tryEditor']");
	By enterCode=By.xpath("//textarea[@tabindex='0']");
	
	By runBtn=By.xpath("//form[@id='answer_form']//button");
	
	
	public ArrayPage(WebDriver driver) {
		this.driver=driver;
	}
	public void clickArrayGetStDataSt() {
		driver.findElement(getstAr).click();
	}
	public void clickArraysInPython() {
		driver.findElement(arraysInPython).click();
	}
	public void clickArrayTryHere() {
		driver.findElement(tryHere).click();
	}
	public void enterArrayTestCode() {
		driver.findElement(enterCode).sendKeys("print 'Array'");
	}
	public void clickArrayRunBtn() {
		driver.findElement(runBtn).click();
	}

}
