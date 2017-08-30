
public class StringCounter {
	
	private final String toCheck="B";
	public int countString(String str){
		  if (str.length() == 0) {
			    return 0;
			  }
			  int count = 0;
			  if (str.substring(0, 1).equals(toCheck)) {
		    count = 1;
		  }
		  return count + countString(str.substring(1));
	}
}
