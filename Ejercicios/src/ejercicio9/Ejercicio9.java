package ejercicio9;

import java.util.Scanner;


public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pesetas;
		float euros;
		
		System.out.println("Introduzca el número de pesetas:");
		pesetas = sc.nextInt();
		euros = (float) (pesetas / 166.38);
		System.out.println(pesetas + "pts son " + euros + "€.");
		sc.close();
	}
}
