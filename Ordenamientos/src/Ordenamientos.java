
public class Ordenamientos<T extends Comparable<T>> {
	
	
	public LinkedList<T> bubbleSort(LinkedList<T> list){
		for(int i=0;i<list.tamanio()-1;i++){
			boolean swapped=false;
			for(int j=0;j<list.tamanio()-1;j++){
				if(list.obtenerElementoEn(j).compareTo(list.obtenerElementoEn(j+1))>0){
					System.out.println("Hizo swap con el elemento en: "+j+" : "+list.obtenerElementoEn(j)+ " con "+(j+1)+" : "+list.obtenerElementoEn(j+1));
					list.swap(j,j+1);
					swapped=true;
				}
			}
			System.out.println("-----Algoritmo sin terminar------");
			list.printList();
			if(!swapped){
				break;
			}
		}	
		return list;
		
	}
	
	public LinkedList<T> selectionSort(LinkedList<T> list){
		int smallest=0;
		for(int j=0;j<list.tamanio()-1;j++){
			smallest=j;
			
			for(int i=j+1;i<list.tamanio();i++){
				if(list.obtenerElementoEn(i).compareTo(list.obtenerElementoEn(smallest))<0){
					System.out.println("Smallest "+i);
					smallest=i;
				}
			}
			
			System.out.println("-----Algoritmo sin terminar------");
			list.swap(j, smallest);
			list.printList();
			System.out.println("-------------");

		}
		
		return list;
		
	}
	
	public LinkedList<T> insertionSort(LinkedList<T> list){
		
		for(int i= 1;i<list.tamanio();i++){
			int j= i;
			while((j>0) &&(list.obtenerElementoEn(j-1).compareTo(list.obtenerElementoEn(j))>0)){
				list.swap(j,j-1);
				System.out.println("-----Algoritmo sin terminar------");
				list.printList();
				System.out.println("-------------");
				j=j-1;
			}
		}
		
		return list;
		
	}
	
	
	
}
