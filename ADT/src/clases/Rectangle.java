package clases;

public class Rectangle implements Shape{

	protected double base;
	private double altura;
	
	public Rectangle(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcularArea() {
		
		return base*altura;
	}
	
}
