package ejerciciosPropuestos;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa que calcula el máximo y el mínimo de 2 números enteros introducidos por teclado.

		try {
			int num1;
			int num2;
			
			Scanner lector = new Scanner(System.in);
			
			System.out.println("Elige el primer número.");
			num1 = lector.nextInt();//El usuario elige el primer número.
			
			System.out.println("Elige el segundo número.");
			num2 = lector.nextInt();//El usuario elige el segundo número.
			lector.close();
			
			int min = Math.min(num1, num2);//Calcula el número más pequeño.
			int max = Math.max(num1, num2);//Calcula el número más grande.
			
			System.out.println("El número más pequeño es el: " + min);
			System.out.println("El número más grande es el: " + max);
		}
		
		catch (Exception e) {
			System.out.println("Ha ocurrido un error. Asegúrate de introducir número enteros.");
		}
	}

}