package ejerciciosPropuestos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crear una matriz de enteros con capacidad para 5 números. Darle valores aleatorios y mostrar por pantalla los valores almacenados en la primera y la última posición.

		int lista[] = {(int)(Math.random() * 100) , (int)(Math.random() * 100) , (int)(Math.random() * 100) , (int)(Math.random() * 100) , (int)(Math.random() * 100) };

		System.out.println("El primer valor de la lista es el: " + lista[0]);
		System.out.println("El último valor de la lista es el: " + lista[4]);
		
		
		//A continuación copiar la matriz a otra matriz. 

		int lista2[] = Arrays.copyOf(lista, lista.length);
		System.out.println("Este es el primer valor de la matriz copia: " + lista2[0]);
		System.out.println("Este es el último valor de la matriz copia: " + lista2[4]);

		
		//Ordenar la matriz copia. Mostrar por pantalla las dos matrices para comprobar.
		
		Arrays.sort(lista2);
		System.out.println("Esta es la lista NO ORDENADA: " + lista[0] + " , " + lista[1] + " , " + lista[2] + " , " + lista[3] + " , " + lista[4]);
		System.out.println("Esta es la lista ORDENADA: " + lista2[0] + " , " + lista2[1] + " , " + lista2[2] + " , " + lista2[3] + " , " + lista2[4]);
		
		
		//Solicitar al usuario que introduzca un valor e indicar en qué posición se encuentra.

		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce un valor:");
		int valorUsuario = lector.nextInt();
		lector.close();

		int posicion = Arrays.binarySearch(lista2, valorUsuario);//Busca dentro del array "lista2" lo que le digamos en "valorUsuario".

		System.out.println("El valor se encuentra en la posición: " + posicion);
				
	}

}
