package TPLaboSoft;

public class Administrativo extends Empleado{
	private double salarioAdministrativo = 400;
	
	
	Administrativo(String nombre, int dni){
		super(nombre, dni);
	}
	
	@Override 
	
	public double calcularSalario(){
		return salario*salarioAdministrativo;
	}
	

}
