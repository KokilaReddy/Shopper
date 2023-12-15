package Scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_New_window {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
        WebElement l1 = driver.findElement(By.xpath("//span[text()='Downloads']"));
        WebElement l2 = driver.findElement(By.xpath("//span[text()='Documentation']"));
        WebElement l3 = driver.findElement(By.xpath("//span[text()='Blog']"));
        WebElement l4 = driver.findElement(By.xpath("//span[text()='Projects']"));
        WebElement l5 = driver.findElement(By.xpath("//span[text()='Support']"));
        ArrayList<WebElement> l= new ArrayList<WebElement>();
        l.add(l1);
        l.add(l2);
        l.add(l3);
        l.add(l4);
        l.add(l5);
        for(WebElement wh:l)
        {
        	Actions act=new Actions(driver);
    		act.contextClick(wh).perform();
    		Robot r = new Robot();
    		r.keyPress(KeyEvent.VK_T);
    		r.keyRelease(KeyEvent.VK_T);
        }
        Set<String> allwh=driver.getWindowHandles();
        ArrayList<String> a=new ArrayList<String>(allwh);
        String wh1=a.get(4);
        driver.switchTo().window(wh1);
        
        
        
        
	}

}
