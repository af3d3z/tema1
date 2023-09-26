package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		int nota0;
		int nota1;
		float res;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la primera nota:");
		nota0 = sc.nextInt();
		System.out.println("Introduce la segunda nota:");
		nota1 = sc.nextInt();
		res = (nota0 + nota1)/2;
		System.out.println("Media de ambas notas: " + res );
	}
}
