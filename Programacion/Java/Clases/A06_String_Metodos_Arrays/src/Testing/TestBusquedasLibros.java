package Testing;

import java.util.ArrayList;

import Ejercicios.Libro;

public class TestBusquedasLibros {

	public static void main(String[] args) {
		
		ArrayList<Libro> libros = new ArrayList<>();
		
		/*
		 * Alta de libros
		 * Repositorio de libros ne memoria
		 * Cuando se arranca el main se cargan y al terminar de ejecutarse desaparecen
		 */
		libros.add(new Libro(1L, "El mejor titulo del mundo", "Pepe", "Planeta", 10, 500));
		libros.add(new Libro(2L, "El peor titulo del mundo", "Paco el autor", "Paraninfo", 10, 500));
		libros.add(new Libro(3L, "El pasajero", "Manolo", "Planeta", 10, 500));
		libros.add(new Libro(4L, "El mejor titulo del mundo 2", "Pepe ", "Paraninfo", 10, 500));
		libros.add(new Libro(5L, "El mejor titulo del mundo", "Pepe el autor", "Paraninfo", 10, 500));

		//Buscar 1 libro, solo teniendo el ISBN
		long isbnBuscar = 2;
		boolean existe = false;
		
		for (int i = 0; i < libros.size(); i++) {
			if(isbnBuscar == libros.get(i).getIsbn()) {
				System.out.println("El libro con el isbn " + isbnBuscar + " contiene la siguiente info " +  libros.get(i));
				existe = true;
				break;
			}
		}
		if(!existe)
			System.out.println("Libro buscado no encontrado");
		
		//Otra forma más eficiente de buscar libros con indexOf
		Libro libroBuscar = new Libro();
		libroBuscar.setIsbn(isbnBuscar);
		int posicion = libros.indexOf(libroBuscar);
		
		if(posicion != -1)
			System.out.println("Libro buscado en la posicion " + posicion  + " y su info: " + libros.get(posicion).toString());
		else 
			System.out.println("Libro no encontrado");
		
		/*
		 * Buscar por editorial
		 * Y almacenarlos en otra coleccion y tratarlos
		 */

		ArrayList<Libro> auxiliar = new ArrayList<>();
		for(Libro libro:libros) {
			if(libro.getEditorial().equals("Planeta"))
				auxiliar.add(libro);
		}
		
		
	}

}
