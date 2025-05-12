package ejercicio3;

public class Circulo extends Figura{
	
	public static final double PI = 3.141592653589793;
	
	protected double radio;
	
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}
	
	@Override
	public double calcularArea() {
		// Área = PI * radio^2
        return PI * Math.pow(radio, 2);
	}
	
	@Override
    public double calcularPerimetro() {
        // Perímetro = 2 * PI * radio
        return 2 * PI * radio;
    }
	
	public double getRadio() {
        return radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
	
}
