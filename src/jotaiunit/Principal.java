package jotaiunit;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// operacion(3, 5);

	}

	public static double operacion(int numero, int numero2) {
		String operacion;
		double resultado = 0;
		Scanner scanop = new Scanner(System.in);

		System.out.println("M�todo que suma dos valores recibi�ndolos por par�metro");
		System.out.println("�Qu� operaci�n deseas realizar? S,R,M,D");
		operacion = scanop.nextLine();

		switch (operacion) {

		case "S":
			System.out.println("Has elegido sumar");
			resultado = numero + numero2;
			System.out.println("La suma es " + (resultado));
			return resultado;

		case "R":
			System.out.println("Has elegido restar");
			resultado = numero - numero2;
			System.out.println("La suma es " + (resultado));
			return resultado;
		case "M":
			System.out.println("Has elegido multiplicar");
			resultado = numero * numero2;
			System.out.println("La suma es " + (resultado));
			return resultado;
		case "D":
			System.out.println("Has elegido dividir");
			resultado = numero / numero2;
			System.out.println("La suma es " + (resultado));
			return resultado;
		default:
			System.out.println("No has escogido una operaci�n v�lida");
			return resultado;
		}

	}

	public static String metodoestring() {

		String cadena1 = "Hola ";
		String cadena2 = "amiguitos ";
		String cadena3 = "del progressive";
		return cadena1 + cadena2 + cadena3;
	}

	public static String esBisiesto(int a�o) {
		String resultado;

		if (a�o % 4 == 0) {
			resultado = "S� es bisiesto";
			System.out.println(resultado);
			return resultado;
		} else {
			resultado = "NO es bisiesto";
			System.out.println(resultado);
			return resultado;
		}

	}

}