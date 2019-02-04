package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroPage {
	
	static WebDriver driver;

	public CadastroPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void preencherCampos() {
		
		WebElement nome = driver.findElement(By.id("firstName"));
		nome.sendKeys("Camila");
		
		WebElement sobrenome = driver.findElement(By.id("lastName"));
		sobrenome.sendKeys("Monaco");

		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("monacocamila1");
		
		WebElement senha = driver.findElement(By.name("Passwd"));
		senha.sendKeys("Teste@1234");

		WebElement confirmarSenha = driver.findElement(By.name("ConfirmPasswd"));
		confirmarSenha.sendKeys("Teste@1234");

		WebElement btnProxima = driver.findElement(By.id("accountDetailsNext"));
		btnProxima.click();
		
	}	
	
	public String validarExibicaoTela2() {
		
		return driver.findElement(By.cssSelector("h1")).getText();
	}
	
	

}
