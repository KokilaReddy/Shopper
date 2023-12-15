package launch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_url_fb {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);	
		
		String s1 = driver.getCurrentUrl();
		System.out.println(s1);
		driver.close();
		
		String s2="//https:www.Instagram.com";
		
		if(s1.equals(s2))
			{
			System.out.println("url are matching");
			}
		else
			{
			System.out.println("url are not matching");
			}

		

	}

}
