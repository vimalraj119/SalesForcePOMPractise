package baseclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {

	public ChromeDriver driver;
	public ChromeOptions options;

	@BeforeMethod
	public void precondition() {
		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		driver.get("https://login.salesforce.com/");
	}
		

	@AfterMethod
	public void postcondition() {
		driver.close();
	}

}
