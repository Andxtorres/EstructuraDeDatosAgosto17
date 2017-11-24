
public class Main {
	public static void main (String args[]) {
		Grafo<String> grafo= new Grafo<>();
		grafo.insertarVertice("A");
		grafo.insertarVertice("B");
		grafo.insertarVertice("C");
		grafo.insertarVertice("D");
		grafo.insertarVertice("E");
		grafo.insertarVertice("F");
		grafo.insertarVertice("G");
		grafo.insertarArista("A", "B");
		grafo.insertarArista("A", "C");
		grafo.insertarArista("A", "D");
		grafo.insertarArista("B", "E");
		grafo.insertarArista("C", "F");
		grafo.insertarArista("F", "G");
		grafo.insertarArista("E", "G");
		System.out.println("En profundidad:");
		grafo.recorrerEnProfundidad();
		System.out.println("En anchura:");
		grafo.recorrerEnAnchura();
	}
}
