package Atv04;

import java.util.ArrayList;
import java.util.List;

public class Util<V> {
	
	private List<Pair<V>> lista = new ArrayList<Pair<V>>();

	public List<Pair<V>> getLista() {
		return lista;
	}

	public void setLista(List<Pair<V>> lista) {
		this.lista = lista;
	}
	
	public boolean add(Pair<V> newPair) {
		for (Pair<V> value : this.lista) {
			if (value.getKey() == newPair.getKey()) {
				return false;
			}
		}
		this.lista.add(newPair);
		return true;
	}
	
}