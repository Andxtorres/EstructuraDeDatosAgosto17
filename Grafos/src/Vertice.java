import java.util.ArrayList;
import java.util.List;

public class Vertice<T extends Comparable<T>> {
	
	private T elemento;
	private List<Arista<T>> aristas;
	private boolean visitado;
	
	public Vertice(T elemento) {
		aristas= new ArrayList<>();
		this.elemento = elemento;
	}
	public T getElemento() {
		return elemento;
	}
	public void setElemento(T elemento) {
		this.elemento = elemento;
	}
	public List<Arista<T>> getAristas() {
		return aristas;
	}
	public void setAristas(List<Arista<T>> aristas) {
		this.aristas = aristas;
	}
	public boolean isVisitado() {
		return visitado;
	}
	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}
	
	

}
