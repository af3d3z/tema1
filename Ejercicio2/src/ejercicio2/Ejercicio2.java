package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Declaración de variables
		int edad;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca su edad:");
		edad = sc.nextInt();
		edad++;
		System.out.println("El año que viene usted tendrá: " + edad);
	}

}
