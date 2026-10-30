package ejerciciosPropuestos;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6 {

	//Programar un método que reciba una matriz y devuelva otra matriz con los mismos valores pero el doble de capacidad.

	
	public static int[] doblarMatriz(int[] matriz) {
		int copia[] = new int[matriz.length * 2];
		
		copia = Arrays.copyOf(matriz, copia.length);
		return copia;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random aleatorio = new Random();
		
		int array[] = new int[5];
		
		//Matriz original:
		for(int i = 0; i < array.length;i++) {
			
			array[i] = aleatorio.nextInt(0 , 10);
			System.out.print(array[i] + " ");
			
			}
		
		System.out.println();
		
		//Doblamos la capacidad de la matriz:
		int matrizDoblada[] = doblarMatriz(array);
		
		
		//Mostramos la nueva matriz
		for(int i = 0; i < matrizDoblada.length;i++) {
			
			System.out.print(matrizDoblada[i] + " ");
			
			}
		
		
	}

}
