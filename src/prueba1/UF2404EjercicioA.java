package prueba1;

import java.util.Scanner; //Zona de importaciones. Todos los paquetes que no se encuentren en el paquete por defecto (JAVA LANG) han de ser incluídos.

/*
 * ) Realizar un programa en java que realice la siguiente función: Crear un array de 5 notas que almacenara en formato double.
Una vez creado dicho array se rellenaran  dichos elementos leyéndolo desde el teclado.
Una vez creado el contenido, se calculara la media de las notas así como se mostraran las notas más altas y más bajas de dicho array

 */

public class UF2404EjercicioA {

	public static void main(String[] args) { // El intérprete JAVA acude a este método en primer lugar, el flujo de
												// ejecución comienza siempre por el método MAIN

		/**
		 * 1- Crear variables: arrayNotas, media, máxima, mínima 2- Abrir Scanner 3-
		 * Hacer un for con la longitud del array 4-Preguntar por pantalla la nota,
		 * guardar en el array la nota. 5- Sumar la nota en la variable media. 5.1-
		 * Comprobar si es la nota máxima para guardarla en la variable máxima, lo mismo
		 * para la mínima 6- Usar la variable media par aconsegiir la media de notas
		 * 
		 * 
		 * 
		 */

		// Zona de declaración de variables locales
		double notas[];
		notas = new double[5];
		double notamedia = 0d;
		double notamaxima = 10d;
		double notaminima = 0d;

		// Instanciación clase Scanner, para poder usar sus métodos
		Scanner scanotas = new Scanner(System.in);

		System.out.println("Has de introducir 5 notas.....");
		for (int x = 0; x < notas.length; x++) { // Usamos la propiedad length para delimitar el número máximo de
													// iteraciones.
			System.out.println("Introduce la nota número " + (x + 1)); // Hemos de controlar la primera posición del
																		// ARRAY, que comienza en 0.
			// En cada iteración guardamos el valor introducido en una posición del ARRAY.
			notas[x] = scanotas.nextDouble();
			notamedia = (notamedia + notas[x]) / 5;
			// Ir calculando las notas medias
			notamedia = notamedia + notas[x];

			// Comprobar si es la nota máxima
			if (notas[x] > notamaxima) {
				notamaxima = notas[x];
			} else {
				notaminima = notas[x];
			}

		} // for
		scanotas.close(); // Cerrar recursos no utilizados

		;

		// Informar resultados totales
		System.out.println("La nota media es: " + notamedia);
		System.out.println("La nota más alta es: " + notamaxima);
		System.out.println("La nota más baja es: " + notaminima);

	}// main

}// clase
