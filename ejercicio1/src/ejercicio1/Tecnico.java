package ejercicio1;

public class Tecnico extends Empleado {
	
	protected static final double SUELDO_TECNICO = 200.0;
	
	public Tecnico(String nombre, String dni) {
		super(nombre, dni);
	}
	
	@Override
	public double calcularSalario() {
		return SUELDO_TECNICO + SUELDO_BASE;
	}
	

}
