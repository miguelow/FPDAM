package Laboratorio01Fecha0512;

import java.util.Scanner;

public class Ejercicio01TipoSalario {

	public static void main (String[] args) {

		/*
		 * En base a un input por consola dividelo entre:
		 * Salario bajo si < 20.000
		 * Medio entre 20 y 40
		 * Alto entre 40 y 70 y
		 * Muy alto > 70
		 */
		
		double [] salarios = {
				19_999, 20_000, 39_000, 69_000, 70_000
		};
		
		for(double salario: salarios) {
			System.out.println(salario + " equivale a un " + tipoSalario(salario));
		}
		
	}
	public static String tipoSalario(double salario) {
		String literal = null; 
		
		if(salario < 20_000)
			literal = "salario bajo";
		else if(salario >= 20_000 && salario <= 40_000)
			literal = "salario medio";
		else if(salario > 40_000 && salario < 70_000)
			literal = "salario medio";
		else
			literal = "salario muy alto";
		
		return literal;
	}
}
