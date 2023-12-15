package Scripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fetch_title_for_browser {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		Set<String> allwh = driver.getWindowHandles();
	    int s=allwh.size();
		for(String all:allwh)
		{
			System.out.println(all);
		driver.switchTo().window(all);
		}
		String str = driver.getTitle();
		for(int i=1;i<=s;i++)
		{
          System.out.println(str);
		}
}
}
