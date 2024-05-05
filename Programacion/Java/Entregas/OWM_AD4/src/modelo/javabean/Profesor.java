package modelo.javabean;

public class Profesor extends AbstractPersona{

	private String competencias;
	
	public Profesor() {
		super();
	}

	public Profesor(String nif, String nombre, String direccion, String telefono, String competencias) {
		super(nif, nombre, direccion, telefono);
		this.competencias = competencias;
	}

	public String getCompetencias() {
		return competencias;
	}

	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}
	
	public String ponerNotas() {
		return "El profesor " + this.getNombre() + " está calificando el examen.";	
	}

	@Override
	public String trabajar() {
		return "El profesor " + this.getNombre() + " va a impartir su clase.";
	}

	@Override
	public String toString() {
		return "Profesor [competencias=" + competencias + ", getCompetencias()=" + getCompetencias() + ", ponerNotas()="
				+ ponerNotas() + ", trabajar()=" + trabajar() + ", getNif()=" + getNif() + ", getNombre()="
				+ getNombre() + ", getDireccion()=" + getDireccion() + ", getTelefono()=" + getTelefono()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ "]";
	}	
	
}
