package prueba1;

import java.util.Scanner;

/**
 * ) Crear un proyecto en modo consola que nos muestre un menú de 3 opciones
 * <ol>
 * •
 * <li>Calcular la letra del dni</li> •
 * <li>Calcular medida de cm a pulgadas</li> •
 * <li>Salir</li>
 * <ol/>
 * 
 * 
 **/

public class UF2404EjercicioB {

	// Zona de declaración de variables
	static boolean continuar = true;
	static boolean isDniOk = false;
	static Scanner scanopcion = new Scanner(System.in);
	Scanner scandni = new Scanner(System.in);
	Scanner scancm = new Scanner(System.in);
	int cm;
	static int opcion = 0;
	int dni = 0;
	final double CONVCMPULG = 0.393701d; // Si se declara una variable como final, ésta no podrá cambiar su valor.

	public static void main(String[] args) {

		do {
			System.out.println("*****MENÚ DE OPCIONES******");
			System.out.println("1- Calcular letra del DNI");
			System.out.println("2- Calcular medida de cm a pulgadas");
			System.out.println("3- SALIR");

			try {
				opcion = scanopcion.nextInt();
			} catch (java.util.InputMismatchException e) { // Esta excepción se lanza cuando el tipo de datos que espera
															// el compilador no es el correcto
				System.out.println("No has introducido un número válido");
				isDniOk = false;
				// break;
			}

			if (isDniOk == false) {

			} else {
				isDniOk = true;
				logica();
			}

		} while (continuar == true && isDniOk == false);

	} // main

	public static void logica() {

		switch (opcion) {
		case 1:
			System.out.println("Has escogido calcular letra del DNI");
			System.out.println("Introduce un DNI: ");

			// scandni.close();
			try {
				dni = scandni.nextInt();
				System.out.println("Calculando..............");
				Thread.sleep(1000);
			} catch (Exception e) { // Tratamos la excepcion capturando la clase Exception, que es la superclase de
									// todas las excepciones
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// Aplicar algoritmo para la letra del DNI
			if (dni % 2 == 0) {
				System.out.println("Tu DNI es " + dni + "R"); // imaginando mucho
			} else {
				System.out.println("Tu DNI es " + dni + "Z");
			}
			break;
		case 2:
			System.out.println("Has escogido pasar de cm a pulgadas");
			System.out.println("Introduce un valor en cm: ");
			cm = scancm.nextInt();
			// scancm.close(); // Cerrar recursos que ya no se utilizan
			System.out.println("CALCULANDO...............");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Has introducido " + cm + " que pasándolo a pulgadas son: " + (CONVCMPULG / cm));

		case 3:
			System.out.println("Has escogido SALIR. Hasta luego Lucas.");
			continuar = false;
		default:
			System.out.println("Escoge una opción válida");

		}

	}

} // clase
