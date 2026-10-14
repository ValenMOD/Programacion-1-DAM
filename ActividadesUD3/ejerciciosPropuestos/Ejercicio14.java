package ejerciciosPropuestos;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realizar un programa que trabaje con una matriz de Strings y realice los siguientes algoritmos:
		
		// 1. Almacenar un String en la primera posición vacía.
		// 2. Contar cuantas palabras contienen el caracter ‘t’.
		// 3. Buscar un determinado string en la matriz e indicar la posición en que se encuentra. Si no lo encuentra debe informar de dicha circunstancia.

		
		String matriz[] = new String[5];
		
		Scanner lector = new Scanner(System.in);
		
		
		int opcion = 0;
		
		int i;
		
		char salirPrograma;
		
		
		do {

			System.out.println("Seleccione una opción:");
			System.out.println("1. Almacenar un String.");
			System.out.println("2. Contar cuantas palabras contienen el carcter 't'.");
			System.out.println("3. Buscar palabra.");
			System.out.println("4. Salir del programa.");
			
			opcion = lector.nextInt();
			
		
			switch(opcion) {
			
				case 1:
			
					String palabra = null;
					
					System.out.println("Por favor, escriba su palabra a guardar:");
					palabra = lector.next();
					
					
					boolean sitioString = false; //Volvemos a inicializar la booleana a "false" para que no de el mismo mensaje todo el rato.
					
					for(i = 0;i < matriz.length;i++) { //Recorremos la matríz
						
						if(matriz[i] == null) { //En caso de que identifique una posición vacía en el array, entrará dentro del condicional.
							
							sitioString = true;
							matriz[i] = palabra;
							break;//Una vez guardada la palabra, salimos del bucle.
							
							} //Cierre del "if" que busca sitio vacío.
						
						} //Cierre del "for" que recorre la matríz.
					
					if(sitioString) { //Si había un hueco dentro del array y se ejecutó correctamente el programa, nos mostrará un mensaje diciendo que se guardó la palabra.
						System.out.println("Palabra guardada correctamente.");
						}
					else { //En caso de que la booleana esté en "false" (por lo tanto no encontró un hueco en el array) se avisará al usuario de esto.
						System.out.println("No se ha podido guardar la palabra por falta de espacio.");
						}
					
					break; //Cierre del "case 1".
			
					
				case 2:
					
					int contadorT = 0;
					
					for(i = 0; i < matriz.length;i++) //Recorremos la matríz.
						
						
						if(matriz[i] != null) { //Las posiciones que no estén vacías (o sea que no valgan "null") entrarán en el bucle. No pasará nada con las que si estén vacías.
							if(matriz[i].indexOf('t') >= 0) { //Si se detecta una 't' en el String, se sumará uno al contador.
								contadorT++;
								} //Cierre del "if" contador.
							} //Cierre del "if" que recorre la matríz en busca de posiciones vacías.
							
					System.out.println("Hay " + contadorT + " palabras con \'t\'.");
					
					break; //Cierre del "case 2".
					
					
				case 3:
					
					String palabraABuscar = null;
					
					boolean encontrado = false; //Creamos la booleana "encontrado". En caso de que la palabra que introduzca el usuario coincida con una que esté en el array, su vaor pasará a ser "true".
					
					System.out.println("Introduce la palabra a buscar.");
					palabraABuscar = lector.next();
					
						for(i = 0; i < matriz.length; i++) {
							
							if(palabraABuscar.equals(matriz[i])) {
								encontrado = true;
								break;
								} //Cierre del "if".
							
							} //Cierre del bucle "for".
					
					if(encontrado) {
						
						System.out.println("Se ha encontrado la palabra \"" + palabraABuscar + "\" en la posición " + i);
						
						}
					else {
						System.out.println("No se ha encontrado la palabra \"" + palabraABuscar + "\" en la lista.");
					}
					
					break;
						
				case 4:
					
					break; //Cierre del "case 4".
					
				} //Cierre del "switch".
			
			System.out.println("Seguro desea salir del programa? S/N");
			salirPrograma = lector.next().charAt(0);
			
			} //Cierre del "do".
		

		
		while(salirPrograma != 'S');
		
		}

}
