package modelo.javabean;

import java.util.Objects;

public abstract class AbstractPersona {
	
	// Declaramos los atributos como privados

	private String nif;
	private String nombre;
	private String direccion;
	private String telefono;
	
	// Declaramos ambos constructores
	
	public AbstractPersona(String nif, String nombre, String direccion, String telefono) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public AbstractPersona() {
		super();
	}
	
	// GETTERS Y SETTERS

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	// EQUALS Y HASHCODE CON EL NIF COMO IDENTIFICADOR
	
	@Override
	public int hashCode() {
		return Objects.hash(nif);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractPersona other = (AbstractPersona) obj;
		return Objects.equals(nif, other.nif);
	}

	// Método ToString
	
	@Override
	public String toString() {
		return "AbstractPersona [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono="
				+ telefono + ", getNif()=" + getNif() + ", getNombre()=" + getNombre() + ", getDireccion()="
				+ getDireccion() + ", getTelefono()=" + getTelefono() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}
	
	// Métodos propios
	
	public String llamar(AbstractPersona p){
		return this.getNombre() + " llamando a " + p.getNombre();
		
	}
	
	public abstract String trabajar();
}
