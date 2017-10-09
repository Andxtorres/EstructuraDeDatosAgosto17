
public class Nodo<T> {
	private T elemento;
	private Nodo<T> anterior;
	private Nodo<T> siguiente;
	
	public Nodo(){
		
	}
	public Nodo(T elemento) {
		super();
		this.elemento = elemento;
	}
	public T getElemento() {
		return elemento;
	}
	public void setElemento(T elemento) {
		this.elemento = elemento;
	}
	public Nodo<T> getAnterior() {
		return anterior;
	}
	public void setAnterior(Nodo<T> anterior) {
		this.anterior = anterior;
	}
	public Nodo<T> getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}
	
	

}
