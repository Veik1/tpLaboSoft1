package TPLaboSoft;

public abstract class Empleado {
	
	protected String nombre;
	protected int dni;
	protected static int contadorEmpleados = 0;
	public static final double salario = 1500.0;
	
	public abstract double calcularSalario();
	
	public static int getContadorEmpleados() {
		return contadorEmpleados;
	}
	
	Empleado (String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni;
		contadorEmpleados++;

	}
}
