package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByIDLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
	WebElement email=driver.findElement(By.xpath("//*[@id='email']"));
		email.sendKeys("shbcd@gmail.com");
		
		WebElement pass=driver.findElement(By.xpath("//*[@id='pass']"));
		pass.sendKeys("lajsgdg");
		Thread.sleep(40000);
		
		driver.quit();
		
		
		
	}
}
