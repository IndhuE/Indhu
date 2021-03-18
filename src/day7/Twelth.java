package day7;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Twelth {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement clkCancel = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clkCancel.click();
		WebElement firstCursor = driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[9]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(firstCursor).perform();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File dummyScrnshot = ts.getScreenshotAs(OutputType.FILE);
		File newScrnshot=new File("D:\\rs.jana THEMES\\Screenshot\\flipkart toy's screenshot.png");
		FileUtils.copyFile(dummyScrnshot, newScrnshot);
		System.out.println(newScrnshot);
		Thread.sleep(3000);
		driver.quit();
	}
}
