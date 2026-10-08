package ejerciciosPropuestos;

import java.util.Random;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realizar un programa que encuentre el valor más alto de un array.

		Random aleatorio = new Random(); //Creamos una variable "aleatorio" que usaremos para asignar números aleatorios.

		int array[] = new int[10]; //Creamos un array de diez posiciones.

		int i;

		for(i = 0;i<array.length;i++) { //Hacemos un bucle donde le asignamos un valor aleatorio entre 0 y 20 a cada posición del array y lo mostramos por pantalla.
			array[i] = aleatorio.nextInt(0 , 21);
			System.out.println("La posición " + i + " del array vale: " + array[i]);
		}

		int suma = 0; //Creamos la variable "suma". Aquí se guardará el valor más alto del array.
		int posicion = 0; //En la variable "posición" se guardará la posición del valor más alto.
		
		for(i = 0;i<array.length;i++) { //El programa va posición por posición viendo el valor de esta.
			if(array[i] > suma) { //En caso de que encuentre una posición cuyo valor sea mayor al de "suma", la variable "suma" tomará su valor hasta que encuentre otra posición con un valor más alto o el bucle finalice.
				suma = array[i];
				posicion = i; //"posicion" tomará como valor la posición del número más alto cuando la variable "suma" cambie su valor.
			}
		}
		
		System.out.println("El valor más alto en el array es el " + suma + " y se encuentra en la posición " + posicion);
		
	}

}
