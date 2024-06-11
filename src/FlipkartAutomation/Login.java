package FlipkartAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	WebElement Click=driver.findElement(By.xpath("(//*[text()='Login'])[1]"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", Click);
	
     WebElement mobilenumber=driver.findElement(By.xpath("//*[@class='r4vIwl BV+Dqf']"));
	 mobilenumber.sendKeys("7887711960");
	 WebElement requestotp=driver.findElement(By.xpath("//*[text()='Request OTP']"));
	 requestotp.click();
	WebElement signup=driver.findElement(By.xpath("//*[text()='Sign Up']"));
	signup.click();
	
	
}
}
