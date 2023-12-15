package launch_browser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Title_url_source {

	public static  void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("Webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
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
