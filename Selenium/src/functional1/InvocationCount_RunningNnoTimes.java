package functional1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount_RunningNnoTimes {

	

    @Test(invocationCount = 3,priority = 1)
    public void test1()
    { 
    	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	
    	Reporter.log("Hello",true);
    }
    @Test
    public void test2()
    {     
    	 System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
    		WebDriver driver=new FirefoxDriver();
    		driver.get("https://www.facebook.com/");
    		
    	Reporter.log("India",true);
    }
}
