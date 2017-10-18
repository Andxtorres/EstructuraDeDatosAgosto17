
public class Alumno {
	
	private String matricula;
	private String nombre;
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int hashCode(){
		String sub= matricula.substring(1, matricula.length());
		Integer i= Integer.valueOf(sub);
		return i.intValue();
	}
	
	public boolean equals(Alumno a){
		if(a.getMatricula().equals(matricula)){
			return true;
		}
		return false;
		
	}
	@Override
	public String toString() {
		return "Alumno [matricula=" + matricula + ", nombre=" + nombre + "]";
	}
	
	
	
	
}
