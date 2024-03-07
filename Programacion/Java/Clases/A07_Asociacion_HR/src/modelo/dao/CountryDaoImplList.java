package modelo.dao;

import java.util.ArrayList;

import modelo.javabeans.Country;
import modelo.javabeans.Region;

public class CountryDaoImplList implements CountryDao{

	private ArrayList<Country> lista; //Esto queda inicializado a null
	
	public CountryDaoImplList(){
		//En el constructor arrancamos la lista
		lista = new ArrayList<Country>();
		
		//Imitamos la carga de datos con este método privado
		cargarDatos();
	}
	
	private void cargarDatos() {
		RegionDaoImplList rdao = new RegionDaoImplList();
		lista.add(new Country("ESP", "España", rdao.buscarUno(1)));
		lista.add(new Country("AUS", "Austria", rdao.buscarUno(1)));
		lista.add(new Country("ITA", "Italia", rdao.buscarUno(1)));
		lista.add(new Country("MEX", "Mexico", rdao.buscarUno(2)));
		lista.add(new Country("VNZ", "Venezuela", rdao.buscarUno(2)));
	}

	@Override
	public boolean alta(Country country) {
		if(lista.contains(country))
			return false;
		else
			return lista.add(country);
	}

	@Override
	public boolean modificacion(Country country) {
		int pos = lista.indexOf(country);
		if(pos != -1) {
			lista.set(pos, country);
			return true;
		}else
			return false;
	}

	@Override
	public boolean eliminar(String countryId) {
		
		Country country = buscarUno(countryId);
		if(country != null) 
			return lista.remove(country);
		else
			return false;
				
	}

	@Override
	public boolean eliminar(Country country) {
		return lista.remove(country);
	}

	@Override
	public Country buscarUno(String countryId) {
		Country country = new Country();
		country.setCountryId(countryId);;
		int pos = lista.indexOf(country);
		
		if(pos != -1)
			return lista.get(pos);
		
		return null;
	}

	@Override
	public ArrayList<Country> buscarTodos() {
		return lista;
	}

	@Override
	public ArrayList<Country> paisesPorRegion(int regionId) {
		ArrayList<Country> aux = new  ArrayList<Country>();
		
		for(Country pais: lista) {
			if(pais.getRegion().getRegionId() == regionId)
				aux.add(pais);
		}
		return aux;
	}
	
	
}
