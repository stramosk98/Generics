package Atv02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto<String> p1 = new Produto<>();
		Produto<Integer> p2 = new Produto<>();
		
		p1.setId("1");
		p2.setId(2);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
