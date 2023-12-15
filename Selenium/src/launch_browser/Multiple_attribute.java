package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_attribute {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/maps/");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//button[@aria-label='Directions']")).click();
		driver.findElement(By.xpath("//input[@autocomplete='off' and	@placeholder='Choose starting point, or click on the map...']")).sendKeys("Bengaluru");
		driver.findElement(By.xpath("//input[@aria-autocomplete='list' and @dir='ltr' and@placeholder='Choose destination...']")).sendKeys("Kgf");
		driver.findElement(By.xpath("//button[ @jsaction='search;focus:pane.focusTooltip;blur:pane.blurTooltip']")).click();
		Thread.sleep(3000);	
		
		
		

	}

}
