package models;

import exceptions.ListaVaciaException;

public class ListaLigada<T> {
	
	private Nodo<T> first;
	
	public ListaLigada(){
		first=null;
	}
	
	public boolean estaVacia(){
		return first==null;
	}
	
	public int numElementos(){
		if(estaVacia()){
			return 0;
		}else{
			int contador=0;
			Nodo<T> temp= new Nodo<>();
			temp=first;
			while(temp!=null){
				contador++;
				temp=temp.getSiguiente();
			}
			return contador;
			
		}
	}
	
	public void agregarAlInicio(T elemento){
		Nodo<T> nodo= new Nodo<>();
		nodo.setT(elemento);
		if(estaVacia()){
			first=nodo;
		}else{
			nodo.setSiguiente(first);
			first=nodo;
		}
	}
	
	public void agregarAlFinal(T elemento){
		Nodo<T> nodo= new Nodo<>();
		nodo.setT(elemento);
		if(estaVacia()){
			first=nodo;
		}else{
			Nodo<T> temp= first;
			while(temp.getSiguiente()!=null){
				temp=temp.getSiguiente();
				
			}
			temp.setSiguiente(nodo);
		}
	}
	
	public void eliminarAlFinal() throws ListaVaciaException{
		if(estaVacia()){
			throw new ListaVaciaException();
		}else{
			Nodo<T> temp=first;
			Nodo<T> prev= new Nodo<>();
			if(temp.getSiguiente()==null){
				first=null;
			}else{
				while(temp!=null){
					prev=temp;
					temp=temp.getSiguiente();
				}
			}
			System.out.println("Prev: "+prev.getT());
			prev.setSiguiente(null);
		}
	}
	
	public void eliminarAlInicio() throws ListaVaciaException{
		if(estaVacia()){
			throw new ListaVaciaException();
		}else{
			first=first.getSiguiente();
		}		
	}
	
	
	public void imprimeLista(){
		Nodo<T> temp= new Nodo<>();
		if(estaVacia()){
			System.out.println("Lista vacía");
		}else{
			temp= first;
			while(temp!=null){
				System.out.println(temp.getT());
				temp=temp.getSiguiente();
			}
		}
	}
	

}
