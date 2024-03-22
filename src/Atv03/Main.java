package Atv03;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProdutoX px1 = new ProdutoX("Prod1", 39, 2);
		ProdutoX px2 = new ProdutoX("Prod2", 20, 3);
		ProdutoX px3 = new ProdutoX("Prod3", 70, 1);

		Pedido pedido = new Pedido();
		pedido.addLista(px1);
		pedido.addLista(px2);
		pedido.addLista(px3);
		System.out.println(pedido.mostrarLista());
	}

}
