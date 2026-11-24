package torresValentin;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Reserva r1 = new ReservaElectrico("ABC123", "Manuel");
		
		System.out.println(r1.getIva());
		
		if(r1 instanceof ReservaElectrico) {
			ReservaElectrico e1 = (ReservaElectrico) r1;
			System.out.printf("%.2f%n" , e1.getDescuentoEco());
			}
		
		
		Reserva r2 = new ReservaElectrico("987ZXY", "Iago");
		
		if(r2 instanceof ReservaElectrico) {
			
			System.out.println(((ReservaElectrico) r2).isIncluyyeCableCarga());
			((ReservaElectrico) r2).setTRUEIncluyyeCableCarga();
			System.out.println(((ReservaElectrico) r2).isIncluyyeCableCarga());
			
			ReservaElectrico e2 = (ReservaElectrico)r2;
			System.out.println(e2.isIncluyyeCableCarga());
			e2.setTRUEIncluyyeCableCarga();
			System.out.println(e2.isIncluyyeCableCarga());
			
			}
		
		
		ReservaElectrico r3 = new ReservaElectrico("QWERTY", "Alguien");
		r3.isIncluyyeCableCarga();
	}
}
