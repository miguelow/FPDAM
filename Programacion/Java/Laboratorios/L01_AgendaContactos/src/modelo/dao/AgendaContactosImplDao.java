package modelo.dao;

import java.util.ArrayList;

import modelo.javabean.Contacto;

public class AgendaContactosImplDao implements gestionAgendaDao {

	private String nombreAgenda;
	private ArrayList<Contacto> lista;

	public AgendaContactosImplDao() {
		nombreAgenda = "Agenda Personal";
		// SIEMPRE INICIALIZAR LAS LISTAS
		lista = new ArrayList<Contacto>();
		cargarDatos();
	}

	public AgendaContactosImplDao(String nombreAgenda) {
		this.nombreAgenda = nombreAgenda;
		lista = new ArrayList<Contacto>();
		cargarDatos();
	}

	private void cargarDatos() {
		lista.add(new Contacto("Pepe", "Lopez", "610910823", "miguel.owd@gmail.com", "Verisure"));
		lista.add(new Contacto("Martin", "Yague", "674598087", "martin.owd@gmail.com", "Verisure"));
		lista.add(new Contacto("Carlos", "Lopez", "610910845", "carlos.owd@gmail.com", "Verisure"));
	}

	public String getNombreAgenda() {
		return nombreAgenda;
	}

	public void setNombreAgenda(String nombreAgenda) {
		this.nombreAgenda = nombreAgenda;
	}

	// Solo generamos el get de la lista de los contactos para que no sea posible
	// modificarlo
	public ArrayList<Contacto> getLista() {
		return lista;
	}

	// Metodos del interface con Override ya que los sobreescribimos
	@Override
	public boolean altaContacto(Contacto contacto) {
		if (lista.contains(contacto))
			return false;
		else
			return lista.add(contacto);
	}

	@Override
	public boolean eliminarContacto(Contacto contacto) {
		if (lista.contains(contacto))
			return lista.remove(contacto);
		else
			return false;
	}

	@Override
	public boolean eliminarContacto(String nombre) {
		Contacto contacto = buscarUno(nombre);
		if (contacto != null)
			return lista.remove(contacto);
		else
			return false;
	}

	@Override
	public boolean cambiarContacto(Contacto contacto) {
		int pos = lista.indexOf(contacto);
		if (pos != -1) {
			lista.set(pos, contacto);
			return true;
		} else
			return false;
	}

	@Override
	public Contacto buscarUno(String nombre) {
		Contacto contacto = new Contacto();
		contacto.setNombre(nombre);
		int pos = lista.indexOf(contacto);
		
		if(pos != -1)
			return lista.get(pos);
		
		return null;
	}

	@Override
	public Contacto buscarTelefono(String telefono) {
		// teniendo en cuenta que no puede haber telefonos repetidos
		for (Contacto con : lista) {
			if (con.getTelefono().equals(telefono))
				return con;
		}
		return null;
	}

	@Override
	public Contacto buscarEmail(String email) {
		for (Contacto con : lista) {
			if (con.getEmail().equals(email))
				return con;
		}
		return null;
	}

	@Override
	public ArrayList<Contacto> buscarContactosPorTresPrimeros(String cadena) {
		ArrayList<Contacto> aux = new ArrayList<Contacto>();
		for (Contacto con : lista) {
			if (con.getNombre().substring(0, 2).equalsIgnoreCase(cadena.substring(0, 2)))
				aux.add(con);
		}
		return aux;
	}

	@Override
	public ArrayList<Contacto> buscarTodos() {
		return lista;
	}
}
