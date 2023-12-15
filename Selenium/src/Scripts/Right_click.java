package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			Thread.sleep(2000);
	        WebElement src = driver.findElement(By.xpath("//span[text()='right click me']"));
	        Actions act = new Actions(driver);
	        act.contextClick(src).perform();
	
	}

}
