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

public class Nine {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement clkCancel = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clkCancel.click();
		WebElement txtSearch = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		Actions actions = new Actions(driver);
		txtSearch.sendKeys( "IPhone",Keys.ENTER);
		Thread.sleep(6000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File dummyScrnshot = ts.getScreenshotAs(OutputType.FILE);
		File iPhoneScreenshot=new File("D:\\rs.jana THEMES\\Screenshot\\IphoneScreenshot.png");
		FileUtils.copyFile(dummyScrnshot, iPhoneScreenshot);
		System.out.println(iPhoneScreenshot);
		driver.quit();
		
	}
}
