
public class ListaCircular<T extends Comparable<T>> {
	private Nodo<T> first;
	private Nodo<T> ultimo;
	private int tamanio;
	
	public boolean estaVacia(){
		return first==null;
	}
	
	public int getTamanio(){
		return tamanio;
	}
	
	
	public void agregarAlFinal(T elemento){
		Nodo<T> nuevo= new Nodo<>(elemento);
		if(estaVacia()){
			first=nuevo;
			ultimo=nuevo;
			ultimo.setSiguiente(first);
		}else{
			ultimo.setSiguiente(nuevo);
			nuevo.setSiguiente(first);
			ultimo= nuevo;
		}
		tamanio++;
	}
	
	public void agregarAlInicio(T elemento){
		Nodo<T> nuevo= new Nodo<>(elemento);
		if(estaVacia()){
			first=nuevo;
			ultimo=nuevo;
			ultimo.setSiguiente(first);			
		}else{
			nuevo.setSiguiente(first);
			first=nuevo;
			ultimo.setSiguiente(first);
			
		}
		tamanio++;
	}
	
	public Nodo<T> buscarEnPosicion(int posicion){
		Nodo<T> temp= first;
		Nodo<T> resultado=new Nodo<>();
		if(posicion<tamanio){
			for (int i = 0; i < posicion; i++) {
				temp=temp.getSiguiente();
				
			}
			resultado= temp;
		}else{
			System.out.println("La posición no se encuentra");
			return null;
		}
		return resultado;
	}
	
	public void insertarEnPosicion(T elemento, int posicion){
		Nodo<T> nuevo= new Nodo<>(elemento);
		if(posicion==0){
			agregarAlInicio(elemento);
		}
		if(posicion<tamanio&&posicion!=0){
			Nodo<T> temp= first;
			Nodo<T> anterior= new Nodo<T>();
			for (int i = 0; i < posicion; i++) {
				anterior= temp;
				temp= temp.getSiguiente();
			}
			anterior.setSiguiente(nuevo);
			nuevo.setSiguiente(temp);
			tamanio++;
		}else{
			System.out.println("El tamaño no es suficiente.");
		}
		
		
	}
	
	public void imprimirLista(){
		if(!estaVacia()){
			Nodo<T> temp= first;
			int i=0;
			do{
				System.out.println("Elemento en la posición "+i+" es: "+temp.getElemento());
				temp= temp.getSiguiente();
				i++;
			}while(temp!=first);
		}
	}
	
	
	
	
}
