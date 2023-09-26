package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		int num0;
		int num1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el primer número: ");
		num0 = sc.nextInt();
		System.out.println("Ingrese el segundo número: ");
		num1 = sc.nextInt();
		
		System.out.println(num0 + " + " + num1 + " = " + (num0 + num1));
		System.out.println(num0 + " - " + num1 + " = " + (num0 - num1));
		System.out.println(num0 + " * " + num1 + " = " + (num0 * num1));
		System.out.println(num0 + " / " + num1 + " = " + (num0 / num1));
		sc.close();
	}
}
