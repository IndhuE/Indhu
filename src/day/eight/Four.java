package day.eight;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Four {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		List<WebElement> frame = driver.findElements(By.tagName("frame"));
		int size = frame.size();
		System.out.println(size);
		driver.switchTo().frame(0);
		WebElement btnContinue = driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']"));
		btnContinue.click();
		Thread.sleep(3000);
		driver.quit();	
	}
}
