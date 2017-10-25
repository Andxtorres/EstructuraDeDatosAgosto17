
public class Main {
	public static void main(String args[]){
		LinkedList<Integer> linkedList= new LinkedList<>();
		linkedList.addElementFirst(14);
		linkedList.addElementLast(11);
		linkedList.addElementLast(16);
		linkedList.addElementLast(13);
		linkedList.printList();
		System.out.println("---------------");
		Ordenamientos<Integer> ordenamientos= new Ordenamientos<>();
		//LinkedList<Integer> listaOrdenada=ordenamientos.bubbleSort(linkedList);
		//LinkedList<Integer> listaOrdenada=ordenamientos.selectionSort(linkedList);
		LinkedList<Integer> listaOrdenada=ordenamientos.insertionSort(linkedList);
		System.out.println("-------Terminado--------");
		listaOrdenada.printList();
	}
}
