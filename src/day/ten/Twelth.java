package day.ten;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twelth {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/python-training.html");
		WebElement btnSelTest = driver.findElement(By.xpath("(//h3[@class='panel-title'])[24]"));
		//btnSelTest.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", btnSelTest);
		js.executeScript("arguments[0].click()", btnSelTest);
		WebElement btnSelDay9 = driver.findElement(By.xpath("(//h3[@class='panel-title'])[33]"));
		js.executeScript("arguments[0].click()",btnSelDay9);
		//btnSelDay9.click();
		WebElement clkWindowHandling = driver.findElement(By.xpath("(//button[@class='let-us-now pinkbutton ga-click'])[33]"));
		js.executeScript("arguments[0].click()",clkWindowHandling);
		//		clkWindowHandling.click();
		
	}
}
