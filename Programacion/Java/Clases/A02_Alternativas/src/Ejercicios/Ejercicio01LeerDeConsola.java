package Ejercicios;

import java.util.Scanner;

public class Ejercicio01LeerDeConsola {

	public static void main(String[] args) {
		//Creamos una variable para luego usar los metodos de la clase Scanner
		Scanner leer = new Scanner(System.in);
		int numero = leer.nextInt();
		
		System.out.println("el numero leido es : " + numero);
	}
}
