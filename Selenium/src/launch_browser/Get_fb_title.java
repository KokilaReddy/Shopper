package launch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_fb_title {

	public static void main(String[] args) throws InterruptedException
	{
		

		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);	
		
		String s1 = driver.getTitle();
		System.out.println(s1);
		driver.close();
		
		String s2="Instagram login";
		
		if(s1.equals(s2))
			{
			System.out.println("titles are matching");
			}
		else
			{
			System.out.println("titles are not matching");
			}

}
}