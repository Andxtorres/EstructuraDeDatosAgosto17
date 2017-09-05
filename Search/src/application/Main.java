package application;

import algorithms.BinarySearch;

public class Main {
	public static void main(String[] args){
		Integer[] numeros=new Integer[7];
		numeros[0]=1;
		numeros[1]=2;
		numeros[2]=3;
		numeros[3]=4;
		numeros[4]=5;
		numeros[5]=6;
		numeros[6]=7;
		BinarySearch<Integer>  bsint= new BinarySearch<>();
		System.out.println("El elemento buscado esta en: "+bsint.binarySearch(numeros, 4));					
		/*
		LinearSearch<Integer> ln= new LinearSearch<>();
		System.out.println("El objeto que buscas está en la pos: "+ln.search(numeros, 7));
		String[] strings= new String[5];
		strings[0]="hola";
		strings[1]="van";
		strings[2]="a";
		strings[3]="reprobar";
		strings[4]="todos";
		LinearSearch<String> lnString= new LinearSearch<>();
		System.out.println("El string que buscas está en la pos: "
				+lnString.search(strings, new String("reprobar")));
		Persona[] personas= new Persona[4];
		personas[0]=new Persona("Andres");
		personas[1]=new Persona("Sam");
		personas[2]=new Persona("Pau");
		personas[3]=new Persona("Miguel");
		LinearSearch<Persona> lnPersona= new LinearSearch<>();
		System.out.println("La persona que buscas está en la pos: "
				+lnPersona.search(personas, new Persona("Miguel")));	
				*/	
	}
}
