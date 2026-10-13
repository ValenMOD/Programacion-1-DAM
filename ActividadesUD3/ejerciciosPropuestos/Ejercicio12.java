package ejerciciosPropuestos;

import java.util.Random;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realizar un programa que compruebe si una matriz de dos dimensiones es la matriz identidad es decir solo tiene unos en su diagonal principal.

		Random aleatorio = new Random();
		
		int matriz2D[][] = new int[3][3]; //Hacemos una matriz de 3 filas y 3 columnas.
		
		
		//Creamos las variables necesarias para utilizarlas en el bucle.
		int i;
		int j;
		
		boolean matrizIdentidad = true;
		
		for(i = 0; i < matriz2D.length;i++) { //Con este bucle recorremos las filas.
			
			for(j = 0;j < matriz2D[0].length;j++) { //En este bucle, asignamos a cada posición del array el valor 0 o 1 de forma aleatoria.
				matriz2D[i][j] = aleatorio.nextInt(2);
				System.out.print(matriz2D[i][j] + " ");
			}
		
			System.out.println();
			
		}
		
		for(i = 0; i < matriz2D.length;i++) { //Recorremos el array. Tanto las filas como las columnas.
		
			for(j = 0;j < matriz2D[i].length;j++) {
				
				
				if(i==j) { //Si ambas variables coinciden quiere decier que estamos en la diagonal de la matríz.
					
					if(matriz2D[i][j] == 0) { //En caso de que el valor asignado sea 0, no nos vale para que sea una matríz identidad.
						matrizIdentidad = false; //Cambiamos el estado de la booleana a false;
						}
					
					} //Cierre del "if" que compara el valor de "i" y "j".
				
				else { //En caso de que no se cumpla lo anterior, suponemos que estamos en una posición del array que no es diagonal.
					
					if(matriz2D[i][j] != 0) { //Si "i" y "j" no valen lo mismo pero la posición del array que componen vale uno, descartamos también que sea una matríz identidad por la misma lógica que aplicamos en el "else".
						matrizIdentidad = false;
						}
					
					}//Cierre del "else"
				
				
				} //Cierre del bucle de las columnas.
		
			} //Cierre del bucle de las filas.
		
		if(matrizIdentidad) {
			System.out.println("Esta es la matríz identidad.");
			}
		else {
			System.out.println("Esta NO es la matríz identidad.");
			}
		
	}
}
