package ejercicio3;

import java.util.Scanner;

//Crear una clase principal en la que se instancian 5 objetos de tipo Municipio. A continuación mostrar por pantalla el DC y el nombre de los 5 municipios creados.

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
		
		Municipio m1 = new Municipio("Vigo", "36", "00017");
		Municipio m2 = new Municipio("Madrid", "6", "8");
		Municipio m3 = new Municipio("Barcelona", "89", "13");
		Municipio m4 = new Municipio("Sevilla", "0003", "7");
		Municipio m5 = new Municipio("Bilbao", "67", "5");

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		
		
		
		//Crear una matriz de municipios
		
		Municipio[] array = new Municipio[10];
		
		array[0] = m1;
		array[1] = m2;
		array[2] = m3;
		array[3] = m4;
		array[4] = m5;
		
		
		
		/*  Crear un menú donde el usuario pueda realizar las siguientes operaciones:
		 *	Introducir nuevo municipio.
		 *	Buscar municipio: Introduce el nombre y se devuelve toda la info de ese municipio.
		 *	Mostrar todos los municipios cuyo código acabe por un determinado número.
		 *	Buscar por código: Se introduce el codigo y se muestra toda la información.
		 *	Mostrar todos los municipios de una determinada Provincia. Se muestran todos los municipios con el mismo Código de Provincia
		*/
		
		String salir = "";
		
		do {
			
			System.out.println();
			System.out.println("Escoge una opción:");
			System.out.println("1. Introducir un nuevo municipio.");
			System.out.println("2. Buscar municipio.");
			System.out.println("3. Mostrar todos los municipios cuyo código acabe por un determinado número.");
			System.out.println("4. Buscar por código.");
			System.out.println("5. Mostrar todos los municipios de una determinada provincia.");
			
			int opcion = lector.nextInt();
			
			switch(opcion) {
			
				case 1:
						
						boolean posicionLibre = false;
						int pos = 0;
						
						for(int i = 0; i < array.length; i++) {
							
							if(array[i] != null) {
								
								posicionLibre = true;
								pos = i;
								break;
								
								}
							
							}
						
						if(!posicionLibre) {
							
							System.out.println("No hay posiciones vacías en el array.");;
							
							}
						
						Municipio mun = new Municipio();
						
						System.out.print("Introduce el nombre del municipio: ");
						
						mun.setNombre(lector);
						
						
						System.out.print("Introduce el código del municipio: ");
						
						mun.setCodigoMunicipio(lector);
						
						
						System.out.print("Introduce el código de la provincia: ");
						mun.setCodigoProvincia(lector);
						
						array[pos] = mun;
			
						System.out.println(array[0]);
						System.out.println(array[1]);
						System.out.println(array[2]);
						System.out.println(array[3]);
						System.out.println(array[4]);
						System.out.println(array[5]);
						
				}
			
			
			}
		while(salir != "S");
		
	}

}
