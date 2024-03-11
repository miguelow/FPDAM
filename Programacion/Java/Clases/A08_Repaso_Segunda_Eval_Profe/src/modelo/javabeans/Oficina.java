package modelo.javabeans;

import java.util.Objects;

public class Oficina {
	
	private int idOficina;
	private String nombre;
	private String direcion;
	private Banco banco;
	
	public Oficina() {
		super();
	}

	public Oficina(int idOficina, String nombre, String direcion, Banco banco) {
		super();
		this.idOficina = idOficina;
		this.nombre = nombre;
		this.direcion = direcion;
		this.banco = banco;
	}

	public int getIdOficina() {
		return idOficina;
	}

	public void setIdOficina(int idOficina) {
		this.idOficina = idOficina;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirecion() {
		return direcion;
	}

	public void setDirecion(String direcion) {
		this.direcion = direcion;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idOficina);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Oficina))
			return false;
		Oficina other = (Oficina) obj;
		return idOficina == other.idOficina;
	}

	@Override
	public String toString() {
		return "Oficina [idOficina=" + idOficina + ", nombre=" + nombre + ", direcion=" + direcion + ", banco=" + banco
				+ "]";
	}
	
	

}
