package perreraxabi;

import java.util.Scanner;

public class AppPerrera {
	static int opcion;
	static boolean esCorrecto = false;
	static String nomperro, razaperro;
	static int contaid; // variable estática, cada instancia recibirá la misma copia de la misma
						// variable, en vez de una copia por variable.

	static PerroDAO dao = new PerroDAOImpl();

	public static void main(String[] args) {

		System.out.println("Inetrefax gracica");
		pintarMenu();

	}

	static void pintarMenu() {
		System.out.println("****GESTIÓN DE PERRERA MUNICIPOTAL*****");
		System.out.println("Escoge una opción: ");
		System.out.println("1- Añadir un perro");
		System.out.println("2- Eliminar un perro por ID");

		Scanner scanopcion = new Scanner(System.in);
		opcion = scanopcion.nextInt();

		switch (opcion) {
		case 1:
			crearperro();
		case 2:
			eliminarperroid();

		case 3:
		default:
		}

	}

	private static void eliminarperroid() {
		// TODO Auto-generated method stub

	}

	private static void crearperro() {
		do {
			// Pedir datos por pantalla
			System.out.println("**MENÚ DE CREACIÓN DE PERRO**");
			System.out.println("¿Cómo se va a llamar la criatura?");
			Scanner scannomperro = new Scanner(System.in);
			nomperro = scannomperro.nextLine();
			System.out.println("¿De qué raza es el pequeñín?");
			Scanner scanrazaperro = new Scanner(System.in);
			razaperro = scanrazaperro.nextLine();

			// Pedir confirmación
			System.out.println("¿Son correctos los datos introducidos? S/N");
		} // do
		while (esCorrecto = true);

		// Comprobación de si los datos son correctos
		if (esCorrecto) {
			// Crear objeto de tipo perro (Llamamos al tercer constructor).
			// Setear datos pedidos por pantalla
			Perro perro1 = new Perro ();
			perro1.setNombre(nomperro);
			perro1.setRaza(razaperro);
			// Generar ID secuencial de perro
			perro1.setId(contaid);
			contaid++;
			// LLamar DAO para crear perro.
			dao.crear(perro1);
			// Informar resultado.
			System.out.println(
					"Se ha añadido el perro " + perro1.getNombre() + ", de raza " + perro1.getRaza() + " con el ID " + perro1.getId());
			// Guardar perro en el arraylist
			dao.
			
		} // if

	} // crearperro()
} // clase