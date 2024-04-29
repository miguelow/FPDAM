package modelo.javabean;

import java.util.Objects;

public abstract class AbstractAnimal {

	/*
	 * Declaramos los atributos de la clase padre como PROTECTED
	 * Para que puedan ser accesibles desde la clase hija
	 * 
	 * 
	 * 1. Una clase abstracta debe tener sus construcotres si tiene datos
	 * 2. Tiene datos privados, dando acceso a través de los getters and setters
	 * 
	 */
	protected String especie;
	protected int patas;
	protected String nombre;
	public AbstractAnimal(String especie, int patas, String nombre) {
		super();
		this.especie = especie;
		this.patas = patas;
		this.nombre = nombre;
	}
	public AbstractAnimal() {
		super();
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public int hashCode() {
		return Objects.hash(especie);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractAnimal other = (AbstractAnimal) obj;
		return Objects.equals(especie, other.especie);
	}
	/*
	 * Este método no llegaría a ejecutarse ya que los métodos se ejecutan en el orden:
	 * 1. En el new
	 * 2. En el padre 
	@Override
	public String toString() {
		return "Animal [especie=" + especie + ", patas=" + patas + ", nombre=" + nombre + "]";
	}
	*/
	//Métodos propios
	public abstract String sonido();
	
	public abstract String saludo();
	
	public abstract String medioLocomocion();
	
}
