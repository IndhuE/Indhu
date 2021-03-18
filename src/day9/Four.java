package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Four {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement btnCreateAcoount = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		btnCreateAcoount.click();
		Thread.sleep(4000);
		WebElement dropYear = driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[2]"));
		Select se = new Select(dropYear);
		List<WebElement> yearList = se.getOptions();
		for (int i = 0; i < yearList.size(); i++) {
			WebElement years = yearList.get(i);
			String textYear = years.getText();
			System.out.println(textYear);
		}
		driver.quit();
	}
}
