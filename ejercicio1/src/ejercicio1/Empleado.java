package ejercicio1;

public abstract class Empleado {
	
	public static final double SUELDO_BASE = 1500.0;
	
	protected String nombre;
	protected String dni;
	
	protected static int totalEmpleados = 0;
	
	public Empleado(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
		totalEmpleados++;
	}
	
	public abstract double calcularSalario();
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public static int getTotalEmpleados() {
        return totalEmpleados;
    }
	
}
