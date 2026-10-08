package ejerciciosPropuestos;

import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Diseñar un programa que calcule el menor de 4 números.

		Random aleatorio = new Random();

		int num1 = aleatorio.nextInt(0 , 11); //Se crean las cuatro variables de los números. Las variables tomarán como valor un número aleatorio entre 0 y 10.
		int num2 = aleatorio.nextInt(0 , 11);
		int num3 = aleatorio.nextInt(0 , 11);
		int num4 = aleatorio.nextInt(0 , 11);
		int menor; //Se crea la variable "menor" que contendra el dígito más pequeño en el momento de la ejecución del programa.
		
		
		System.out.println("num1 equivale a: " + num1);
		System.out.println("num2 equivale a: " + num2);
		System.out.println("num3 equivale a: " + num3);
		System.out.println("num4 equivale a: " + num4);
		
		if(num1 < num2) { //El sistema analiza los dos primeros números. Si el primero es más pequeño que el segundo, el valor del primero lo toma "menor".
			menor = num1;
		}
		else {
			menor = num2; //En caso de que la condición no se cumpla, "menor" vale lo que valga el segundo número.
		}
		
		if (menor > num3) { //El programa evalúa lo mismo de antes. Si "menor" es más grande que el tercer número, "menor" pasa a valer lo que valga este.
			menor = num3;
		}
		
		if (menor > num4) { //El programa sigue y evalúa lo mismo con el cuarto número.
			menor = num4;
		}
		
		System.out.println("El número más pequeño es el "+ menor); //Finalmente, el programa muestra el valor más bajo de estos cuatro números.
		}

}
