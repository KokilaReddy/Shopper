package launch_browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Close_browser {

	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String values="./softwares/chromedriver.exe";
		System.setProperty(key, values);
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);	
//  driver.close();
		driver.quit();
	}

}
