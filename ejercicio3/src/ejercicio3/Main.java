package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];
        
        figuras[0] = new Circulo(5.0);
        figuras[1] = new Cuadrado(4.0);
        figuras[2] = new Triangulo(3.0, 4.0);
        
        // Calcular y mostrar áreas y perímetros
        for (Figura figura : figuras) {
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            System.out.println("-------------------");
        }
        
        System.out.println("Total de figuras creadas: " + Figura.getTotalFiguras());
    }
}