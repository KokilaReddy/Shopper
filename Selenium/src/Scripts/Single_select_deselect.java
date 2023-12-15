package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_select_deselect {

	public static void main(String[] args) throws InterruptedException
	{
	
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/hp/Desktop/Multi_dropdown.html");
	WebElement drop_down=driver.findElement(By.xpath("//select[@id='city-dropdown']"));
	Select sel=new Select(drop_down);
	sel.selectByVisibleText("Udupi");
	Thread.sleep(1000);
	sel.deselectByIndex(4);
	Thread.sleep(1000);
	driver.close();
}
}