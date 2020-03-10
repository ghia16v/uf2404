package perreraxabi;

import java.util.ArrayList;

public class PerroDAOImpl implements PerroDAO {

	private ArrayList<Perro> perros;

	public PerroDAOImpl() { // Constructor por defecto
		super();
		this.perros = new ArrayList<Perro>();

		this.perros.add(new Perro("Bubba"));
		this.perros.add(new Perro("Ratplam"));
	}

	@Override
	public ArrayList<Perro> getAll() {
		return perros;
	}

	@Override
	public ArrayList<Perro> buscarPorNombre(String nombre) {

		for (Perro a : perros) {

		}

		return null;
	}

	@Override
	public ArrayList<Perro> buscarPorRaza(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Perro getById(int id) {

		return null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Perro crear(Perro p) {
		String nombre = p.getNombre();
		String raza = p.getRaza();
		Perro perro1 = new Perro(nombre, raza);
		return p;
	}

	@Override
	public boolean update(Perro p) {
		// TODO Auto-generated method stub
		return false;
	}

}
