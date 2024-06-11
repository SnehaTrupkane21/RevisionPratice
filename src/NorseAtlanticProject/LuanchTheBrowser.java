package NorseAtlanticProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LuanchTheBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flynorse.com/en-US");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement Cookiespopup=driver.findElement(By.xpath("//*[text()=' Accept all cookies ']"));
		Cookiespopup.click();
		Thread.sleep(3000);
 
        
	}

}
