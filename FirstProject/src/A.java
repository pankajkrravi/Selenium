import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {
	public static void main(String[] args) {
		System.out.println(1);
		WebDriver wd = new FirefoxDriver();// open browser
		wd.getClass();
		System.out.println(2);
		wd.get(".facebook.com");
		System.out.println(3);
		System.out.println(wd.getTitle());
		WebElement wb = wd.findElement(By.id("email"));

	}
}
