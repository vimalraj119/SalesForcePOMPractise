package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectSpecificMethod;

public class NewOpportunity extends ProjectSpecificMethod {

	public NewOpportunity(ChromeDriver driver) {
		this.driver = driver;
	}

	public NewOpportunity enterName() {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by VimalRaj");
		return this;

	}

	public NewOpportunity enterAmount() {
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("75000");
		return this;
	}

	public NewOpportunity clickCloseDate() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Today']")).click();
		return this;
	}

	public NewOpportunity clickStageAndAnalysis() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement stage = driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input')])[2]"));
		js.executeScript("arguments[0].click();", stage);
		driver.findElement(By.xpath("//span[@class='slds-media__body']//span[text()='Needs Analysis']")).click();
		return this;
	}

	public Verifyopportunity clickSave() {
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
		return new Verifyopportunity(driver);
	}

}
