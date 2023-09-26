package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
	final static int IVA = 21;
	
	public static double calculoIVA (float precio){
		return (IVA * precio)/100;
	}	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float precio;
		
		System.out.println("Introduzca el precio del producto:");
		precio = sc.nextFloat();
		
		System.out.println("Precio original: " + precio + "€");
		System.out.println("IVA: " + calculoIVA(precio) + "€");
		System.out.println("Precio + IVA: " + (calculoIVA(precio) + precio) + "€");
		sc.close();
		
	}
}
