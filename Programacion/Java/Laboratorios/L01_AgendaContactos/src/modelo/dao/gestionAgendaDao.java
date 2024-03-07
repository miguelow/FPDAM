package modelo.dao;

import java.util.ArrayList;

import modelo.javabean.Contacto;

public interface gestionAgendaDao {
	
	// aqui definimos los métodos y donde se implementen ya se definen
	
	boolean altaContacto(Contacto contacto);
	boolean eliminarContacto(Contacto contacto);
	//Metodos sobrecargado
	boolean eliminarContacto(String nombre);
	boolean cambiarContacto(Contacto contacto);
	
	//devolvemos
	//el parametro recibimos el que hayamos puesto en el  equals y hascode
	Contacto buscarUno(String nombre);
	Contacto buscarTelefono(String telefono);
	Contacto buscarEmail(String email);
	ArrayList<Contacto> buscarContactosPorTresPrimeros(String cadena);
	ArrayList<Contacto> buscarTodos();
	
}
