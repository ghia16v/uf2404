package ejer_alist;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	// Declaraci�n ArrayList
	public static ArrayList<Pais> paises = new ArrayList<Pais>();

	// Declaraci�n de m�todos
	public static void pintarmenu() {
		System.out.println("�Qu� operaci�n deseas realizar con el ArrayList?");
		System.out.println("1 - Crear pa�s");
		System.out.println("2 - Listar pa�s ");
		System.out.println("3 - Eliminar pa�s");
	}

	public static void guardarpais(String nombre) {
		String a = nombre;
		paises.add(new Pais(a)); // A�adimos el pa�s a la �ltima posici�n
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
		Scanner scan = new Scanner(System.in); // Instanciamos objeto de clase Scanner para usar m�todos de entrada de
												// datos

		do {
			pintarmenu();

			numopcion = scan.nextInt();

			switch (numopcion) {
			// CREAR PA�S
			case 1:
				opcionvalida = true;
				continuar = true;

				/*
				 * System.out.println("Introduce el n�mero de pa�s: "); Scanner scannum = new
				 * Scanner(System.in); idpais = scannum.nextInt();
				 */

				System.out.println("Introduce el nombre del pa�s: ");
				Scanner scannum2 = new Scanner(System.in);
				nombre = scannum2.nextLine();

				System.out.println("Introduce el n�mero de afectados de dicho pa�s: ");
				Scanner scanafect = new Scanner(System.in);
				numafectados = scanafect.nextInt();
				guardarpais(nombre);
				break;
			// LISTAR PA�S
			case 2:
				String guardanom;
				int guardaid;
				opcionvalida = true;
				continuar = true;
				System.out.println("Introduce el n�mero de pa�s a buscar");
				Scanner scannum3 = new Scanner(System.in);
				idpais = scannum3.nextInt();

				// Recuperar los datos
				guardanom = paises.get(idpais - 1).getNombre();
				guardaid = paises.get(idpais - 1).getId();

				// Mostrar los datos
				System.out.println("Se ha encontrado el pa�s " + guardanom + " con el id de pa�s: " + idpais);
				break;

			// ELIMINAR PA�S
			case 3:
				int guardaid2;
				opcionvalida = true;
				continuar = true;
				System.out.println("Introduce el id de pa�s a borrar");
				Scanner scannum4 = new Scanner(System.in);
				guardaid2 = scannum4.nextInt();
				paises.remove(guardaid2);
				break;

			default:
				opcionvalida = true;
				continuar = true;
				System.out.println("No has introducido una opci�n v�lida. Introduce una opci�n del 1 al 3 por favor.");
				break;
			}// switch

		} // do
		while ((opcionvalida) && (continuar)); // se repetir� mientras la opci�n sea v�lida

	}// main

}// clase
