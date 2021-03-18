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

public class Seven {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement btnInterview = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",btnInterview);
		js.executeScript("arguments[0].click()", btnInterview);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File dummyScreenshot = ts.getScreenshotAs(OutputType.FILE);
		File newScrnshot=new File("D:\\rs.jana THEMES\\Screenshot\\Interview Questions.png");
		System.out.println(newScrnshot);
		FileUtils.copyFile(dummyScreenshot, newScrnshot);
		Thread.sleep(3000);
		driver.quit();
	}
}
