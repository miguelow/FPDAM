package modelo.dao;

import java.util.ArrayList;

import modelo.javabeans.Country;

public interface CountryDao {
	
	/*
	 * Estos son los métodos
	 * No los podemos llamar porque no tienen instrucciones
	 * No tienen instrucciones ya que se abstrae de donde se implemente
	 */
	
	boolean alta(Country country);
	boolean modificacion(Country country);
	boolean eliminar(String countryId);
	boolean eliminar(Country country);
	
	Country buscarUno(String countryId);
	ArrayList<Country> buscarTodos();
	ArrayList<Country> paisesPorRegion(int regionId);
}
