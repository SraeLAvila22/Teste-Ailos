package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metodos extends Browser {
	
	JavascriptExecutor jse = (JavascriptExecutor) driver;

	/**
	 * Metodo para clicar em um elemento
	 * 
	 * @author Israel
	 * @param passo
	 * @param element
	 */
	public void click(By element) {
		try {
			driver.findElement(element).click();
		} catch (Exception e) {
			System.err.println("----- error ao clilcar no elemento " + e.getMessage());
		}
	}

	/**
	 * Metodo para escrever em um elemento
	 * 
	 * @author Israel
	 * @param element
	 * @param text
	 * @param passo
	 */
	public void escrever(By element, String text) {
		try {
			driver.findElement(element).sendKeys(text);
		} catch (Exception e) {
			System.err.println("----- error ao escrever no elemento " + e.getMessage());
		}
	}

	/**
	 * Metodo para clicar por texto usando a tag e texto do HTML
	 * 
	 * @author Israel
	 * @param passo
	 * @param tag
	 * @param text
	 */
	public void clickByText(String tag, String texto) {
		try {
			driver.findElement(By.xpath("//" + tag + "[text()= '" + texto + "']")).click();
		} catch (Exception e) {
			System.err.println("-------- error ao clilcar peo texto " + e.getMessage());
		}

	}

	public void waitElement(int time) {
		try {
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.err.println("-------- error ao aguardar " + e.getMessage());
		}

	}

	/**
	 * Metodo para pausar a execução do teste utilizar 1000 para um segundo e assim
	 * por diante.
	 * 
	 * @author Israel
	 * @param time
	 */
	public void threadSleep(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			System.err.println("-------- error ao pausar a aplicação " + e.getMessage());
		}

	}

	/**
	 * Metodo para gerar massa de teste com letras aleatórias + nome escolhido
	 * 
	 * @author Israel
	 * @return
	 */
	public String nameGenerator(int quantLetras, String nome) {
		String generatedString = RandomStringUtils.randomAlphabetic(quantLetras);
		return (nome + generatedString);

	}

	/**
	 * Metodo para gerar um email com 4 letras aleatórias
	 * 
	 * @author Israel
	 * @return
	 */
	public String emailgenerator() {
		String generatedString = RandomStringUtils.randomAlphabetic(4);
		return (generatedString + "@accenture.com");
	}

	/**
	 * Metodo para gerar uma senha com 4 letras aleatórias + nome escolhido
	 * 
	 * @author Israel
	 * @return
	 */
	public String passgenerator(String nome) {
		String generatedString = RandomStringUtils.randomAlphabetic(4);
		return (nome + generatedString);
	}

	/**
	 * Metodo para validar texto
	 * 
	 * @author Israel
	 * @param element
	 * @param textoEsperado
	 * @param passo
	 */
	public void assertText(By element, String textoEsperado) {
		try {
			String screenText = driver.findElement(element).getText();
			assertEquals(textoEsperado, screenText);
			System.out.println("O texto esperado foi " + screenText);
		} catch (Exception e) {
			System.err.println("-------- error ao validar texto " + e.getMessage());
		}

	}

	public void screenShot(String nomeEvidencia) {
		try {
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./src/Evidencias/" + nomeEvidencia + ".png");
			FileUtils.copyFile(scrFile, destFile);

		} catch (Exception e) {
			System.err.println("-------- error ao tirar screenShot " + e.getMessage());
		}

	}

	/**
	 * Metodo para aguardar um elemento clicavel
	 * 
	 * @author Israel
	 * @param element
	 */
	public void aguardar(By element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(element));

		} catch (Exception e) {
			System.err.println("------- error ao aguardar elemento " + e.getMessage() + e.getCause());
		}

	}

	/**
	 * Metodo para submeter o elemento (ENTER)
	 * 
	 * @author Israel
	 * @param elemento
	 */
	public void submit(By elemento) {
		driver.findElement(elemento).submit();
	}

	public String numberGenerator(int quantNumeros) {
		String generatedNumber = RandomStringUtils.randomNumeric(quantNumeros);
		return generatedNumber;
	}

	/**
	 * Metodo parar gerar letras aleatórias independentes
	 * 
	 * @author Israel
	 * @param quantLetras
	 * @return
	 */
	public String letterGenerator(int quantLetras) {
		String generatedString = RandomStringUtils.randomAlphabetic(quantLetras);
		return "Ailos" + generatedString;

	}
	
	public void barra(By elemento) {
		try {
			WebElement element = driver.findElement(elemento);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		} catch (Exception e) {
			System.err.println("----------- error ao rolar a tela " + e.getMessage());
		}
		
	}

}
