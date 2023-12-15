package TestNGScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase2 extends GenericScript {
	
	
	@Test
	public void login1()
	{
		driver.findElement(By.id("email")).sendKeys("pallavireddy2803@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("pallu@2803");
		driver.findElement(By.name("login")).click();
	}
	
	@Test
	public void signin()
	{
		driver.findElement(By.id("email")).sendKeys("pallavireddy2803@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("pallu@2803");
		driver.findElement(By.name("login")).click();
	}

}
