package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_upload_popup {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/hp/Desktop/pop.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.name("upload file"));
		ele.sendKeys("C:\\Users\\hp\\Desktop\\shp.txt");
	
	}

}