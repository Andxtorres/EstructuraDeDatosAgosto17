
public class Fibonacci {
	public int calcularFibonacci(int num){
		int resultado=1;
		int numAnt=1;
		int numAnt2=1;
		for (int i=1;i<num;i++){
			resultado=numAnt2+numAnt;
			numAnt=numAnt2;
			numAnt2= resultado;
			
		}
		return numAnt;
	}
}
