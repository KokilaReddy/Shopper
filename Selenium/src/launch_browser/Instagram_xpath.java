package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Instagram_xpath {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.instagram.com");
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//input[@dir=\"\"]")).sendKeys("pallavireddy");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pallavi2803");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	driver.close();	
	
		
		

	}

}
