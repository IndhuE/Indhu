package day.ten;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seven {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement btnCoreJava = driver.findElement(By.xpath("//div[@id='heading302']"));
		btnCoreJava.click();
		WebElement clkControlSt = driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/Day4_ControlStatements.txt']"));
		clkControlSt.click();
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		for (String string : windowHandles) {
			if(!(string.equals(windowHandle))) {
				driver.switchTo().window(string);
			}
		}
		System.out.println("1.What is difference between break and continue?");
		driver.quit();
	
	}
}
