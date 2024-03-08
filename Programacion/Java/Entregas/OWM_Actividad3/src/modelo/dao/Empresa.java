package modelo.dao;

import java.util.ArrayList;

import modelo.javabeans.Departamento;
import modelo.javabeans.Empleado;
import modelo.javabeans.Localidad;
import modelo.javabeans.Trabajo;

public class Empresa implements IntGestionEmpresa{

	private String nombre;
	private ArrayList<Empleado> plantilla;
	
	public Empresa() {
		nombre = "Servicios RRHH Las Rozas";
		plantilla = new ArrayList<Empleado>();
		cargarDatos();
	}
	
	public Empresa(String nombreEmpresa) {
		this.nombre = nombreEmpresa; 
		plantilla = new ArrayList<Empleado>();
		cargarDatos();
	}
	
	private void cargarDatos() {
		Localidad loc1 = new Localidad(1, "Calle benito fuentes", "Madrid", "España");
		Localidad loc2 = new Localidad(2, "Calle salamanca", "Toledo", "España");
		Departamento dep1 = new Departamento(1, "RRHH", loc1);
		Departamento dep2 = new Departamento(2, "FIN", loc2);
		Departamento dep3 = new Departamento(3, "MARKT", loc2);
		Departamento dep4 = new Departamento(4, "CONT", loc1);
		Trabajo trab1 = new Trabajo("CONTR", "Contratacion", 10000, 20000);
		Trabajo trab2 = new Trabajo("ADMIN", "Administrativo", 20000, 30000);
		Trabajo trab3 = new Trabajo("GER", "Gerente", 30000, 40000);
		
		Empleado emp1 = new Empleado(1, "Miguel", "Ortega", "H", "miguel.owd@gmail.com", 16000, 10, trab1, dep1);
		Empleado emp2 = new Empleado(2, "David", "Martinez", "H", "david.martinez@gmail.com", 1000, 10, trab1, dep2);
		Empleado emp3 = new Empleado(3, "Laura", "Pacheco", "M", "Laura.pacheco@gmail.com", 25000, 10, trab2, dep3);
		Empleado emp4 = new Empleado(4, "Rocio", "Perez", "M", "rocio.perez@gmail.com", 32000, 10, trab3, dep4);
		plantilla.add(emp1);
		plantilla.add(emp2);
		plantilla.add(emp3);
		plantilla.add(emp4);
	
	}
	
	//Getters y setters solo de nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreEmpresa() {
		return nombre;
	}
	
	//Lista de métodos implementados del interface
	@Override
	public boolean alta(Empleado empleado) {
		if(plantilla.contains(empleado))
			return false;
		else
			return plantilla.add(empleado);
	}

	@Override
	public boolean eliminarUno(Empleado empleado) {
		if(plantilla.contains(empleado))
			return plantilla.remove(empleado);
		else
			return false;
	}

	@Override
	public boolean modificarUno(Empleado empleado) {
		int pos = plantilla.indexOf(empleado);
		if(pos != -1) {
			plantilla.set(pos, empleado);
			return true;
		}
		else
			return false;
	}

	@Override
	public double masaSalarial() {
		double suma = 0;
		for(Empleado emp: plantilla)
			suma += emp.salarioBruto();
		return suma;
	}

	@Override
	public Empleado buscarUno(int idEmpleado) {
		Empleado empleado = new Empleado();
		empleado.setIdEmpleado(idEmpleado);
		int pos = plantilla.indexOf(empleado);
		if(pos != -1) 
			return plantilla.get(pos);
		return null;
	}

	@Override
	public ArrayList<Empleado> buscarTodos() {
		return plantilla;
	}

	@Override
	public ArrayList<Empleado> buscarPorSexo(String sexo) {
		ArrayList<Empleado> aux = new ArrayList<Empleado>();
		
		for(Empleado emp: plantilla) {
			if(emp.getGenero().equalsIgnoreCase(sexo))
				aux.add(emp);
		}
		return aux;
	}

	@Override
	public ArrayList<Empleado> buscarPorDepartamento(int idDepar) {
		ArrayList<Empleado> aux = new ArrayList<Empleado>();
		
		for(Empleado emp: plantilla) {
			if(emp.getDepartamento().getIdDepartamento() == idDepar)
				aux.add(emp);
		}
		return aux;
	}

	@Override
	public ArrayList<Empleado> buscarPorTrabajo(String idTrabajo) {
		ArrayList<Empleado> aux = new ArrayList<Empleado>();
		
		for(Empleado emp: plantilla) {
			if(emp.getTrabajo().getIdTrabajo().equals(idTrabajo))
				aux.add(emp);
		}
		return aux;
	}

	@Override
	public ArrayList<Empleado> buscarPorPais(String pais) {
		ArrayList<Empleado> aux = new ArrayList<Empleado>();
		
		for(Empleado emp: plantilla) {
			if(emp.getDepartamento().getLocalidad().getPais().equals(pais))
				aux.add(emp);
		}
		return aux;
	}
}
