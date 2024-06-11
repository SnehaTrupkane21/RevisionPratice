package indigo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle {
	
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.goindigo.in/?utm_source=google&utm_medium=cpc&utm_campaign=search_campaign_6exclusivefare&cid=Search|P|6ExclusiveFare&s_kwcid=AL!12293!3!697746087045!b!!g!!indigo&gad_source=1&gclid=CjwKCAjw0YGyBhByEiwAQmBEWie_oGLAXOV-5ai0NBKH2TTEor2D6wqySeODbVdhllQ8B6mf0yoW0hoCVY0QAvD_BwE");
driver.findElement(By.xpath("/html/body/main/div/div/div/main/div/div/div/div/div/div[4]/div/div/a/i")).click();		
		WebElement booking=driver.findElement(By.xpath("(//span[text()='Book'])[1]"));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
