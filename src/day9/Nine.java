package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nine {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		WebElement txtUserName = driver.findElement(By.xpath("//input[@id='username']"));
		txtUserName.sendKeys("IndhuElango");
		WebElement txtPassword = driver.findElement(By.xpath("//input[@id='password']"));
		txtPassword.sendKeys("Nila@123");
		WebElement btnLogin = driver.findElement(By.xpath("//input[@id='login']"));
		btnLogin.click();
		WebElement dropRoomType = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select se = new Select(dropRoomType);
		List<WebElement> options = se.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement roomTypeList = options.get(i);
			String roomTypes = roomTypeList.getAttribute("value");
			System.out.println(roomTypes);
		}
		driver.quit();
	}

}
