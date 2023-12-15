package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_for_Instagram {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);	
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("pallavireddy");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Pallu@2803");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
