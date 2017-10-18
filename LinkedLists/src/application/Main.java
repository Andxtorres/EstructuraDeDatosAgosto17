package application;

import exceptions.ListaVaciaException;
import models.ListaLigada;

public class Main {

	public static void main(String[] args) {
		
		ListaLigada<String> listaLigada=new ListaLigada<>();
		try{
			listaLigada.eliminarAlFinal();
		}catch(ListaVaciaException e){
			System.out.println("La lista est� vac�a");
		}
		listaLigada.agregarAlFinal("Sam");
		listaLigada.agregarAlFinal("Pau");
		listaLigada.agregarAlInicio("Andr�s");
		try {
			listaLigada.eliminarAlInicio();
			listaLigada.eliminarAlInicio();
			listaLigada.eliminarAlInicio();
		} catch (ListaVaciaException e) {
			System.out.println("La lista est� vac�a");
		}
		listaLigada.imprimeLista();

	}

}
