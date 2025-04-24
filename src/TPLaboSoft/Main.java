package TPLaboSoft;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente gerente1 = new Gerente("Ricky", 30987128);
		Tecnico tecnico1 = new Tecnico("Jose", 40587120);
		Administrativo administrativo1 = new Administrativo("Sergio", 5058452);
		
		
		System.out.println("Sueldo del gerente: " + gerente1.calcularSalario());
		System.out.println("Sueldo del administrativo: " + administrativo1.calcularSalario());
		System.out.println("Sueldo del tecnico: " +tecnico1.calcularSalario());
		System.out.println("Cantidad de empleados: " + Empleado.getContadorEmpleados());
	
		
	}

}
