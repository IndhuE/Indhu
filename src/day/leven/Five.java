package day.leven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Five {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		WebElement table = driver.findElement(By.xpath("//table[@border='l']"));
		List<WebElement> rowData = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < rowData.size(); i++) {
			if(i%2==0) {
				WebElement row = rowData.get(i);
				String evenRows = row.getText();
				System.out.println(evenRows);
			}
			
			
		}

	}
}
