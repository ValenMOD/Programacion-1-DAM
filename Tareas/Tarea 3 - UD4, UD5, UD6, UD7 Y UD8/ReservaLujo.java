package torresValentin;

public class ReservaLujo extends Reserva {

	private final int seguroPremium = 100;
	
	private String choferAsignado;
	

	
	public int getSeguroPremium() {
		return seguroPremium;
	}
	

	
	public String getChoferAsignado() {
		return choferAsignado;
	}

	public void setChoferAsignado(String choferAsignado) {
		this.choferAsignado = choferAsignado;
	}



	ReservaLujo(String codigo, String cliente, String choferAsignado) {
		super(codigo, cliente);
		setChoferAsignado(choferAsignado);
		// TODO Auto-generated constructor stub
	}

}
