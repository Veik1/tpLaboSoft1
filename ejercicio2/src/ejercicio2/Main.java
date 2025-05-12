package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Transporte[] transportes = new Transporte[3];
        
        transportes[0] = new Colectivo("152");
        transportes[1] = new Tren("Mitre");
        transportes[2] = new Subte("B");
        
        // Iniciamos viajes
        for (Transporte t : transportes) {
            t.iniciarViaje();
        }
        
        // Calculamos tarifas
        for (Transporte t : transportes) {
            System.out.println("Tarifa: $" + t.calcularTarifa());
        }
        
        // Finalizamos viajes
        for (Transporte t : transportes) {
            t.detenerViaje();
        }
        
        System.out.println("Total de viajes realizados: " + Viajes.getTotalViajes());
    }
}
