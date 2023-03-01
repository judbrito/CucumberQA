package Steps;

import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import Entidades.AluguelService;
import Entidades.Filmes;
import Entidades.NotaAlguel;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class Locadora {
	private Filmes filme;
	private AluguelService aluguel = new AluguelService();
	private NotaAlguel nota;

	@Dado("que há um filme com estoque de {int} unidades")
	public void que_há_um_filme_com_estoque_de_unidades(int int1) {
		filme = new Filmes();
		filme.setEstoque(int1);
	}

	@Dado("o valor do aluguel é R$ {int}")
	public void o_valor_do_aluguel_é_R$(int int1) {
		filme.setAluguel(int1);
	}

	@Quando("eu alugar")
	public void eu_alugar() {
		nota = aluguel.alugar(filme);
	}

	@Então("o preço do aluguel será R$ {int}")
	public void o_preço_do_aluguel_será_R$(int int1) {
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

@Dado("que filme tem o estoque  {int} unidades")
public void que_filme_tem_o_estoque_unidades(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Quando("Alugar")
public void alugar() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Então("não será possivel")
public void não_será_possivel() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Então("estoque do filme é {int} unidade")
public void estoque_do_filme_é_unidade(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}



}