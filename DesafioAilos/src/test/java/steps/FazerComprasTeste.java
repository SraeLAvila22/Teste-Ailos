package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FinalizarComprasPage;

public class FazerComprasTeste extends FinalizarComprasPage{

	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String site) {
		abrirBrowser(site);
		threadSleep(3000);
	}

	@When("preencher os dados de usuario bloqueado")
	public void preencher_os_dados_de_usuario_bloqueado() {
		loginBloquado();
	}

	@Then("Valido a mensagem de bloqueio exibida")
	public void valido_a_mensagem_de_bloqueio_exibida() {
		validarMsgBloqueio();
	}

	@When("preencher os dados de login validos")
	public void preencher_os_dados_de_login_validos() {
		loginValido();
	}

	@When("escolher meus produtos")
	public void escolher_meus_produtos() {
		escolherProdutos();
	}

	@Then("finalizo minhas compras")
	public void finalizo_minhas_compras() {
		finalizarCompra();
	}

	@When("selecionar todos os produtos da loja")
	public void selecionar_todos_os_produtos_da_loja() {
		comprarTodosOsProdutos();
	}

	@Then("valido o valor total a ser pago")
	public void valido_o_valor_total_a_ser_pago() {
		validarValorTotal();
	}

}
