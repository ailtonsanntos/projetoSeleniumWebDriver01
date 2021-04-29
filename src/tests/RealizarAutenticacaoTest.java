package tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


class RealizarAutenticacaoTest {

	@Test
	void testAutenticarUsuarioComSucesso() {
		
		//Local driver Google Chrome 
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\Chrome\\89\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://lojaexemplod.lojablindada.com/customer/account/login/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ailtonaula02@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("adminadmin");
		
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
		
		String mensagem = driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[1]/div/div/div[2]/p[1]/strong")).getText();
		
		assertEquals(mensagem, "Olá, Ailton Santos!");
		
		driver.close();
	
		
	}

}
