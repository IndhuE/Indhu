package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leven {
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
		WebElement dropRoom = driver.findElement(By.name("adult_room"));
		Select se = new Select(dropRoom);
		List<WebElement> options = se.getOptions();
		int roomCount = options.size();
		System.out.println("No of options available in Adults room:");
		System.out.println(roomCount);
		driver.quit();
	}
}
