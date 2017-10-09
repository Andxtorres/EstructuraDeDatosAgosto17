
public class ListaDoblementeLigada<T extends Comparable<T>> {
	
	private Nodo<T> first;
	private int tamanio;
	
	public boolean estaVacia(){
		return first==null;
	}
	
	public void insertarAlInicio(T elemento){
		Nodo<T> nuevo= new Nodo<>(elemento);
		if(estaVacia()){
			first= nuevo;
		}else{
			first.setAnterior(nuevo);
			nuevo.setSiguiente(first);
			first=nuevo;
		}
		tamanio++;
	}
	
	public int getTamanio(){
		return tamanio;
	}
	
	public Nodo<T> getFirst() {
		return first;
	}

	public void setFirst(Nodo<T> first) {
		this.first = first;
	}
	
	public void imprimeLista(){
		if(!estaVacia()){
			int i= 0;
			Nodo<T> temp = first;
			do{
				System.out.println("El Elemento en la posición "+i+" es "+temp.getElemento());
				temp=temp.getSiguiente();
				i++;
			}while(temp!=null);
		}else{
			System.out.println("Lista vacía");
		}
	}
	
	
	
	
}
