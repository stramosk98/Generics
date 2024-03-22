package Atv03;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private List<ProdutoX> lista = new ArrayList<ProdutoX>();
	
	public List<ProdutoX> getLista() {
		return lista;
	}

	public void setLista(List<ProdutoX> lista) {
		this.lista = lista;
	}

	public void addLista(ProdutoX produto) {
		this.lista.add(produto);
	}
	
	public String mostrarLista() {
		String lista = "";
		for(ProdutoX prod : this.lista) {
			lista += prod.toString() + "\n";
 		}
		return lista;
	}
	
}