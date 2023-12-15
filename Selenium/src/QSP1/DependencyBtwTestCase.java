package QSP1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependencyBtwTestCase {

	

    @Test
    public void facebook()
    {    
    	 System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
    		WebDriver driver=new FirefoxDriver();
    		driver.get("https://www.facebook.com/");
    		
    	Reporter.log("Facebook",true);
    }
    @Test(dependsOnMethods = "facebook")
    public void instagram()
    {   
    	 System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
    		WebDriver driver=new FirefoxDriver();
    		driver.get("https://www.instagram.com/");
    		
    	Reporter.log("Instagram",true);
    	Assert.fail();
    }
    @Test(dependsOnMethods = "instagram")
    public void google()
    {
    	 System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
    		WebDriver driver=new FirefoxDriver();
    		driver.get("https://www.google.com/");
    		
    	Reporter.log("Google",true);
    }
}
