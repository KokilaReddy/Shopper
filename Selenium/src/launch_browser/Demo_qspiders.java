package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_qspiders {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);	
		
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys("pallavireddy");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("pallavireddy");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("pallavireddy");
		driver.findElement(By.cssSelector("a[type='button']")).click();
		Thread.sleep(2000);	
		
		driver.findElement(By.cssSelector("a[href='/button']")).click();
		driver.findElement(By.cssSelector("button[id='btn']")).click();
		driver.findElement(By.cssSelector("button[id='btn2']")).click();
		driver.findElement(By.cssSelector("button[id='btn5']")).click();
		Thread.sleep(2000);	
		
		driver.findElement(By.cssSelector("a[href='/link']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a[href='/radio']")).click();
		driver.findElement(By.cssSelector("input[value='credit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='cod']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a[href='/checkbox']")).click();
		driver.findElement(By.cssSelector("input[id='domain2']")).click();
		driver.findElement(By.cssSelector("input[id='mode3']")).click();
		driver.findElement(By.cssSelector("input[id='mode6']")).click();
		Thread.sleep(2000);
		driver.quit();
		
		




	}

}
