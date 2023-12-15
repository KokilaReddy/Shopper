package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoo_xpath {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.yahoo.com");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//span[text()='mail']")).click();
		driver.findElement(By.xpath("//a[.='compose']")).click();
		Thread.sleep(2000);	
		

	}

}
