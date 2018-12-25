import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.jotform.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		Actions actions = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//span[text=]"));

		WebElement target = driver.findElement(By.id("list"));
		// element.dragAndDrop(source,target).build().perform();
	}
}
