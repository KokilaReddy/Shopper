package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://wwww.facebook.com");
		Thread.sleep(2000);	
		driver.findElement(By.id("email")).sendKeys("pallavireddy2803@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Pallu@2803");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		 String title = driver.getTitle();
		 System.out.println(title);
		 driver.quit();
		
	}

}
