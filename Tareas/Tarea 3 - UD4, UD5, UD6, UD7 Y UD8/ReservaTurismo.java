package torresValentin;

import java.time.LocalDate;

public class ReservaTurismo extends Reserva {
	
	ReservaTurismo(String codigo, String cliente, float tarifaDiaria, int diasAlquiler, LocalDate fechaInicio) {
		super(codigo, cliente, tarifaDiaria, diasAlquiler, fechaInicio);
		calcularImporteFinal();
		
	}

	@Override
	public float calcularImporteFinal() {
		
		float tarifa = this.getTarifaDiaria() * this.getDiasAlquiler();
		float ivaTarifa = tarifa * getIva();
		float tarifaTotal = tarifa * ivaTarifa;
		return tarifaTotal;
		
	}
	
	@Override
	
	
}
