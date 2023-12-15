package Scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Google_Actions
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
        WebElement src = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
        Actions act = new Actions(driver);
        act.contextClick(src).perform();
        Thread.sleep(1000);
        Robot r = new Robot();
     r.keyPress(KeyEvent.VK_T);
     r.keyRelease(KeyEvent.VK_T);
        driver.close();
        

}
}
