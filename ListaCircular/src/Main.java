
public class Main {
	public static void main(String args[]){
		ListaCircular<Integer> listaCircular= new ListaCircular<>();
		listaCircular.agregarAlFinal(3);
		listaCircular.agregarAlFinal(6);
		listaCircular.agregarAlFinal(8);
		listaCircular.agregarAlFinal(1);
		listaCircular.agregarAlInicio(10);
		listaCircular.insertarEnPosicion(15, 4);
		listaCircular.imprimirLista();
		System.out.println("El elemento en 1 es: "+listaCircular.buscarEnPosicion(1).getElemento());
		System.out.println("El tamaño es: "+listaCircular.getTamanio());
	}
}
