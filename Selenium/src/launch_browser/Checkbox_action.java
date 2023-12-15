package launch_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox_action {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/hp/Desktop/checkbox.html");
		Thread.sleep(2000);
		List<WebElement> links=driver.findElements(By.xpath("//input"));
		int count = links.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement we = links.get(i);
			we.click();
			Thread.sleep(1000);
		}
		

	}

}
