package ejercicios;
/*
 * Un array es un campo simple o compuesto 
 * que se repite n veces en memoria
 * 
 */
public class Ejercicio05ForArrays {

	public static void main(String[] args) {
		
		int [] numeros = {0,1,2,3,4,5};
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Recorrer con posicion");
			System.out.println("Posicion " + i + " => " + numeros[i]);
		}
		
		//Para recorrer sin importancia de la posicion
		//Tener cuidado si hay huecos en el array
		//Idealmente usar con arrays completos
		
		for (int numero: numeros) {
			System.out.println("Recorrer sin posicion");
			System.out.println(numero);
		}
	}
}
