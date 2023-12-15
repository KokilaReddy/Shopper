package TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class FB_Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File scr=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("C:\\Screenshot\\act.jpeg");
		FileHandler.copy(scr, dst);
		driver.close();
		
	}

}
