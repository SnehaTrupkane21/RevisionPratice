package NorseAtlanticProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingupPage {
	public static void main(String[] args) throws InterruptedException {
		//Launch The Browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flynorse.com/en-US");

		//Handle The CookiesPopUp
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement Cookiespopup=driver.findElement(By.xpath("//*[text()=' Accept all cookies ']"));
		Cookiespopup.click();
		Thread.sleep(3000);
		
		//Click To Login Button
		WebElement login=driver.findElement(By.xpath("(//*[text()='Login'])[1]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", login);
				       
		//Click to SignUp Button
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement Signup=driver.findElement(By.xpath("//span[text()=' Sign up ']"));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click()",  Signup );
				       
		//Fill All Information inside the signUp 
		//FirstName
		WebElement firstname=driver.findElement(By.xpath("//*[@id='firstName']"));
		firstname.sendKeys("A");
		
		//Lastname
		
		
		WebElement Lastname=driver.findElement(By.xpath("//*[@id='lastName']"));
		Lastname.sendKeys("B");
		
		
		
		
		//Gender Dropdown
		WebElement Gender=driver.findElement(By.xpath("//select[@id='gender']"));
		Select sel=new Select(Gender);
		sel.selectByVisibleText("Female");
		
		String getvalue=Gender.getText();
		System.out.println(getvalue);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		    }
		

		
		
		
		
		
		
		
	}
	

