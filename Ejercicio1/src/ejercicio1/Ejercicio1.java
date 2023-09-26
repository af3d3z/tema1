package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número:");
		numero = sc.nextInt();
		System.out.println("El número introducido es: " + numero);
		sc.close();
	}
}
