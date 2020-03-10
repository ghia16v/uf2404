package ejernivel;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int opcion;
		int id;
		Scanner scan = new Scanner(System.in);

		System.out.println("¿Qué deseas hacer? Leer alumno (1), escribir alumno (2) o borrar alumno (3)");
		opcion = scan.nextInt();
		scan.close();

		switch (opcion) {

		case 1:
			System.out.println("Has escogido leer un alumno. Introduce su ID para mostrar sus datos: ");
			id = scan.nextInt();
			scan.close();

			break;

		case 2:
			break;
		case 3:
			break;
		default:

		}
	}

}
