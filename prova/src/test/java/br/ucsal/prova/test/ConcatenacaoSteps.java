package br.ucsal.prova.test;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConcatenacaoSteps {

	@Test
	public void pegarVariaveisSet() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Seventech\\Desktop\\Faculdade\\4º Semestre\\Teste\\chromedriver.exe");

		WebDriver navegador = new ChromeDriver();

		navegador.get(
				"file:///C:/Users/Seventech/eclipse-workspace/prova/src/main/java/br/ucsal/prova/test/pagina.html");

		pegarVariaveis(navegador);
		concatenar(navegador);
		imprimirNomesConcatenados(navegador);
		navegador.quit();
	}

	@Given("informar primeiro e segundo nome")
	public void pegarVariaveis(WebDriver navegador) {

		navegador.findElement(By.id("nome")).sendKeys("Claudio");
		navegador.findElement(By.id("sobrenome")).sendKeys("Neiva");

	}

	@When("concatenar os nomes Claudio e Neiva")
	public void concatenar(WebDriver navegador) {

		navegador.findElement(By.id("botao")).click();
	}

	@Then("imprimir os nomes concatenados")
	public void imprimirNomesConcatenados(WebDriver navegador) {

		String nomeEsperado = "Claudio Neiva";

		String nomeConcatenado = navegador.findElement(By.id("nomesobrenome")).getText();

		Assert.assertEquals(nomeEsperado, nomeConcatenado);

	}
}
