/*
 * Esta clase implementa la interfaz
 */
package modelo.dao;

import java.util.ArrayList;

import modelo.javabeans.Region;

public class RegionDaoImplList implements RegionDao{
//Heredamos los métodos de la interfaz
		
		private ArrayList<Region> lista; //Esto queda inicializado a null
		
		public RegionDaoImplList(){
			//En el constructor arrancamos la lista
			lista = new ArrayList<>();
			
			//Imitamos la carga de datos con este método privado
			cargarDatos();
		}
		
		private void cargarDatos() {
			lista.add(new Region(1,"Europa"));
			lista.add(new Region(2,"USA"));
			lista.add(new Region(3,"LATAM"));
		}
		
		@Override
		public boolean alta(Region region) {
			if (lista.contains(region))
				return false;
			else
				return lista.add(region);
		}

		@Override
		public boolean modificacion(Region region) {
			/*
			 * Buscamos la posicion de la region a modificar, 
			 * ya que el metodo set recibe como primer parametro la posicion
			 * y segudno el objeto a modificar
			 * 
			 */
			
			int pos = lista.indexOf(region);
			
			if(pos != -1) {
				lista.set(pos, region);
				return true;
			}else
				return false;
		}

		@Override
		public boolean eliminar(int regionId) {
			
			Region region = buscarUno(regionId);
			
			if(region != null)
				return lista.remove(region);
			else 
				return false;
		}

		@Override
		public boolean eliminar(Region region) {
			return lista.remove(region);
		}

		@Override
		public Region buscarUno(int regionId) {
			Region region = new Region();
			region.setRegionId(regionId);
			int pos = lista.indexOf(region);
			
			if(pos != -1)
				return lista.get(pos);
			
			return null;
		}

		@Override
		public ArrayList<Region> buscarTodas() {
			//Devolver toda la lista de regiones
			return lista;
		}

		@Override
		public ArrayList<Region> buscarNombreContains(String cadena) {
			
			ArrayList<Region> aux = new  ArrayList<Region>();
			
			for(Region reg: lista) {
				if(reg.getRegionName().contains(cadena))
					aux.add(reg);
			}
			/*
			 * Si la funcion devuelve un ArrayLista, conviene
			 * crear uno para devolver ya que devolver null 
			 * creara más problemas
			 */
			return aux;
		}
}
