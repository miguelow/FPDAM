package modelo.javabeans;

import java.util.Objects;

public class Banco {
	
	private int idBanco;
	private String nombre;
	private double facturacion;
	
	public Banco() {
		super();
	}

	public Banco(int idBanco, String nombre, double facturacion) {
		super();
		this.idBanco = idBanco;
		this.nombre = nombre;
		this.facturacion = facturacion;
	}

	public int getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(int idBanco) {
		this.idBanco = idBanco;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getFacturacion() {
		return facturacion;
	}

	public void setFacturacion(double facturacion) {
		this.facturacion = facturacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idBanco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Banco))
			return false;
		Banco other = (Banco) obj;
		return idBanco == other.idBanco;
	}

	@Override
	public String toString() {
		return "Banco [idBanco=" + idBanco + ", nombre=" + nombre + ", facturacion=" + facturacion + "]";
	}
	
	

}
