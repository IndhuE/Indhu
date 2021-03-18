package day9;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class First {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/automation-practice-form/");
		WebElement txtFirstName = driver.findElement(By.id("firstName"));
		txtFirstName.sendKeys("Indhu");
		WebElement txtLastName = driver.findElement(By.id("lastName"));
		txtLastName.sendKeys("Elango");
		WebElement txtEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
		txtEmail.sendKeys("Indhu@gmail.com");
		WebElement btnGender = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]"));
		btnGender.click();
		WebElement txtContact = driver.findElement(By.xpath("//input[@id='userNumber']"));
		txtContact.sendKeys("976543210");
		WebElement btnDob = driver.findElement(By.id("dateOfBirthInput"));
		btnDob.click();
		//Thread.sleep(3000);
		Thread.sleep(3000);
		WebElement btnMonth = driver.findElement(By.id("dateOfBirthInput"));
		btnMonth.click();
		WebElement dropMonth = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select s = new Select(dropMonth);
		s.selectByVisibleText("August");
		//WebElement btnYear = driver.findElement(By.id("dateOfBirthInput"));
		//btnYear.click();
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		WebElement dropYear = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select s1=new Select(dropYear);
		s1.selectByVisibleText("1901");
		WebElement btnDay = driver.findElement(By.xpath("//div[text()='30']"));
		btnDay.click();
		
	}
}
