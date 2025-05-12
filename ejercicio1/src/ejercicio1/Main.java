package ejercicio1;

public class Main {

	public static void main(String[] args) {
		Empleado[] empleados = new Empleado[3];
		
		empleados[0] = new Tecnico("Hideo Kojima", "123456789");
		empleados[1] = new Administrativo("Elon Musk", "123456789");
		empleados[2] = new Gerente("Fidel Castro", "123456789");
		
		for(Empleado emp: empleados) {
			System.out.println(emp.getNombre() + " - Salario: " + emp.calcularSalario());
			
		}
		
		System.out.println("Total de empleados creados: " + Empleado.getTotalEmpleados());
		
	}

}
