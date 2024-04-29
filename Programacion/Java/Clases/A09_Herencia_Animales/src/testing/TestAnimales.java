package testing;

import java.util.ArrayList;

import modelo.javabean.AbstractAnimal;
import modelo.javabean.Gato;
import modelo.javabean.Perro;

public class TestAnimales {

	public static void main(String[] args) {
		
		/*
		AbstractAnimal animal1 = new AbstractAnimal("lagarto", 4, "Lagartija");
		De una clase abstyracta no puedo hacer NEW pero si puedo crear variables
		de la clase abstracta como gato1
		*/
		
		System.out.println("-- TEST GATO");
		Gato gato1 = new Gato("Felino", 4, "Gato", 9);
		AbstractAnimal gatoAbstracto = new Gato("Felino", 4, "Gatus maximus", 9);
		
		System.out.println(gato1.getNombre());
		System.out.println("El gato tiene acceso a todos los métodos de la clase padre: " + gato1.saludo());
		System.out.println(gato1.sonido());
		System.out.println(gato1.saludo());
		System.out.println(gato1.medioLocomocion());
		gato1.perderVidas(2);
		
		/*
		 * Si probasemos a hacer
		 * gatoAbstracto.perderVidas()
		 * el método perderVidas() no nos aparecerá, para invocarlo se hace de la siguiente manera
		 */
		
		((Gato)gatoAbstracto).perderVidas(2);
		System.out.println(((Gato)gatoAbstracto).getVidas());
	
		System.out.println("-- TEST CLASE PERRO");
		Perro perro1 = new Perro("Mastodonte", 4, "Pepe", "Raza Mastodontica");
		AbstractAnimal perroAbstracto = new Perro("Mastodonte", 4, "Perro abstracto", "Raza Mastodontica");
		
		System.out.println(perro1.getNombre());
		System.out.println("El gato tiene acceso a todos los métodos de la clase padre: " + gato1.saludo());
		System.out.println(perro1.sonido());
		
		System.out.println("-- TEST LISTA ANIMAL");
		ArrayList<AbstractAnimal> listaAnimales = new ArrayList<AbstractAnimal>();
		listaAnimales.add(gato1);
		listaAnimales.add(gatoAbstracto);
		listaAnimales.add(perro1);
		listaAnimales.add(perroAbstracto);
		
		for(AbstractAnimal elem: listaAnimales) {
			System.out.println(elem.saludo() + " y soy de especie " + elem.getEspecie());
			if(elem instanceof Gato)
				System.out.println("Tengo " + ((Gato)elem).getVidas() + " vidas!");
		}
	
	}

}
