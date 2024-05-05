package modelo.javabean;

public class Administrativo extends AbstractPersona{

	private String tareas;

	public Administrativo() {
		super();
	}

	public Administrativo(String nif, String nombre, String direccion, String telefono, String tareas) {
		super(nif, nombre, direccion, telefono);
		this.tareas = tareas;
	}

	public String getTareas() {
		return tareas;
	}

	public void setTareas(String tareas) {
		this.tareas = tareas;
	}
	
	public String gestionarMatricula() {
		return "El administrativo " + this.getNombre() + " va a gestionar una matrícula.";
	}
	
	@Override
	public String trabajar() {
		return "El administrativo " + this.getNombre() + " va a realizar estas tareas: " + this.getTareas();
	}

	@Override
	public String toString() {
		return "Administrativo [tareas=" + tareas + ", getTareas()=" + getTareas() + ", gestionarMatricula()="
				+ gestionarMatricula() + ", trabajar()=" + trabajar() + ", getNif()=" + getNif() + ", getNombre()="
				+ getNombre() + ", getDireccion()=" + getDireccion() + ", getTelefono()=" + getTelefono()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ "]";
	}
}
