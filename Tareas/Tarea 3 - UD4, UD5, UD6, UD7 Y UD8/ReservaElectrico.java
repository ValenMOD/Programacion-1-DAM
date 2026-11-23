package torresValentin;

public class ReservaElectrico extends Reserva {

	ReservaElectrico(String codigo, String cliente) {
		super(codigo, cliente);
	}
	
	private final float descuentoEco = 0.10f;

	public float getDescuentoEco() {
		return descuentoEco;
	}
	
	
	


	
	
	
}
