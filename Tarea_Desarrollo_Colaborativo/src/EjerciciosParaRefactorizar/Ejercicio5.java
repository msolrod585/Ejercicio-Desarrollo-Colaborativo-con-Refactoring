package EjerciciosParaRefactorizar;

import java.util.Scanner;

public class Ejercicio5 {
public static void main(String[] args) { Scanner sc = new Scanner(System.in); System.out.println("Dime un carácter(pulse z para salir): ");
char caracterintroducido = sc.next().charAt(0);
int contadordevocales = 0;
while( caracterintroducido != 'z' ) { if ((caracterintroducido == 'a')|| (caracterintroducido == 'e') || (caracterintroducido == 'i')|| (caracterintroducido == 'o') || (caracterintroducido == 'u'))
contadordevocales ++;
System.out.println("Dime otro carácter(pulse z para salir): ");
caracterintroducido = sc.next().charAt(0);}
System.out.println("Se han contado " + contadordevocales + " vocales.");sc.close();
}}
