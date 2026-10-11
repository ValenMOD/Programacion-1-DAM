package ejerciciosPropuestos;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realizar un programa que detecte cuantas palabras de una cadena empiezan por Z o por z.

		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce tu frase y el sistema te dira cuantas palabras empiezan por la letra \"Z/z\"");
		String frase = lector.nextLine(); //Le pedimos al usuario que introduzca una cadena de Strings.
		
		String[] palabras = frase.split(" "); //El método "split" creará una matríz de caracteres a partir del argumento que le pasemos. En este caso el argumento es el espacio (" "). Por lo que cada posición del array será una palabra diferente del String introducido.
		
		
		//Creamos las variables que vamos a utilizar en más adelante.
		int i;
		
		int empiezaConZ = 0; //Aquí llevaremos la contabilidad de las palabras que empiecen con ese caracter.
		
		boolean hayPalabrasConZ = false; //Esta booleana nos ayuda a identificar si hay o no "z/Z" en el String.
		
		
		for(i = 0;i < palabras.length;i++) { //Recorremos el String e indicamos que, por cada posición del array (cada palabra del String), el sistema recuerde el primer caracter.
			char empiezaPor = palabras[i].charAt(0);
			
			
			if(empiezaPor == 'z') { //En caso de que la palabra empiece por "z", entrará en el bucle.
				
				hayPalabrasConZ = true; //Cambiará también el estado a "true" de la booleana en caso de que se cumpla la condición.
				
				empiezaConZ++; //Sumará en uno la variable "empiezaConZ".
				System.out.println("La palabra \"" + palabras[i] + "\" empieza con \'z\'.");
				}
			
			
			if(empiezaPor == 'Z') { //Funciona igual que el condicional anterior solo que aquí analizamos si empieza con "Z" en mayúscula.
				
				hayPalabrasConZ = true;
				
				empiezaConZ++;
				System.out.println("La palabra \"" + palabras[i] + "\" empieza con \'Z\'.");
				}
			
			}
		
		
		if(hayPalabrasConZ) { //Si la booleana es "true" (lo que indica que en algún momento se cumplió alguna de las condiciones) informará al usuario de las palabras que empiezan con "z" o "Z".
			System.out.println("En tu cadena hay " + empiezaConZ + " palabras que empiezan con \'z\' o \'Z\'.");
			}
		else { //En caso de que no se cumpla la condición, el sistema informará de que no hay palabras que empiecen "z" o "Z".
			System.out.println("En tu cadena no hay palabras que empiezan con \'z\' o \'Z\'.");
			}
		
	}

}
