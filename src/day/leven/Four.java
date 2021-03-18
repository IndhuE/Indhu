package day.leven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Four {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		WebElement table = driver.findElement(By.xpath("//table[@border='l']"));
		List<WebElement> rowData = driver.findElements(By.tagName("td"));
		for (int i = 1; i < rowData.size(); i++) {
				WebElement data = rowData.get(i);
				String text = data.getText();
				if(text.equals("fourth cell")) {
					System.out.println(text);
				}
		}
		driver.quit();
		
	}
}
