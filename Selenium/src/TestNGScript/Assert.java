package TestNGScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert extends GenericScript {
  
	
	@Test
	public void login()
	{   
		 driver.get("http://localhost/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		String title=driver.getTitle();
		System.out.println(title);
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(title,"actiTIME");
		System.out.println("1");
		sa.assertAll();
		
		
	}
	@Test
	public void facebook()
	{
		    driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("pallavireddy2803@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("pallu@2803");
			driver.findElement(By.name("login")).click();
	}
	
}
