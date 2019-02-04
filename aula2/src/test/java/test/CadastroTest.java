package test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.CadastroPage;

public class CadastroTest {

	static WebDriver driver;
	static CadastroPage cadastroPage;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		cadastroPage = new CadastroPage(driver);
	}
	
	@Test
	public void test() {
		
		cadastroPage.preencherCampos();
		assertEquals(cadastroPage.validarExibicaoTela2(), "Criar sua Conta do Google");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//driver.close();
	}



}
