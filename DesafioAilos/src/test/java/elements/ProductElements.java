package elements;

import org.openqa.selenium.By;

public class ProductElements {

	private By backpack = By.id("add-to-cart-sauce-labs-backpack");
	private By bikelight = By.id("add-to-cart-sauce-labs-bike-light");
	private By boltTshirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
	private By fleeceJacket = By.id("add-to-cart-sauce-labs-fleece-jacket");
	private By onesie = By.id("add-to-cart-sauce-labs-onesie");
	private By tshirtRed = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
	private By kart = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	private By checkout = By.id("checkout");

	public By getCheckout() {
		return checkout;
	}

	public By getBackpack() {
		return backpack;
	}

	public By getBikelight() {
		return bikelight;
	}

	public By getBoltTshirt() {
		return boltTshirt;
	}

	public By getFleeceJacket() {
		return fleeceJacket;
	}

	public By getOnesie() {
		return onesie;
	}

	public By getTshirtRed() {
		return tshirtRed;
	}

	public By getKart() {
		return kart;
	}

}
