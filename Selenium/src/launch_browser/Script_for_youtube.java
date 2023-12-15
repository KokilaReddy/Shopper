package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_for_youtube {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);	
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("kgf trailer");
		driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		Thread.sleep(2000);	
		driver.findElement(By.cssSelector("(//div[@class='yt-spec-touch-feedback-shape__fill'])[1]")).click();
		Thread.sleep(4000);
		driver.close();
		
		
		

	}

}
