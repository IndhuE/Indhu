package day.eight;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Second {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement btnClk = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		btnClk.click();
		WebElement btnClick = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		btnClick.click();
		Actions actions = new Actions(driver);
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		Thread.sleep(4000);
		driver.quit();
		
	}
}
