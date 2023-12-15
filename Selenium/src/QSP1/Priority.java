package QSP1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {

	
    @Test(priority=1)
    public void test1()
    {    System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("pallavireddy2803@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("pallu@2803");
	driver.findElement(By.name("login")).click();
    	Reporter.log("Hello",true);
    }
    @Test
    public void test2()
    {   System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("pallavireddy2803@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("pallu@2803");
	driver.findElement(By.name("login")).click();
    	Reporter.log("India",true);
    }
}

