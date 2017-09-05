package models;

public class Persona implements Comparable<Persona>{
	private String nombre;

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public int compareTo(Persona o) {
		return nombre.compareTo(o.getNombre());
	}


	
	
}
