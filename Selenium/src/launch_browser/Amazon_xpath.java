package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_xpath {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//img[@class='s-image']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='a-button-input attach-dss-atc']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
		Thread.sleep(2000);
		

	}

}
