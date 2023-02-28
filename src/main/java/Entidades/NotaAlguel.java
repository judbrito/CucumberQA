package Entidades;

import java.util.Date;

public class NotaAlguel {

	private int preco;
	private Date dataEntrega;

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
