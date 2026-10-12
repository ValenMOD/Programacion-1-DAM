package ejerciciosPropuestos;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realizar un programa que detecte las posiciones de una cadena en las que hay vocales.

		Scanner lector = new Scanner(System.in);
		
		System.out.println("Escribe una oración y el sistema te dirá donde están las vocales.");
		String oracion = lector.nextLine();
		lector.close(); //Solicitamos al usuario que introduzca una oración y la guardamos en la variable "oracion".
		
		
		char [] vocales = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'}; //Creamos un array con las vocales. Nos serivrá para identificarlas en los bucles de más abajo.
		
		int i; //Creamos las variables necesarias en los bucles.
		int j;
		boolean hayVocales = false; //En caso de que el String no tenga vocales, usaremos esta booleana para avisar al usuario de ello.
		
		
		for(i = 0;i < oracion.length();i++) { //Recorremos cada posición del String, es decir, cada letra que compone la oración.
			
			for(j = 0;j < vocales.length;j++) { //Recorremos cada posición del array. Esto significa que el bucle va a ir buscando las vocales tanto en mayúscula como en minúscula.
				
				if(oracion.charAt(i) == vocales[j]) { //En caso de que detecte que el caracter de la oración y una de las letras del array, se cumplirá la condición y cambiará el estado de la booleana a "true" e informará al usuario de la vocal encontrada y en que posición del String está.
					hayVocales = true;
					System.out.println("Se encontró la vocal \'" + vocales[j] + "\' en la posición " + i + " del String.");
				}
			}
		}
		
		if(hayVocales != true) { //En caso de que la booleana nunca haya cambiado su valor (lo cual nos da a entender que nunca se cumplió la condición que está requería) informará al usuario de esto.
			System.out.println("No se han encontrado vocales en tu String.");
		}
		
	}
}
