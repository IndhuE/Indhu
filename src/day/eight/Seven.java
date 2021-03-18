package day.eight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seven {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("login_page");
		WebElement txtUserId = driver.findElement(By.xpath("//input[@type='text']"));
		txtUserId.sendKeys("Indhu");
		WebElement btnContinue = driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']"));
		btnContinue.click();
		WebElement txtPassword = driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));
		txtPassword.sendKeys("123");
		Thread.sleep(3000);
		driver.quit();	
		
		
	}
}
