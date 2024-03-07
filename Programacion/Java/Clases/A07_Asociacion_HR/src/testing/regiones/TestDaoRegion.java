package testing.regiones;

import java.util.ArrayList;

import modelo.dao.RegionDaoImplList;
import modelo.javabeans.Region;

public class TestDaoRegion {
	
	//Lo 1ero que necesito es definir una variable RegionDaoImplList
	private static RegionDaoImplList regionDaoImplList = new RegionDaoImplList();
	
	//Imita al constructor pero en vez de arranzar lo privado, arranca lo static
	static {
		regionDaoImplList = new RegionDaoImplList();
	}
	
	public static void main(String[] args) {
		
		//buscarTodos();
		//buscarUna();
		//alta();
		//modificar();
		//eliminar();
		//eliminar2();
		//buscarContainsNombre();
		
	}
	
	public static void buscarTodos() {
		for(Region region: regionDaoImplList.buscarTodas()) {
			System.out.println(region);
		}
	}
	
	public static void buscarUna() {
		Region regionBuscar = regionDaoImplList.buscarUno(1);
		if(regionBuscar != null)
			System.out.println(regionBuscar);
		else
			System.out.println("Region con ese id no existe");
	}
	
	public static void alta() {
		Region reg1 = new Region(4, "AUSTRALIA");
		Region reg2 = new Region(2,"USA");
		System.out.println("alta -- ");
		
		System.out.println(regionDaoImplList.alta(reg1));
		System.out.println(regionDaoImplList.alta(reg2));
		
		buscarTodos();
	}
	
	public static void eliminar() {
		System.out.println("Eliminar -- ");
		System.out.println(regionDaoImplList.eliminar(1));
		buscarTodos();
	}
	
	public static void eliminar2() {
		System.out.println("Eliminar2 -- ");
		Region regionEliminar = regionDaoImplList.buscarUno(7);
		if(regionEliminar != null)
			System.out.println(regionDaoImplList.eliminar(regionEliminar));
		else
			System.out.println("Introduzca una region correcta que desee eliminar");
	}
	
	public static void modificar() {
		System.out.println("modificar -- ");
		Region regionCambiar= regionDaoImplList.buscarUno(1);
		
		if(regionCambiar != null) {
			System.out.println("Region antes de modificar " + regionCambiar);
			regionCambiar.setRegionName("Nombre modificado");
			regionDaoImplList.modificacion(regionCambiar);
			System.out.println("Region despues de modificar" + regionCambiar);
		}else
			System.out.println("Introduzca una region ya existente para modificar");
	}
	
	public static void buscarContainsNombre() {
		for(Region reg: regionDaoImplList.buscarNombreContains("Eur")) {
			System.out.println(reg);
		}
	}


}
