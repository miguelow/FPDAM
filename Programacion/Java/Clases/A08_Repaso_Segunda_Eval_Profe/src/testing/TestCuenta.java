package testing;

import modelo.javabeans.Banco;
import modelo.javabeans.Cuenta;
import modelo.javabeans.Oficina;

public class TestCuenta {

	// Esta clase la usamos para probar que la creación
	// y el acceso a los métodos de esta son correctos
	public static void main(String[] args) {

		/*
		 * 1 banco esta asociado a n oficinas las cuales están asociadas a n cuentas
		 */
		Banco ban1 = new Banco(2090, "BBGFR", 120_000_000);
		Oficina of1 = new Oficina(9080, "Sucursal 32", "Madrid", ban1);
		Cuenta cuen = new Cuenta(1, "AHORRO", 1000, of1);

		System.out.println("El saldo de la cuenta" + cuen.getNumeroCuenta() + "es de: " + cuen.getSaldo());
		System.out.println("Nombre de la oficina asociada a la cuenta: " + cuen.getOficina().getNombre());
		System.out.println("Nombre del banco asociado a la oficina: " + cuen.getOficina().getBanco().getNombre());

	}

}
