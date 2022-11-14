package CICDDemoGUI.CICDDemoGUI;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		 driver = WebDriverManager.chromedriver().create();
		 driver.manage().window().fullscreen();
	}
	
	
	@Test
	public void test1() {
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void test2() {
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void test3() {
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void test4() {
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
