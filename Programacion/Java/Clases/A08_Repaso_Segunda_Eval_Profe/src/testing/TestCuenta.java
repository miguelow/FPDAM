package testing;

import modelo.javabeans.Banco;
import modelo.javabeans.Cuenta;
import modelo.javabeans.Oficina;

public class TestCuenta {

	public static void main(String[] args) {
		Cuenta cuenta =
			new Cuenta(1000, "AHORRO", 1000,  
			new Oficina(9080, "Sucursal 32", "Madrid",  
			new Banco(2090, "BBGFR", 120_000_000)));
		
		Banco ban1 = new Banco(2090, "BBGFR", 120_000_000);
		Oficina of1 = new Oficina(9080, "Sucursal 32", "Madrid",ban1);
		Oficina of2 = new Oficina(9082, "Sucursal 33", "Sevilla",ban1);
		Cuenta cuen2 = new Cuenta(1000, "AHORRO", 1000,of1);
		
		System.out.println(cuen2.getSaldo());
		System.out.println(cuen2.getOficina().getNombre().substring(0,3));
		System.out.println(cuen2.getOficina().getBanco().getNombre());
		
		
		

	}

}
