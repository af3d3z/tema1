package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		String nombre;
		Scanner sc = new Scanner(System.in);
		int edad;
		
		System.out.println("Introduzca su nombre:");
		nombre = sc.nextLine();
		System.out.println("Introduzca su edad:");
		edad = sc.nextInt();
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
		sc.close();
	}

}
