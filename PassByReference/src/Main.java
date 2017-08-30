
public class Main {
	public static void main(String args[]){
		Point point1=new Point(0,0);
		Point point2= new Point(0,0);
		System.out.println("Point 2 X: " + point2.x + " Y: " +point2.y); 
		
		//point1= point2;
		//System.out.println("Point 1 X: " + point1.x + " Y: " +point1.y); 

		
		tricky(point1,point2);
		
		System.out.println("Despues de tricky X: "+point2.x +" Y: "+point2.y);
		
		trickyCreation(point1);
		System.out.println("Despues de tricky X: "+point1.x +" Y: "+point1.y);


		
	}
	
	public static void tricky(Point point1,Point point2){
		point1.x = 100;
		point2.y = 100;
		Point temp = point1;

		point1 = point2;

		point2 = temp;
		System.out.println("Tricky X: "+point1.x +" Y: "+point1.y);


	}
	
	public static void trickyCreation(Point point1){
		point1.x=200;
		point1 = new Point(0,0);
		point1.x=300;
		System.out.println("En tricky creation X: "+point1.x +" Y: "+point1.y);

	}
}
