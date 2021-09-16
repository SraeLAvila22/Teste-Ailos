package elements;

import org.openqa.selenium.By;

public class LoginElements {
	
	private By username = By.id("user-name");
	private By password = By.id("password");
	private By btnLogin = By.id("login-button");
	
	
	public By getUsername() {
		return username;
	}
	public By getPassword() {
		return password;
	}
	public By getBtnLogin() {
		return btnLogin;
	}

}
