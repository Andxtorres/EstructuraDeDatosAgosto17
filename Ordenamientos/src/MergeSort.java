
public class MergeSort<T extends Comparable<T>> {
	
	
	public LinkedList<T> mergeSort(LinkedList<T> list){
		list.setFirst(mergeSortRec(list.getFirst()));
		
		return list;
	}
	
	private int tamanioDesdeNodo(Node<T> nodo){
		int resultado=0;
		Node<T> temp= nodo;
		while(temp.getNext()!=null){
			resultado++;
			temp=temp.getNext();
		}
		
		return resultado;
		
	}
	
	
	private Node<T> mergeSortRec(Node<T> inicial){
		
		Node<T> inicioAnterior=inicial;
		int mid= tamanioDesdeNodo(inicioAnterior)/2;
		if(inicial.getNext()==null){
			return inicial;
		}
		while(mid-1>0){
			inicioAnterior=inicioAnterior.getNext();
			mid--;
		}
		
		Node<T> nuevoInicio = inicioAnterior.getNext();
		inicioAnterior.setNext(null);
		inicioAnterior=inicial;
		Node<T> temp1= mergeSortRec(inicioAnterior);
		Node<T> temp2= mergeSortRec(nuevoInicio);
		return merge(temp1,temp2);

	}
	
	private Node<T> merge(Node<T> a,Node<T> b){
		Node<T> resultado= null;
		if(a==null){
			return b;
		}
		if(b==null){
			return a;
		}
		if(a.getElement().compareTo(b.getElement())<0){
			resultado=b;
			resultado.setNext(merge(a,b.getNext()));
		}else{
			resultado=a;
			resultado.setNext(merge(a.getNext(),b));
		}
		return resultado;
	}
	
	
	
}
