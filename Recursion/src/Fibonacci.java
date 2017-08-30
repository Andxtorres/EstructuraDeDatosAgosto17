
public class Fibonacci {
	
	public int fibonacci(int number){
		if(number<=1){
			return number;
		}else{
			System.out.println("Entra: "+ number);
			return fibonacci(number-1) + fibonacci(number-2);
		}
	}
}
