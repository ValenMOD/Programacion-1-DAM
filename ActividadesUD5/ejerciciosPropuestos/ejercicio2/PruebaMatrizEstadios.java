package ejercicio2;

//E. Crea otra clase llamada PruebaMatrizEstadios en la que se debe declarar una matriz de Estadios, con capacidad para 10 estadios.

public class PruebaMatrizEstadios {

	static Estadio estadiosLista[] = new Estadio[10];
	
	
	
	public static void addLista(Estadio estadioAAgregar) {
		
		for(int i = 0; i < PruebaMatrizEstadios.estadiosLista.length;i++) {
			
			if(PruebaMatrizEstadios.estadiosLista[i] == null) {
				
				PruebaMatrizEstadios.estadiosLista[i] = estadioAAgregar;
				break;
				
				}
			
			}
		
	}
	
	public static void mostrarEstadios() {
		
		for(int i = 0; i < PruebaMatrizEstadios.estadiosLista.length;i++) {
			
			if(PruebaMatrizEstadios.estadiosLista[i] != null) {
				
				System.out.println(PruebaMatrizEstadios.estadiosLista[i]);
				
				}
			
			}
		
	}
	
	
	public static int getPosAlmacenada() {
		
			int pos = 0;
		
			for(int i = 0; i < PruebaMatrizEstadios.estadiosLista.length;i++) {
				
				if(PruebaMatrizEstadios.estadiosLista[i] != null) {
					
					pos++;
					
					}
				
				
				}
			
			return pos - 1;
			
		}
	
	public static void getEstadioCapacidadMayor(int capacidad) {
		
		boolean capacidadMayor = false;
		
		for(int i = 0; i < PruebaMatrizEstadios.estadiosLista.length;i++) {
			
			if(PruebaMatrizEstadios.estadiosLista[i] != null) {
			
				if(capacidad < PruebaMatrizEstadios.estadiosLista[i].getCapacidad()) {
					
					capacidadMayor = true;
					
					System.out.println(PruebaMatrizEstadios.estadiosLista[i]);
					
					}
				
				}
			}
		
		if(!capacidadMayor) {
			
			System.out.println("No hay estadios con capacidades mayores a las que nos dices");
			
			}
	}
	
	
	public static void getEstadiosMismaCiudad(String ciudad) {
		
		boolean estadiosCiudad = false;
		
		for(int i = 0; i < PruebaMatrizEstadios.estadiosLista.length;i++) {
			
			if(PruebaMatrizEstadios.estadiosLista[i] != null) {
				
				if(ciudad.equals(PruebaMatrizEstadios.estadiosLista[i].getCiudad())) {
					
					estadiosCiudad = true;
					
					System.out.println(PruebaMatrizEstadios.estadiosLista[i]);
					
					}
				
				}
			
			}
		
		if(!estadiosCiudad) {
			
			System.out.println("No hay estadios que coincidan con la ciudad que buscas");
			
			}
		
	}
	
	public static void getInfoEstadioXNombre(String nombre) {
		
		boolean estadioGuardado = false;
		
		for(int i = 0; i < PruebaMatrizEstadios.estadiosLista.length;i++) {
			
			if(PruebaMatrizEstadios.estadiosLista[i] != null) {
				
				if(nombre.equals(PruebaMatrizEstadios.estadiosLista[i].getNombre())) {
					
					estadioGuardado = true;
					
					System.out.println("Tu estadio se encuentra en la posición: " + i + ". Su nombre es: " + PruebaMatrizEstadios.estadiosLista[i].getNombre() + ". Su capacidad es de " + PruebaMatrizEstadios.estadiosLista[i].getCapacidad() + " y se ubica en la ciudad de " + PruebaMatrizEstadios.estadiosLista[i].getCiudad());
					
					}
				
				}
			
			}
		
		
		if(!estadioGuardado) {
			
			System.out.println("No encontramos ningún estadio que coincida con ese nombre.");
			
			}
		
		}
	
}
