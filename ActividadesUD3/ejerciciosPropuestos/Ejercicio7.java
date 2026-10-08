package ejerciciosPropuestos;

import java.util.Random;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realizar un programa que encuentre la posición del primer número negativo.

		Random aleatorio = new Random(); //Creamos una variable "aleatorio" que usaremos para asignar números aleatorios.
		
		int array[] = new int[10]; //Creamos un array de diez posiciones.
		
		int i;
		
		for(i = 0;i<array.length;i++) { //Hacemos un bucle donde le asignamos un valor aleatorio entre -2 y 7 a cada posición del array y lo mostramos por pantalla.
			array[i] = aleatorio.nextInt(-2 , 8);
			System.out.println("La posición " + i + " del array vale: " + array[i]);
		}
		
		
		boolean hayNegativos = false; //Variable booleana donde preguntamos si hay números negativos o no. En un principio no hay.
		
		for(i = 0;i<array.length;i++) { //El bucle va posición por posición viendo el valor de cada una.
			if(array[i] < 0) { //En caso de que encuentre una posición que valga menos que "0". Cambiará la condición de la booleana a true.
				hayNegativos = true;
				System.out.println("El primer número negativo está en la posición: " + i); //El sistema mostrará por pantalla la posición del número negativo.
				break; //Como solo queremos ver el primer número negativo, le indicamos que una vez se cumpla esta función salga del bucle.
			}
		}
		
		if(hayNegativos == false) { //En caso de que el sistema no encuentre ningún número negativo, la booleana no cambiará su condición e informará al usuario de ello.
			System.out.println("No hay números negativos en el array.");
			}
		
	}
	
}