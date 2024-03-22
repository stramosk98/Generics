package Atv04;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Util<Integer> u = new Util<Integer>();
		Pair<Integer> p1 = new Pair<Integer>(1, "key1");
		Pair<Integer> p2 = new Pair<Integer>(2, "key1");
		Pair<Integer> p3 = new Pair<Integer>(3, "key3");
		
		System.out.println(u.add(p1));
		System.out.println(u.add(p2));
		System.out.println(u.add(p3));
		
		List<Pair<Integer>> list = u.getLista();
		for (Pair<Integer> conteudo : list) {
			System.out.println(conteudo.toString());
		}
	}

}