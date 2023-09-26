import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		final int IVA = 21;
		Scanner sc = new Scanner(System.in);
		float precio, resultado;
		
		System.out.println("Introduzca el precio del producto:");
		precio = sc.nextFloat();
		
		// cálculo del IVA
		resultado = (precio * IVA)/100;
		
		System.out.println("Precio original: " + precio + "€");
		System.out.println("IVA: " + resultado + "€");
		System.out.println("Precio + IVA: " + (precio + resultado) + "€");
		sc.close();
		
	}
}
