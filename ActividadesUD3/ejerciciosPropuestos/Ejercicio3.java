package ejerciciosPropuestos;

import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Diseñar un programa que calcule el menor de 4 números.

		Random aleatorio = new Random();

		int num1 = aleatorio.nextInt(0 , 10);
		int num2 = aleatorio.nextInt(0 , 10);
		int num3 = aleatorio.nextInt(0 , 10);
		int num4 = aleatorio.nextInt(0 , 10);
		int menor;
		
		
		System.out.println("num1 equivale a: " + num1);
		System.out.println("num2 equivale a: " + num2);
		System.out.println("num3 equivale a: " + num3);
		System.out.println("num4 equivale a: " + num4);
		
		if(num1 < num2) {
			menor = num1;
		}
		else {
			menor = num2;
		}
		
		if (menor > num3) {
			menor = num3;
		}
		
		if (menor > num4) {
			menor = num4;
		}
		
		System.out.println("El número más pequeño es el "+ menor);
		}

}
