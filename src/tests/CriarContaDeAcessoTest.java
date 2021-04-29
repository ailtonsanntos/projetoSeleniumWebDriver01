package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class CriarContaDeAcessoTest {

	@Test
	void testCriarContaDeUsuarioComSucesso() {

		/* Função de teste para o passo 1 do caso de teste */

		System.setProperty("webdriver.chrome.driver", "c:\\WebDriver\\Chrome\\89\\chromedriver.exe");

		// Abrindo o navegador do Chrome.
		WebDriver driver = new ChromeDriver();

		// Acessar a página que será utilizada para os testes
		driver.get("https://lojaexemplod.lojablindada.com/customer/account/create/");

		// Maximizar a janela do navegador
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Ailton");

		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Santos");

		driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys("ailtonaula02@gmail.com");

		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("adminadmin");

		driver.findElement(By.xpath("//*[@id=\"confirmation\"]")).sendKeys("adminadmin");

		// clicar no botão para cadastrar o cliente
		driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[3]/button")).click();

		// ler a mensagem obtida pelo sistema

		String mensagem = driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[1]/div/div/ul/li/ul/li/span"))
				.getText();

		assertEquals(mensagem, "Obrigado por se registrar com LOJA EXEMPLO de Livros");

		driver.close();

	}

}
