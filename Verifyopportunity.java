package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.ProjectSpecificMethod;

public class Verifyopportunity extends ProjectSpecificMethod {

	public Verifyopportunity(ChromeDriver driver) {
		this.driver = driver;
	}

	public void verOpportunity() {

		String verOpportunity = driver
				.findElement(By.xpath("//lightning-formatted-text[text()='Salesforce Automation by VimalRaj']"))
				.getText();
		if (verOpportunity.equals("Salesforce Automation by VimalRaj")) {
			System.out.println("Opportunity created successfully");
		} else {
			System.out.println("Opportunity was not created");
		}

	}
}
