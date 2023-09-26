package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	public static float calcularMedia(int[] array){
		int total = 0;
		
		for(int i = 0; i < array.length; i++) {
			total = total + array[i];
			System.out.println(total);
		}
		
		return (float) total/array.length;
	}	
	
	public static void main(String[] args) {
		int[] notas = new int[2];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la primera nota: ");
		notas[0] = sc.nextInt();
		System.out.println("Introduzca la segunda nota: ");
		notas[1] = sc.nextInt();
		
		System.out.println("Media: " + calcularMedia(notas));
	}
}
