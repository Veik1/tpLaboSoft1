package TPLaboSoft;

public class Gerente extends Empleado {
	private double salarioGerente = 200;
	
	Gerente(String nombre, int dni){
		super(nombre, dni);
		

	}
	
	@Override 
	public double calcularSalario() {
		return salario * salarioGerente;
	}
}
