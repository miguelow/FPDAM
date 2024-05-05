package modelo.dao;

import java.util.ArrayList;
import java.util.List;

import modelo.javabean.AbstractPersona;
import modelo.javabean.Administrativo;
import modelo.javabean.Alumno;
import modelo.javabean.Profesor;

public class Instituto implements InstitutoDao{
	
	private List<AbstractPersona> personas;
	
	public Instituto() {
		personas = new ArrayList<AbstractPersona>();
		cargarDatos();
	}
	
	private void cargarDatos() {
		AbstractPersona profAbs1 = new Profesor("3334", "Manuel", "Avenida Calamar 27", "663778902", "Ciencias e Inglés");
		AbstractPersona alumAbs1 = new Alumno("3335", "Lucía", "Avenida Calamar 28", "663778002", "4ESO");
		AbstractPersona adminAbs1 = new Administrativo("3336", "Ramón", "Avenida Calamar 29", "663778345", "Controlar asistencia");
		
		personas.add(profAbs1);
		personas.add(alumAbs1);
		personas.add(adminAbs1);
	}

	@Override
	public boolean altaPersona(AbstractPersona persona) {
		if (personas.contains(persona))
			return false;
			else
				return personas.add(persona);
	}
	
	@Override
	public boolean eliminarPersona(AbstractPersona persona) {
		if (personas.contains(persona)) {
			return personas.remove(persona);
		}
		else {
			return false;
		}
	}
	
	@Override
	public List<AbstractPersona> buscarTodas() {
		return personas;
	}
	
	@Override
	public AbstractPersona buscarUno(String nif) {
		for (AbstractPersona persona: personas) {
            if (persona.getNif().equals(nif))
                return persona;
        } 
        return null;
	}
	
	@Override
	public List<AbstractPersona> buscarPersonasPorTipo(String tipoPersona) {
		
		List<AbstractPersona>personasPorTipo = new ArrayList<>();
		
		for (AbstractPersona persona : personas) {
			if (("Alumno".equals(tipoPersona) && persona instanceof Alumno)
					||
                ("Profesor".equals(tipoPersona) && persona instanceof Profesor) 
                	||
                ("Administrativo".equals(tipoPersona) && persona instanceof Administrativo)) {
				personasPorTipo.add(persona);
	            }
	        }
	        return personasPorTipo;
    }	
}

	

