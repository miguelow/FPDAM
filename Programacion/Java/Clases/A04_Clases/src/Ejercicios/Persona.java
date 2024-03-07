package Ejercicios;

public class Persona {
/*
 * Persona es una clase de negocio, estas clases
 * llevan todos los atributos que representan todos los objetos 
 * de la clase persona
 */
	private int idPersona;
	private String nombre;
	private String apellidos;
	private double salario;
	private double complementoSalario;
	private char genero;
	
	/*
	 * Para generar el constructor 
	 * click derecho -> source generate constructor e incluir todos los atributos
	 */
	
	public Persona(
			int idPersona, 
			String nombre, 
			String apellidos, 
			double salario, 
			double complementoSalario, 
			char genero
			) {
	super();
	
	/*
	 * Super representa a mi padre en herencia
	 * Funcionaría si lo quitamos pero conviene dejarlo
	 */
	
	this.idPersona = idPersona;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.salario = salario;
	this.complementoSalario = complementoSalario;
	this.genero = genero;
}
	
	/*
	 * Para generar todos estos métodos: click derecho en 
	 * source->generate getters and setters y seleccionar todos
	 */
	
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPerona(int idPerona) {
		this.idPersona = idPerona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getComplementoSalario() {
		return complementoSalario;
	}
	public void setComplementoSalario(double complementoSalario) {
		this.complementoSalario = complementoSalario;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	//Metodos propios
	public String nombreCompleto() {
		return apellidos + ",  " + nombre;
	}
	public double salarioBruto() {
		return salario + complementoSalario;
	}
	public double salarioBrutoMensual(int meses) {
		//Dentro de métodos podemos hacer uso de otros métodos
		return salarioBruto() /meses;
	}
	
	//Si hay un método con el mismo nombre que en el padre se sobreescribe el método = Override
	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario="
				+ salario + ", complementoSalario=" + complementoSalario + ", genero=" + genero + "]";
	}
	
	
	
}
