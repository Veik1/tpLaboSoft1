package ejercicio1;

public class Gerente extends Empleado {
	
	protected static final double SUELDO_GERENTE = 600.0;

	public Gerente(String nombre, String dni){
		super(nombre, dni);
	}
	@Override
	public double calcularSalario() {
		return SUELDO_GERENTE + SUELDO_BASE;
	}
	
}
