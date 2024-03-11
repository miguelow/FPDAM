package modelo.javabeans;

import java.util.Objects;

public class Cuenta {
	
	private int numeroCuenta;
	private String tipoCuenta;
	private double saldo;
	private Oficina oficina;
	
	public Cuenta() {
		super();
	}

	public Cuenta(int numeroCuenta, String tipoCuenta, double saldo, Oficina oficina) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.tipoCuenta = tipoCuenta;
		this.saldo = saldo;
		this.oficina = oficina;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Oficina getOficina() {
		return oficina;
	}

	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroCuenta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Cuenta))
			return false;
		Cuenta other = (Cuenta) obj;
		return numeroCuenta == other.numeroCuenta;
	}

	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", tipoCuenta=" + tipoCuenta + ", saldo=" + saldo + ", oficina="
				+ oficina + "]";
	}
	
	public void aumentarSaldo(double cantidad) {
		saldo += cantidad;
	}
	
	public boolean disminuirSaldo(double cantidad) {
		if (cantidad > saldo)
			return false;
		
		saldo-= cantidad;
		return true;
	}
	
	

}
