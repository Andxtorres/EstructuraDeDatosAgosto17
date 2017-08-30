package algorithms;

public class LinearSearch<T extends Comparable<T>> {
	
	public int search(T[] array,T lookingFor){
		for (int i = 0; i < array.length; i++) {
			if(array[i].compareTo(lookingFor)==0){
				return i;
			}
		}
		return -1;
	}
}
