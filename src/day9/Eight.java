package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Eight {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/index.php");
		WebElement txtUserName = driver.findElement(By.xpath("//input[@id='username']"));
		txtUserName.sendKeys("IndhuElango");
		WebElement txtPassword = driver.findElement(By.xpath("//input[@id='password']"));
		txtPassword.sendKeys("Nila@123");
		WebElement btnLogin = driver.findElement(By.xpath("//input[@id='login']"));
		btnLogin.click();
		Thread.sleep(2000);
		//
		WebElement dropLocation = driver.findElement(By.xpath("//select[@id='location']"));
		Select se = new Select(dropLocation);
		se.selectByVisibleText("London");
		Thread.sleep(2000);
		WebElement dropHotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select se1=new Select(dropHotel);
		se1.selectByIndex(1);
		Thread.sleep(2000);
		WebElement dropRoom = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select se2=new Select(dropRoom);
		se2.selectByValue("Super Deluxe");
		Thread.sleep(2000);
		WebElement dropRooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select se3=new Select(dropRooms);
		se3.selectByValue("5");
		Thread.sleep(2000);
		WebElement txtCheckInDate = driver.findElement(By.id("datepick_in"));
		txtCheckInDate.sendKeys("5/3/21");
		Thread.sleep(2000);
		WebElement txtCheckOutDate = driver.findElement(By.id("datepick_out"));
		txtCheckOutDate.sendKeys("8/3/21");
		Thread.sleep(2000);
		WebElement dropAdults = driver.findElement(By.id("adult_room"));
		Select se4=new Select(dropAdults);
		se4.selectByVisibleText("3 - Three");
		Thread.sleep(2000);
		WebElement dropChildren = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select se5=new Select(dropChildren);
		se5.selectByVisibleText("0 - None");
		WebElement btnSubmit = driver.findElement(By.xpath("//input[@id='Submit']"));
		btnSubmit.click();
		//
		WebElement clkRadioButton = driver.findElement(By.id("radiobutton_0"));
		clkRadioButton.click();
		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();
		//
		WebElement txtFirst = driver.findElement(By.xpath("//input[@id='first_name']"));
		txtFirst.sendKeys("Indhu");
		WebElement txtLast = driver.findElement(By.xpath("//input[@id='last_name']"));
		txtLast.sendKeys("Elango");
		WebElement txtAddress = driver.findElement(By.xpath("//textarea[@id='address']"));
		txtAddress.sendKeys("OMR");
		WebElement txtCredit = driver.findElement(By.xpath("//input[@id='cc_num']"));
		txtCredit.sendKeys("9780654321123456");
		WebElement dropCard = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select se11 = new Select(dropCard);
		se11.selectByVisibleText("VISA");
		Thread.sleep(2000);
		WebElement dropDate = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select se12 = new Select(dropDate);
		se12.selectByVisibleText("April");
		Thread.sleep(2000);
		WebElement dropYear = driver.findElement(By.name("cc_exp_year"));
		Select se13 = new Select(dropYear);
		se13.selectByVisibleText("2022");
		Thread.sleep(2000);
		WebElement txtCvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		txtCvv.sendKeys("123");
		WebElement btnBookNow = driver.findElement(By.id("book_now"));
		btnBookNow.click();
		Thread.sleep(4000);
		WebElement ordrNo = driver.findElement(By.xpath("//input[@name='order_no']"));
		String orderNO = ordrNo.getAttribute("value");
		System.out.println("Order no:");
		System.out.println(orderNO);
		
		
	}
}
