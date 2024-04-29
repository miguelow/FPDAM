package modelo.javabean;

public class Gato extends AbstractAnimal{
	
	private int vidas;

	public Gato() {
		super();
	}

	public Gato(String especie, int patas, String nombre, int vidas) {
		super(especie, patas, nombre);
		this.vidas = vidas;
	}

	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	@Override
	public String toString() {
		return "Gato [especie=" + especie + ", patas=" + patas + ", nombre=" + nombre + ", vidas=" + vidas + "]";
	}
	
	public void perderVidas(int vidas) {
		this.vidas -= vidas;
	}

	/*
	 * Dependiendo si los métodos del padre son identificativos con la clase hija, está la opción
	 * de hacer un ovverride a estos métodos, sobreescribiendolos
	 */
	
	@Override
	public String sonido() {
		return "miau";
	}

	@Override
	public String saludo() {
		return "Hola, me llamo " + nombre + " y digo " + this.sonido();
	}

	@Override
	public String medioLocomocion() {
		return "Mi medio de locomoción son mis " + this.patas + " patas";
	}

	// No creamos el equals y hascode ya que la manera de comprar los objetos de tipo gato es por 
	// su atributo especie, el identificador de la clase padre
	
	
	
	
}
