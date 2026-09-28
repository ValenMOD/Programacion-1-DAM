package ejerciciosPropuestos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crear un programa que lea una cadena y muestre la siguiente información:
		
		//a. Cuántas palabras componen la cadena.
		//b. En qué posición está el caracter ‘a’ en cada una de las palabras.(Suponer que estamos trabajando con 3 palabras).
		//c. Cuál es el primer caracter de cada una de estas palabras.
		//d. Cuál es el último caracter de cada una de estas palabras.
		//e. Solicitar al usuario una letra e indicar en qué posición se encuentra.
		
		
		String cadena = "Amo aprender Java.";
		
		
		//a. Cuántas palabras componen la cadena.

		String[] palabras = cadena.split(" ");//Separamos el String en " " espacios en blanco para poder contar las palabras que hay.
		System.out.println("En esta cadena hay " + palabras.length + " palabras.");
		
		
		System.out.println();
		
		//b. En qué posición está el caracter ‘a’ en cada una de las palabras.(Suponer que estamos trabajando con 3 palabras).

		int posicion1 = palabras[0].indexOf("a");//La palabra "Amo" contiene una "A" mayúscula pero nosotros estamos indicando que queremos una "a" en minúscula.
		System.out.println("En la palabra \"" + palabras[0] + "\", la letra \"a\" está en la posición: " + posicion1);
		
		int posicion2 = palabras[1].indexOf("a");
		System.out.println("En la palabra \"" + palabras[1] + "\", la letra \"a\" está en la posición: " + posicion2);
		
		int posicion3 = palabras[2].indexOf("a");//Aunque hayan dos "a", el sistema nos informa solo de la primera que encuentra.
		System.out.println("En la palabra \"" + palabras[2] + "\", la letra \"a\" está en la posición: " + posicion3);
		
		
		System.out.println();
		
		//c. Cuál es el primer caracter de cada una de estas palabras.

		char primerCaracter = palabras[0].charAt(0);
		System.out.println("El primer caracter de la palabra \"" + palabras[0] + "\" es: " + primerCaracter);
		
		char segundoCaracter = palabras[1].charAt(0);
		System.out.println("El primer caracter de la palabra \"" + palabras[1] + "\" es: " + segundoCaracter);
		
		char tercerCaracter = palabras[2].charAt(0);
		System.out.println("El primer caracter de la palabra \"" + palabras[2] + "\" es: " + tercerCaracter);
		
		
		System.out.println();
		
		//d. Cuál es el último caracter de cada una de estas palabras.

		int caracteres1 = palabras[0].length() - 1;
		char ultimoCaracter1 = palabras[0].charAt(caracteres1);
		
		System.out.println("El último caracter de la palabra \"" + palabras[0] + "\" es: " + ultimoCaracter1);
		
		
		int caracteres2 = palabras[1].length() - 1;
		char ultimoCaracter2 = palabras[1].charAt(caracteres2);
		
		System.out.println("El último caracter de la palabra \"" + palabras[1] + "\" es: " + ultimoCaracter2);
		
		
		int caracteres3 = palabras[2].length() - 1;
		char ultimoCaracter3 = palabras[2].charAt(caracteres3);
		
		System.out.println("El último caracter de la palabra \"" + palabras[2] + "\" es: " + ultimoCaracter3);
		
		
		System.out.println();
		
		//e. Solicitar al usuario una letra e indicar en qué posición se encuentra.

		Scanner lector = new Scanner(System.in);
		
		System.out.println("Indica una letra y el sistema te dirá su posición.");
		String sLetraABuscar = lector.next();
		
		int posicion = cadena.indexOf(sLetraABuscar);
		
		System.out.println("La letra \"" + sLetraABuscar + "\" se encuentra en la posición: " + posicion);
	}

}
