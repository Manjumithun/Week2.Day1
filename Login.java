package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver=new ChromeDriver();
		//driver.get("http://leaftaps.com/opentaps/control/main");
		//driver.manage().window().maximize();
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		//GeckoDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.get("http://www.google.com");
		driver.manage().window().minimize();
		//identify uname field and enter the uname
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//identify password field and enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click on login
		driver.findElement(By.className("decorativeSubmit")).click();
		//to get page title in console
		String title=driver.getTitle();
		
	}

}
