package launch_browser;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;


public class Title_url_firefox {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);	
		
		String title = driver.getTitle();
		System.out.println(title);
		 
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	    String src = driver.getPageSource();
	    System.out.println(src);
		

	}

}
