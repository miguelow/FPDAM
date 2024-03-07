package aplicaciones;

import java.util.Scanner;

import modelo.dao.RegionDaoImplList;
import modelo.javabeans.Region;

public class AppRegiones {
	
	private static Scanner leer;
	private static RegionDaoImplList rdao;
	
	static {
		//Constructor de los métodos estaticos
		leer = new Scanner(System.in);
		rdao = new RegionDaoImplList();
	}

	public static void main (String [] args) {
		int opcion = 0;
		do {
			opcion = pintarMenu();
			if(opcion == 5)
				break;
			
			switch(opcion){
			case 1:
				procesarAlta();
				break;
			case 2:
				listarRegiones();
				break;
			case 3:
				buscarRegion();
				break;
			case 4:
				eliminarRegion();
				break;
			}
		}while(opcion > 0 || opcion <= 5);
	}
	
	public static int pintarMenu() {
		int opcion = 0;
		System.out.println("-- Menu --");
		System.out.println("1 - Alta region");
		System.out.println("2 - Listar regiones");
		System.out.println("3 - Buscar 1 region");
		System.out.println("4 - Eliminar region");
		System.out.println("5 - Salir");
		System.out.println("Introduzca una opcion: ");
		
		opcion = leer.nextInt();
		while(opcion < 1 || opcion > 5) {
			System.out.println("Introduzca un valor entre 1 y 5");
			opcion = leer.nextInt();
		}
		return opcion;
	}
	
	public static void procesarAlta() {
		System.out.println("Procesar Alta");
	}
	
	public static void listarRegiones() {
		for(Region reg: rdao.buscarTodas()) {
			System.out.println("Nombre de la region: " + reg.getRegionName());
		}
	}
	
	public static void buscarRegion() {
		System.out.println("Introduzca el id de la region que desee buscar");
		int id = leer.nextInt();
		Region reg = rdao.buscarUno(id);
		
		if(reg != null)
			System.out.println("El id " + id + " corresponde con la region: " + reg.getRegionName());
		else
			System.out.println("Introduzca un id válido");
	}
	
	public static void eliminarRegion() {
		System.out.println("Introduzca el id de la region que desee eliminar: ");
		int regionId = leer.nextInt();
		if(rdao.buscarUno(regionId) != null) {
			System.out.println("La region a eliminar es: " + rdao.buscarUno(regionId).getRegionName());
			
			rdao.eliminar(regionId);
			
			//Listamos las regiones restantes
			for(Region reg: rdao.buscarTodas()) {
				System.out.println("Nombre de la region: " + reg.getRegionName());
			}
		}else
			System.out.println("Introduzca un id de region válido");
	}
}
