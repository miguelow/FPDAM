/*ENUNCIADO EJERCICIO 1 ACTIVIDAD 1
Realizar un algoritmo en java que pida por teclado, cada vez, un número entero
y que vaya sumando los números pares hasta que se pulse un número entero negativo 
que será la salida del programa y que, al terminar el programa presente:
1.La media de la suma de todos los números pares, sin contar el cero
2.EL número de impares introducidos 
3.El número de ceros introducidos por teclado  
 */

package ejercicios;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);

		//Declarar las variables
        int sumaPares = 0;
        int cantidadImpares = 0;
        int cantidadPares = 0;
        int cantidadCeros = 0;
        int numero;
        int mediaPares = 0;

        System.out.println("Introduzca números enteros. \n"
        		+ "Para finalizar, introduzca un número negativo. \n"
        		+ "Valor máximo permitido: 2,147,483,647");

        System.out.print("Introduzca un número: ");
        numero = scanner.nextInt();

        while (numero >= 0) {
            if (numero > 0) {
                if (numero % 2 == 0) {
                    sumaPares += numero;
                    cantidadPares++;
                } else {
                    cantidadImpares++;
                }
            }else {
            	cantidadCeros++;
            }
            System.out.print("Introduzca otro número: ");
            numero = scanner.nextInt();
        }

        mediaPares = sumaPares / cantidadPares;
        
        // Mostrar los resultados
        System.out.println("Resultados:");
        System.out.println("1. Media de la suma de todos los números pares : " + mediaPares);
        System.out.println("2. Número de impares introducidos: " + cantidadImpares);
        System.out.println("3. Número de ceros introducidos: " + cantidadCeros);

		
	}
}
