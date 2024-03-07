package ejercicios;

import java.util.Scanner;

public class Ejercicio06CompararStrings {
	
	public static void main(String[] args) {
	
		//Prueba1
		String prueba1 = "Miguel";
		if("Miguel" == prueba1) 
			System.out.println("Prueba 1 Son los mismos");
		else
			System.out.println("Prueba 1 No son los mismos");
		//El resultado es que son los 
		//mismos ya que apuntan a la misma direccion en memoria
		
		//Prueba2
		Scanner leer = new Scanner(System.in);
		String nombre2 ="";
		System.out.println("Introduzca una cadena por consola");
		nombre2=leer.next();
		
		if(nombre2 == "Miguel")
			System.out.println("Prueba 2  Son iguales");
		else
			System.out.println("Prueba 2 No son iguales");
		/*
		 * Aunque introduzcamos el mismo literal al cual estamos comparando
		 * siempre va a ser falso ya que son diferentes direcciones
		 * de memoria
		 */
		
		//Prueba3
		if(nombre2.equals("Miguel"))
			System.out.println("Prueba 3  Son iguales");
		else
			System.out.println("Prueba 3 No son iguales");
		/*
		 * Con .equals compara la variable guardada en direccion de 
		 * memoria con el string que le pasamos como
		 * parámetro
		 */
		
	}
}
