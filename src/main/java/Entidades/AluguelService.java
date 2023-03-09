package Entidades;

import static Utilidades.Utils.obterData;

public class AluguelService {

	public NotaAluguel alugar(Filmes filme, TipoAluguel tipo) {
		if (filme.getEstoque() == 0)
			throw new RuntimeException("Filme sem estoque");

		NotaAluguel nota = new NotaAluguel();
		switch (tipo) {
		case COMUM:
			nota.setPreco(filme.getAluguel());
			nota.setDataEntrega(obterData(1));
			nota.setPontos(1);

			break;
		case ESTENDIDO:
			nota.setPreco(filme.getAluguel()* 2);
			nota.setDataEntrega(obterData(3));
			nota.setPontos(2);

			break;
		case SEMANAL:
			nota.setPreco(filme.getAluguel() * 3);
			nota.setDataEntrega(obterData(7));
			nota.setPontos(3);

			break;
		}

		filme.setEstoque(filme.getEstoque() - 1);
		return nota;

	}

}
