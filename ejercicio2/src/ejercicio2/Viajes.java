package ejercicio2;

public abstract class Viajes {
	
	public static int totalViajes = 0;
	
	public static int getTotalViajes() {
		return totalViajes;
	}
	
	protected void incrementarViaje() {
		totalViajes++;
	}
	
}
