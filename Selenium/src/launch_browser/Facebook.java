package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://wwww.facebook.com");
			Thread.sleep(2000);	
			driver.findElement(By.linkText("Forgotten password?")).click();
	}

}
