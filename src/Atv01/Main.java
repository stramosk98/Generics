package Atv01;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("Corolla", 110.000, 2023);
		Integer[] intArray = {1, 2, 3, 4, 5};
		
		Generic<Car> g1 = new Generic<>(car);
		Generic<List<Integer>> g2 = new Generic<>(Arrays.asList(intArray));
		Generic<String> g3 = new Generic<>("bla bla");
		
		System.out.println(g1.getType().toString());
		System.out.println(g2.getType());
		System.out.println(g3.getType());
	}

}
