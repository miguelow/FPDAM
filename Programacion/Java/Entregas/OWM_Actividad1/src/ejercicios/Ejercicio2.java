/*ENUNCIADO EJERCICIO 2 ACTIVIDAD 1
Pedimos por pantalla un nombre y una contraseña:
1.Si el nombre coincide con “sara”, preguntamos por  la contraseña y si coincide con 
“sarita”, escribimos el mensaje “usuario y contraseña correctas, bienvenido a la aplicación”
2.Si el nombre NO es “sara” Escribimos "usuario incorrecto”
3.Si el nombre es correcto y la contraseña NO, Escribimos “contraseña incorrecta”.
 */

package ejercicios;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Declaramos las variables
		String user = "sara";
		String password = "sarita";
		String input;
		
		System.out.println("Introduzca el usuario: ");
		input = scanner.next();
		if(input.equals(user)) {
			System.out.println("Introduzca la contraseña: ");
			input = scanner.next();
			if(input.equals(password)){
				System.out.println("Usuario y contraseña correctas, bienvenido a la aplicación.");
			}
			else {
				System.out.println("Contraseña incorrecta");
			}
		}else {
			System.out.println("usuario incorrecto");
		}
	}
}
