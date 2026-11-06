package ejercicio3;

/* Crea una clase llamada Municipio en la que se almacenarán los siguientes atributos:
 * Nombre del Municipio
 * CodigoMunicipio: String con tres caracteres, cuyo valor es un número entre 1 y 999. Si el número no tiene 3 dígitos se rellena con ceros a la izquierda: 004 , 023….
 * CódigoProvincia: String cuyo valor es número entero entre 1 y 57 ( si el código no tiene 2 dígitos se rellena con un cero a la izquierda: 09, 08…)
 * DC: Dígito de control . Es un String que contiene un  número entre 0 y 9.
 */

public class Municipio {

	private String nombre;
	private String codigoMunicipio = "000";
	private String codigoProvincia = "00";
	private String digitoControl;
	
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}
	
	public String setCodigoMunicipio(String codigoMunicipio) {
		
		if((Integer.parseInt(codigoMunicipio) >= 1 && 999 >= Integer.parseInt(codigoMunicipio)) && codigoMunicipio.length() >= 3) {
			
			if(Integer.parseInt(codigoMunicipio) > 0 && 10 > Integer.parseInt(codigoMunicipio)) {
				
				this.codigoMunicipio = "00" + codigoMunicipio;
				return this.codigoMunicipio;
				
				}
			else if(Integer.parseInt(codigoMunicipio) > 10 && 99 > Integer.parseInt(codigoMunicipio)) {
							
					this.codigoMunicipio = "0" + codigoMunicipio;
					return this.codigoMunicipio;
					
				}
			else {
				
				this.codigoMunicipio = codigoMunicipio;
				return this.codigoMunicipio;
				
				}
		
			}
		
		return null;

	}
	
	
	
	public String getCodigoProvincia() {
		return codigoProvincia;
	}

	public String setCodigoProvincia(String codigoProvincia) {
		
		if(Integer.parseInt(codigoProvincia) >= 1 && 57 >= Integer.parseInt(codigoProvincia)) {
			
			if(Integer.parseInt(codigoProvincia) >= 1 && 9 >= Integer.parseInt(codigoProvincia)) {
				
				this.codigoProvincia = "0" + codigoProvincia;
				return this.codigoProvincia;
				
				}
			else {
				
				this.codigoProvincia = codigoProvincia;
				return this.codigoProvincia;
				
				}
			
			}
		
		return null;
		
	}

	
	
	public String getDigitoControl() {
		return digitoControl;
	}
	
	private String setDigitoControl() {
		int[][] magicos = {
	         	{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
	         	{0, 3, 8, 2, 7, 4, 1, 5, 9, 6},
	         	{0, 2, 4, 6, 8, 1, 3, 5, 7, 9}
	         	};
	       String codigo = codigoMunicipio + codigoProvincia;
	       byte[] bytes = codigo.getBytes();
	         	 
	         	 int sum = 0, i = 0;
	                	for(Byte v : bytes){
	                       	sum+=magicos[2 - i % 3][v - 48];
	                       	i++;
	                	}
	         	
	         	int res = sum == 0?0:10 - sum % 10;
	         	digitoControl = Integer.toString(res);
	         	return digitoControl;
	}
	
	
	//A. Programar el constructor de forma que reciba el nombre y dos enteros, el código de municipio y el código de provincia.
		
	public Municipio(String nombre , String codigoMunicipio , String codigoProvincia) {
		
		this.nombre = nombre;
		setCodigoMunicipio(codigoMunicipio);
		setCodigoProvincia(codigoProvincia);
		String DC = setDigitoControl();
	}
	
	
	//B. Programar un método toString que pase a String toda la información de un municipio.
	
	@Override
	public String toString() {
		return "El municipio " + getNombre() + " con el código de municipio " + getCodigoMunicipio() + " y el número de código de provincia " + getCodigoProvincia() + " cuenta con el dígito de control: " + setDigitoControl();
	}
	
}

