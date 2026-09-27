package ejerciciosPropuestos;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Mejorar el programa anterior para que calcule el máximo y el mínimo de 3 números enteros.
		
		int num1;
		int num2;
		int num3;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Elige el primer número.");
		num1 = lector.nextInt();//El usuario elige el primer número.
		
		System.out.println("Elige el segundo número.");
		num2 = lector.nextInt();//El usuario elige el segundo número.
		
		System.out.println("Elige el tercer número.");
		num3 = lector.nextInt();//El usuario elige el tercer número.
		lector.close();
		
		int min = Math.min(num1, num2);//Calcula el número más pequeño.
		int min2 = Math.min(num2, num3);//Calcula el número más pequeño.
		int min3 = Math.min(min, min2);//Calcula el número más pequeño entre los tres números.
		
		int max = Math.max(num1, num2);//Calcula el número más grande.
		int max2 = Math.max(num2, num3);//Calcula el número más grande.
		int max3 = Math.max(max, max2);//Calcula el número más grande entre los tres números.
		
		System.out.println("El número más pequeño es el: " + min3);
		System.out.println("El número más grande es el: " + max3);
		
	}

}
