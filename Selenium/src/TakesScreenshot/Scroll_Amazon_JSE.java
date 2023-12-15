package TakesScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll_Amazon_JSE {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement brazil = driver.findElement(By.xpath("//a[text()='Brazil']"));
		Point loc = brazil.getLocation();
		int x1=loc.getX();
		int y1=loc.getY();
		System.out.println(x1+" "+y1);
		js.executeScript("window.scrollBy("+x1+","+y1+")");
		brazil.click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
