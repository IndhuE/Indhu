package day.ten;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eight {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		WebElement txtSearch = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		txtSearch.sendKeys("hand sanitizer",Keys.ENTER);
		WebElement btnSanitizer = driver.findElement(By.xpath("//p[@class='product-title']"));
		btnSanitizer.click();
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		for (String string : windowHandles) {
			if(!(string.equals(windowHandle))) {
				driver.switchTo().window(string);
			}
		}
		WebElement btnAddToCart = driver.findElement(By.xpath("//span[@class='intialtext']"));
		btnAddToCart.click();
		
		driver.quit();
		
	}
}
