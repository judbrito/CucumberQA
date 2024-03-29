package Steps.senhorBarriga;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class SiteBarriga {
	public static WebDriver driver;

	@Dado("que estou acessando a aplicação")
	public void queEstouAcessandoAAplicação() {
		driver = new ChromeDriver();
		driver.get("https://seubarriga.wcaquino.me/");

	}

	@Quando("informo o usuário {string}")
	public void informoOUsuário(String string) {

		driver.findElement(By.id("email")).sendKeys(string);

	}

	@Quando("a senha {string}")
	public void aSenha(String string) {
		driver.findElement(By.id("senha")).sendKeys(string);
	}

	@Quando("seleciono entrar")
	public void selecionoEntrar() {
		driver.findElement(By.className("btn-primary")).click();

	}

	@Então("visualizo a página inicial")
	public void visualizoAPáginaInicial() {
		String texto = driver.findElement(By.className("alert-success")).getText();
		Assert.assertEquals("Bem vindo, BRITOBRITO!", texto);

	}

	@Quando("seleciono Contas")
	public void selecionoContas() {
		driver.findElement(By.linkText("Contas")).click();

	}

	@Quando("seleciono Adicionar")
	public void selecionoAdicionar() {
		driver.findElement(By.linkText("Adicionar")).click();

	}

	@Quando("informo a conta {string}")
	public void informoAConta(String string) {
		driver.findElement(By.id("nome")).sendKeys(string);

	}

	@Quando("seleciono Salvar")
	public void selecionoSalvar() {
		driver.findElement(By.className("btn-primary")).click();

	}

	@Então("a conta é inserida com sucesso")
	public void aContaÉInseridaComSucesso() {

		String texto = driver.findElement(By.xpath("//div[@class='alert-success']")).getText();
		Assert.assertEquals("Conta adicionada com sucesso!", texto);

	}

	@Então("sou notificado que o nome da conta é obrigatório")
	public void souNotificadoQueONomeDaContaÉObrigatório() {
		String texto = driver.findElement(By.xpath("//div[@class='alert-danger']")).getText();
		Assert.assertEquals("Informe o nome da conta", texto);

	}

	@Então("sou notificado que já existe uma conta com esse nome")
	public void souNotificadoQueJáExisteUmaContaComEsseNome() {
		String texto = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		Assert.assertEquals("Já existe uma conta com esse nome!", texto);
	

	}

	@Então("recebo a mensagem {string}")
	public void receboAMensagem(String string) {
		String texto = driver.findElement(By.xpath("//div[starts-with(@class,'alert alert-')]")).getText();
		Assert.assertEquals(string, texto);

	}
	@After
	
	public void fechar() {
	driver.quit();
	}

}
