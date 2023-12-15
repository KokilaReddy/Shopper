package launch_browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_browser {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String values="./softwares/chromedriver.exe";
		System.setProperty(key, values);
		ChromeDriver driver=new ChromeDriver();
		
		

	}

}
