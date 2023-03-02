package Entidades;

import static Utilidades.Utils.obterData;



public class AluguelService {
	public NotaAluguel alugar(Filmes filme, String tipo) {
		if (filme.getEstoque() == 0)
			throw new RuntimeException("Filme sem estoque");
		NotaAluguel nota = new NotaAluguel();
		if("extendido".equals(tipo)) {
			nota.setPreco(filme.getAluguel()*2);			
			nota.setEntrega(obterData(3));
		}else {
			nota.setPreco(filme.getAluguel());
			nota.setEntrega(obterData(1));

		}
		filme.setEstoque(filme.getEstoque() - 1);

		return nota;

	}

}
