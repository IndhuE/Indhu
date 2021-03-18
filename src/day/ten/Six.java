package day.ten;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Six {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement btnFrameworkT = driver.findElement(By.xpath("(//h2[@class='mb-0'])[6]"));
		btnFrameworkT.click();
		WebElement btnJunit = driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/JUNIT.txt']"));
		btnJunit.click();
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		for (String string : windowHandles) {
			if(!(string.equals(windowHandle))) {
				driver.switchTo().window(string);
			}
		}
		System.out.println("QUESTION 1\r\n" + 
				"----------\r\n" + 
				"URL : https://www.facebook.com/\r\n" + 
				"\r\n" + 
				"NOTE: Enter the username and password and verify whether the input data is correct or not by using junit framework.\r\n" + 
				"");
		driver.quit();
	}
}
