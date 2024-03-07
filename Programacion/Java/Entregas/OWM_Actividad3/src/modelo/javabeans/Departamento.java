package modelo.javabeans;

import java.util.Objects;

public class Departamento {
	private int idDepartamento;
	private String descripcion;
	private Localidad localidad;
	public Departamento(int idDepartamento, String descripcion, Localidad localidad) {
		super();
		this.idDepartamento = idDepartamento;
		this.descripcion = descripcion;
		this.localidad = localidad;
	}
	public Departamento() {
		super();
	}
	public int getIdDepartamento() {
		return idDepartamento;
	}
	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Localidad getLocalidad() {
		return localidad;
	}
	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idDepartamento);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Departamento))
			return false;
		Departamento other = (Departamento) obj;
		return idDepartamento == other.idDepartamento;
	}
	@Override
	public String toString() {
		return "Departamento [idDepartamento=" + idDepartamento + ", descripcion=" + descripcion + ", localidad="
				+ localidad + "]";
	}
	
	

}
