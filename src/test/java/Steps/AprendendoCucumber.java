package Steps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AprendendoCucumber {

	@Given("que criei arquivo corretamente")
	public void que_criei_arquivo_corretamente() {

	}

	@When("executa-lo")
	public void executa_lo() {

	}

	@Then("especificacao deve finalizar com sucesso")
	public void especificacao_deve_finalizar_com_sucesso() {

	}

	private int contador = 0;

	@Given("O valor do contador e {int}")
	public void o_valor_do_contador_e(Integer int1) {
		contador = int1;

	}

	@When("Eu incremento {int}")
	public void eu_incremento(Integer int1) {
		contador = contador + int1;
	}

	@Then("o valor contador sera {int}")
	public void o_valor_contador_sera(Integer int1) {
		System.out.println("judriani");
		System.out.println(int1);
		System.out.println(contador);
		System.out.println(contador == int1);
		Assert.assertTrue(contador == int1);

	}

	Date entrega = new Date();

	@Given("Que a entrega e {int}\\/{int}\\/{int}")
	public void queAEntregaE(Integer dia, Integer mes, Integer ano) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, dia);
		cal.set(Calendar.MONTH, mes - 1);
		cal.set(Calendar.YEAR, ano);
		entrega = cal.getTime();
	}

	@When("Entrega e de {int} dias")
	public void entregaEDeDias(Integer int1) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		cal.add(Calendar.DAY_OF_MONTH, int1);
		entrega = cal.getTime();
	}

	@Then("A entrega sera dia {int}\\/{int}\\/{int}")
	public void aEntregaSeraDia(Integer dia, Integer mes, Integer ano) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, dia);
		cal.set(Calendar.MONTH, mes - 1);
		cal.set(Calendar.YEAR, ano);
		Date dataEsperada = cal.getTime();

		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatadaEsperada = format.format(dataEsperada);
		String dataFormatadaAtual = format.format(entrega);

		Assert.assertEquals(dataFormatadaEsperada, dataFormatadaAtual);
	}

	@Given("que o ticket é AF{int}")
	public void que_o_ticket_é_AF(Integer int1) {
		
		
	}

	@Given("que o valor da passagem é R$ {double}")
	public void que_o_valor_da_passagem_é_R$(Double double1) {
		
		
	}

	@Given("que o nome do passageiro é {string}")
	public void que_o_nome_do_passageiro_é(String string) {
		
		
	}

	@Given("que o telefone do passageiro é {int}{int}")
	public void que_o_telefone_do_passageiro_é(Integer int1, Integer int2) {
		
		
	}

	@When("criar os steps")
	public void criar_os_steps() {
		
		
	}

	@Then("o teste vai funcionar")
	public void o_teste_vai_funcionar() {
		
		
	}

	@Given("que o ticket é AB{int}")
	public void que_o_ticket_é_AB(Integer int1) {
		
		
	}

	@Given("que o ticket especial é AB{int}")
	public void que_o_ticket_especial_é_AB(Integer int1) {
		
		
	}

	@Given("que o ticket é CD{int}")
	public void que_o_ticket_é_CD(Integer int1) {
		
		
	}

	@Given("que o ticket é AG{int}")
	public void que_o_ticket_é_AG(Integer int1) {
		
		
	}

	@Given("que o valor da passagem é R$ {double}{double}")
	public void que_o_valor_da_passagem_é_R$(Double double1, Double double2) {
		
		
	}

}