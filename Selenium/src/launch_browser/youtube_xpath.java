package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class youtube_xpath {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kgf trailer");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//div[@id='channel-info']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='yt-spec-touch-feedback-shape__fill']")).click();
		Thread.sleep(2000);
		
	}

}
