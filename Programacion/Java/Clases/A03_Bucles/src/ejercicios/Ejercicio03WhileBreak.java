package ejercicios;

import java.util.Scanner;

public class Ejercicio03WhileBreak {
public static void main (String [] args) {
	System.out.println("Introduzca numeros enteros");
	Scanner leer = new Scanner(System.in);
	int numeroLeido=0, suma=0, cuantos=0;
	
	
	while(true) {
		numeroLeido = leer.nextInt();
		if(numeroLeido < 0) {
			break;
		}
		suma += numeroLeido;
		cuantos++;
	}
	
	System.out.println("Estadisticas del bucle");
	System.out.println("SUMA DE NUMEROS LEIDOS : " + suma);
	System.out.println("SUMA DE NUMEROS PROCESADOS : " + cuantos);
	
}
}
