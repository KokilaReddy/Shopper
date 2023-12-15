package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Perform_action {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/hp/Desktop/a1.html");
		WebElement ele=driver.findElement(By.xpath("//a[text()='Feacebook']"));
		boolean b = ele.isDisplayed();
		if(b)
		{
			System.out.println("ELEMENT displayed");
		}
			else
			{
				System.out.println("element not displayed");
			}
			WebElement el=driver.findElement(By.id("a1"));
				boolean a = el.isEnabled();
				if(a) {
					System.out.println("ELEMENT displayed");}
					else {
						System.out.println("element not displayed");}
			
		
	}

}
