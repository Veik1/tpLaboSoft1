package ejercicio2;

public class Colectivo extends Viajes implements Transporte {
	
	private String linea;
	private boolean enViaje;
	
	public static final double BONDI_TARIFA = 1000.0;
	
	public Colectivo(String linea) {
		this.linea = linea;
		this.enViaje = false;
	}
	
	@Override
	public double calcularTarifa() {
		return MINIMO_TARIFA + BONDI_TARIFA;
	}
	
	@Override
	public void iniciarViaje() {
		if (!enViaje) {
			enViaje = true;
			incrementarViaje();
			System.out.println("Colectivo linea " + linea + " inició el viaje");
		}
	}
		
	@Override
	public void detenerViaje() {
		if (enViaje) {
			enViaje = false;
			System.out.println("Colectivo linea " + linea + " finalizó su viaje");
		}
	}
	
	public String getLinea() {
        return linea;
    }
	
	

}
