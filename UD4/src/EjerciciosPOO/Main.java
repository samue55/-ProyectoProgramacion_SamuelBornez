package EjerciciosPOO;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);


		// aqui vamos a crear las instancias 
		CuentaBancaria cuenta1 = new CuentaBancaria("Ana", 500);
		CuentaBancaria cuenta2 = new CuentaBancaria("Luis", 300);


		// Mostrar estado inicial de todas la cuentas
		System.out.println("Estado inicial de las cuentas:");
		System.out.println(cuenta1);
		System.out.println(cuenta2);


		// Uso de bucle
		for (int i = 0; i < 2; i++) {
		System.out.print("Introduce cantidad a retirar de la cuenta de Ana: ");
		double cantidad = sc.nextDouble();


		boolean retiradaCorrecta = cuenta1.retirar(cantidad);


		if (retiradaCorrecta) {
		System.out.println("Retirada realizada correctamente.");
		} else {
		System.out.println("No hay saldo suficiente.");
		}
		}


		// Mostrar estado final para que salga cuando el limite a sido sobrepasado del dinero que hay en la cuenta
		System.out.println("\nEstado final de las cuentas:");
		System.out.println(cuenta1);
		System.out.println(cuenta2);


		sc.close();
		}
}
