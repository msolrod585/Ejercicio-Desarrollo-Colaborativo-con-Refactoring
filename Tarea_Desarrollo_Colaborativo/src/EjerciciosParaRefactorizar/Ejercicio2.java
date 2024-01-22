package EjerciciosParaRefactorizar;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int primerNumero = sc.nextInt();
		System.out.println("Introduce un numero mayor al anterior: ");
		int segundoNumero = sc.nextInt();

		if (segundoNumero < primerNumero) {
			System.out.println("Error. Introduce un n�mero mayor al anterior: ");
			segundoNumero = sc.nextInt();
		}

		System.out.println("Los numeros comprendidos entre " + primerNumero + " y " + segundoNumero + " son"
				+ numComprendidos(primerNumero, segundoNumero));
		sc.close();
	}

	public static String numComprendidos(int primerNumero, int segundoNumero) {
		String numerosComprendidos = "";
		for (int i = primerNumero; i <= segundoNumero; i++) {
			numerosComprendidos = numerosComprendidos + " " + i;
		}
		return numerosComprendidos;
	}
}
