package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Declaración de variables
		int anoActual;
		int anoNacimiento;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el año actual: ");
		anoActual = sc.nextInt();
		System.out.println("Introduzca su año de nacimiento: ");
		anoNacimiento = sc.nextInt();
		System.out.println("Su edad es de " + (anoActual - anoNacimiento) + " años." );
	}

}
