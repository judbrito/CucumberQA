package Entidades;

import java.util.Date;

public class NotaAluguel {

	private int preco;
	private Date dataEntrega;
	private int quantidade;
	private int pontos;

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

	public void setDataEntrega(Date time) {
		dataEntrega = time;

	}

	public int getPontos() {

		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
		
	}

}
