package clases;

public class Circle implements Shape{
	private int radio;

	
	public Circle(int radio) {
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	public double calcularArea(){
		return Math.PI*(Math.pow(radio, 2));
	}
	
}
