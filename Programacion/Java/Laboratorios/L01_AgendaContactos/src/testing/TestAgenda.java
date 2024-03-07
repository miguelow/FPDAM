package testing;

import modelo.dao.AgendaContactosImplDao;
import modelo.javabean.Contacto;

public class TestAgenda {

	public static void main (String [] args) {
		
		AgendaContactosImplDao miAgenda = new AgendaContactosImplDao();
		
		System.out.println(miAgenda.getNombreAgenda());
		
		for(Contacto contacto: miAgenda.getLista()) {
			System.out.println(contacto);
		}
		
		System.out.println(miAgenda.buscarUno("perico"));
	}
}
