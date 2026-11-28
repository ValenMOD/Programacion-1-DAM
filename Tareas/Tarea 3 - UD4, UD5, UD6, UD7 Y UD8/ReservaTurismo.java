package torresValentin;

import java.time.LocalDate;

public class ReservaTurismo extends Reserva {
	
	ReservaTurismo(String codigo, String cliente, float tarifaDiaria, int diasAlquiler, float importeFinal,
			LocalDate fechaInicio, LocalDate fechaDevolucionPrevista) {
		super(codigo, cliente, tarifaDiaria, diasAlquiler, fechaInicio, fechaDevolucionPrevista);
		calcularImporteFinal(importeFinal);
		
	}

	@Override
	public float calcularImporteFinal() {
		
		float tarifa = this.tarifaDiaria * this.diasAlquiler;
		float ivaTarifa = tarifa * iva;
		float tarifaTotal = tarifa * ivaTarifa;
		return tarifaTotal;
		
	}
	
}
