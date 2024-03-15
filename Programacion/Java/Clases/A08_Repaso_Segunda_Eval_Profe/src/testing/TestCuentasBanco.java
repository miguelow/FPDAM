package testing;

import modelo.dao.CuentasDelBanco;
import modelo.javabeans.Banco;
import modelo.javabeans.Cuenta;
import modelo.javabeans.Oficina;

public class TestCuentasBanco {
	
	private static CuentasDelBanco cuentas;
	
	static {
		//Constructor static
		cuentas = new CuentasDelBanco();
	}
	
	public static void main(String[] args) {
		alta();
		//todos();
		//porOficina();
		// porBanco();
		
	}
	
	public static void alta() {
		System.out.println("ALTA EMPLEADO");
		Cuenta cuenta =
				new Cuenta(1004, "CORIENTE", 1005,  
				new Oficina(9080, "Sucursal 32", "Madrid",  
				new Banco(2090, "BBGFR", 120_000_000)));
		System.out.println(cuentas.alta(cuenta));
		todos();
	}
	
	public static void porOficina() {
		System.out.println("POR OFICINA");
		for (Cuenta cuenta: cuentas.buscarPorOficina(9081)) {
			System.out.println(cuenta);
		}
	}
	
	public static void porBanco() {
		System.out.println("POR BANCO");
		for (Cuenta cuenta: cuentas.buscarPorBanco(2091)) {
			System.out.println(cuenta);
		}
	}
	
	public static void todos() {
		System.out.println("TODOS");
		for (Cuenta cuenta: cuentas.todas()) {
			System.out.println(cuenta);
		}
	}

}
