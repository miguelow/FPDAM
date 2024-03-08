package testing.dao;

import modelo.dao.Empresa;
import modelo.javabeans.Departamento;
import modelo.javabeans.Empleado;
import modelo.javabeans.Localidad;
import modelo.javabeans.Trabajo;

public class Principal {

	//1ero definimos una variable de tipo Empresa
	private static Empresa empresa = new Empresa();
	
	/*
	 * Imitamos al constructor pero inicializando lo estático 
	 * en vez de lo privado
	 */
	static {
		empresa = new Empresa();
	}
	public static void main (String [] args) {
		pruebaMetodos();
	}
	public static void pruebaMetodos() {
		alta();
		eliminarUno();
		modificarUno();
		masaSalarial();
		buscarUno();
		buscarTodos();
		buscarPorSexo();
		buscarPorDepartamento();
		buscarPorTrabajo();
		buscarPorPais();
	}
	public static void alta() {	
		Localidad loc1 = new Localidad(1, "Calle benito fuentes", "Madrid", "España");
		Departamento dep1 = new Departamento(1, "RRHH", loc1);
		Trabajo trab1 = new Trabajo("CONTR", "Contratacion", 10000, 20000);
		Empleado emp1 = new Empleado(1, "Miguel", "Ortega", "H", "miguel.owd@gmail.com", 16000, 10, trab1, dep1);
		Empleado empNuevo = new Empleado(6, "Jorge", "Perez", "H", "jp@gmail.com", 18000, 10, trab1, dep1);
		
		System.out.println("Alta empleado -- ");
		System.out.println("Estado de alta empleado ya existente -> " + empresa.alta(emp1));
		System.out.println("Estado de alta nuevo empleado -> " + empresa.alta(empNuevo));	
		System.out.println();
	}
	public static void eliminarUno() {
		System.out.println("Prueba eliminar 1 empleado con idEmpleado 2 -- ");
		System.out.println("Total de empleados previo a eliminar " + empresa.buscarTodos().size());
		System.out.println("Estado operacion de eliminar: " + empresa.eliminarUno(empresa.buscarUno(2)));
		System.out.println("Total de empleados previo a eliminar " + empresa.buscarTodos().size());
		System.out.println();
	}
	public static void modificarUno() {
		System.out.println("Modificacion empleado con idEmpleado 1 -- ");
		Empleado empModificar = empresa.buscarUno(1);
		System.out.println("Datos del empleado previos a modificar " + empModificar.toString());
		if(empModificar != null) {
			empModificar.setNombre("Manolito");
			empresa.modificarUno(empModificar);
			System.out.println("Datos del empleado después a modificar " + empModificar.toString());
		}
		System.out.println();
	}
	public static void masaSalarial() {
		System.out.println("La suma de todos los salarios de la empresa: " + empresa.masaSalarial() + " euros");
		System.out.println();
	}
	public static void buscarUno() {
		System.out.println("Busqueda de empleado por idEmpleado no existente -- ");
		if(empresa.buscarUno(10) != null)
			System.out.println(empresa.buscarUno(10).toString());
		else {
			System.out.println("Introduzca un idEmpleado existente, esta es una lista de los ids existentes: ");
			for(Empleado emp: empresa.buscarTodos()) {
				System.out.print(emp.getIdEmpleado());
				System.out.print(" ");
			}
		}
		System.out.println();
		System.out.println("Busqueda de empleado por idEmpleado existente -- ");
		if(empresa.buscarUno(1) != null)
			System.out.println("Datos del empleado: " + empresa.buscarUno(1).toString());
		else {
			System.out.println("Introduzca un idEmpleado existente, esta es una lista de los ids existentes: ");
			for(Empleado emp: empresa.buscarTodos()) {
				System.out.print(emp.getIdEmpleado());
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	public static void buscarTodos() {
		System.out.println("Listado de todos los empleados -- ");
		for(Empleado emp: empresa.buscarTodos())
			System.out.println(emp.toString());
		System.out.println();
	}
	public static void buscarPorSexo() {
		System.out.println("Listado de todos los empleados por sexo -- ");
		System.out.println("Hombres");
		for(Empleado emp: empresa.buscarPorSexo("H"))
			System.out.println(emp.toString());
		System.out.println("Mujeres");
		for(Empleado emp: empresa.buscarPorSexo("M"))
			System.out.println(emp.toString());
		System.out.println();
	}
	public static void buscarPorDepartamento() {
		System.out.println("Busqueda de idDepartamento, 1 -- ");
		for(Empleado emp: empresa.buscarPorDepartamento(1))
			System.out.println("El idDepartamento 1 corresponde a " + emp.getDepartamento().getDescripcion() + " y estan ubicados en la " + emp.getDepartamento().getLocalidad().getDireccion());
		System.out.println();
	}
	public static void buscarPorTrabajo() {
		System.out.println("Busqueda de empleados por trabajo, ADMIN -- ");
			System.out.println("Hay un total de " + empresa.buscarPorTrabajo("ADMIN").size() + " empleados que trabajan como administrativos");
		System.out.println();
	}
	public static void buscarPorPais() {
		System.out.println("Busqueda de empleados por pais, España -- ");
		System.out.println("Total de trabajadores en España: " + empresa.buscarPorPais("España").size());
		System.out.println("Listado");
		for(Empleado emp: empresa.buscarPorPais("España"))
			System.out.println(emp.getNombre() + " " + emp.getApellidos());
	}
}
