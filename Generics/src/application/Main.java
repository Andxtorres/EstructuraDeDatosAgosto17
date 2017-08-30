package application;

import clases.Box;
import clases.GenericBox;
import clases.Item;

public class Main {
	public static void main(String args[]){
		Box box= new Box();
		Item alienware= new Item("Alienware perrona",35000);
		box.setT(alienware);
		Item i= (Item)box.getT();
		System.out.println("El objeto en la box es: "+i.getName());
		GenericBox< Item,String> genericBox= new GenericBox<>();
		genericBox.setT(alienware);
		genericBox.setS("String");
		System.out.println("El objeto de la generic Box es: "+genericBox.getT().getName());
		
		
	
	}
}
