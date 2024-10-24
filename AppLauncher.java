package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectSpecificMethod;

public class AppLauncher extends ProjectSpecificMethod {
	public AppLauncher(ChromeDriver driver) {
		this.driver = driver;
	}

	public SalesPage clickSales() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement clickSales = driver.findElement(By.xpath("//p[text()='Sales']"));
		js.executeScript("arguments[0].click();", clickSales);
		return new SalesPage(driver);

	}

}
