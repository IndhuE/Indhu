package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Five {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement btnCreateAcoount = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		btnCreateAcoount.click();
		Thread.sleep(5000);
		WebElement dropDay = driver.findElement(By.id("day"));
		Thread.sleep(3000);
		Select se = new Select(dropDay);
		List<WebElement> dayOptions = se.getOptions();
		for (int i = 0; i < dayOptions.size(); i++) {
		   // if ( i % 2 == 0 ) {
		    	WebElement j = dayOptions.get(i);
				String evenDays = j.getAttribute("value");
				if(i%2==0) {
					System.out.println(evenDays);
				}
			//}
				
		}
		
		
	}
}
