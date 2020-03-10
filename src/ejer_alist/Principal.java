package ejer_alist;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	// Declaración ArrayList
	public static ArrayList<Pais> paises = new ArrayList<Pais>();

	// Declaración de métodos
	public static void pintarmenu() {
		System.out.println("¿Qué operación deseas realizar con el ArrayList?");
		System.out.println("1 - Crear país");
		System.out.println("2 - Listar país ");
		System.out.println("3 - Eliminar país");
	}

	public static void guardarpais(String nombre) {
		String a = nombre;
		paises.add(new Pais(a)); // Añadimos el país a la última posición
	}

	public static void eliminarpais() {

	}

	public static void main(String[] args) {
		int numopcion;
		boolean opcionvalida = false;
		boolean continuar = true;
		String nombre;
		int idpais;
		int numafectados;
		Scanner scan = new Scanner(System.in); // Instanciamos objeto de clase Scanner para usar métodos de entrada de
												// datos

		do {
			pintarmenu();

			numopcion = scan.nextInt();

			switch (numopcion) {
			// CREAR PAÍS
			case 1:
				opcionvalida = true;
				continuar = true;

				/*
				 * System.out.println("Introduce el número de país: "); Scanner scannum = new
				 * Scanner(System.in); idpais = scannum.nextInt();
				 */

				System.out.println("Introduce el nombre del país: ");
				Scanner scannum2 = new Scanner(System.in);
				nombre = scannum2.nextLine();

				System.out.println("Introduce el número de afectados de dicho país: ");
				Scanner scanafect = new Scanner(System.in);
				numafectados = scanafect.nextInt();
				guardarpais(nombre);
				break;
			// LISTAR PAÍS
			case 2:
				String guardanom;
				int guardaid;
				opcionvalida = true;
				continuar = true;
				System.out.println("Introduce el número de país a buscar");
				Scanner scannum3 = new Scanner(System.in);
				idpais = scannum3.nextInt();

				// Recuperar los datos
				guardanom = paises.get(idpais - 1).getNombre();
				guardaid = paises.get(idpais - 1).getId();

				// Mostrar los datos
				System.out.println("Se ha encontrado el país " + guardanom + " con el id de país: " + idpais);
				break;

			// ELIMINAR PAÍS
			case 3:
				int guardaid2;
				opcionvalida = true;
				continuar = true;
				System.out.println("Introduce el id de país a borrar");
				Scanner scannum4 = new Scanner(System.in);
				guardaid2 = scannum4.nextInt();
				paises.remove(guardaid2);
				break;

			default:
				opcionvalida = true;
				continuar = true;
				System.out.println("No has introducido una opción válida. Introduce una opción del 1 al 3 por favor.");
				break;
			}// switch

		} // do
		while ((opcionvalida) && (continuar)); // se repetirá mientras la opción sea válida

	}// main

}// clase
