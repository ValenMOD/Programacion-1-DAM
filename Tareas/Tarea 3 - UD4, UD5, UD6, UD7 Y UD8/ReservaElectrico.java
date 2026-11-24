package torresValentin;

public class ReservaElectrico extends Reserva {

	ReservaElectrico(String codigo, String cliente) {
		super(codigo, cliente);
	}
	
	private final float descuentoEco = 0.10f;

	public float getDescuentoEco() {
		return descuentoEco;
	}
	
	
	
	private boolean incluyyeCableCarga;

	public void setTRUEIncluyyeCableCarga() {
		incluyyeCableCarga = true;
	}
	
	public void setFALSEIncluyyeCableCarga() {
		incluyyeCableCarga = false;
	}

	public boolean isIncluyyeCableCarga() {
		return incluyyeCableCarga;
	}

	
	
	
}
