package torresValentin;

public class Reserva {

	private String codigo;
	private String cliente;
	private float tarifaDiaria;
	private int diasAlquiler;
	private float importeFinal;
	
	//Agregar fechas
	
	private boolean estado;
	private final static float iva = 0.21f;
	
	Reserva(String codigo , String cliente) {
		setCodigo(codigo);
		setCliente(cliente);
	}
	
	public Reserva(String codigo , String cliente , float tarifaDiaria , int diasAlquiler) {
		setCodigo(codigo);
		setCliente(cliente);
		setTarifaDiaria(tarifaDiaria);
		setDiasAlquiler(diasAlquiler);
	}
	
	private int diasParaDevolucion() {
		int diasParaDevolucion = 0;
		return diasParaDevolucion;
	}
	
	private void calcularImporteFinal() {
		
	}
	
	private void cerrarReserva() {
		
	}
	
	private void cerrarReserva(int dia , int mes , int anyo) {
		
	}

	
	
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	
	
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	
	
	public float getTarifaDiaria() {
		return tarifaDiaria;
	}

	public void setTarifaDiaria(float tarifaDiaria) {
		this.tarifaDiaria = tarifaDiaria;
	}

	
	
	public int getDiasAlquiler() {
		return diasAlquiler;
	}

	public void setDiasAlquiler(int diasAlquiler) {
		this.diasAlquiler = diasAlquiler;
	}

	
	
	public float getImporteFinal() {
		return importeFinal;
	}

	public void setImporteFinal(float importeFinal) {
		this.importeFinal = importeFinal;
	}

	
	
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	
	
	public float getIva() {
		return iva;
	}
	
	
	
	
	
}
