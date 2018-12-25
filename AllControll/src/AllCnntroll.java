import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllCnntroll {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://softwaretesting-guru.blogspot.in/p/main-page");
		// maxmize browser
		driver.manage().window().maximize();
		// handle hyperlink Selenium Practice Page
		driver.findElement(By.linkText("Selenium Practice page")).click();
		// handling textbox using webdriver
		driver.findElement(By.name("Name")).sendKeys("selenium");
		// handle checkbox
		driver.findElement(By.name("subscribe")).click();
		// handling text box
		driver.findElement(By.name("comments")).sendKeys("Welcome to selenium tranning");
		// handle dropdown
		// Select(driver.findElement(By.name("countries"))).selectByVisibleText("text");
		// handle radio button
		driver.findElement(By.name("//input[@value='bad']")).click();
	}
}
