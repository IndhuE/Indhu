package day.ten;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Four {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("http://www.greenstechnologys.com/python-training.html");
		WebElement btnSelenium = driver.findElement(By.xpath("(//h3[@class='panel-title'])[24]"));
		js.executeScript("arguments[0].click()",btnSelenium);
		//		btnSelenium.click();
		WebElement clkDay10 = driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']"));
		js.executeScript("arguments[0].click()", clkDay10);
		//		clkDay10.click();
		WebElement clkWindownHandling = driver.findElement(By.xpath("//button[text()='Windows Handling']"));
//		clkWindownHandling.click();
		js.executeScript("arguments[0].click()", clkWindownHandling);
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		for (String string : args) {
			if(!(string.equals(windowHandle))) {
				driver.switchTo().window(string);
			}
		}
		System.out.println("QUESTION 1\r\n" + 
				"----------\r\n" + 
				"URL : https://www.amazon.com/\r\n" + 
				"\r\n" + 
				"NOTE: Search iphones X and right click 1st phone and give open in new window \r\n" + 
				"      Increase quantity of phone as 5\r\n" + 
				"");
		driver.quit();
		
	}
	
}
