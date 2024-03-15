package modelo.javabeans;

import java.util.Objects;

public class Proveedor {
	private String cif;
	private String nombre;
	private String actividad;
	private String email;
	private String pais;
	
	public Proveedor() {
		// TODO Auto-generated constructor stub
	}

	public Proveedor(String cif, String nombre, String actividad, String email, String pais) {
		super();
		this.cif = cif;
		this.nombre = nombre;
		this.actividad = actividad;
		this.email = email;
		this.pais = pais;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getActividad() {
		return actividad;
	}

	public void setActividad(String actividad) {
		this.actividad = actividad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cif);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Proveedor))
			return false;
		Proveedor other = (Proveedor) obj;
		return Objects.equals(cif, other.cif);
	}

	@Override
	public String toString() {
		return "Proveedor [cif=" + cif + ", nombre=" + nombre + ", actividad=" + actividad + ", email=" + email
				+ ", pais=" + pais + "]";
	}
	
	

}
