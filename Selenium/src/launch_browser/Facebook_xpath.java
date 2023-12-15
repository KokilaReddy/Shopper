package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_xpath {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pallavireddy");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pallavi2803");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);	
		driver.close();	

	}

}
