package ejerciciosPropuestos;

import java.util.Random;

public class Ejercicio3 {

	
	//Programar un método que reciba una matriz y la rellene con números aleatorios.
	//Sobrecargarlo para que funcione con variables de tipo int y con float.

	
	//Método que trabaja con datos de tipo "int":
	public static void llenarMatriz(int matriz[]) {
		
		Random aleatorio = new Random();
		
		for(int i = 0; i < matriz.length;i++) {
			matriz[i] = aleatorio.nextInt(101);
		}
		
	}
	
	
	//Método que trabaja con datos de tipo "double":
	public static void llenarMatriz(float matriz[]) {
		
		Random aleatorio = new Random();
		
		for(int i = 0; i < matriz.length;i++) {
			matriz[i] = aleatorio.nextInt(101);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arrayInt[] = new int[10];
		
		llenarMatriz(arrayInt);
		
		for(int i = 0; i < arrayInt.length;i++) {
			System.out.println("En la posición " + i + ", el valor es: " + arrayInt[i]);
		}
		
		
		System.out.println();
		
		
		float arrayFloat[] = new float[10];
		
		llenarMatriz(arrayFloat);
		
		for(int i = 0; i < arrayInt.length;i++) {
			System.out.println("En la posición " + i + ", el valor es: " + arrayFloat[i]);
		}
		
	}

}
