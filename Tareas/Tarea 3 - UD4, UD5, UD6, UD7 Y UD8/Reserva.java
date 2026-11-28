package torresValentin;

import java.time.LocalDate;

public class Reserva {

	private String codigo;
	private String cliente;
	private float tarifaDiaria;
	private int diasAlquiler;
	private float importeFinal;
	private float importeFinalReal;
	private LocalDate fechaInicio;
	private LocalDate fechaDevolucionPrevista;
	//Agregar fechas
	
	private boolean estado;
	private final static float iva = 0.21f;
	
	
	
	Reserva(String codigo , String cliente , float tarifaDiaria , int diasAlquiler , LocalDate fechaInicio) {
		setCodigo(codigo);
		setCliente(cliente);
		setTarifaDiaria(tarifaDiaria);
		setDiasAlquiler(diasAlquiler);
		setFechaInicio();
	}
	
	

	private int diasParaDevolucion() {
		int diasParaDevolucion = 0;
		return diasParaDevolucion;
	}
	
	public float calcularImporteFinal() {
		
		float tarifa = this.tarifaDiaria * this.diasAlquiler;
		float ivaTarifa = tarifa * iva;
		float tarifaTotal = tarifa + ivaTarifa;
		return tarifaTotal;
		
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

	
	
	public float getImporteFinalReal() {
		return importeFinalReal;
	}

	public void setImporteFinalReal(float importeFinalReal) {
		this.importeFinalReal = importeFinalReal;
	}

	
	
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio() {
		this.fechaInicio = LocalDate.now();
	}

	
	
	public LocalDate getFechaDevolucionPrevista() {
		return fechaDevolucionPrevista;
	}

	public void setFechaDevolucionPrevista() {
		this.fechaDevolucionPrevista = fechaDevolucionPrevista;
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
