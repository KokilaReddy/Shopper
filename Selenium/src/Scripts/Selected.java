package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selected {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/hp/Desktop/link.html");
		Thread.sleep(2000);
		WebElement ele= driver.findElement(By.id("a4"));
				boolean b=ele.isSelected();
				if(b)
				{
					System.out.println("element selected");
				}
				else
				{
					System.out.println("element is not selected");
				}
	}

}
