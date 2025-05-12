package ejercicio3;

public abstract class Figura {
	
	public abstract double calcularArea();
	public abstract double calcularPerimetro();
	
	protected static int totalFiguras = 0;
	
	public Figura() {
		totalFiguras++;
	}
	
	public static int getTotalFiguras() {
		return totalFiguras;
	}
	
}
