package Scripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Facebook_dropdown {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement drop_down1=driver.findElement(By.id("day"));
		Select sel=new Select(drop_down1);
		sel.selectByVisibleText("28");
		Thread.sleep(1000);
		WebElement drop_down2=driver.findElement(By.id("month"));
		Select sel1=new Select(drop_down2);
		sel1.selectByVisibleText("Mar");
		Thread.sleep(1000);
		WebElement drop_down3=driver.findElement(By.id("year"));
		Select sel2=new Select(drop_down3);
		sel2.selectByVisibleText("2002");
		Thread.sleep(1000);

	}
}


