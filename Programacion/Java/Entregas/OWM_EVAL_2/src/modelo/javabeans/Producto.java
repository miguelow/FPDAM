package modelo.javabeans;

import java.util.Objects;

public class Producto {
	private long idProducto;
	private String descripcionLarga;
	private String descripcionCorta;
	private String marca;
	private double precio;
	private Familia familia;
	private Proveedor proveedor;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(long idProducto, String descripcionLarga, String descripcionCorta, String marca, double precio,
			Familia familia, Proveedor proveedor) {
		super();
		this.idProducto = idProducto;
		this.descripcionLarga = descripcionLarga;
		this.descripcionCorta = descripcionCorta;
		this.marca = marca;
		this.precio = precio;
		this.familia = familia;
		this.proveedor = proveedor;
	}

	public long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
	}

	public String getDescripcionLarga() {
		return descripcionLarga;
	}

	public void setDescripcionLarga(String descripcionLarga) {
		this.descripcionLarga = descripcionLarga;
	}

	public String getDescripcionCorta() {
		return descripcionCorta;
	}

	public void setDescripcionCorta(String descripcionCorta) {
		this.descripcionCorta = descripcionCorta;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Familia getFamilia() {
		return familia;
	}

	public void setFamilia(Familia familia) {
		this.familia = familia;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idProducto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Producto))
			return false;
		Producto other = (Producto) obj;
		return idProducto == other.idProducto;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", descripcionLarga=" + descripcionLarga + ", descripcionCorta="
				+ descripcionCorta + ", marca=" + marca + ", precio=" + precio + ", familia=" + familia + ", proveedor="
				+ proveedor + "]";
	}
	
	

}
