package application;

import clases.Circle;
import clases.Rectangle;
import clases.Shape;
import clases.Square;

public class Main {
	
	public static void main(String args[]){
		//System.out.println("Hola Mundo 2");
		Shape cuadradin= new Square(2.2);
		Shape circulin= new Circle(5);
		System.out.println("El �rea del cuadrado es: "+cuadradin.calcularArea());
		System.out.println("El �rea del circulo es: "+circulin.calcularArea());
		Shape rectangulin= new Rectangle(2,3);
		System.out.println("El �rea del rect�ngulo es: "+rectangulin.calcularArea());
		Shape[] shapes= new Shape[3];
		shapes[0]=cuadradin;
		shapes[1]=rectangulin;
		shapes[2]=circulin;
		for(int i=0;i<shapes.length;i++){
			System.out.println("El �rea del shape: "+shapes[i].calcularArea());
		}
	}

}
