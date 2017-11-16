
public class Main {

	public static void main(String[] args) {
		Arbol<Integer> a= new Arbol<>();
		a.insertaElemento(5);
		a.insertaElemento(3);
		a.insertaElemento(2);
		a.insertaElemento(1);
		a.insertaElemento(4);
		a.insertaElemento(8);
		a.insertaElemento(7);
		a.insertaElemento(6);
		a.insertaElemento(9);
		a.insertaElemento(10);
		System.out.println("Mi nodo raíz es: "+a.getRaiz().getElemento());
		a.enOrden();

		System.out.println("");
		a.preOrden();
		System.out.println("");
		a.posOrden();
		System.out.println("");
		if(a.buscarElemento(15)==null){
			System.out.println("Elemento no encotrado");
		}else{
			System.out.println("Elemento encontrado");
		}

	}

}
