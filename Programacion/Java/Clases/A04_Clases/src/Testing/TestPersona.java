package Testing;

import Ejercicios.Persona;

public class TestPersona {

	//Aqui incluimos el main ya que pretendemos ejecutar
	public static void main(String[] args) {
		//Creamos un nuevo objeto de la clase persona
		Persona yo = new Persona(
				1,
				"Miguel",
				"Ortega",
				12000,
				12000,
				'H'
				);
		
		/* Si pongo yo. se vera que hay muchos métodos
		 * estos los hereda de la clase object, este tipo
		 * de herencia -> Herencia implícita
		 * Se hereda todos los métodos y atributos
		 */
		
		/*
		 * Yo puedo acceder a los metodos de Persona que están puestos
		 * como public. Aquí entra otro principio de la POO:
		 * La encapsulación. Donde una clase proporciona acceso a sus métodos pero 
		 * no a sus atributos directamente
		 */
		System.out.println(yo.toString());
		System.out.println(yo.getNombre());
		System.out.println("Nombre completo " + yo.nombreCompleto());
		System.out.println("Mi salario bruto mensual a 12 pagas es de: " + yo.salarioBrutoMensual(12));
		
		
		
	}
}
