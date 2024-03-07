package Testing;
import java.util.ArrayList;

public class CadenasArrayList03 {

	public static void main (String [] args) {
		ArrayList<String> nombres = new ArrayList<>();
		
		nombres.add("Pepe");
		nombres.add("Pepe2");
		nombres.add("Pepe3");
		nombres.add("Pepe4");
		System.out.println(nombres.get(0));
		System.out.println("En nuestro array hay " + nombres.size() + " elementos.");
		
		//Recorrer ArrayList
		for (String nombre: nombres) {
			System.out.println(nombre);
		}
		for(int i = 0; i < nombres.size(); i++) {
			System.out.println("Posicion del ArrayList " + i + "  = " + nombres.get(i));
		}
		
		//Posicion de memoria
		int posicion = nombres.indexOf("Pepe");
		//Si probasemos con pepe no lo encontraria ya que a haciendo un .equals con cada elemento 
		System.out.println(posicion);
		//Buscar por posicón del array
		if(posicion != -1)
			System.out.println(nombres.get(posicion));
		else
			System.out.println("El nombre introducido no existe");
		
		//Para evitar duplicidad de datos usamos .contains
		if(nombres.contains("Pepe")) {
			nombres.add("Miguel");
			System.out.println("Nombre introducido correctamente");
		}
		else
			System.out.println("Nombre ya forma parte del ArrayList, introduzca otro nombre");
		
		/*
		 * Modificar valores
		 * Con .set , tenemos que saber la posición por la que queremos cambiar el valor
		 */
		nombres.set(0, "Tomás");
		System.out.println("El nuevo String en la posición 0 es = " + nombres.get(0));
		
		//.remove le podemos pasar tanto el elemento o la posición que queramos eliminar
		nombres.remove("Tomás");
		
	}
}
