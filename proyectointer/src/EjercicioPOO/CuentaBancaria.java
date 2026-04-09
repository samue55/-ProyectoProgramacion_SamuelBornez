package EjercicioPOO;

public class CuentaBancaria {
	// Atributos
	private String titular;
	private double saldo;


	// Constructor
	public CuentaBancaria() {
	this.titular = "sin titular";
	this.saldo = 0;
	}


	// Constructor con parámetros
	public CuentaBancaria(String titular, double saldo) {
	this.titular = titular;
	this.saldo = saldo;
	}


	// Get y set 
	public String getTitular() {
	return titular;
	}


	public void setTitular(String titular) {
	this.titular = titular;
	}


	public double getSaldo() {
	return saldo;
	}


	public void setSaldo(double saldo) {
	this.saldo = saldo;
	}


	// metodo para ingresar dinero 
	public void ingresar(double cantidad) {
	if (cantidad > 0) {
	saldo += cantidad;
	}
	}


	// Metodo para retirar dinero
	public boolean retirar(double cantidad) {
	if (cantidad <= saldo) {
	saldo -= cantidad;
	return true;
	} else {
	return false;
	}
	}

	@Override
	public String toString() {
	return "titular: " + titular + " | saldo: " + saldo + " €";
	}
}






