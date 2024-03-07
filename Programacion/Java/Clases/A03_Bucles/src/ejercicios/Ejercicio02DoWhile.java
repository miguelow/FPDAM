package ejercicios;
import java.util.Scanner;

/*
 * Contar y sumar los numeros introducidos por teclado 
 * hasta sacar un numero negativo, usar bucle do while
 */
public class Ejercicio02DoWhile {

	public static void main(String[] args) {
		System.out.println("Introduzca numeros enteros");
		Scanner leer = new Scanner(System.in);
		int numeroLeido=0, suma=0, cuantos=0;
		
		do {
			numeroLeido = leer.nextInt();
			if(numeroLeido >= 0) {
				cuantos++;
				suma += numeroLeido;
			}
		}while(numeroLeido >= 0);
		//Do while nos obliga a leer 1 vez y preguntar 2 veces
		
		System.out.println("Estadisticas del bucle");
		System.out.println("SUMA DE NUMEROS LEIDOS : " + suma);
		System.out.println("SUMA DE NUMEROS PROCESADOS : " + cuantos);
		

	}

}
