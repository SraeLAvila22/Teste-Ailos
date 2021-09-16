package pages;

import elements.LoginElements;

public class LoginPage extends Metodos {

	LoginElements e = new LoginElements();

	public void loginBloquado() {
		escrever(e.getUsername(), "locked_out_user");
		escrever(e.getPassword(), "secret_sauce");
		click(e.getBtnLogin());

	}

	public void loginValido() {
		escrever(e.getUsername(), "standard_user");
		escrever(e.getPassword(), "secret_sauce");
		click(e.getBtnLogin());

	}

	public void validarMsgBloqueio() {
		screenShot("Usuário bloqueado com mensagem de bloqueio exibida");
		fecharBrowser();
	}

}
