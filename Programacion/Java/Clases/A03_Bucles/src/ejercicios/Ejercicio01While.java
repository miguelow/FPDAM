package ejercicios;
import java.util.Scanner;

/*
 * Contar y sumar los numeros introducidos por teclado 
 * hasta sacar un numero negativo
 */
public class Ejercicio01While {

	public static void main(String[] args) {
		System.out.println("Introduzca numeros enteros");
		Scanner leer = new Scanner(System.in);
		int numeroLeido=0, suma=0, cuantos=0;
		
		numeroLeido = leer.nextInt();
		while(numeroLeido >= 0) {
			//tratar el numero leido
			suma += numeroLeido;
			cuantos++;
			numeroLeido = leer.nextInt();
		}
		System.out.println("Estadisticas del bucle");
		System.out.println("SUMA DE NUMEROS LEIDOS : " + suma);
		System.out.println("SUMA DE NUMEROS PROCESADOS : " + cuantos);
		

	}

}
