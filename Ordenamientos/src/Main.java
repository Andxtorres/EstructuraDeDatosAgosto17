
public class Main {
	public static void main(String args[]){
		LinkedList<Integer> linkedList= new LinkedList<>();
		linkedList.addElementFirst(4);
		linkedList.addElementLast(1);
		linkedList.addElementLast(6);
		linkedList.addElementLast(3);
		linkedList.printList();
		System.out.println("---------------");
		Ordenamientos<Integer> ordenamientos= new Ordenamientos<>();
		LinkedList<Integer> listaOrdenada=ordenamientos.bubbleSort(linkedList);
		System.out.println("-------Terminado--------");
		listaOrdenada.printList();
	}
}
