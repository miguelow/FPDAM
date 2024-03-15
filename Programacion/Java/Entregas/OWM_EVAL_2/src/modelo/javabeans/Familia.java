package modelo.javabeans;

import java.util.Objects;

public class Familia {
	private int idFamilia;
	private String descripcion;
	
	public Familia(int idFamilia, String descripcion) {
		super();
		this.idFamilia = idFamilia;
		this.descripcion = descripcion;
	}

	public Familia() {
		super();
	}

	public int getIdFamilia() {
		return idFamilia;
	}

	public void setIdFamilia(int idFamilia) {
		this.idFamilia = idFamilia;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idFamilia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Familia))
			return false;
		Familia other = (Familia) obj;
		return idFamilia == other.idFamilia;
	}

	@Override
	public String toString() {
		return "Familia [idFamilia=" + idFamilia + ", descripcion=" + descripcion + "]";
	}
	
	

}
