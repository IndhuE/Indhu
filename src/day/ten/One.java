package day.ten;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class One {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebElement searchPhone = driver.findElement(By.id("twotabsearchtextbox"));
		searchPhone.sendKeys("iPhone X",Keys.ENTER);
		WebElement rightClick = driver.findElement(By.xpath("//a[@class='a-size-base-plus a-link-normal']"));
		Actions actions = new Actions(driver);
		actions.contextClick(rightClick).perform();
		Robot robot = new Robot();
		for (int i = 1; i <=2; i++) {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		String firstWindow= driver.getWindowHandle();
		System.out.println(firstWindow);
		Set<String> secWindow = driver.getWindowHandles();
		System.out.println(secWindow);
		for (String string : secWindow) {
			if(!(firstWindow.equals(string))){
				driver.switchTo().window(string);
			}
		}
		WebElement price = driver.findElement(By.xpath("//span[@style='background-color:#7FDA69!important']"));
		String prntPrice = price.getText();
		System.out.println(prntPrice);
		Thread.sleep(4000);
		driver.quit();
	}
}
