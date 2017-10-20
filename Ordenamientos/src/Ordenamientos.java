
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
	
}
