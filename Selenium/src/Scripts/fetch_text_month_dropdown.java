package Scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class fetch_text_month_dropdown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	//	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pallavireddy");
	//	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pallavi8765");
	//	driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement ele=driver.findElement(By.id("month"));
		Select sel=new Select(ele);
		List<WebElement> opt=sel.getOptions();	
		Thread.sleep(1000);
		for(WebElement we:opt)
		{
			System.out.println(we.getText());
		}

	}

}
