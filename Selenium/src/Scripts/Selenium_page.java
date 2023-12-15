package Scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_page {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
        WebElement src = driver.findElement(By.xpath("//span[text()='Downloads']"));
        WebElement src1 = driver.findElement(By.xpath("//span[text()='Documentation']"));
        WebElement src2 = driver.findElement(By.xpath("//span[text()='Blog']"));
        Actions act = new Actions(driver);
        act.contextClick(src).perform();
        Thread.sleep(1000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_T); 
        act.contextClick(src1).perform();
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_T);
        act.contextClick(src2).perform();
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_T);
        
        driver.close();
		

	}

}
