/*ENUNCIADO EJERCICIO 3 ACTIVIDAD 1
Realizar una función que calcule y devuelva el área o el volumen de un cilindro, según se especifique.
Para distinguir un caso de otro se le pasará el carácter 'a' (para área) o 'v' (para el volumen) a la función.
Además hemos de pasarle a la función el radio y la altura.

En el método main, hacer las pruebas necesarias para comprobar que la función hace lo que tiene que hacer.
 */
package ejercicios;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main (String [] args) {
		   Scanner scanner = new Scanner(System.in);

		   double radio = 0;
	       double altura = 0;
	       char opcion = ' ';
	        
	       // Bucle do-while para solicitar datos hasta que sean ingresados correctamente
	        do {
	            System.out.print("Ingrese el radio (solo admite numeros positivos): ");
	            radio = scanner.nextDouble();

	            System.out.print("Ingrese la altura (solo admite numeros positivos): ");
	            altura = scanner.nextDouble();

	            System.out.print("Ingrese 'a' para calcular el área o 'v' para calcular el volumen: ");
	            opcion = scanner.next().charAt(0);

	            // Verificar que los números sean positivos y la opción sea 'a' o 'v'
	            if (radio < 0 || altura < 0 || (opcion != 'a' && opcion != 'v')) {
	                System.out.println("Error: Por favor, ingrese números positivos y la opción correcta.");
	            }

	        } while (radio < 0 || altura < 0 || (opcion != 'a' && opcion != 'v'));

	        // Llamar a la función con los valores proporcionados por el usuario
	        double resultado = calculoCilindro(radio, altura, opcion);
	        
	        if(opcion == 'a') {
	        	System.out.println("El area de un cilindro con radio: " + radio + " y altura: " + altura + " es de: " + resultado);
	        }else {
	        	System.out.println("El volumen de un cilindro con radio: " + radio + " y altura: " + altura + " es de: " + resultado);
	        }
	}

    public static double calculoCilindro(double radio, double altura, char opcion) {

    	if (opcion == 'a') {
            return (2 * Math.PI * radio * altura + 2 * Math.PI * Math.pow(radio, 2));
        } else if (opcion == 'v') {
            
            return (Math.PI * Math.pow(radio, 2) * altura);
        }
		return opcion; 
    }
}
