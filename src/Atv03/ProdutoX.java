package Atv03;

public class ProdutoX {

	private String descricao;
	private float preco;
	private int qtd;
	
	public ProdutoX(String descricao, float preco, int qtd) {
		this.descricao = descricao;
		this.preco = preco;
		this.qtd = qtd;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProdutoX [descricao=");
		builder.append(descricao);
		builder.append(", preco=");
		builder.append(preco);
		builder.append(", qtd=");
		builder.append(qtd);
		builder.append("]");
		return builder.toString();
	}
	
}