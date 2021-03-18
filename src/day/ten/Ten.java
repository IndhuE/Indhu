package day.ten;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ten {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement btnCancel = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnCancel.click();
		WebElement txtSearch = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		txtSearch.sendKeys("mask",Keys.ENTER);
		WebElement clkMask = driver.findElement(By.xpath("//img[@class='_396cs4  _3exPp9']"));
		clkMask.click();
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		for (String string : windowHandles) {
			if(!(string.equals(windowHandle))) {
				driver.switchTo().window(string);
			}
		}
		WebElement txtPinCode = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtPinCode.sendKeys("600097");
		driver.quit();
	}
}
