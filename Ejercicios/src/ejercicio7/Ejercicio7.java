package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		String nombre;
		String direccion;
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre:");
		nombre = sc.nextLine();
		System.out.println("Introduce tu dirección:");
		direccion = sc.nextLine();
		System.out.println("Introduce tu número de teléfono:");
		numero = sc.nextInt();
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direccion);
		System.out.println("Nº de teléfono: " + numero);
		
		sc.close();
	}

}
