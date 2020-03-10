package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Prueba_Streams {

	static int valor;
	static int maxSize;

	public static void main(String[] args) {
		List<String> milista = Arrays.asList("Ipartek", "Microsoft", "Microsoft", "Abside", "Grupo Lontana",
				"Microsoft", "Ipartek");
		// Stream sin ciudades repetidas: Cali, Bogot�, Medell�n
		Stream stream = milista.stream().distinct(); // Elemento repetido
		Stream stream2 = milista.stream().limit(maxSize);

		// Mostrar cu�l es distinto
		Optional<String> distinto = milista.stream().findAny();
		System.out.println(distinto);

		// Mostrar el n�mero
		Optional<String> maximo = milista.stream().findAny();
		System.out.println(maximo);

	}// main

}// clase
