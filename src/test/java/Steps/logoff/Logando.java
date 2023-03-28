package Steps.logoff;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class Logando {
	
 static WebDriver driver;

	@Before

	public  void navegar() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public  void fecharPagina() {
		driver.quit();
	}

	@Dado("que o usuário navegue na pagina")
	public void queOUsuárioNavegueNaPagina() {
		driver.get("https://www.amazon.com.br/");

	}

	@Quando("digite o {string} e {string}")
	public void digiteOE(String string, String string2) {
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();

		WebElement login = driver.findElement(By.id("ap_email"));
		login.sendKeys(string);
		driver.findElement(By.id("continue")).click();

		WebElement passWord = driver.findElement(By.id("ap_password"));
		passWord.sendKeys(string2);
		driver.findElement(By.id("signInSubmit")).click();
	}

	@Então("seguida a mensagem exibida Login com sucesso")
	public void seguidaAMensagemExibidaLoginComSucesso() {
		System.out.println("Login Successfully");
		driver.quit();
	}

	@Quando("clicar em sair")
	public void clicarEmSair() {

		WebElement elemento = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions look = new Actions(driver);
		look.moveToElement(elemento).build().perform();

		driver.findElement(By.xpath("//a[@id='nav-item-signout']//span")).click();

	}

	@Então("a mensagem exibida Saiu com sucesso")
	public void aMensagemExibidaSaiuComSucesso() {
		System.out.println("LogOut Successfully");

	}

}
