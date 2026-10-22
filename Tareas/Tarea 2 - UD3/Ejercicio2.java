package valentín;

import java.lang.reflect.Array;
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
		 * B. Rotación de la Matriz 90 en el sentido de las agujas del reloj: Implementa un algoritmo que rote la matriz 55 un cuarto de vuelta a la derecha (90). Ejemplo: La primera fila de la matriz original pasa a ser la última columna de la nueva matriz.
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
		int k = 0;
		
		boolean esLetra = false;
		
		char mayuscula[] = {'A' , 'B' , 'C' , 'D', 'E' , 'F' , 'G' , 'H' , 'I' , 'J' , 'K' , 'L', 'M' , 'N' , 'O' , 'P', 'Q' , 'R' , 'S' , 'T', 'U' , 'V' , 'W' , 'X', 'Y' , 'Z'};
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce tu palabra clave:");
		String palabraClave = lector.next();
		
		while(palabraClave.length() > 25) { //El usuario introduce por primera vez la palabra
			
			System.out.println("Tu palabra clave debe tener como máximo 25 caracteres.");
			
			System.out.println("Introduce tu palabra clave:");
			palabraClave = lector.next();
			}
		
		
		while(!esLetra) {
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
		
		int aumento = 0;
		
		for(i = 0; i < matriz.length;i++) {
			
			for(j = 0; j < matriz[0].length;j++) {
				
				
				int longitudPalabraClave = palabraClave.length();				
				
				if(longitudPalabraClave > contadorCaracteres) {
					
					char caracterAMostrar = palabraClave.charAt(contadorCaracteres);
					
					matriz[i][j] = caracterAMostrar;
					
					System.out.print(matriz[i][j] + " ");
					
					}
				
				contadorCaracteres++;
				
				if(longitudPalabraClave < contadorCaracteres) {
					int generador = aleatorio.nextInt(0, mayuscula.length);
					
					matriz[i][j] = mayuscula[generador];
					
					System.out.print(matriz[i][j] + " ");
					}
				}
				
			System.out.println();	
			}
		
		
		System.out.println("La copia de tu array se ve así:");
		
		
		
		char matrizCopia[][] = Arrays.copyOf(matriz, matriz.length);

		for (i = 0; i < matriz.length; i++) {
		    matrizCopia[i] = Arrays.copyOf(matriz[i], matriz[i].length);
			}
		
		for(i = 0; i < matrizCopia.length;i++) {
			
			for(j = 0; j < matrizCopia[0].length;j++) {
				
				System.out.print(matrizCopia[i][j] + " ");
				
				}
			
			System.out.println();
			
			}
				
		
		System.out.println("El array invertido se ve de esta forma:");
		
		int aux = 4;
		
		for(i = 0; i < matriz.length;i++) {
			
			for(j = 0;j < matriz[0].length;j++) {
				
				if(i == 0) {
					
					matrizCopia[i][j] = matriz[aux][0];
					System.out.print(matrizCopia[i][j] + " ");

					aux--;
					
					}
				}
			}
				
		System.out.println();		
			
		aux = 4;
		
		for(i = 0; i < matriz.length;i++) {
			
			for(j = 0;j < matriz[0].length;j++) {
				
				
				
				if(i == 1) {
					
					matrizCopia[i][j] = matriz[aux][1];
					System.out.print(matrizCopia[i][j] + " ");

					aux--;
					
					}
				
				}
			}
		
		System.out.println();
		
		aux = 4;
		
		for(i = 0; i < matriz.length;i++) {
			
			for(j = 0;j < matriz[0].length;j++) {
				
				
				
				if(i == 2) {
					
					matrizCopia[i][j] = matriz[aux][2];
					System.out.print(matrizCopia[i][j] + " ");

					aux--;
					
					}
				
				}
			}
		
		System.out.println();
		
		aux = 4;
		
		for(i = 0; i < matriz.length;i++) {
			
			for(j = 0;j < matriz[0].length;j++) {
				
				
				
				if(i == 3) {
					
					matrizCopia[i][j] = matriz[aux][3];
					System.out.print(matrizCopia[i][j] + " ");

					aux--;
					
					}
				
				}
			}
		
		
		System.out.println();
		
		aux = 4;
		
		for(i = 0; i < matriz.length;i++) {
			
			for(j = 0;j < matriz[0].length;j++) {
				
				
				
				if(i == 4) {
					
					matrizCopia[i][j] = matriz[aux][4];
					System.out.print(matrizCopia[i][j] + " ");

					aux--;
					
					}
				
				}
			}
		
		
		
		}

}
