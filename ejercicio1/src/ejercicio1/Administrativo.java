package ejercicio1;

public class Administrativo extends Empleado {
	
	protected static final double SUELDO_ADMIN = 300.0;

	public Administrativo(String nombre, String dni){
		super(nombre, dni);
	}
	@Override
	public double calcularSalario() {
		return SUELDO_ADMIN + SUELDO_BASE;
	}
	
}
