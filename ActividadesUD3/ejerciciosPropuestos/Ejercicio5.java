package ejerciciosPropuestos;

import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realizar un programa que cuente los valores de una matriz que están por encima de la media. Y la desviación media de la matriz (la media de las desviaciones). 

		
		Random aleatorio = new Random();
		
		int array[] = new int[10]; //Creamos un array de diez posiciones.
		
		int i;
		
		float media = 0; //Creamos la variable "media" que va a alojar la suma de todas las posiciones del array
		
		for(i = 0;i < array.length;i++) { //El bucle le asignará a cada posición del array un valor aleatorio entre 0 y 10.
			array[i] = aleatorio.nextInt(0 , 11);
			System.out.println("La posición \"" + i + "\" vale " + array[i]);
			media = media + array[i]; //Cada posición del array se va a ir sumando a la variable "media" a medida que avanza el bucle.
		}
		
		media = media / array.length; //Una vez tengamos la suma de las posiciones, lo dividiremos entre las posiciones del array.
		
		System.out.println();
		System.out.println("La media del array es de: " + media);
		System.out.println();

		
		float desviacion = 0; //Creamos la variable desviacion y la inicializamos a 0.
		
		for(i = 0;i < array.length;i++) { //Hacemos un bucle que recorra todas las posiciones del array.
			if(array[i] > media) { //En caso de que el valor de la posición supere a la media, la desviacion se va a sumar a la variable "desviacion" restando el valor menos la media.
				desviacion = desviacion + (array[i] - media);
				System.out.println("En la posición \"" + i + "\", el valor " + array[i] + " supera a la media de " + media);
			}
			else { //En caso de que la media sea superior al valor de la posición en el array, haremos lo contrario, el la posición del array le restará a la media para conocer la desviación y así poder guardarlo.
				desviacion = desviacion + (media - array[i]);
			}
		}
		
		System.out.println();
		
		desviacion = desviacion / array.length; //La desviación media es la desviación partido las posiciones del array.
		
		System.out.printf("La desviación media de la matriz es de: %.2f" , desviacion);
		
		
		
	}

}
