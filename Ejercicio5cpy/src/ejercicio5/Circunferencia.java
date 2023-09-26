package ejercicio5;

public class Circunferencia {

	private double radio;
	final double PI = Math.PI;
	
	public Circunferencia(double radio) {
		this.radio = radio;
	}
	
	public double getLongitud() {
		return 2 * PI * this.radio;
	}
	
	public double getArea() {
		return PI * Math.pow(radio, 2);
	}
}
