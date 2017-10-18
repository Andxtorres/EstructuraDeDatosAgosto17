
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
	
	public void insertarAlFinal(T elemento){
		Nodo<T> nuevo= new Nodo<>(elemento);
		if(estaVacia()){
			first=nuevo;
		}else{
			Nodo<T> aux= first;
			while(aux.getSiguiente()!=null){
				aux=aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);
			nuevo.setAnterior(aux);
		}
		tamanio++;
	}
	
	public void eliminarAlInicio(){
		if(estaVacia()){
			System.out.println("La lista esta vacía y no podemos elimnar");
		}else{
			if(tamanio==1){
				first=null;
			}else{
				Nodo<T> temp= first;
				first=temp.getSiguiente();
				first.setAnterior(null);
			}
			tamanio--;
		
		}
	}
	public void eliminarAlFinal(){
		if(estaVacia()){
			System.out.println("La lista está vacía y no podemos eliminar");
		}else{
			if(tamanio==1){
				first=null;
			}else{
				Nodo<T> temp= first;
				while(temp.getSiguiente()!=null){
					temp=temp.getSiguiente();
				}
				temp.getAnterior().setSiguiente(null);
				temp=null;
				
			}
			tamanio--;
		}
	}
	
	public void eliminarElemento(T elemento){
		if(estaVacia()){
			System.out.println("Nada que eliminar");
		}else{
			Nodo<T> temp=first;
			boolean seElimino=false;
			while(temp.getSiguiente()!=null){
				if(temp.getElemento().equals(elemento)){
					if(temp==first){
						eliminarAlInicio();
					}
					if(temp.getSiguiente()!=null){
						temp.getSiguiente().setAnterior(temp.getAnterior());
					}
					if(temp.getAnterior()!=null){
						temp.getAnterior().setSiguiente(temp.getSiguiente());
					}
					seElimino=true;
					
				}
				temp=temp.getSiguiente();
			}
			
			if(temp.getElemento().equals(elemento)){
				eliminarAlFinal();
				seElimino=true;				
			}
			
			if(seElimino==false){
				System.out.println("No Encontré el elemento a eliminar");
			}else{
				tamanio--;
			}
			
		}
	}
	
	public Nodo<T> encontrarNodoEnIndice(int index){
		if(estaVacia()||index>tamanio-1||index<0){
			return null;
		}else{
			Nodo<T> temp= first;
			for (int i = 0; i < index; i++) {
				temp=temp.getSiguiente();
			}
			return temp;
			
		}
		
	}
	
	public void intercambiarValores(int index1, int index2){
		if(estaVacia()||tamanio==1||index1<0||index1>tamanio-1||index2<0||index2>tamanio-1||index1==index2){
			System.out.println("La lista no puede intercambiar elementos");
		}else{
			Nodo<T> nodo1= encontrarNodoEnIndice(index1);
			Nodo<T> nodo2= encontrarNodoEnIndice(index2);
			T temp = nodo1.getElemento();
			nodo1.setElemento(nodo2.getElemento());
			nodo2.setElemento(temp);	
		}
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
