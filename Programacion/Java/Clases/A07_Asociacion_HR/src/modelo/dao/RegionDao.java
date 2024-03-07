package modelo.dao;

import java.util.ArrayList;

import modelo.javabeans.*;

public interface RegionDao {
	
	/*
	 * Estos son los métodos
	 * No los podemos llamar porque no tienen instrucciones
	 * No tienen instrucciones ya que se abstrae de donde se implemente
	 */
	boolean alta(Region region);
	boolean modificacion(Region region);
	boolean eliminar(int regionId);
	boolean eliminar(Region region);
	
	Region buscarUno(int regionId);
	ArrayList<Region> buscarTodas();
	ArrayList<Region> buscarNombreContains(String cadena);
}
