package ejercicio1;


/* Crear una clase denominada Jugador que almacene los siguientes atributos:
 * 
 * Codigo : String formado por una letra y un dígito.
 * Nombre: String.
 * Puntos: Entero positivo.
 * Competicion: String. (Todos los jugadores deben pertenecer a la misma competicion, es decir , es un atributo de clase, no de instancia(no de objeto).
 *
 */


public class Jugador {

	private String codigo;
	private String nombre;
	private int puntos;
	public static String competicion;

	
	
	//A. Añadir un constructor que permita inicializar un Jugador con Código y Nombre.
	
	public Jugador(String codigo, String nombre) {
		
		setCodigo(codigo);
		this.nombre = nombre;
		
		}

	
	
	//B. Añadir métodos de acceso de lectura y de escritura para el código ,el nombre y la competición. En el caso del código debe de validar que el código tiene la estructura correcta.

	public String getCodigo() {
		return codigo;
		}
	
	public void setCodigo(String codigo) {
		
		if(codigo.length() == 2) {
			
			boolean letra = false;
			boolean digito = false;
			
			letra = Character.isLetter(codigo.charAt(0));
			digito = Character.isDigit(codigo.charAt(1));
			
			
			if(letra && digito) {
				this.codigo = codigo;
				}
			
			}
		
		}
	
	
	
	public String getNombre() {
		return nombre;
		}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
		}
	
	
	
	public static String getCompeticion() {
		return competicion;
		}
	
	public static void setCompeticion(String competicion) {
		Jugador.competicion = competicion;
		}
	
	
	
	//C. Para la variable puntos añadir el método de acceso de lectura.

	public int getPuntos() {
		return puntos;
		}
		
		
		
	//D. Añadir método actualizarPuntos(int puntos) : Recibe una cantidad de puntos que es sumada a los puntos almacenados.
	
	public int actualizarPuntos(int nuevosPuntos) {
		
		puntos = nuevosPuntos + this.puntos;
		
		return puntos;
	}	
		

	
	//E. Programar el método toString que vuelque la información del jugador por pantalla.
	
	@Override
	public String toString() {
		return "Código del jugador: " + codigo + ". Nombre del jugador: " + nombre + ". Puntos del jugador: " + puntos + ". Competición del jugador: " + competicion;
	}
	
}
