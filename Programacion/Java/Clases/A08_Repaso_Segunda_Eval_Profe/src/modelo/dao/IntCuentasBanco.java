package modelo.dao;

import java.util.ArrayList;

import modelo.javabeans.Cuenta;

public interface IntCuentasBanco {
	
	boolean alta(Cuenta cuenta);
	boolean modificar(Cuenta cuenta);
	boolean eliminar(int numeroCuenta);
	boolean eliminar(Cuenta cuenta);
	Cuenta buscarUna(int numeroCuenta);
	ArrayList<Cuenta> todas();
	ArrayList<Cuenta> buscarPorOficina(int idOficina);
	ArrayList<Cuenta> buscarPorBanco(int idBanco);
	
	

}
