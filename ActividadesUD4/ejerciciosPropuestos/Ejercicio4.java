package ejerciciosPropuestos;

import java.util.Random;

public class Ejercicio4 {

	//Programar una función que indique si un número es primo o no.
	//Utilizando esta función indicar los números primos que hay en un array 2D.

	public static boolean esPrimo (int ...n) {
		boolean primo = true;
		int numero = n[0];
		
		if(numero < 2) {
			System.out.println("El número debe ser igual o mayor que 2.");
			return false;
		}
		
		for(int i = 2; i < numero;i++) {
			primo = true;
			if(numero % i == 0) {
				primo = false;
				break;
			}
		}
		
		return primo;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Probamos el método con números sueltos:
		boolean estado = esPrimo(20);
		System.out.println("El método que analiza si tu núemro es primo o no dio: " + estado);
		
		boolean estado2 = esPrimo(7);
		System.out.println("El método que analiza si tu núemro es primo o no dio: " + estado2);
		
	
		System.out.println();
		
		
		//Creamos el array y le damos valores aleatorios:
		int array[][] = new int[5][5];
		
		for(int i = 0; i < array.length;i++) {
			for(int j = 0; j < array[0].length;j++) {
				
				Random aleatorio = new Random();
				
				array[i][j] = aleatorio.nextInt(101);
				System.out.print(array[i][j] + " ");
				
				}
			System.out.println();
			}
		
		
		System.out.println();
		
		
		//Recorremos el array indicando los valores que son primos:
		for(int i = 0; i < array.length;i++) {
			for(int j = 0; j < array[0].length;j++) {
				
				if(esPrimo(array[i][j])) {
					
					System.out.println("El número " + array[i][j] + " es primo.");
					
					}
				}
			}
		
	}

}
