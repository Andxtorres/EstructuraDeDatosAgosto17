
public class Arbol<T extends Comparable<T>> {
	
	private Nodo<T> raiz;

	public Nodo<T> getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo<T> raiz) {
		this.raiz = raiz;
	}
	
	public void enOrden(){
		enOrdenRec(raiz);
	}
	public void preOrden(){
		preOrdenRec(raiz);
	}	
	public void posOrden(){
		posOrdenRec(raiz);
	}	
	private void enOrdenRec(Nodo<T> raiz){
		
		if(raiz!=null){
			enOrdenRec(raiz.getIzquierdo());
			System.out.print(""+raiz.getElemento()+" ");
			enOrdenRec(raiz.getDerecho());
		} 
		
	}
	
	private void preOrdenRec(Nodo<T> raiz){
		
		if(raiz!=null){
			System.out.print(""+raiz.getElemento()+" ");
			preOrdenRec(raiz.getIzquierdo());
			preOrdenRec(raiz.getDerecho());
		} 		
	}
	private void posOrdenRec(Nodo<T> raiz){
		
		if(raiz!=null){
			posOrdenRec(raiz.getIzquierdo());
			posOrdenRec(raiz.getDerecho());
			System.out.print(""+raiz.getElemento()+" ");

		} 		
	}
	
	public void insertaElemento(T elemento){
		raiz= insertaElementoRec(raiz, new Nodo<T>(elemento));
		
	}
	
	private Nodo<T> insertaElementoRec(Nodo<T> papa, Nodo<T> nuevo){
		if(papa==null){
			return nuevo;
		}else if(nuevo.getElemento().compareTo(papa.getElemento())>0){
			papa.setDerecho(insertaElementoRec(papa.getDerecho(), nuevo));
		}else if(nuevo.getElemento().compareTo(papa.getElemento())<0){
			papa.setIzquierdo(insertaElementoRec(papa.getIzquierdo(), nuevo));
		}
		
		return papa;
	}
	
	public Nodo<T> buscarElemento(T elemento){
		Nodo<T> resultado= buscarElementoRec(elemento, raiz);
		return resultado;
	}
	
	private Nodo<T> buscarElementoRec(T elemento,Nodo<T> raiz){
		if(raiz==null){
			return null;
		}

		if(elemento.compareTo(raiz.getElemento())==0){
			return raiz;
		}else if(elemento.compareTo(raiz.getElemento())<0){
			return buscarElementoRec(elemento, raiz.getIzquierdo());
			
		}else{
			return buscarElementoRec(elemento, raiz.getDerecho());

		}
	}
}
