package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radio;
		
		System.out.println("Introduce el radio de la circunferencia: ");
		radio = sc.nextDouble();
		
		Circunferencia c = new Circunferencia(radio);
		
		System.out.println("Longitud: " + c.getLongitud());
		System.out.println("Área: " + c.getArea());
		sc.close();
	}

}
