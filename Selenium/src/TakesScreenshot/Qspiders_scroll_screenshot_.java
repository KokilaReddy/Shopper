package TakesScreenshot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Qspiders_scroll_screenshot_ {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/search?client=firefox-b-d&q=qsipders+courses");
		
        driver.findElement(By.xpath("//h3[text()='Courses']")).click();

        JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement brazil = driver.findElement(By.xpath("//p[text()='API Testing']"));
		Point loc = brazil.getLocation();
		int x1=loc.getX();
		int y1=loc.getY();
		js.executeScript("window.scrollBy("+x1+","+y1+")");
		WebElement click = driver.findElement(By.xpath("(//span[text()='Details'])[6]"));
		Actions a1=new Actions(driver);
		a1.contextClick(click).perform();
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
		 Set<String> allwh=driver.getWindowHandles();
	        ArrayList<String> a=new ArrayList<String>(allwh);
	        String wh1=a.get(1);
	        driver.switchTo().window(wh1);
			WebElement tool = driver.findElement(By.xpath("(//p[@class='card-header-title has-text-persian'])[3]"));
			Point loc1 = tool.getLocation();
			int x2=loc1.getX();
			int y2=loc1.getY();
			js.executeScript("window.scrollBy("+x2+","+y2+")");
			 driver.findElement(By.xpath("(//p[@class='card-header-title has-text-persian'])[3]")).click();
			TakesScreenshot ts=(TakesScreenshot) driver;
			File scr=ts.getScreenshotAs(OutputType.FILE);
			File dst=new File("C:\\Screenshot\\act2.jpeg");
			FileHandler.copy(scr, dst);
	      System.out.println(tool.getText());
		
		
	}

}
