package ejernivel;

//En esta clase abstraeremos las características princinpales de un alumno

public class Alumno {
	// Zona de declaración de variables de clase

	String nombre;
	static int idalumno;
	int edad = 0;
	String direccion;

	// Constructor
	public Alumno(String nombre, int idalumno, int edad, String direccion) {
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
		this.edad = edad;

		edad = edad += 1; // edad es estática, por lo que no hay una copia de cada variable edad para cada
							// objeto, si no que todos los objetos comparten la misma copia de edad, que
							// podremos incrementar secuencialmente

	}// constructor

}// clase
