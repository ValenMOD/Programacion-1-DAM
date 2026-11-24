package torresValentin;

public class ReservaTurismo extends Reserva {

	ReservaTurismo(String codigo, String cliente) {
		super(codigo, cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	private void calcularImporteFinal() {
		super()
		float precio = (getTarifaDiaria() * getDiasAlquiler());
		
	}
	
}
