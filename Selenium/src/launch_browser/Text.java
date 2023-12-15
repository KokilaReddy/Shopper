package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Text {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/hp/Desktop/text.html");
		Thread.sleep(2000);	
		//driver.findElement(By.tagName("input")).sendKeys("Hello");
		//driver.findElement(By.id("a1")).sendKeys("Hello");
		//driver.findElement(By.name("n1")).sendKeys("Hello");
		driver.findElement(By.className("c1")).sendKeys("Hello");
		Thread.sleep(2000);	
		driver.close();
		
		
		

	}

}
