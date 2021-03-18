package day.eight;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Third {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement btnClk = driver.findElement(By.xpath("//a[@href='#Textbox']"));
		btnClk.click();
		WebElement btnClick = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		btnClick.click();
		Robot robot = new Robot();
		Alert alert = driver.switchTo().alert();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		alert.accept();
		Thread.sleep(4000);
		driver.quit();
	}
}
