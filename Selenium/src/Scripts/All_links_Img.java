package Scripts;

import java.util.List;
import java.lang.String;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class All_links_Img {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		List<WebElement> both=driver.findElements(By.xpath("//a|//img"));
		int count = both.size();
		System.out.println(count);
		
	}

}
