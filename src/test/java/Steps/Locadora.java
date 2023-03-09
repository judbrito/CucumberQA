package Steps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Map;

import org.junit.Assert;

import static Utilidades.Utils.obterData;
import Entidades.AluguelService;
import io.cucumber.core.cli.Main;

import Entidades.Filmes;
import Entidades.NotaAluguel;
import Entidades.TipoAluguel;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

@SuppressWarnings("unused")
public class Locadora {
	private static final String Interger = null;
	private Filmes filme;
	private AluguelService aluguel = new AluguelService();
	private NotaAluguel nota;
	private String estoqueZero;
	private TipoAluguel tipoAluguel;

	@Dado("que há um filme com estoque de {int} unidades")
	public void que_há_um_filme_com_estoque_de_unidades(int int1) {
		filme = new Filmes();
		filme.setEstoque(int1);

	}

	@Dado("que há um filme")
	public void que_há_um_filme(DataTable table) {
		Map<String, String> map = table.asMap(String.class, String.class);
		filme = new Filmes();
		filme.setEstoque(Integer.parseInt(map.get("estoque")));
		filme.setAluguel(Integer.parseInt(map.get("preço")));
		String tipo = map.get("tipo");
		tipoAluguel = tipo.equals("semanal") ? TipoAluguel.SEMANAL
				: tipo.equals("estendido") ? TipoAluguel.ESTENDIDO : TipoAluguel.COMUM;

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
		Assert.assertEquals(int1, nota.getPreco());
	}
 
	@Então("o estoque do filme será de {int} unidade.")
	public void o_estoque_do_filme_será_de_unidade(int int1) {

		Assert.assertEquals(int1, filme.getEstoque());
	}

	@Então("não será possivel")
	public void nãoSeráPossivel() {
		Assert.assertEquals("Filme sem estoque", estoqueZero);
	}

	@Dado("que o tipo de aluguel seja (.*)$")
	public void que_o_tipo_de_aluguel_seja_estendido(String tipo) {
		tipoAluguel = tipo.equals("semanal") ? TipoAluguel.SEMANAL
				: tipo.equals("estendido") ? TipoAluguel.ESTENDIDO : TipoAluguel.COMUM;

	}

	@Então("a data de entrega será em {int} dia")
	public void a_data_de_entrega_será_em_dia(int int1) {
		Date dataEspera = obterData(int1);
		Date dataReal = nota.getDataEntrega();
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Assert.assertEquals(format.format(dataEspera), format.format(dataReal));
	}

	@Então("a pontuação será de {int} pontos")
	public void a_pontuação_será_de_pontos(int int1) {
		Assert.assertEquals(int1, nota.getPontos());

	}

}
