package Steps;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import static Utilidades.Utils.obterData;
import Entidades.AluguelService;
import Entidades.Filmes;
import Entidades.NotaAluguel;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class Locadora {
	private Filmes filme;
	private AluguelService aluguel = new AluguelService();
	private NotaAluguel nota;
	private String estoqueZero;
	private String tipoAluguel;

	@Dado("que há um filme com estoque de {int} unidades")
	public void que_há_um_filme_com_estoque_de_unidades(int int1) {
		filme = new Filmes();
		filme.setEstoque(int1);

	}

	@Dado("o valor do aluguel é R$ {int}")
	public void o_valor_do_aluguel_é_R$(int int1) {
		filme.setAluguel(int1);
	}

	@Quando("alugar")
	public void alugar() {
		try {
			nota = aluguel.alugar(filme, tipoAluguel);

		} catch (RuntimeException e) {
			estoqueZero = e.getMessage();
		}
	}

	@Então("o preço do aluguel será R$ {int}")
	public void o_preço_do_aluguel_será_R$(int int1) {
	
		 Assert.assertNotNull(nota);
		    Assert.assertEquals(int1, nota.getPreco());
	}

	@Então("a data de entrega será no dia seguinte")
	public void a_data_de_entrega_será_no_dia_seguinte() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 1);

		Date dataRetorno = nota.getDataEntrega();
		Calendar calRetorno = Calendar.getInstance();
		calRetorno.setTime(dataRetorno);

		Assert.assertEquals(cal.get(Calendar.DAY_OF_MONTH), calRetorno.get(Calendar.DAY_OF_MONTH));
		Assert.assertEquals(cal.get(Calendar.MONTH), calRetorno.get(Calendar.MONTH));
		Assert.assertEquals(cal.get(Calendar.YEAR), calRetorno.get(Calendar.YEAR));
	}

	@Então("o estoque do filme será de {int} unidade.")
	public void o_estoque_do_filme_será_de_unidade(int int1) {

		Assert.assertEquals(int1, filme.getEstoque());
	}

	@Então("não será possivel")
	public void nãoSeráPossivel() {
		Assert.assertEquals("Filme sem estoque", estoqueZero);
	}

	@Dado("que o tipo de aluguel seja R$ seja extendida")
	public void que_o_tipo_de_aluguel_seja_R$_seja_extendida() {
		tipoAluguel = "extendido";
	}

	@Então("a data de entrega será em {int} dias")
	public void a_data_de_entrega_será_em_dias(int int1) {
		Date dataEspera = obterData(3);
		Date dataReal = nota.getDataEntrega();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Assert.assertEquals(format.format(dataEspera), format.format(dataReal));
	}

	@Então("a pontuação será de {int} pontos")
	public void a_pontuação_será_de_pontos(int int1) {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

}
