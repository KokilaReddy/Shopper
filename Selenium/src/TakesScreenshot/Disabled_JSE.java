package TakesScreenshot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Disabled_JSE {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/hp/Desktop/Jsc.html");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('a1').value='Selenium'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('a1').value=''");
		driver.close();		
		
		

	}

}
