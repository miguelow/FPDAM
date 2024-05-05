package testing;

import modelo.dao.Instituto;
import modelo.javabean.AbstractPersona;
import modelo.javabean.Administrativo;
import modelo.javabean.Alumno;
import modelo.javabean.Profesor;

public class TestDao {
	
		private static Instituto instituto = new Instituto();
		
		static {
			instituto = new Instituto();
		}
		
		public static void main (String [] args) {
			
			AbstractPersona profAbs2 = new Profesor("2674", "Alfonso", "Calle gloria", "654123123", "Matemáticas");
			AbstractPersona alumAbs2 = new Alumno("2568", "Lourdes", "Avenida de Atenas", "6123123123", "1Bachillerato");
			AbstractPersona adminAbs2 = new Administrativo("9876", "Paco ", "Avenida Calamar 45", "6786786878", "Comunicados internos");
			
			System.out.println("-- personas cargadas desde la clase Instituto");
			System.out.println(instituto.buscarTodas().size());
			
			instituto.altaPersona(profAbs2);
			instituto.altaPersona(alumAbs2);
			instituto.altaPersona(adminAbs2);
			
			System.out.println("-- Numero de Personas despues de dar de alta");
			System.out.println(instituto.buscarTodas().size());
			
			System.out.println("-- Buscando por DNI 2674");
			System.out.println(instituto.buscarUno("2674").getNombre());
			
			System.out.println("-- Eliminando por DNI 2674");
			System.out.println("Estado operación eliminado " + instituto.eliminarPersona(instituto.buscarUno("2674")));
			
			System.out.println("-- Numero de Personas por tipo");
			System.out.println(instituto.buscarPersonasPorTipo("Profesor").size() + " Profesor");
			System.out.println(instituto.buscarPersonasPorTipo("Alumno").size() + " Alumnos");
			System.out.println(instituto.buscarPersonasPorTipo("Administrativo").size() + " Administrativos");
			
		}
		
}
