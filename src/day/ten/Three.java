package day.ten;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Three {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.homedepot.com/");
		WebElement txtSearch = driver.findElement(By.xpath("//input[@class='SearchBox__input']"));
		txtSearch.sendKeys("ceiling fan",Keys.ENTER);
		WebElement clickFan = driver.findElement(By.xpath("//img[@alt='Indoor Ceiling Fans with Lights']"));
		clickFan.click();
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println(allWindow);
		for (String string : allWindow) {
			if(string!=parentWindow) {
				driver.switchTo().window(string);
			}		
		}
		WebElement clkRemoteFan = driver.findElement(By.xpath("//img[@src='https://images.homedepot-static.com/productImages/97ea0aa6-b36f-4f7e-8fc2-cb027af5b1f7/svn/brushed-nickel-home-decorators-collection-ceiling-fans-with-lights-59252-64_400.jpg']"));
		clkRemoteFan.click();
		Thread.sleep(4000);
		driver.quit();
		
	}
}
