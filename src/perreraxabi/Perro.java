package perreraxabi;

public class Perro {

	private int id;
	private String nombre;
	private String raza;

	public Perro() { // Constructor por defecto
		super();

		// id 0
		nombre = "";
		raza = "cruce";

	}

	public Perro(String nombre) { // sobrecarga de constructores
		super();
		this.nombre = nombre; // Palabra reservada THIS. Nos dice que el argumento que recibimos por parámetro
								// es igual a la variable local
	}

	public Perro(String nombre, String raza) { // sobrecarga de constructores
		this.nombre = nombre;
		this.raza = raza;
	}

	// GETERS seTTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	// TOSTRING
	@Override
	public String toString() {
		return "Perro [id=" + id + ", nombre=" + nombre + ", raza=" + raza + "]";
	}

}
