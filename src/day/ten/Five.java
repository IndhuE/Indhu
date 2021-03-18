package day.ten;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Five {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		Actions actions = new Actions(driver);
		WebElement courseMouseOver = driver.findElement(By.xpath("//a[@href='courses.html']"));
		actions.moveToElement(courseMouseOver).perform();
		WebElement clkPython = driver.findElement(By.xpath("(//span[text()='Python'])[1]"));
		clkPython.click();
		WebElement clkExploreCurriculam = driver.findElement(By.xpath("//button[@class='btn']"));
		actions.contextClick(clkExploreCurriculam).perform();
		Robot robot = new Robot();
		for (int i = 1; i <=2; i++) {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);	
		}
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		for (String string : windowHandles) {
			if(!(string.equals(windowHandle))) {
				driver.switchTo().window(string);
			}
		}
		driver.quit();		
	}
}
