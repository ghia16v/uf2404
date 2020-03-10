package jotaiunit;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operacion(3, 5);

	}

	public static double operacion(int numero, int numero2) {
		String operacion;
		double resultado;
		Scanner scanop = new Scanner(System.in);

		System.out.println("Método que suma dos valores recibiéndolos por parámetro");
		System.out.println("¿Qué operación deseas realizar? S,R,M,D");
		operacion = scanop.nextLine();

		switch (operacion) {

		case "S":
			System.out.println("Has elegido sumar");
			resultado = numero + numero2;
			System.out.println("La suma es " + (resultado));
			return numero;

		case "R":
			System.out.println("Has elegido restar");
			resultado = numero - numero2;
			System.out.println("La suma es " + (resultado));
			return numero;
		case "M":
			System.out.println("Has elegido multiplicar");
			resultado = numero * numero2;
			System.out.println("La suma es " + (resultado));
			return numero;
		case "D":
			System.out.println("Has elegido dividir");
			resultado = numero / numero2;
			System.out.println("La suma es " + (resultado));
			return numero;
		default:
			System.out.println("No has escogido una operación válida");

		}

	}

}
