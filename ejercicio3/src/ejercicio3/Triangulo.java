package ejercicio3;

public class Triangulo extends Figura {
    private double base;
    private double altura;
    
    public Triangulo(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        // Área = (base * altura) / 2
        return (base * altura) / 2;
    }
    
    @Override
    public double calcularPerimetro() {
        // Asumimos triángulo rectángulo para este ejemplo
        // Perímetro = base + altura + hipotenusa
        double hipotenusa = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        return base + altura + hipotenusa;
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
}