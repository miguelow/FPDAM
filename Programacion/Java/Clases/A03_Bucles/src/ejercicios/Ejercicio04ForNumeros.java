package ejercicios;

/*
 * Vamos a procesar los numeros del 1 al 15
 * vamos a sumar los pares
 */

public class Ejercicio04ForNumeros {

	public static void main (String[] args) {
		int sumaPares = 0;
		int sumaImpares= 0;
		
		for(int i=0; i<=15; i++) {
			if(i%2 == 0) {
				sumaPares += i;
			}else {
				sumaImpares += i;
			}
		}
		System.out.println("La suma de pares hasta 15 : " + sumaPares);
		System.out.println("La suma de impares hasta 15 : " + sumaImpares);
	}
}
