package pages;

import elements.KartElements;

public class FinalizarComprasPage extends ProdutosPage {

	KartElements e = new KartElements();

	public void finalizarCompra() {
		escrever(e.getFirstName(), letterGenerator(4));
		escrever(e.getLastName(), letterGenerator(4));
		escrever(e.getPostalCode(), numberGenerator(8));
		click(e.getBtnContinue());
		click(e.getBtnFinish());
		threadSleep(3000);
		screenShot("Compra realizada com sucesso");
		threadSleep(2000);
		fecharBrowser();
	}

	public void validarValorTotal() {
		escrever(e.getFirstName(), letterGenerator(4));
		escrever(e.getLastName(), letterGenerator(4));
		escrever(e.getPostalCode(), numberGenerator(8));
		click(e.getBtnContinue());
		barra(e.getValorTotal());
		String valorTotal = driver.findElement(e.getValorTotal()).getText();
		assertText(e.getValorTotal(), valorTotal);
		screenShot("Valor total da compra");
		threadSleep(2000);
		fecharBrowser();

	}

}
