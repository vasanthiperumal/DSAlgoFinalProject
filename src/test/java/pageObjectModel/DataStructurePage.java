package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataStructurePage {
			
			WebDriver driver;
			By getstDS=By.xpath("//a[@href='data-structures-introduction']");
			By timeComplexity=By.xpath("//a[text()='Time Complexity']");
			By tryHere=By.xpath("//a[@href='/tryEditor']");
			//By enterCode=By.xpath("//div[@class='CodeMirror cm-s-default\']");
			By enterCode=By.xpath("//textarea[@tabindex='0']");
			
			
			By runBtn=By.xpath("//form[@id='answer_form']//button");
			// By runBtn=By.xpath("//input[@type='submit' and @value='Submit']");
			
			public DataStructurePage(WebDriver driver) {
				this.driver=driver;
			}
			public void clickGetStDataSt() {
				driver.findElement(getstDS).click();
			}
			public void clickTimeComplexity() {
				driver.findElement(timeComplexity).click();
			}
			public void clickTryHere() {
				driver.findElement(tryHere).click();
			}
			public void enterTestCode() {
				driver.findElement(enterCode).sendKeys("print 'DataStructure Introduction'");
			}
			public void clickRunBtn() {
				driver.findElement(runBtn).click();
			}
		
		}



