package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sixth {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		WebElement dropCountry = driver.findElement(By.xpath("//select[@name='country']"));
		Thread.sleep(4000);
		Select se = new Select(dropCountry);
		List<WebElement> countryOptions = se.getOptions();
		for (int i = 0; i < countryOptions.size(); i++) {
			WebElement j = countryOptions.get(i);
			String text = j.getText();
			System.out.println(text);
			
		}
		
		
	}
}
