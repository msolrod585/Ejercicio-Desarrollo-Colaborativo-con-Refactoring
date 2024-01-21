package EjerciciosParaRefactorizar;

import java.util.Scanner;

public class ejercicio4 {
	
		public static int contadorPalabra(String palabra, String frase) {
frase = frase.toLowerCase();
palabra=palabra.toLowerCase();
int contador = 0;int pos = 0;int pal = 0;
do {pal = frase.indexOf(palabra, pos);
				if(pal >= 0) {
					contador++;pos= pal + 1;
				}}while (pal >= 0);
return contador;
		}

public static void main(String[] args) {
var sc = new Scanner(System.in);
System.out.println("Introduce una frase: ");
String fraseintroducida =sc.nextLine();
System.out.println("Introduce una palabra: ");
String palabradelafrase =sc.nextLine();
sc.close();
System.out.println("La palabra " + palabradelafrase + " aparece " + contadorPalabra(palabradelafrase, fraseintroducida) + " veces.");
		}

	}


