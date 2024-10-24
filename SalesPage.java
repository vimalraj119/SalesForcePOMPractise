package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectSpecificMethod;

public class SalesPage extends ProjectSpecificMethod {

	public SalesPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public SalesPage clickOpportunities() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement clickOpportunity = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		js.executeScript("arguments[0].click();", clickOpportunity);
		return this;

	}

	public NewOpportunity clickNewButton() {
		driver.findElement(By.xpath("//div[text()='New']")).click();
		return new NewOpportunity(driver);
	}

}
