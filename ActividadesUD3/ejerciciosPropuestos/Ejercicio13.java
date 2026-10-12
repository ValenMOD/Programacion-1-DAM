package ejerciciosPropuestos;

import java.util.Random;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realizar un programa que calcule el porcentaje de valores negativos que hay en una matriz 2D.

		Random aleatorio = new Random();
		
		int matriz2D[][] = new int[5][5]; //Creamos una matriz 2D de 5 filas y 5 columnas. 
		
		
		//Creamos las variables que vamos a utilizar a lo largo del programa.
		
		int i; //Las variables "i" y "j" las vamos a utilizar en los bucles.
		int j;
		
		int negativo = 0; //Con esta variable vamos a llevar una contabilidad de los números negativos.
		
		for(i = 0; i < matriz2D.length;i++) { //Creamos un bucle que recorrerá cada fila del array.
					
					for(j = 0;j < matriz2D[0].length;j++) { //Dentro del bucle, habrá otro que reocrrerá cada columna del array.
						
						matriz2D[i][j] = aleatorio.nextInt(-3 , 6); //Cuando el bucle pasa por cada posición, le asigna un número aleatorio entre -3 y 5.
						System.out.print(matriz2D[i][j] + " ");
						
						if(matriz2D[i][j] < 0) { //En caso de que el número asignado sea negativo, se le sumará uno a la variable "negativo".
							negativo++;
							}
						
						}
				
					System.out.println(); //Lo utilizamos para poder ver bien las filas y columnas.		
			}
		
		int total = matriz2D.length * matriz2D[0].length; //El total de valores que hay son la multiplicación de las filas por las columnas.

		float porcentajeNegativo = (float)negativo / total * 100; //Calculamos el porcentaje negativo sobre el total de la matríz.

		System.out.println("En la matriz hay " + total + " números de los cuales " + negativo + " son negativos.");
		System.out.println("El porcentaje de números negativos en la matríz es de: " + porcentajeNegativo + "%.");
	}

}
