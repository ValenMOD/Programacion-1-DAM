package ejerciciosPropuestos;

import java.util.Random;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realizar un programa que encuentre las posiciones de un array en las que hay ceros.

		Random aleatorio = new Random(); //Creamos una variable "aleatorio" que usaremos para asignar números aleatorios.
		
		int array[] = new int[10]; //Creamos un array de diez posiciones.
		
		int i;
		
		for(i = 0;i<array.length;i++) { //Hacemos un bucle donde le asignamos un valor aleatorio entre 0 y 5 a cada posición del array y lo mostramos por pantalla.
			array[i] = aleatorio.nextInt(0 , 6);
			System.out.println("La posición " + i + " del array vale: " + array[i]);
		}
		
		
		boolean hayCeros = false; //Variable booleana donde preguntamos si hay ceros o no. En un principio no hay.
		
		for(i = 0;i<array.length;i++) { //El bucle va posición por posición viendo el valor de cada una.
			if(array[i] == 0) { //En caso de que encuentre una posición que valga exactamente "0". Cambiará la condición de la booleana a true.
				hayCeros = true;
				System.out.println("Se encontró un \"0\" en la posición: " + i); //El sistema mostrará por pantalla la posición del "0".
			}
		}
		
		if(hayCeros == false) { //En caso de que el sistema no encuentre ningún cero, la booleana no cambiará su condición e informará al usuario de ello.
			System.out.println("No hay ceros en el array.");
		}
	}

}
