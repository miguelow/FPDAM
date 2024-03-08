package testing.javabeans;

import modelo.javabeans.Departamento;
import modelo.javabeans.Empleado;
import modelo.javabeans.Localidad;
import modelo.javabeans.Trabajo;

public class TestingEmpleado {

	public static void main(String [] args) {
		Localidad loc1 = new Localidad(1, "Calle benito fuentes", "Madrid", "España");
		Departamento dep1 = new Departamento(1, "RRHH", loc1);
		Trabajo trab1 = new Trabajo("CONTR", "Contratacion", 12000, 20000);
		Empleado emp1 = new Empleado(1, "Miguel", "Ortega", "H", "miguel.owd@gmail.com", 16000, 10, trab1, dep1);
		
		//Nombre, apellidos, género, nombre del departamento, nombre de su trabajo, dirección , ciudad y país.
		System.out.println("Nombre -> " + emp1.getNombre());
		System.out.println("Apellidos -> " + emp1.getApellidos());
		System.out.println("Género -> " + emp1.getGenero());
		System.out.println("Nombre del departamento -> " + emp1.getDepartamento().getDescripcion());
		System.out.println("Nombre del trabajo -> " + emp1.getTrabajo().getDescripcion());
		System.out.println("Dirección -> " + emp1.getDepartamento().getLocalidad().getDireccion());
		System.out.println("Ciudad -> " + emp1.getDepartamento().getLocalidad().getCiudad());
		System.out.println("País -> " + emp1.getDepartamento().getLocalidad().getPais());
		
		//Test métodos propios 
		System.out.println("Prueba de métodos propios -- ");
		System.out.println("Salario bruto: " + emp1.salarioBruto());
		System.out.println("Salario mensual en 12 pagas: " + Math.round(emp1.salarioMensual()));
		System.out.println("Sexo: " + emp1.literalSexo());
		System.out.println("Nombre completo: " + emp1.nombreCompleto());
		System.out.println("Email: " + Empleado.obtenerEmail(emp1.getNombre(), emp1.getApellidos()));
		/*
		 * Como el método obtenerEmail está declarado como estático
		 * No necesitamos hacer uso de la instancia de la clase Empleado como con los demás métodos
		 * Podemos llamar al método usando la propia clase
		 */
	}
}
