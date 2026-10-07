package ejerciciosPropuestos;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realizar un programa que indique si un número es primo o no. Un número es primo cuando sólo tiene 2 divisores : el 1 y el mismo número.

		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce un número y el sistema te dirá si es primo o no.");
		int numero = lector.nextInt();
		
		boolean esPrimo = true; //Creamos una booleana que nos diga si el número es primo o no. La inicializamos como "true".
		
		
		for(int i = 2;i<numero;i++) { //El bucle irá dividiendo el número introducido desde el 2 hasta el propio número.
			
			if(numero % i == 0) { //En caso de que algún valor sea capaz de dividir nuestro número, el bucle romperá.
				esPrimo = false;
				break;
				
				}
			}
			
		if(esPrimo) { //En caso de que se recorra todo el bucle y no se encuentre otro divisor del número, reconoceremos que es un número primo.
			System.out.println("El núemro es primo.");
		}
		else { //Cuando el bucle rompe, evalúa la condición "esPrimo" la cual tendrá que valer "false". Le indicará al usuario de esto.
			System.out.println("El núemro NO es primo.");
		}
		
		
		}
		
		
	}
