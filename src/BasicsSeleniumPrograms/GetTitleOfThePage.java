package BasicsSeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleOfThePage {
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	
	String Title=driver.getTitle();
	System.out.println(Title);
	
	
	
	}

}
