package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_dropdown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/hp/Desktop/Multi_dropdown.html");
		Thread.sleep(2000);
		WebElement drop_down= driver.findElement(By.xpath("//select[@id='city-dropdown']"));
		Select sel=new Select(drop_down);
		sel.selectByIndex(0);
		Thread.sleep(2000);
		sel.selectByValue("C");
		Thread.sleep(2000);
		sel.selectByVisibleText("Udupi");
		Thread.sleep(2000);
		sel.deselectByIndex(4);
		Thread.sleep(2000);
		sel.deselectAll();
		Thread.sleep(2000);
		
	}

}
