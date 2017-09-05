package algorithms;

public class BinarySearch<T extends Comparable<T>> {
	
	public int binarySearch(T[] array,T lookingFor){
		int start=0;
		int end=array.length-1;
		while(start<=end){
			int midPivote=(start+end)/2;
			if(array[midPivote].compareTo(lookingFor)==0){
				return midPivote;
			}else if(lookingFor.compareTo(array[midPivote])<0){
				end=midPivote-1;
			}else if(lookingFor.compareTo(array[midPivote])>0){
				start=midPivote+1;
			}
		}
		return -1;
	}
}
