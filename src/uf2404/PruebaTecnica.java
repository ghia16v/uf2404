package uf2404;

public class PruebaTecnica {

	public static void main(String[] args) {

		System.out.println("Prueba técnica");

		for (int i = 0; i < 10; i++) {

			System.out.println("Estamos en la vuelta número " + i);

			if (i == 0) {
				System.out.println("Es la primera vuelta, i vale 0 y no es par ni impar");
			} else {
				if (i % 2 == 0) {
					System.out.println("i es par");
				} else {
					System.out.println("i es impar");

				}
			}
			;

		}

	}

}
