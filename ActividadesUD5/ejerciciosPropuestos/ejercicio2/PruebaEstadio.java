package ejercicio2;

import java.util.Scanner;

//D. Crea una clase PruebaEstadio en la que debes crear 5 Estadios y mostrar por pantalla toda la información.

public class PruebaEstadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estadio e1 = new Estadio("Balaídos" , 23000 , "Vigo");
		Estadio e2 = new Estadio("Santiago Bernabéu", 83000, "Madrid");
		Estadio e3 = new Estadio("Camp Nou", 99000, "Barcelona");
		Estadio e4 = new Estadio("Mestalla", 49000, "Valencia");
		Estadio e5 = new Estadio("La Cartuja", 71000, "Sevilla");

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		System.out.println();
		
		
		/* Crear un menú con las siguientes opciones:
		 * Guardar un nuevo estadio.
		 * Mostrar todos los estadios con capacidad superior a una dada.
		 * Mostrar todos los estadios de una determinada ciudad.
		 * Buscar un estadio a partir del nombre.
		 */
		
		int opcion = 0;
		
		do {
			
			System.out.println();
			System.out.println("Selecciona una opción");
			System.out.println("1. Guardar un nuevo estadio.");
			System.out.println("2. Mostrar todos los estadios con capacidad superior a una dada.");
			System.out.println("3. Mostrar todos los estadios de una determinada ciudad.");
			System.out.println("4. Buscar un estadio a partir del nombre.");
			
			Scanner lector = new Scanner(System.in);
			opcion = lector.nextInt();
			
			Object[] estadios;
			switch(opcion) {
				
				case 1:
					
					int pos = -1;
					
					for(int i = 0; i < PruebaMatrizEstadios.estadiosLista.length; i++) {
						
						if(PruebaMatrizEstadios.estadiosLista[i] == null) {
							
							pos = i;
							
							}
						
						}
					
					if(pos == -1) {
						
						System.out.println("No hay espacio en la matríz para guardar más información.");
						break;
						}
					
					System.out.println(PruebaMatrizEstadios.estadiosLista.length);
					
					Estadio estadioArray = new Estadio();
						
					System.out.println();
					System.out.print("Indica el nombre del estadio: ");
					estadioArray.setNombre(lector.next());
					
					System.out.println();
					System.out.print("Indica la capacidad del estadio: ");
					estadioArray.setCapacidad(lector.nextInt());
					
					System.out.println();
					System.out.print("Indica la ciudad donde se encuentra el estadio: ");
					estadioArray.setCiudad(lector.next());
					
					
					PruebaMatrizEstadios.addLista(estadioArray);
					System.out.println("Estadio guardado en la posición: " + PruebaMatrizEstadios.getPosAlmacenada());
					
					PruebaMatrizEstadios.mostrarEstadios();
					
					
					
				}
			}
		while(opcion == 5);
	}

}
