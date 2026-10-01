package ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//EJERCICIO 1.
		
		
		/* Crear un programa en Java que utilice un array de tipo double de 10 posiciones y realice secuencialmente las siguientes operaciones:
		 *
		 *
		 * A. 	Asigna a la primera posición del array el valor:  Un número aleatorio entero entre 2 y 10 (ambos incluidos). 
		 *		Asigna a la segunda posición del array el valor: Un número aleatorio entero entre 15 y 30 (ambos incluidos).
		 *		Asigna a la tercera posición la suma de las dos anteriores
		 *
		 * B.	Asigna a la cuarta posición del array el valor:
		 *		posicion[3] = sin(posicion[0] ) * cos(posicion [1] )  + log(posicion[2] + 1).
		 *
		 * C.	Asigna a la quinta posición del array el valor:  La media aritmética de las 4 posiciones anteriores, redondeada
		 *		al entero más cercano.
		 *
		 * D.   Realizar una copia exacta de las primeras 5 posiciones en un segundo array de tamaño 5.
		 *
		 * E.	Ordenar el segundo array de menor a mayor.
		 *
		 * F.	Buscar en qué índice ha quedado el valor original generado en el apartado a) dentro del array ordenado (usando Arrays.binarySearch)
		 *		y mostrar dicho índice por pantalla. 
		 */
		
		
		double posicion[] = new double[10]; //Creamos un array de 10 posiciones.
		
		Random aleatorio = new Random(); //Esta varibale nos permite simplificar el código. En lugar de escribir "Math.Random()" al momento de generar un número aleatorio puedo escribir "aleatorio" y trabajar de forma más limpia.
		
		
		// A. 	Asigna a la primera posición del array el valor:  Un número aleatorio entero entre 2 y 10 (ambos incluidos). 
		//		Asigna a la segunda posición del array el valor: Un número aleatorio entero entre 15 y 30 (ambos incluidos).
		//		Asigna a la tercera posición la suma de las dos anteriores
		
			posicion[0] = aleatorio.nextDouble(2 , 10); //Como se explicó cuando creamos la variable "aleatorio", aquí estamos generando un número entre 2 y 10.
			
			posicion[1] = aleatorio.nextDouble(15 , 30); //Aquí hacemos lo mismo.

			
			posicion[2] = posicion[0] + posicion[1]; //El valor de los dos primeros espacios del array se sumarán y el resultado se le asignará a posicion[2] (el tercer espacio del array).
			

			System.out.printf("La primera posición del array tiene como valor: %.2f%n \n" , posicion[0]);	//"%.2f%n" simplifica a dos decimales la salida en pantalla del número.		
			System.out.printf("La segunda posición del array tiene como valor: %.2f%n \n" , posicion[1]);
			System.out.printf("Si sumamos los valores anteriores, sabemos que la tercera posición vale: %.2f \n" , posicion[2]);
			System.out.println();

			
			
		//	B.	Asigna a la cuarta posición del array el valor:
		//		posicion[3] = sin(posicion[0] ) * cos(posicion [1] )  + log(posicion[2] + 1).
			
			posicion[3] = Math.sin(posicion[0] ) * Math.cos(posicion [1] )  + Math.log(posicion[2] + 1);// Esta operación la podemos realizar gracias a la clase Math.
			
			System.out.printf("El valor de la cuarta posición es de: %.2f%n" , posicion[3]);
			System.out.println();
			
			
			
		//	C.	Asigna a la quinta posición del array el valor:  La media aritmética de las 4 posiciones anteriores, redondeada
		//		al entero más cercano.
			
			posicion[4] = Math.round(posicion[0] + posicion[1] + posicion[2] + posicion[3]) / 4; //Sumamos las 4 primeras posiciones y el resultado lo dividimos entre 4. Redondeamos el resultado con "Math.round".
			System.out.println("La quinta posición es la media de las cuatro primeras posiciones. La quinta posición vale: " + posicion[4]);
			System.out.println();
			
			
			
		//	D.   Realizar una copia exacta de las primeras 5 posiciones en un segundo array de tamaño 5.
			
			double copia[] = Arrays.copyOf(posicion, 5); //Hacemos una copia del array original llamada "copia". Le pedimos que solo replique las primeras 5 posiciones.
			
			System.out.println("Las 5 primeras posiciones son: "); //Mostramos los valores mediante un bucle.
			for(int i = 0;i<copia.length;i++) {
				System.out.print(copia[i] + "  ");
			}
			System.out.println();
			
			
			
		//	E.	Ordenar el segundo array de menor a mayor.
			
			Arrays.sort(copia); //Ordenamos de menor a mayor el array "copia".
			
			
			
		//	F.	Buscar en qué índice ha quedado el valor original generado en el apartado a) dentro del array ordenado (usando Arrays.binarySearch)
		//		y mostrar dicho índice por pantalla. 
			
			System.out.println();
			int valorBuscado = Arrays.binarySearch(copia, posicion[0]); //Dentro del array "copia" ya ordenado, va a buscar donde está el valor de la primera posición del array original.
			System.out.println("El valor que buscas está en la posición: " + valorBuscado);
			
			for(int i = 0;i<copia.length;i++) { //Mostramos los valores del array para comprobar que lo que dice el sistema es cierto.
				System.out.print(copia[i] + "  ");
			}

	}

}
