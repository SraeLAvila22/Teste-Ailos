package pages;

import elements.ProductElements;

public class ProdutosPage extends LoginPage {

	ProductElements e = new ProductElements();

	public void escolherProdutos() {
		click(e.getBackpack());
		click(e.getBikelight());
		threadSleep(2000);
		click(e.getKart());
		threadSleep(2000);
		click(e.getCheckout());
	}
	
	public void comprarTodosOsProdutos() {
		click(e.getBackpack());
		click(e.getBikelight());
		click(e.getBoltTshirt());
		click(e.getFleeceJacket());
		click(e.getOnesie());
		click(e.getTshirtRed());
		threadSleep(2000);
		click(e.getKart());
		threadSleep(2000);
		click(e.getCheckout());
	}

}
