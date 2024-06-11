package BasicsSeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommand {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.navigate().back();
		Thread.sleep(300);
		driver.navigate().refresh();
		driver.navigate().forward();
		
		Thread.sleep(400);
		driver.close();
	}

}
