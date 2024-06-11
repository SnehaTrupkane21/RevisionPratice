package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDrop {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/signup");
       WebElement sal = driver.findElement(By.xpath("//select[@id='day']"));
       Select sal2= new Select(sal);
       sal2.selectByVisibleText("21");

      
		WebElement firstname=driver.findElement(By.xpath("//*[@name='firstname']"));
		firstname.sendKeys("Sneha");
		
		
		
		
		
		
		
	}

}
