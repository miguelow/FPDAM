package ejercicios;
import java.util.Scanner;

public class Ejercicio07StringSwitch {

	public static void main (String [] args) {
		String opcion = ""; 
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca la operación matemática que quiera realizar : ");
		opcion = leer.next();
		
		//Switch lleva implicito el equals, en cada case lo aplica
		switch(opcion) {
		case "sumar":
			System.out.println("sumando...");
			break;
		case "restar":
			System.out.println("restando...");
			break;
		case "multiplicando":
			System.out.println("multiplicando...");
			break;
		case "dividiendo":
			System.out.println("dividiendo...");
			break;
		}
		
	}
}
