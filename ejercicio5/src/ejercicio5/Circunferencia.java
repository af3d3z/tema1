package ejercicio5;


public class Circunferencia {
	final double PI = Math.PI;
	private double radio;
	
	public Circunferencia(double radio) {
		this.radio = radio;
	}
	
	public double getRadio() {
		return radio;
	}
	
	public double getArea() {
		return PI * Math.pow(radio, 2);
	}
	
	public double getLongitud() {
		return 2 * PI * radio;
	}
}
