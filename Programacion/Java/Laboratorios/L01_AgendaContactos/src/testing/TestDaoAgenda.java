package testing;

import modelo.dao.AgendaContactosImplDao;
import modelo.javabean.Contacto;

public class TestDaoAgenda {
	//Lo 1ero que necesito es definir una variable RegionDaoImplList
	private static AgendaContactosImplDao agendaContactosImplDao = new AgendaContactosImplDao();
	
	//Imita al constructor pero en vez de arrancar lo privado, arranca lo static
	static {
		agendaContactosImplDao = new AgendaContactosImplDao();
	}
	
	public static void main(String[] args) {
		
		//buscarTodos();
		// buscarUno();
		//alta();
		modificacion();
		//eliminar();
		//eliminar2();
		//buscarContainsNombre();
		
	}
	
	public static void buscarUno() {
		System.out.println(agendaContactosImplDao.buscarUno("Pepe"));
	}
	
	public static void buscarTodos() {
		System.out.println("Numero de contactos en la agenda: " + agendaContactosImplDao.buscarTodos().size());
		System.out.println("Listado de contactos en la agenda ");
		for(Contacto con: agendaContactosImplDao.buscarTodos())
			System.out.println(con.toString());
	}
	
	public static void alta() {
		Contacto con1 = new Contacto("Perico", "Palotes", "2323232323", "pericopalotes@perico.com", "Ninguna");
		System.out.println("Estado de alta en agenda -> " + agendaContactosImplDao.altaContacto(con1));
	}
	
	public static void modificacion() {
		Contacto contactoModificar = agendaContactosImplDao.buscarUno("Pepe");
		if(contactoModificar != null) {
			System.out.println("Contacto antes de moficarlo: " + contactoModificar.toString());
			contactoModificar.setNombre("Pepito");
			agendaContactosImplDao.cambiarContacto(contactoModificar);
			System.out.println("Contacto después de moficarlo: " + contactoModificar.toString());
		}
		
	}
}
