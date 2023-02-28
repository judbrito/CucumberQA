package Entidades;

import java.util.Calendar;

public class AluguelService {

	public NotaAlguel alugar(Filmes filme) {
		NotaAlguel nota = new NotaAlguel();
		nota.setPreco(filme.getAluguel());
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 1);
		nota.setEntrega(cal.getTime());
		filme.setEstoque(filme.getEstoque()-1);		
		return nota;
	
		
	}


}
