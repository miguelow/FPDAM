package Testing;

import Ejercicios.Libro;

public class TestIgualdad {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro (1, "El mejor titulo del mundo", "Pepe", "Planeta", 10, 500);
		Libro libro2 = new Libro (2, "El mejor titulo del mundo", "Pepe", "Planeta", 10, 500);
		
		
		System.out.println(libro1.equals(libro2));
		boolean comparacion = false;
		if (libro1.hashCode() == libro2.hashCode())
				comparacion = true;
				
		
		System.out.println(comparacion);
		System.out.println(libro1.hashCode());
		System.out.println(libro2.hashCode());

	}

}
