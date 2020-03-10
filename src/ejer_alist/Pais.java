package ejer_alist;

public class Pais {

	private String nombre;
	private static int contaid = 0;
	private int id;
	private int numAfectados;

	public Pais() { // constructor por defecto
		super();
		this.nombre = "";
		this.id = contaid;
		contaid++;
		this.numAfectados = 0;

	}

	public Pais(String nombre) {
		this();
		this.nombre = nombre;
		contaid++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumAfectados() {
		return numAfectados;
	}

	public void setNumAfectados(int numAfectados) {
		this.numAfectados = numAfectados;
	}

	@Override // Sobreescribiendo éste método mostramos las variables en tiempo de ejecución
	public String toString() {
		return "Pais [nombre=" + nombre + ", id=" + id + ", numAfectados=" + numAfectados + "]";
	}

}
