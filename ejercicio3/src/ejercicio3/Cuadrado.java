package ejercicio3;

public class Cuadrado extends Figura {
    private double lado;
    
    public Cuadrado(double lado) {
        super();
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        // Área = lado^2
        return Math.pow(lado, 2);
    }
    
    @Override
    public double calcularPerimetro() {
        // Perímetro = 4 * lado
        return 4 * lado;
    }
    
    public double getLado() {
        return lado;
    }
    
    public void setLado(double lado) {
        this.lado = lado;
    }
}