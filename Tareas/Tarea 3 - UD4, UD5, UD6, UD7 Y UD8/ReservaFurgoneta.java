package torresValentin;

public class ReservaFurgoneta extends Reserva {
	
	private int suplementoCarga;
	
	private double capacidadKg;
	
	
	
	public int getSuplementoCarga() {
		return suplementoCarga;
	}

	public void setSuplementoCarga(int suplementoCarga) {
		this.suplementoCarga = suplementoCarga;
	}

	
	
	public double getCapacidadKg() {
		return capacidadKg;
	}

	public void setCapacidadKg(double capacidadKg) {
		this.capacidadKg = capacidadKg;
	}

	
	
	public ReservaFurgoneta(String codigo, String cliente, float tarifaDiaria, int diasAlquiler) {
		super(codigo, cliente, tarifaDiaria, diasAlquiler);
		// TODO Auto-generated constructor stub
	}

	

}
