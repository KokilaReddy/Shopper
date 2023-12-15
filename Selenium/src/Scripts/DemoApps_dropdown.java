package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoApps_dropdown {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9620170307");
		WebElement dr=driver.findElement(By.xpath("//select[@id='select2']"));
		Select sel=new Select(dr);
		sel.selectByValue("female");
		WebElement dr1=driver.findElement(By.xpath("//select[@id='select3']"));
		Select sel1=new Select(dr1);
		sel1.selectByValue("India");
		WebElement dr2=driver.findElement(By.xpath("//select[@id='select5']"));
		Select sel2=new Select(dr2);
		sel2.selectByValue("Karnataka");
	//	WebElement dr3=driver.findElement(By.xpath("option[text()='Select City']"));
	//	Select sel3=new Select(dr3);
	//	sel3.selectByValue("Goalpara");
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		driver.findElement(By.xpath("//input[@id='keypoint']")).sendKeys("9620170307");
		WebElement dr4=driver.findElement(By.xpath("(//select[@id='select40'])[1]"));
		Select sel4=new Select(dr4);
		sel4.selectByVisibleText("Female");
		WebElement dr5=driver.findElement(By.xpath("//select[@id='mul']"));
		Select sel5=new Select(dr5);
		sel5.selectByVisibleText("India");
		sel5.selectByVisibleText("France");
		sel5.selectByVisibleText("Japan");
		WebElement dr6=driver.findElement(By.xpath("//select[@id='selectstate']"));
		Select sel6=new Select(dr6);
		sel6.selectByVisibleText("Karnataka");
		sel6.selectByVisibleText("Tamilnadu");
		WebElement dr7=driver.findElement(By.xpath("//select[@id='select40' and @multiple=\"\"]"));
		Select sel7=new Select(dr7);
		sel7.selectByVisibleText("Mumbai");
		sel7.selectByVisibleText("Chennai");
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		
		
		
		
		
		
		
		
	}

}
