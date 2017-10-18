package exceptions;

public class ListaVaciaException extends Exception{




	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ListaVaciaException() {
		super("La lista está vacía");
	}

}
