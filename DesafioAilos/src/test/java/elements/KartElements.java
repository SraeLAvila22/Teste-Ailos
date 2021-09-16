package elements;

import org.openqa.selenium.By;

public class KartElements {
	
	
	private By firstName = By.id("first-name"); 
	private By lastName = By.id("last-name");
	private By postalCode = By.id("postal-code");
	private By btnContinue = By.id("continue");
	private By btnFinish = By.id("finish");
	private By valorTotal = By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[7]");
	
	
	public By getFirstName() {
		return firstName;
	}
	public By getLastName() {
		return lastName;
	}
	public By getPostalCode() {
		return postalCode;
	}
	public By getBtnContinue() {
		return btnContinue;
	}
	public By getBtnFinish() {
		return btnFinish;
	}
	public By getValorTotal() {
		return valorTotal;
	}

}
