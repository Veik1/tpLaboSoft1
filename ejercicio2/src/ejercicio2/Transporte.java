package ejercicio2;

public interface Transporte {
	
	void iniciarViaje();
    void detenerViaje();
    double calcularTarifa();
    
    public static final double MINIMO_TARIFA = 1000.0;

}
