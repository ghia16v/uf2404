package prueba1;

import java.util.Scanner; //Zona de importaciones. Todos los paquetes que no se encuentren en el paquete por defecto (JAVA LANG) han de ser inclu�dos.

/*
 * ) Realizar un programa en java que realice la siguiente funci�n: Crear un array de 5 notas que almacenara en formato double.
Una vez creado dicho array se rellenaran  dichos elementos ley�ndolo desde el teclado.
Una vez creado el contenido, se calculara la media de las notas as� como se mostraran las notas m�s altas y m�s bajas de dicho array

 */

public class UF2404EjercicioA {

	public static void main(String[] args) { // El int�rprete JAVA acude a este m�todo en primer lugar, el flujo de
												// ejecuci�n comienza siempre por el m�todo MAIN

		/**
		 * 1- Crear variables: arrayNotas, media, m�xima, m�nima 2- Abrir Scanner 3-
		 * Hacer un for con la longitud del array 4-Preguntar por pantalla la nota,
		 * guardar en el array la nota. 5- Sumar la nota en la variable media. 5.1-
		 * Comprobar si es la nota m�xima para guardarla en la variable m�xima, lo mismo
		 * para la m�nima 6- Usar la variable media par aconsegiir la media de notas
		 * 
		 * 
		 * 
		 */

		// Zona de declaraci�n de variables locales
		double notas[];
		notas = new double[5];
		double notamedia = 0d;
		double notamaxima = 10d;
		double notaminima = 0d;

		// Instanciaci�n clase Scanner, para poder usar sus m�todos
		Scanner scanotas = new Scanner(System.in);

		System.out.println("Has de introducir 5 notas.....");
		for (int x = 0; x < notas.length; x++) { // Usamos la propiedad length para delimitar el n�mero m�ximo de
													// iteraciones.
			System.out.println("Introduce la nota n�mero " + (x + 1)); // Hemos de controlar la primera posici�n del
																		// ARRAY, que comienza en 0.
			// En cada iteraci�n guardamos el valor introducido en una posici�n del ARRAY.
			notas[x] = scanotas.nextDouble();
			notamedia = (notamedia + notas[x]) / 5;
			// Ir calculando las notas medias
			notamedia = notamedia + notas[x];

			// Comprobar si es la nota m�xima
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
		System.out.println("La nota m�s alta es: " + notamaxima);
		System.out.println("La nota m�s baja es: " + notaminima);

	}// main

}// clase
