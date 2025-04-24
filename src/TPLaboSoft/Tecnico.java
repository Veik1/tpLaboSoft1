package TPLaboSoft;

public class Tecnico extends Empleado {
	private double salarioTecnico = 300;
	
	Tecnico(String nombre, int dni){
		super(nombre, dni);
	}
	
	@Override 
	public double calcularSalario() {
		return salario*salarioTecnico;
	}

}
