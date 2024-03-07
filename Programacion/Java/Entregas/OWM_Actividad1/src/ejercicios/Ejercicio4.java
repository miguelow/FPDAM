/*ENUNCIADO EJERCICIO 4 ACTIVIDAD 1
Crea un array de enteros e introduce la edad de 10 personas, 
y las variables necesarias para, recorrer el array  y mostrar al final los siguientes datos:

Número de mayores de edad.
Número de menores de edad.
Media de edades.
 */
package ejercicios;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main (String [] args) {
        
		//Declaramos las variables
        int[] edades = new int[10];
        int edadIngresada = 0;
        int edadMax = 0;
        int edadMin = 0;
        int sumaEdades = 0;
        double mediaEdades = 0;
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < edades.length; i++) {
            do {
                System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
                edadIngresada = scanner.nextInt();

                if (edadIngresada <= 0 || edadIngresada > Integer.MAX_VALUE) {
                    System.out.println("Por favor, ingrese un número mayor que 0.");
                }
            } while (edadIngresada <= 0 || edadIngresada > Integer.MAX_VALUE);
            
            edades[i] = edadIngresada;
        }

        for (int edad : edades) {
            if (edad >= 18) {
            	edadMax++;
            } else {
                edadMin++;
            }
            sumaEdades += edad;
        }
        
        mediaEdades = sumaEdades / edades.length;

        System.out.println("Número de mayores de edad: " + edadMax);
        System.out.println("Número de menores de edad: " + edadMin);
        System.out.println("Media de edades: " + mediaEdades + " años.");

	}
}
