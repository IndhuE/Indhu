package day.ten;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fourteenth {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement btnFrameWork = driver.findElement(By.xpath("(//h2[@class='mb-0'])[6]"));
		btnFrameWork.click();
		WebElement clkTesting = driver.findElement(By.xpath("(//li[@class='pointer'])[91]"));
		clkTesting.click();
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		for (String string : windowHandles) {
			if(!(string.equals(windowHandle))) {
				driver.switchTo().window(string);
			}
		}
		System.out.println("4. What are all the annotations available in TestNG?\r\n" + 
				"");
		
		driver.quit();
	}
}
