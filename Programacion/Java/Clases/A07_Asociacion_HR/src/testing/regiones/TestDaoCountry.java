package testing.regiones;

import modelo.dao.CountryDaoImplList;
import modelo.javabeans.Country;

public class TestDaoCountry {

	//Lo 1ero que necesito es definir una variable RegionDaoImplList
	private static CountryDaoImplList countryDaoImplList = new CountryDaoImplList();
	
	//Imita al constructor pero en vez de arranzar lo privado, arranca lo static
	static {
		countryDaoImplList = new CountryDaoImplList();
	}
	
	public static void main(String[] args) {
		
		//buscarTodos();
		//buscarUno();
		//alta();
		//modificar();
		//eliminar();
		//eliminar2();
		//buscarPaisPorRegion();
		
	}
	
	public static void buscarUno() {
		Country countryBuscar = countryDaoImplList.buscarUno("EU");
		if(countryBuscar != null)
			System.out.println(countryBuscar.getCountryName());
		else
			System.out.println("No existe un pais con ese codigo");
	}
	
	public static void buscarTodos() {
		for(Country country: countryDaoImplList.buscarTodos()) {
			System.out.println(country);
		}
	}
	
	public static void modificar() {
		System.out.println("Modificar --");
		Country countryCambiar = countryDaoImplList.buscarUno("ESP");
		if(countryCambiar != null) {
			System.out.println("Pais antes de cambiar -> " + countryCambiar.getCountryName());
			countryCambiar.setCountryName("Españita");
			countryDaoImplList.modificacion(countryCambiar);
			System.out.println("Pais despues de cambiar -> " + countryCambiar.getCountryName());
		}
	}
	
	public static void eliminar() {
		System.out.println("Eliminar por countryId --");
		System.out.println("Listado de paises antes de eliminar " + countryDaoImplList.buscarTodos().size());
		System.out.println("Se ha elmiando correctamente: " + countryDaoImplList.eliminar("ESP"));
		System.out.println("Listado de paises despues de eliminar " + countryDaoImplList.buscarTodos().size());
	}
	
	public static void eliminar2() {
		System.out.println("Eliminar por objeto country --");
		Country countryEliminar = countryDaoImplList.buscarUno("ESP");
		if(countryEliminar != null) {
			System.out.println("Listado de paises antes de eliminar " + countryDaoImplList.buscarTodos().size());
			System.out.println("Se ha elmiando correctamente: " + countryDaoImplList.eliminar(countryEliminar));
			System.out.println("Listado de paises despues de eliminar " + countryDaoImplList.buscarTodos().size());
		}else
			System.out.println("Introduzca un código valido para poder eliminar");
	}
	
	public static void buscarPaisPorRegion() {
		System.out.println("Buscar paises por regionId --");
		if(countryDaoImplList.paisesPorRegion(1).size() > 0) {
			System.out.println("Los paises en el regionId 1 son: ");
			for(Country country: countryDaoImplList.paisesPorRegion(1)) {
				System.out.println(country.getCountryName());
			}
		}
		else
			System.out.println("No existen paises en el regionId proporcionado");
	}
	
}
