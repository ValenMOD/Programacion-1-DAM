package valentín;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*/EJERCICIO 2.
		 *
		 *Ejercicio 2: Cifrado y Transposición. Diseñar un programa que implemente un cifrado basado en una matriz de caracteres de 5 X 5.
		 * 
		 * 
		 * 
		 * A. Generación del Tablero de Cifrado: El programa solicitará una "Palabra Clave" al usuario (máximo 25 caracteres, solo letras). Rellenará una matriz 5 X 5 de char carácter a carácter introduciendo la palabra.
		 *    Si la palabra tiene menos de 25 caracteres, los huecos restantes de la matriz se deben rellenar secuencialmente con caracteres aleatorios en mayúscula entre la 'A' y la 'Z'. Muestra la matriz resultante por consola.
		 * 
		 * 
		 * 
		 * B. Rotación de la Matriz 90 en el sentido de las agujas del reloj: Implementa un algoritmo que rote la matriz 5 X 5 un cuarto de vuelta a la derecha (90). Ejemplo: La primera fila de la matriz original pasa a ser la última columna de la nueva matriz.
		 * 	  Muestra por pantalla el tablero rotado.
		 * 
		 * 
		 * 
		 * C. Extracción de Mensaje por Diagonales: A partir de la matriz rotada, genera y muestra por pantalla un String concatenando:
		 * 		- Los caracteres de la diagonal principal (de arriba-izquierda a abajo-derecha).
		 * 		- Los caracteres de la diagonal secundaria (de arriba-derecha a abajo-izquierda).
		 * 		- Indica cuántas vocales (A, E, I, O, U) contiene la cadena final resultante.
		 */
		
		
		
		
		 // A. Generación del Tablero de Cifrado: El programa solicitará una "Palabra Clave" al usuario (máximo 25 caracteres, solo letras). Rellenará una matriz 5 X 5 de char carácter a carácter introduciendo la palabra.
		 //    Si la palabra tiene menos de 25 caracteres, los huecos restantes de la matriz se deben rellenar secuencialmente con caracteres aleatorios en mayúscula entre la 'A' y la 'Z'. Muestra la matriz resultante por consola.
		
		int i = 0;
		int j = 0;
		
		boolean esLetra = false;
		
		char mayuscula[] = {'A' , 'B' , 'C' , 'D', 'E' , 'F' , 'G' , 'H' , 'I' , 'J' , 'K' , 'L', 'M' , 'N' , 'O' , 'P', 'Q' , 'R' , 'S' , 'T', 'U' , 'V' , 'W' , 'X', 'Y' , 'Z'};
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce tu palabra clave:");
		String palabraClave = lector.next();
		
		while(palabraClave.length() > 25) { //El usuario introduce la palabra y el sistema la guardará si tiene 25 o menos caracteres.
			
			System.out.println("Tu palabra clave debe tener como máximo 25 caracteres.");
			
			System.out.println("Introduce tu palabra clave:");
			palabraClave = lector.next();
			}
		
		
		while(!esLetra) { //El bucle recorre cada caracter de la palabra y se asegura de que sea una letra.
			for(i = 0; i < palabraClave.length();i++) {
				
				char caracter = palabraClave.charAt(i);
				
				esLetra = Character.isLetter(caracter);
				
				if(!esLetra) {
					System.out.println("Tu palabra clave solo puede contener letras.");
					
					System.out.println("Introduce tu palabra clave:");
					palabraClave = lector.next();
					}				
				}
		
			}
				
		Random aleatorio = new Random();
		
		char matriz[][] = new char[5][5];
		
		int contadorCaracteres = 0;
		
		
		System.out.println("Tu matríz es esta: ");
		
		
		//Este bucle rellena la matriz con cada caracter de la palabra. Una vez que no dispongamos de caracteres, el sistema llenará la matríz con letras mayúsculas aleatorias.
		for(i = 0; i < matriz.length;i++) {
			
			for(j = 0; j < matriz[0].length;j++) {
				
				
				int longitudPalabraClave = palabraClave.length();				
				
				if(longitudPalabraClave > contadorCaracteres) { //La variable "contadorCaracteres" actuará como indice de cada caracter dentro de la palabra. En caso de que la longitud de la palabra sea superior a la variable que cuenta los caracteres de la palabra, se asignara un caracter a la posicion del array correspondiente.
					
					char caracterAMostrar = palabraClave.charAt(contadorCaracteres);
					
					matriz[i][j] = caracterAMostrar;
					
					System.out.print(matriz[i][j] + " ");
					
					}
				
				contadorCaracteres++; //Para que el programa avance y no se cree un bucle infinito, por cada vez que se recorra una posición de la matríz, aumentaremos en uno la variable de contador.
				
				if(longitudPalabraClave < contadorCaracteres) { //Una vez que el contador sea superior a la longitud de la palabra (por lo cual no hay caracteres suficientes en la palabra introducida para llenar todo el array), el sistema asignará a las próximas posiciones una letra mayúscula aleatoria.
					int generador = aleatorio.nextInt(0 , mayuscula.length);
					
					matriz[i][j] = mayuscula[generador];
					
					System.out.print(matriz[i][j] + " ");
					}
				}
				
			System.out.println();	
			}
		
		
		
		
		//B. Rotación de la Matriz 90 en el sentido de las agujas del reloj: Implementa un algoritmo que rote la matriz 5 X 5 un cuarto de vuelta a la derecha (90). Ejemplo: La primera fila de la matriz original pasa a ser la última columna de la nueva matriz.
		//  	 Muestra por pantalla el tablero rotado.
		
		
		char matrizInvertida[][] = Arrays.copyOf(matriz, matriz.length); //Creamos una copia de la matríz que tenemos actualmente.

		for (i = 0; i < matriz.length; i++) {
		    matrizInvertida[i] = Arrays.copyOf(matriz[i], matriz[i].length);
			}
				
		
		System.out.println("El array invertido se ve de esta forma:");
		
		
		
		//Si la matriz fuera:A B C D E			Sabriamos que dada vuelta sería así: U P K F A
		//                   F G H I J                                                V Q L G B
	    //                   K L M N O                                                W R M H C 
		//                   P Q R S T                                                X S N I D
		//                   U V W X Y                                                Y T O J E
		
		//Si comparamos ambas matrices podemos ver que, la letra "A" pasa de estar en la posicion [0][0] --> [0][4] y que la letra "B" [0][1] --> [1][4]. Con el resto de las letras pasa lo mismo:
		// C = [0][2] --> [2][4]
		// D = [0][3] --> [3][4]
		// E = [0][4] --> [4][4]
		// F = [1][0] --> [0][3]
		// G = [1][1] --> [1][3]
		// H = [1][2] --> [2][3]
		// I = [1][3] --> [3][3]
		// J = [1][4] --> [4][3]
		// K = [2][0] --> [0][2]
		// L = [2][1] --> [1][2]
		
		//Podemos ver que hay cierto patrón que se repite. A medida que avanzamos en la matríz "normal", el número que varía es el de la columna (j). En la matríz invertida varían las filas (i).
		//Teniendo esto en cuenta, diseñamos este algoritmo para crear una matríz invertida.
		
		int aux = 4;
		
		for(i = 0; i < matriz.length;i++) {
			
			for(j = 0;j < matriz[0].length;j++) {
				
				if(i == 0) { //El bucle recorre la matríz y llega a este punto en su primera ejecución.
					
					matrizInvertida[i][j] = matriz[aux][0];
					//En su primera ejecución, matrizInvertida[0][0] tomará como valor lo que esté almacenado en matriz[aux (que vale 4 en su primera ejecución)][0]
					//En su segunda ejecución, será así: matrizInvertida[i/0][j/1] toma como valor: matriz[aux/3][0]. Y así hasta finalizar el bucle. Hacemos lo mismo con todos los valores posibles de "i".
					System.out.print(matrizInvertida[i][j] + " ");

					aux--; //Restamos en uno el valor de "aux".
					
					}
				}
			}
				
		System.out.println();		
			
		aux = 4;
		
		for(i = 0; i < matriz.length;i++) {
			
			for(j = 0;j < matriz[0].length;j++) {
				
				
				
				if(i == 1) {
					
					matrizInvertida[i][j] = matriz[aux][1];
					System.out.print(matrizInvertida[i][j] + " ");

					aux--;
					
					}
				
				}
			}
		
		System.out.println();
		
		aux = 4;
		
		for(i = 0; i < matriz.length;i++) {
			
			for(j = 0;j < matriz[0].length;j++) {
				
				
				
				if(i == 2) {
					
					matrizInvertida[i][j] = matriz[aux][2];
					System.out.print(matrizInvertida[i][j] + " ");

					aux--;
					
					}
				
				}
			}
		
		System.out.println();
		
		aux = 4;
		
		for(i = 0; i < matriz.length;i++) {
			
			for(j = 0;j < matriz[0].length;j++) {
				
				
				
				if(i == 3) {
					
					matrizInvertida[i][j] = matriz[aux][3];
					System.out.print(matrizInvertida[i][j] + " ");

					aux--;
					
					}
				
				}
			}
		
		
		System.out.println();
		
		aux = 4;
		
		for(i = 0; i < matriz.length;i++) {
			
			for(j = 0;j < matriz[0].length;j++) {
				
				
				
				if(i == 4) {
					
					matrizInvertida[i][j] = matriz[aux][4];
					System.out.print(matrizInvertida[i][j] + " ");

					aux--;
					
					}
				
				}
			}
		
		System.out.println();
		
		
		
		/* C. Extracción de Mensaje por Diagonales: A partir de la matriz rotada, genera y muestra por pantalla un String concatenando:
		 * 		- Los caracteres de la diagonal principal (de arriba-izquierda a abajo-derecha).
		 * 		- Los caracteres de la diagonal secundaria (de arriba-derecha a abajo-izquierda).
		 * 		- Indica cuántas vocales (A, E, I, O, U) contiene la cadena final resultante.
		 */
		
		//Creamos las dos variables para almacenar las diagonales.
		StringBuilder diagonalPrincipal = new StringBuilder();
		StringBuilder diagonalSecundaria = new StringBuilder();
		
		char vocales[] = {'a' , 'e' , 'i' , 'o' , 'u' , 'A' , 'E' , 'I' , 'O' , 'U'};
		
		
		//Para almacenar la diagonal principal, hacemos este algoritmo:
		j = 0;
		for(i = 0; i < matrizInvertida[0].length;i++) {
			
			//La primera vez que se ejecute el bucle, guardará matrizInvertida[0][0].
			diagonalPrincipal.append(matrizInvertida[i][j]);
			
			j++; //Aumentamos en uno "j", lo que indica que bajaremos de fila.
			
			//Una vez ejecutado por primera vez, "j" pasara a valer "1" y el bucle se repetirá haciendo que ahora se guarde el caracter de matrizInvertida[1][1] y así hasta completar la diagonal.
			}
		
		System.out.println("La diagonal principal es: " + diagonalPrincipal);
		
		
		
		//Con la diagonal pasará algo parecido pero "j" irá perdiendo valor a medida que el bucle avanza.
		
		j = 4;
		for(i = 0; i < matrizInvertida[0].length;i++) {
			
			diagonalSecundaria.append(matrizInvertida[i][j]);
			
			//La primera vez se guardará el valor matrizInvertida[0][4], la segunda vez matrizInvertida[1][3] y seguirá hasta finalizar el bucle.
			
			j--;
			
			}
		
		System.out.println("La diagonal secundaria es: " + diagonalSecundaria);
		
		
		
		StringBuilder diagonales = new StringBuilder();
		diagonales.append(diagonalPrincipal);
		diagonales.append(diagonalSecundaria);
		
		System.out.println("En un solo String, las cadenas se verían así: " + diagonales);
		
		
		int contadorVocales = 0;
		
		
		//Creamos una matríz de vocales y la usaremos en este bucle. Por cada caracter en el StringBuilder "diagonales", veremos si coincide ese caracter con alguno de la lista. En caso de que no, seguirá avanzando pero en caso de que si, antes de seguir con el bucle sumará en una unidad a la variable "contadorVocales".
		for(i = 0; i < diagonales.length();i++) {
			
			for(j = 0; j < vocales.length;j++) {
				
				if(diagonales.charAt(i) == vocales[j]) {
					
					contadorVocales++;
					
					}
				
				}
			
			}
		
		//Una vez finalizado el bucle, veremos la cantidad de vocales por pantalla.
		System.out.println("En esta cadena hay " + contadorVocales + " vocales.");
		
	}		

	
}
