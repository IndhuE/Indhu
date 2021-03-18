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

public class Five {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement scrollDown = driver.findElement(By.xpath("//div[@class='card-header111 d-flex align-items-center justify-content-between']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File screenshotAs=ts.getScreenshotAs(OutputType.FILE);
		File newfile=new File("D:\\rs.jana THEMES\\Screenshot\\JobopeningScreenshot.png");
		FileUtils.copyFile(screenshotAs, newfile);
		Thread.sleep(3000);
		WebElement scrollUp = driver.findElement(By.xpath("//h3[text()='Online Classroom']"));
		js.executeScript("arguments[0].scrollIntoView(false)", scrollUp);
		Thread.sleep(3000);
		driver.quit();
	
	}
}
