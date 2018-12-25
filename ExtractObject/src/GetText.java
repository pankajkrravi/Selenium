import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Selenium || WebDriver Third Session : Extract Object using WebDriver
public class GetText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// lunch browser
		WebDriver driver = new ChromeDriver();
		// enter url
		driver.get("http://www.w3schools.com/html/html_tables.asp");
		String name = driver.findElement(By.xpath(".//*[@id='main']/table[1]/tbody/tr[3]/td[2]")).getText();
		System.out.println(name);
		//verification (expected o/p)
		String expectedname = "kumar";
		if (expectedname.equalsIgnoreCase(name)) 
			System.out.println("Test case is  pass");
		
		else
			System.out.println("Test case failed ");
	}
}
