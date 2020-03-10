/*
 * Este programa Java pide alturas de aliumnos por teclado, los guarda en un arraylist
 * de tipo doble y despu�s
 * Calcular la media de altura de los alumnos, cu�ntos est�n por encima de la media�
 * y cu�ntos est�n por debajo
 */

package ejer_alist2;

//Zona de importaciones. Aqu� se importan los paquetes que no forman parte del paquete por defecto (Java.Lang)
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) { // m�todo main. El compilador busca este m�todo est� en la clase que est� y
												// comienza por aqu� el flujo de ejecuci�n.

//Zona de declaraci�n de variables locales
		int nalturas;
		double altura;
		boolean bucle = true;
		char contbucle;
		char contbucle_up;
		int opcion;
		ArrayList<Altura> alturas = new ArrayList<Altura>(); // Donde guardaremos las alturas
		double suma = 0;
		double media = 0;
		int nposiciones;
		int contamayor = 0;
		int contamenor = 0; // contadores para si es superior o inferior a la media

		// Instancias de Scanner
		Scanner scan_nalturas = new Scanner(System.in);
		Scanner scan_alturas = new Scanner(System.in);
		Scanner scan_bucle = new Scanner(System.in);
		Scanner scan_opciones = new Scanner(System.in);

		do {
			System.out.println("�Cu�ntas alturas vas a introducir en el ARRAYLIST?");
			nalturas = scan_nalturas.nextInt();

			for (int i = 0; i < nalturas; i++) {
				System.out.println("Introduce altura n�mero " + i + 1);
				altura = scan_alturas.nextDouble();
				alturas.add(new Altura(altura));
				altura = 0.0d; // limpiar variable para en la pr�xima iteraci�n volver a guardar
				System.out.println("Guardando dato en el ARRAYLIST....");
				try {
					Thread.sleep(2000); // Asignamos un valor a la var sleep de la clase Thread, con esto pausaremos el
										// flujo de ejecuci�n del hilo
				} catch (InterruptedException e) { // Requiere controlar esta excepci�n.
					e.printStackTrace();
				}
				System.out.println("��Datos guardados!!");
			} // for
			System.out.println("�Deseas continuar con el programa, y seguir introduciendo alturas? S/N: ");
			contbucle = scan_bucle.next().charAt(0);
			contbucle_up = Character.toUpperCase(contbucle);
			if (contbucle_up == 'N') {
				break;
			}
		} // do
		while (bucle = true);

		System.out.println("Has acabado de introducir datos, escoge la acci�n para tratar los datos: ");
		System.out.println("1- Sacar la altura media");
		System.out.println("2- Calcular cu�ntos alumnos est�n por encima y por debajo de la media");
		System.out.println("3- Salir.");
		opcion = scan_opciones.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("Calculando la media de todas las alturas.....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// Vamos a sumar todas las posiciones del ArrayList y dividirlo por el n�mero de
			// posiciones

			for (Altura a : alturas) {
				suma += a.getAltura(); // sumatorio de alturas
				nposiciones = alturas.size();
				media = suma / nposiciones;
			}

			System.out.println("La media de todas las alturas es: " + media);
			break;
		case 2:
			System.out.println("Calculando cu�ntos alumnos est�n por encima y por debajo de la media");
			for (Altura a : alturas) {
				suma += a.getAltura(); // sumatorio de alturas
				nposiciones = alturas.size();
				media = suma / nposiciones;
			} // for each
				// Como ya tenemos la media, vamos a comparar cada elemento del ArrayList con la
				// media para saber si es mayor o menor.
			for (Altura b : alturas) {
				if (b.getAltura() < media) {
					contamenor++;
				} else {
					contamayor++;
				}

			} // for each

			System.out.println("Calculando.....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Los alumnos mayores que la media son: " + contamayor);
			System.out.println("Los alumnos menores que la media son: " + contamenor);
			break;
		case 3:
			System.out.println("Nos da mucha pena que te vayas, pero adi�s chuiquit�n");
			break;
		default:
			System.out.println("Escoge una opci�n v�lida");
		}

	}// main

}// class
