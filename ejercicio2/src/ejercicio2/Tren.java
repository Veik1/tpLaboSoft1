package ejercicio2;

public class Tren extends Viajes implements Transporte {
	
	private String ramal;
	private boolean enViaje;
	
	public static final double BONDI_TARIFA = 1200.0;
	
	public Tren(String ramal) {
		this.ramal = ramal;
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
			System.out.println("Tren ramal " + ramal + " inició el viaje");
		}
	}
		
	@Override
	public void detenerViaje() {
		if (enViaje) {
			enViaje = false;
			System.out.println("Tren ramal " + ramal + " finalizó su viaje");
		}
	}
	
	public String getRamal() {
        return ramal;
    }
	
}