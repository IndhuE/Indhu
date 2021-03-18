package day.eight;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Six {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		WebElement continueLogin = driver.findElement(By.xpath("(//a[@href='javascript:void(0);'])[3]"));
		continueLogin.click();
		WebElement btnLogin = driver.findElement(By.xpath("(//input[@class='btn btn-default'])[1]"));
		btnLogin.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		driver.quit();
	}
}
