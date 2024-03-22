package Atv02;

import java.util.Date;

public class Produto<K> {

	private K id;
	private double valor;
	private Date data_fabricacao;
	private Date data_vencimento;
	
	public Produto() {
		
	}
	
	public K getId() {
		return id;
	}

	public void setId(K id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getData_fabricacao() {
		return data_fabricacao;
	}

	public void setData_fabricacao(Date data_fabricacao) {
		this.data_fabricacao = data_fabricacao;
	}

	public Date getData_vencimento() {
		return data_vencimento;
	}

	public void setData_vencimento(Date data_vencimento) {
		this.data_vencimento = data_vencimento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [id=");
		builder.append(id);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", data_fabricacao=");
		builder.append(data_fabricacao);
		builder.append(", data_vencimento=");
		builder.append(data_vencimento);
		builder.append("]");
		return builder.toString();
	}
	
}