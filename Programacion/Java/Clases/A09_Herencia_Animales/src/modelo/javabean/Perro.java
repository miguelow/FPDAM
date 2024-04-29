package modelo.javabean;

public class Perro extends AbstractAnimal{

	private String raza;
	
	public Perro() {
		//Invoco al constructor vacío de mi padre
		super();
	}

	public Perro(String especie, int patas, String nombre, String raza) {
		super(especie, patas, nombre);
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Perro [especie=" + especie + ", patas=" + patas + ", nombre=" + nombre + ", raza=" + raza + "]";
	}

	@Override
	public String sonido() {
		return "Hola, soy un " + raza + " te saludo!";
	}

	@Override
	public String saludo() {
		return "Hola, soy un " + raza + " me llamo " + nombre;
	}

	@Override
	public String medioLocomocion() {
		return "Prueba medio de locomoción";
	}
	
	
}
