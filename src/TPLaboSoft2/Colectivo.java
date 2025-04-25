package TPLaboSoft2;

public class Colectivo implements Transporte{
	
	protected static final double valorTarifa = 1500.00;
	
	Colectivo extends void Viajes(int contadorViajes) {
		
		super(contadorViajes);
		
		@Override
		public void iniciarViaje() {
			System.out.println("El valor de la tarifa es: " + this.valorTarifa);
		}
		
		@Override
		public void detenerViaje() {
			contadorViajes++
		}
		
		@Override
		public void calcularTarifa() {
			// TODO Auto-generated method stub
			return this.valorTarifa;
		}
	}
	
	
}
