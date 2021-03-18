package day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eighth {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement coreJavaScrnshot = driver.findElement(By.xpath("(//h2[@class='mb-0'])[1]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", coreJavaScrnshot);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File dummyScrnshot = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(dummyScrnshot);
		File newScrnshot=new File("D:\\rs.jana THEMES\\Screenshot\\CoreJavaTestpaper.png");
		FileUtils.copyFile(dummyScrnshot, newScrnshot);
		driver.quit();
	}
}
