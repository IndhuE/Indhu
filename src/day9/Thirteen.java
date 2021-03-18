package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Thirteen {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://output.jsbin.com/osebed/2");
		WebElement selectFruits = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select se = new Select(selectFruits);
		List<WebElement> listFruits = se.getOptions();
		for (int i = 0; i < listFruits.size(); i++) {
			WebElement prntFruits = listFruits.get(i);
			se.selectByIndex(i);
		}
		WebElement firstSelectedOption = se.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println("first selected option:");
		System.out.println(text);
	}	
}
