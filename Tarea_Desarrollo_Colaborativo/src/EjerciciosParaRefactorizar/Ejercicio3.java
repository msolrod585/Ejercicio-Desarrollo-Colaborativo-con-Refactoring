package EjerciciosParaRefactorizar;

import java.util.Scanner;

public class Ejercicio3 {
	
public static void main(String[] args) {
var scanner = new Scanner(System.in);
System.out.println("Introduce la cantidad de números que quieres introducir= "); int numeroParaIntroducir = scanner.nextInt();
String valores = ""; int[] otrosValores = new int[numeroParaIntroducir];
for(int i=0; i< otrosValores.length; i++) {
System.out.println("Introduce un número entero= ");
int num = scanner.nextInt();
otrosValores[i] = num ;}		
for (int i=otrosValores.length-1; i>=0 ; i--) {
valores = valores + " " + otrosValores[i] ;}		
System.out.println(valores); scanner.close();


}

}


