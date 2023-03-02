package Entidades;

import java.util.Date;

public class NotaAluguel {

	private int preco;
	private Date dataEntrega;
	private int quantidade;

	public int getQuantidade() {
		
		return this.quantidade; 
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public Date getDataEntrega() {

		return dataEntrega;
	}

	public void setEntrega(Date time) {
		dataEntrega = time;

	}

}
