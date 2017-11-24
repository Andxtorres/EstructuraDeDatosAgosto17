
public class Queue<T> {
	
	private Nodo<T> inicio;
	private Nodo<T> fin;
	private int tamanio;
	
	public boolean isEmpty(){
		return inicio==null;
	}
	
	public void enqueue(T elemento){
		Nodo<T> nuevo = new Nodo<>(elemento);
		Nodo<T> finAnterior=fin;
		fin= nuevo;
		fin.setSiguiente(null);
		if(isEmpty()){
			inicio=fin;
		}else{
			finAnterior.setSiguiente(fin);
		}
		tamanio++;
	}
	
	public T dequeue(){
		if(isEmpty()){
			System.out.println("Esta vacía la fila");
			return null;
		}else{
			Nodo<T> temp=inicio;
			T result= temp.getElemento();
			inicio= inicio.getSiguiente();
			tamanio--;
			if(isEmpty()){
				fin=null;
			}
			return result;
		}
		
	}
	
	public T peek(){
		if(isEmpty()){
			System.out.println("La cola está vacía");
			return null;
		}else{
			return inicio.getElemento();
		}
	}
	
	public int tamanio() {
		int contador=0;
		Nodo<T> temp= inicio;
		while(temp!=null) {
			contador++;
			temp=temp.getSiguiente();
		}
		return contador;
	}
	
	public void print(){
		if(isEmpty()){
			System.out.println("La pila está vacía");
		}else{
			Nodo<T> temp=inicio;
			while(temp!=null){
				System.out.println(temp.getElemento());
				temp=temp.getSiguiente();
			}
		}
	}	
	

}
