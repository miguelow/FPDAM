package modelo.dao;

import java.util.ArrayList;

import modelo.javabeans.Banco;
import modelo.javabeans.Cuenta;
import modelo.javabeans.Oficina;

public class CuentasDelBanco implements IntCuentasBanco{
	private ArrayList<Cuenta> lista;
	
	public CuentasDelBanco() {
		lista = new ArrayList<Cuenta>();
		cargarDatos();
	}
	
	private void cargarDatos() {
		Banco ban1 = new Banco(2090, "BBGFR", 120_000_000);
		Oficina of11 = new Oficina(9080, "Sucursal 32", "Madrid",ban1);
		Oficina of21 = new Oficina(9081, "Sucursal 33", "Sevilla",ban1);
		lista.add(new Cuenta(1001, "AHORRO", 1000,of11));
		lista.add(new Cuenta(1002, "AHORRO", 1000,of11));
		lista.add(new Cuenta(1003, "AHORRO", 1000,of11));
		lista.add(new Cuenta(1004, "AHORRO", 1000,of11));
		
		lista.add(new Cuenta(2001, "AHORRO", 1000,of21));
		lista.add(new Cuenta(2002, "AHORRO", 1000,of21));
		lista.add(new Cuenta(2003, "AHORRO", 1000,of21));
		lista.add(new Cuenta(2004, "AHORRO", 1000,of21));
		
		
	}

	@Override
	public boolean alta(Cuenta cuenta) {
		if (lista.contains(cuenta))
			return false;
		else
			return lista.add(cuenta);
	}

	@Override
	public boolean modificar(Cuenta cuenta) {
		int pos = lista.indexOf(cuenta);
		if (pos != -1) {
			lista.set(pos, cuenta);
			return true;
		}
		return false;
			
	}

	@Override
	public boolean eliminar(int numeroCuenta) {
		Cuenta cuenta = buscarUna(numeroCuenta);
		if (cuenta != null)
			return eliminar(cuenta);
		else
			return false;
	}

	@Override
	public boolean eliminar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		return lista.remove(cuenta);
	}

	@Override
	public Cuenta buscarUna(int numeroCuenta) {
		for (Cuenta cuenta: lista) {
			if (cuenta.getNumeroCuenta() ==  numeroCuenta)
				return cuenta;
		}
		return null;
	}

	@Override
	public ArrayList<Cuenta> todas() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public ArrayList<Cuenta> buscarPorOficina(int idOficina) {
		ArrayList<Cuenta> aux = new ArrayList<Cuenta>();
		for (Cuenta cuenta: lista) {
			if (cuenta.getOficina().getIdOficina() == idOficina)
				aux.add(cuenta);
			
		}
		return aux;
	}

	@Override
	public ArrayList<Cuenta> buscarPorBanco(int idBanco) {
		ArrayList<Cuenta> aux = new ArrayList<Cuenta>();
		for (Cuenta cuenta: lista) {
			if (cuenta.getOficina().getBanco().getIdBanco() == idBanco)
				aux.add(cuenta);
			
		}
		return aux;
	}

}
