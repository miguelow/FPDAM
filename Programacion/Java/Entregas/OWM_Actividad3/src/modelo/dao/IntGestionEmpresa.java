package modelo.dao;

import java.util.ArrayList;

import modelo.javabeans.Empleado;

public interface IntGestionEmpresa {
	
	boolean alta(Empleado empleado);
	boolean eliminarUno(Empleado empleado);
	boolean modificarUno(Empleado empleado);
	double masaSalarial();
	Empleado buscarUno(int idEmpleado);
	ArrayList<Empleado> buscarTodos();
	ArrayList<Empleado> buscarPorSexo(String sexo);
	ArrayList<Empleado> buscarPorDepartamento(int idDepar);
	ArrayList<Empleado> buscarPorTrabajo(String idTrabajo);
	ArrayList<Empleado> buscarPorPais(String pais);
	
	/*
	 * Estos son los métodos
	 * No los podemos llamar porque no tienen instrucciones
	 * No tienen instrucciones ya que se abstraen de donde se implementen
	 */
	
}
