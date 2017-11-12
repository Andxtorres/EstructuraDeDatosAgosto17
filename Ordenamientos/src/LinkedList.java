
public class LinkedList<T extends Comparable<T>> {
	
	private Node<T> first;
	
	public LinkedList(){
		first= null;
	}
	
	public void addElementFirst(T element){
		Node<T> temp= new Node<>(element);
		if(first==null){
			first=temp;
		}else{
			temp.setNext(first);
			first= temp;
		}
		
	}
	
	public void addElementLast(T element){
		Node<T> temp= new Node<>(element);
		if(isEmpty()){
			first=temp;
		}else{
			temp=first;
			while(temp.getNext()!=null){
				temp=temp.getNext();
			}
			temp.setNext(new Node<T>(element));
		}
	}
	
	public boolean isEmpty(){
		return first==null;
	}
	
	public int tamanio(){
		if(isEmpty()){
			return 0;
		}else{
			Node<T> temp= first;
			int count=0;
			while(temp!=null){
				count++;
				temp= temp.getNext();
			}
			return count;
		}
	}
	
	public T obtenerElementoEn(int index){
		if(index>=tamanio()&&!isEmpty()){
			return null;
		}else{
			Node<T> resultado= first;
			for (int i = 0; i < index; i++) {
				resultado= resultado.getNext();
			}
			return resultado.getElement();
		}
	}
	public Node<T> obtenerNodoEn(int index){
		if(index>=tamanio()&&!isEmpty()){
			return null;
		}else{
			Node<T> resultado= first;
			for (int i = 0; i < index; i++) {
				resultado= resultado.getNext();
			}
			return resultado;
		}
	}
		
	public void swap(int index1,int index2){
		Node<T> temp= new Node<T>();
		temp.setElement(obtenerNodoEn(index1).getElement());
		Node<T> nodo1= obtenerNodoEn(index1);
		Node<T> nodo2= obtenerNodoEn(index2);
		nodo1.setElement(nodo2.getElement());
		nodo2.setElement(temp.getElement());
	}
	public void printList(){
		if(first==null){
			System.out.println("Lista vacía");
		}else{
			Node<T> temp= first;
			while(temp!=null){
				
				System.out.println(temp.getElement());
				temp= temp.getNext();
			}
		}
	}
	public void printListFromNode(Node<T> nodo){
		if(nodo==null){
			System.out.println("Lista vacía");
		}else{
			Node<T> temp= nodo;
			while(temp!=null){
				
				System.out.println(temp.getElement());
				temp= temp.getNext();
			}
		}
	}
	public LinkedList<T> insertionSort(){
		
		for(int i= 1;i<this.tamanio();i++){
			int j= i;
			while((j>0) &&(this.obtenerElementoEn(j-1).compareTo(this.obtenerElementoEn(j))>0)){
				this.swap(j,j-1);
				System.out.println("-----Algoritmo sin terminar------");
				this.printList();
				System.out.println("-------------");
				j=j-1;
			}
		}
		
		return this;
		
	}

	public Node<T> getFirst() {
		return first;
	}

	public void setFirst(Node<T> first) {
		this.first = first;
	}
	
	
}
