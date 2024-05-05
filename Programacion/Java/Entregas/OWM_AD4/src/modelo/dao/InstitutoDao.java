package modelo.dao;

import java.util.List;

import modelo.javabean.AbstractPersona;

public interface InstitutoDao {

	boolean altaPersona(AbstractPersona persona);
	boolean eliminarPersona(AbstractPersona persona);
	
	AbstractPersona buscarUno(String nif);
	List<AbstractPersona>buscarTodas();
	List<AbstractPersona>buscarPersonasPorTipo(String tipoPersona);
}
