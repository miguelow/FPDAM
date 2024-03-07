package ejercicios;

import java.util.Scanner;

public class Ejercicio08PruebaStringScanner {

	public static void main (String [] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca una cadena por consola");
		String opcion = leer.next();
		/*
		 * Si hubiesemos introducido nombre y apellidos
		 * unicamente hubiese salido por consola el primer string hasta
		 * el espacio
		 */
		System.out.println("La cadena 1 introducida es : " + opcion);
		
		/*
		 * Usamos nextLine si queremos almacenar +1 palabra
		 * 
		 */
		
	}
}
