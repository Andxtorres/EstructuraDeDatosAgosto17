
public class Stack<T> {
	
	private Nodo<T> inicio;
	private int tamanio;
	
	public boolean isEmpty(){
		return inicio==null;
	}
	
	public void push(T elemento){
		Nodo<T> nuevo= new Nodo<>(elemento);
		if(isEmpty()){
			inicio=nuevo;
		}else{
			Nodo<T> temp= inicio;
			while(temp.getSiguiente()!=null){
				temp=temp.getSiguiente();
			}
			temp.setSiguiente(nuevo);
			
		}
		tamanio++;
	}
	
	public T pop(){
		if(isEmpty()){
			System.out.println("Pila vacía");
			return null;
		}else{
			
			Nodo<T> temp=inicio;
			Nodo<T> penultimo=new Nodo<>();
			while(temp.getSiguiente()!=null){
				penultimo= temp;
				temp=temp.getSiguiente();
			}
			T result=temp.getElemento();
			penultimo.setSiguiente(null);
			temp=null;
			if(tamanio==1){
				inicio=null;
			}
			tamanio--;
			return result;
		}
		
	}
	
	public T peek(){
		if(isEmpty()){
			System.out.println("Pila vacía");
			return null;
		}else{
			
			Nodo<T> temp=inicio;
			while(temp.getSiguiente()!=null){
				temp=temp.getSiguiente();
			}
			return temp.getElemento();
		}		
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
