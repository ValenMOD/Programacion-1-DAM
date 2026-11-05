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
			
			return pos;
			
		}
	
	
}
