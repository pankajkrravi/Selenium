package com.goomo.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Doenloading {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		// driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java download");
		// click enter button
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);// wait 2 seconds
		// driver.findElement(By.linkText("Download Free Java
		// Software")).click();
		driver.findElement(By.linkText("Download Free Java Software")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='jvdl0 jvdl0v0']/a/span")).click();
		Thread.sleep(5000);
		// click on agree and start free download
		driver.findElement(By.xpath("")).click();
		Thread.sleep(5000);
		// handling window keyboard
		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		// click on enter option
		robot.keyPress(KeyEvent.VK_ENTER);
	}
}
// video 29 9:40