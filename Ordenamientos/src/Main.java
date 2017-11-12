
public class Main {
	public static void main(String args[]){
		LinkedList<Integer> linkedList= new LinkedList<>();
		linkedList.addElementFirst(1);
		linkedList.addElementLast(30);
		linkedList.addElementLast(10);
		linkedList.addElementLast(22);
		linkedList.addElementLast(13);
		linkedList.addElementLast(43);
		linkedList.addElementLast(11);
		linkedList.addElementLast(11);
		linkedList.printList();
		System.out.println("--------Ordenada-------");
		Ordenamientos<Integer> ordenamientos= new Ordenamientos<>();
		//LinkedList<Integer> listaOrdenada=ordenamientos.bubbleSort(linkedList);
		//LinkedList<Integer> listaOrdenada=ordenamientos.selectionSort(linkedList);
		//LinkedList<Integer> listaOrdenada=ordenamientos.insertionSort(linkedList);
		MergeSort<Integer> ms= new MergeSort<>();
		LinkedList<Integer> ordenada=ms.mergeSort(linkedList);
		ordenada.printList();
		System.out.println("-------Terminado--------");
		
	}
}
