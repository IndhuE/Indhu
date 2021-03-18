package day.ten;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Two {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		WebElement searchBox = driver.findElement(By.id("inputValEnter"));
		searchBox.sendKeys("Iphones 7",Keys.ENTER);
		WebElement phoneClick = driver.findElement(By.xpath("(//img[@class='product-image '])[1]"));
		phoneClick.click();
		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		for (String string : allWindows) {
			if(mainWindow !=string) {
				driver.switchTo().window(string);
			}
		}
		WebElement btnAddToCart = driver.findElement(By.id("add-cart-button-id"));
		btnAddToCart.click();
		WebElement price = driver.findElement(By.xpath("(//span[@class='price'])[2]"));
		String prntPrice = price.getText();
		System.out.println(prntPrice);
		driver.quit();
	}
}
