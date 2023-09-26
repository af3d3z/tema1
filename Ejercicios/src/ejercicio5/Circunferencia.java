package ejercicio5;

// esta clase simula una circunferencias
public class Circunferencia {
	private double radio;
	final double PI = Math.PI;

	public Circunferencia(double radio) {
		this.radio = radio;
	}
	
	// devuelve el radio de la circunferencia
	public double getRadio(){
		return this.radio;
	}
	// devuelve el area de la circunferencia	
	public double getArea() {
		return PI * Math.pow(this.radio, 2);
	}
	// devuelve la longitud de la circunferencia
	public double getLongitud() {
		return 2 * PI * this.radio;
	}
}
