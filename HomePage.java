package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod {

	public HomePage(ChromeDriver driver) {
		this.driver = driver;
	}

	public HomePage clickToggleButton() throws InterruptedException  {
		

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement clickToggle = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
//		driver.executeScript("arguments[0].click();", clickToggle);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		return this;
	}

	public AppLauncher clickViewAll() throws InterruptedException {
		Thread.sleep(8000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement clickViewAll = driver.findElement(By.xpath("(//button[@class='slds-button'])[2]"));
		js.executeScript("arguments[0].click();", clickViewAll);
		return new AppLauncher(driver);
	}

}
