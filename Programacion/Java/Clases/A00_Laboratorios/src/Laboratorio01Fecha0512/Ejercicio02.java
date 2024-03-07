package Laboratorio01Fecha0512;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main (String [] args) {
        
		//1-Definir variables
		Scanner leer = new Scanner(System.in);
		String nombre = null, apellido1 = null, apellido2 = null;
		String genero = null;
		double salario = 0;
		double sumaSalarios = 0;
		int hombres = 0, mujeres = 0;
		
		//2-Cuerpo del ejercicio
		System.out.println("Introduzca el nombre");
		nombre = leer.next();
		while(!nombre.equalsIgnoreCase("FIN")) {
			System.out.println("Introduzca el segundo apellido");
			apellido1 = leer.next();
			System.out.println("Introduzca el primer apellido");
			apellido2 = leer.next();
			System.out.println("Introduzca el salario");
			salario = leer.nextDouble();
			System.out.println("Introduzca H o M en funcion del genero");
			genero = leer.next();
			
			System.out.println(nombreCompleto(nombre, apellido1, apellido2));
			System.out.println(tipoSalario(salario));
			System.out.println(literalGenero(genero));
			sumaSalarios += salario;
			if(literalGenero(genero).equals("Hombre"))
				hombres++;
			else if(literalGenero(genero).equals("Mujer"))
				mujeres++;
			System.out.println("Si desea no continuar introduciendo personas escriba FIN en caso contrario introduzca el nombre");
			nombre = leer.next();
		}
		//3-Estadisticas
		System.out.println("ESTADISTICAS:");
		System.out.println("suma de salario: " + sumaSalarios);
		System.out.println("contador de hombres: " + hombres);
		System.out.println("contador de mujeres: " + mujeres);
    }
	
	
	
	/*
	 * Devuelve el rango en funcion del salario
	 * @param salario
	 * @return
	 */
    public static String tipoSalario(double salario) {
        String literal = null;
        if (salario < 20_000)
            literal = "Salario Bajo";
        else if (salario >= 20_000 && salario <= 40_000)
            literal = "Salario medio";
        else
            literal = "Salario alto";

        return literal;
    }
    /*
	 * Devuelve el identificador de genero
	 * @param genero
	 * @return
	 */
    public static String literalGenero(String genero) {
        String literal2 = null;
        switch(genero) {
            case "M": case "m":
                literal2 = "Mujer";
                break;
            case "H": case "h":
                literal2 = "Hombre";
                break;
            default:
                literal2 = "Error";
        }
        return literal2;
    }
    /*
	 * Devuelve el nombre completo en mayusculas
	 * @param nombre
	 * @param apellido1
	 * @param apellido2
	 * @return
	 */
    public static String nombreCompleto(String nombre, String apellido1, String apellido2) {
        return nombre.toUpperCase() + " " + apellido1.toUpperCase() + " " + apellido2.toUpperCase();
    }	
}
