package modelo.javabean;

public class Alumno extends AbstractPersona{

	private String curso;

	public Alumno() {
		super();
	}

	public Alumno(String nif, String nombre, String direccion, String telefono, String curso) {
		super(nif, nombre, direccion, telefono);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String hacerExamen() {
		return "El estudiante " + this.getNombre() + " va a hacer su examen.";
	}

	@Override
	public String trabajar() {
		return "El alumno " + this.getNombre() + " va a estudiar para el curso " + this.curso;
	}

	@Override
	public String toString() {
		return "Alumno [curso=" + curso + ", getCurso()=" + getCurso() + ", hacerExamen()=" + hacerExamen()
				+ ", trabajar()=" + trabajar() + ", getNif()=" + getNif() + ", getNombre()=" + getNombre()
				+ ", getDireccion()=" + getDireccion() + ", getTelefono()=" + getTelefono() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + "]";
	}
}
