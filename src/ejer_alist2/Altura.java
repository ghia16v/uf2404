package ejer_alist2;

public class Altura {

	private double altura;

	// Constructor por defecto
	public Altura() {
		super(); // Por si alg�n d�a se implementa la herencia.
	}

	// Segundo constructor (Sobrecarga de constructores)
	public Altura(double altura) { // Sobrecarga de m�todos
		this();
		this.altura = altura;
	}

	// Getter y Setter
	double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
