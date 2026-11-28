package torresValentin;

public class ReservaTurismo extends Reserva {

	ReservaTurismo(String codigo, String cliente) {
		super(codigo, cliente);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public float calcularImporteFinal(Reserva r) {
		
		float tarifa = (r.getTarifaDiaria() * r.getDiasAlquiler());
		float ivaTarifa = tarifa * r.getIva();
		float tarifaTotal = tarifa * ivaTarifa;
		return tarifaTotal;
	}
	
}
