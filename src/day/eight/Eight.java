package day.eight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eight {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__"
				+ "=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI\r\n"+"");
		WebElement btnTxtUser = driver.findElement(By.xpath("//input[@type='text']"));
		btnTxtUser.click();
		WebElement txtUserName = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	    txtUserName.sendKeys("Indhu");
		WebElement txtPassword = driver.findElement(By.xpath("(//input[@type='password'])[4]"));
		txtPassword.sendKeys("Indhu@123");
		WebElement btnLogin = driver.findElement(By.xpath("(//input[@type='Submit'])[1]"));
		btnLogin.click();
		driver.quit();
		
	}
}
