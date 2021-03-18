package day.eight;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class One {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demo.automationtesting.in/Alerts.html");
			WebElement btnClick = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
			btnClick.click();
			Alert alert = driver.switchTo().alert();
			alert.accept();
			Thread.sleep(4000);
			driver.quit();
		}
}
