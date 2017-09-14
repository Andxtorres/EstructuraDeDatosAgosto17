package models;

public class Nodo<T> {
	private T t;
	private Nodo<T> siguiente;
	public Nodo(){
	}
	public Nodo(T t, Nodo<T> siguiente) {
		this.t = t;
		this.siguiente = siguiente;
	}
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public Nodo<T> getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}
	
	
}
