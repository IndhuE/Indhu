package day.leven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Three {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		WebElement table = driver.findElement(By.xpath("//table[@border='l']"));
		List<WebElement> list = driver.findElements(By.tagName("tr"));
		int rowsCount = list.size();
		System.out.println("Number of rows count:"+rowsCount);
		driver.quit();
		}
		
	
	}

