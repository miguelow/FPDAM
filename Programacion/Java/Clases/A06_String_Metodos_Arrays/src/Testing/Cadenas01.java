package Testing;

public class Cadenas01 {
	public static void main (String[] args) {
		
		String nombre = "Miguel";
		String prueba = "Hola me llamo Miguel, encantado de conocerte";
		
		//Métodos de objeto o instancia
		System.out.println("La primera letra de mi nombre es: " + nombre.charAt(0));
		System.out.println(prueba.indexOf(nombre)); 
		System.out.println(prueba.contains(nombre));
		System.out.println(prueba.compareTo(nombre));
		System.out.println(prueba.startsWith(nombre));
		
		String [] palabras = prueba.split(" ");
		for (String palabra: palabras) {
			System.out.println(palabra);
		}
		
		//Método estático o de clase
		//Se pueden invocar desde la clase
		String numero = String.valueOf(12);
		System.out.println(numero);
		System.out.println(numero.getClass().getName());
		
	}
}
