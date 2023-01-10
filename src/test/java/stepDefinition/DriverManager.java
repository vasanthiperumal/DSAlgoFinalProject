package stepDefinition;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;

public class DriverManager {
	
	
	public static WebDriver driver_dmg;

		    @BeforeAll
		    public static void before_all() {
		    	WebDriverManager.chromedriver().setup();	
		    	driver_dmg= new ChromeDriver();
		    }

		    public static WebDriver getDriver(){
		        return driver_dmg;
		    }
		    @AfterAll
		    public static void after_all() {
		    	driver_dmg.quit();
		    }
		    
		    @After
			public void after(Scenario scenario) {
				if(scenario.isFailed()){
					byte[] screenshot=((TakesScreenshot)driver_dmg).getScreenshotAs(OutputType.BYTES);
					Allure.addAttachment("Failed Screenshot", new ByteArrayInputStream(screenshot));
				}
			}
		    @Step("screenshot")
		    public void step1(){

		        Allure.addAttachment("Any text", new ByteArrayInputStream(((TakesScreenshot) driver_dmg).getScreenshotAs(OutputType.BYTES)));
		    }
}