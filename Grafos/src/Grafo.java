import java.util.ArrayList;
import java.util.List;

public class Grafo<T extends Comparable<T>> {
	private List<Arista<T>> aristas;
	private List<Vertice<T>> vertices;
	
	public Grafo() {
		aristas= new ArrayList<>();
		vertices= new ArrayList<>();
	}
	
	public void insertarVertice(T elemento) {
		boolean found= false;
		for (Vertice<T> vertice : vertices) {
			if(vertice.getElemento().equals(elemento)) {
				found=true;
			}
		}
		if(!found) {
			Vertice<T> v= new Vertice<>(elemento);
			vertices.add(v);
		}
	}
	public void insertarArista(T elemento1, T elemento2) {
		Vertice<T> v1=null;
		Vertice<T> v2= null;
		for (Vertice<T> vertice : vertices) {
			if(elemento1.equals(vertice.getElemento())) {
				v1= vertice;
			}
		}
		for (Vertice<T> vertice : vertices) {
			if(elemento2.equals(vertice.getElemento())) {
				v2= vertice;
			}
		}	
		if(v1!=null&&v2!=null&&v1.getElemento()!=v2.getElemento()) {
			Arista<T> a= new Arista<>(v1, v2);
			v1.getAristas().add(a);
			v2.getAristas().add(a);
			aristas.add(a);
		}else {
			System.out.println("No se puede añadir arista");
		}
	}
	
	public void reiniciarVisitas() {
		for (Vertice<T> vertice : vertices) {
			vertice.setVisitado(false);
		}
	}
	
	public void recorrerEnAnchura() {		
		Stack<Vertice<T>> verticesStack=new Stack<>();
		if(vertices.get(0)==null) {
			System.out.println("No hay vertices");
		}else {
			verticesStack.push(vertices.get(0));
			while(verticesStack.tamanio()>0) {
				Vertice<T> vertice=verticesStack.pop();
				if(!vertice.isVisitado()) {
					vertice.setVisitado(true);
					System.out.println("Nodo visitado: "+vertice.getElemento());
					List<Arista<T>> aristas= vertice.getAristas();
					for (Arista<T> arista : aristas) {
						if(arista.getVertice1().isVisitado()==false) {
							verticesStack.push(arista.getVertice1());
						}
						if(arista.getVertice2().isVisitado()==false) {
							verticesStack.push(arista.getVertice2());
						}

					}
				}
			}
		}
		reiniciarVisitas();
		
	}
	public void recorrerEnProfundidad() {
		Queue<Vertice<T>> verticesQueue=new Queue<>();
		if(vertices.get(0)==null) {
			System.out.println("No hay vertices");
		}else {
			verticesQueue.enqueue(vertices.get(0));
			while(verticesQueue.tamanio()>0) {
				Vertice<T> vertice=verticesQueue.dequeue();
				if(!vertice.isVisitado()) {
					vertice.setVisitado(true);
					System.out.println("Nodo visitado: "+vertice.getElemento());
					List<Arista<T>> aristas= vertice.getAristas();
					for (Arista<T> arista : aristas) {
						if(arista.getVertice1().isVisitado()==false) {
							verticesQueue.enqueue(arista.getVertice1());
						}
						if(arista.getVertice2().isVisitado()==false) {
							verticesQueue.enqueue(arista.getVertice2());
						}
					}
				}
			}
		}
		reiniciarVisitas();
	}	
	
	
}
