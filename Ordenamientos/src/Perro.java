
public class Perro implements Comparable<Perro>{
	private String nombre;

	public Perro(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int compareTo(Perro o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
