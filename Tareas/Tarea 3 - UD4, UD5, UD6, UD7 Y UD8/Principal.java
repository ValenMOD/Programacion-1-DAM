package torresValentin;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Reserva r1 = new ReservaElectrico("ABC123", "Manuel");
		
		System.out.println(r1.getIva());
		System.out.println(r1.get);
	}

}
