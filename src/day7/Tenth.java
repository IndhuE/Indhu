package day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tenth {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement txtSearch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Actions actions = new Actions(driver);
		txtSearch.sendKeys("motorolo",Keys.ENTER);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File dummyScrnshot = ts.getScreenshotAs(OutputType.FILE);
		File newScrnshot= new File("D:\\rs.jana THEMES\\Screenshot\\motorola.png");
		FileUtils.copyFile(dummyScrnshot, newScrnshot);
		Thread.sleep(3000);
		driver.quit();
		
	}
}
