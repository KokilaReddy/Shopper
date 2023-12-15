package Scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Textfield_action {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/hp/Desktop/Textfield.html");
		Thread.sleep(2000);
		List<WebElement> links=driver.findElements(By.xpath("//input"));
		int count = links.size();
		System.out.println(count);
		for(WebElement we:links)
		{
			we.sendKeys("Pallavi");
		}
		for(int i=count-1;i>=0;i--) 
		{
			WebElement we=links.get(i);
			we.clear();
			Thread.sleep(500);
		}
			
	}

}
