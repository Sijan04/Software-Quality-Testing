package autotesting;

import org.openqa.selenium.WebDriver;

public class Base {

	 public static WebDriver getDriver()
	 {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	 }
	
}
