package application;

import exceptions.ListaVaciaException;
import models.ListaLigada;

public class Main {

	public static void main(String[] args) throws ListaVaciaException {
		
		ListaLigada<String> listaLigada=new ListaLigada<>();
		listaLigada.agregarAlInicio("Andres");
		listaLigada.agregarAlInicio("Dara");
		listaLigada.agregarAlInicio("Saúl");
		listaLigada.agregarAlFinal("Santiago");
		listaLigada.eliminarAlFinal();
		listaLigada.agregarAlFinal("Sam");
		listaLigada.imprimeLista();

	}

}
