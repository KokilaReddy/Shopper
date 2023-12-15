package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);	
		driver.findElement(By.name("field-keywords")).sendKeys("shoes");
		Thread.sleep(2000);
		 String title = driver.getTitle();
		 System.out.println(title);
		 driver.quit();
	

	}

}
