
public class Main {
	public static void main(String args[]){
		ListaDoblementeLigada<Integer> listaDoubleEnteros= new ListaDoblementeLigada<>();
		listaDoubleEnteros.insertarAlInicio(2);
		listaDoubleEnteros.insertarAlInicio(3);
		listaDoubleEnteros.insertarAlInicio(5);
		listaDoubleEnteros.insertarAlInicio(6);
		listaDoubleEnteros.insertarAlFinal(10);
		//listaDoubleEnteros.eliminarAlFinal();
		listaDoubleEnteros.eliminarElemento(20);
		listaDoubleEnteros.intercambiarValores(1, 4);
		listaDoubleEnteros.imprimeLista();
	}
}
