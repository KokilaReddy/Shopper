package TakesScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FB_ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("pallavireddy2803@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("pallu@2803");
		driver.findElement(By.name("login")).click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleContains("Log in to Facebook"));
		System.out.println(driver.getTitle());
		wait.until(ExpectedConditions.urlContains("https://www.facebook.com/login"));
		System.out.println(driver.getCurrentUrl());
        WebElement ele=driver.findElement(By.xpath("//img[@alt='Facebook']"));
        wait.until(ExpectedConditions.visibilityOf(ele));
        driver.findElement(By.id("loginbutton")).click();
        System.out.println("done");
}
}
