package valentín;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*EJERCICIO 1
		
		 *Ejercicio 1: Gestor y Validador Avanzado de Claves de Acceso
		 *Crear un programa que trabaje con un array unidimensional de tipo String con capacidad fija para 15 credenciales/claves. Al arrancar el programa, se deben inicializar por código 4 claves en las primeras posiciones. El programa ofrecerá un menú interactivo con las siguientes opciones:
		 *
		 *
		 *
		 * A. Insertar nueva clave válida: Busca la primera posición libre (null). Antes de insertarla, el usuario introduce la clave y el algoritmo debe validar obligatoriamente que cumpla todas las siguientes condiciones (sin usar expresiones regulares complejas, usando métodos de String y bucles):
		 * 		- Longitud mínima de 8 caracteres y máxima de 16.
		 * 		- Debe contener al menos una letra mayúscula y una letra minúscula.
		 * 		- Debe contener al menos un dígito numérico.
		 * 		- Debe contener al menos un carácter especial del conjunto: @, #, $, %, &.
		 *		- No puede contener espacios en blanco.
		 *
		 * En caso de que no la cumpla deberá avisar al usuario y solicitar que vuelva a introducir la clave. Después de 3 intentos sale y vuelve a mostrar el menú principal.
		 * En caso de que el array esté lleno también debe informar que ya no se pueden almacenar más claves.
		 *
		 *
		 *
		 * B. Búsqueda y Máscara de Seguridad: El usuario introduce una palabra o clave. El programa debe buscar en la matriz si existe dicha clave (o si coincide de forma insensible a mayúsculas/minúsculas).
		 * 	  Si la encuentra, debe mostrar en qué índice está e imprimir por pantalla la clave cifrada/oculta (reemplazando por asteriscos * todos los caracteres excepto el primero y el último).
		 *
		 *
		 *
		 * C. Análisis de Fortaleza Global: El programa recorre todas las claves almacenadas y calcula un "Índice de Fortaleza Promedio".
		 *		- Por cada clave, asigna puntos: +1 por cada dígito, +2 por cada carácter especial, +1 si tiene más de 10 caracteres.
		 *		- Muestra por pantalla la clave más fuerte (la de mayor puntuación), la posición en la que está y el porcentaje de claves que superan una puntuación de 5 puntos respecto al total de claves almacenadas.
		 */
		
		
		StringBuilder claves[] = new StringBuilder[15];
				
		int i = 0;
		
		for(i = 0; i < claves.length;i++) {
			
			claves[i] = new StringBuilder();
			
			}
		
		
		Scanner lector = new Scanner(System.in);
		
		Random random = new Random();
		
		char minuscula[] = {'a' , 'b' , 'c' , 'd' , 'e' , 'f' , 'g' , 'h' , 'i' , 'j' , 'k' , 'l' , 'm' , 'n' , 'o' , 'p' , 'q' , 'r' , 's' , 't' , 'u' , 'v' , 'w' , 'x' , 'y' , 'z'};
		char mayuscula[] = {'A' , 'B' , 'C' , 'D', 'E' , 'F' , 'G' , 'H' , 'I' , 'J' , 'K' , 'L', 'M' , 'N' , 'O' , 'P', 'Q' , 'R' , 'S' , 'T', 'U' , 'V' , 'W' , 'X', 'Y' , 'Z'};
		char numeros[] = {'0' , '1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9'};
		char caracterEspecial[] = {'@' , '#' , '$' , '%' , '&'};
		
		
		
		int j = 0;
		
		boolean tieneMin = false;
		boolean tieneMay = false;
		boolean tieneNum = false;
		boolean tieneCar = false;
		
		for(i = 0; i < 4;i++) {
			
			do {
				
				tieneMin = false;
				tieneMay = false;
				tieneNum = false;
				tieneCar = false;
				
				for(j = 0;j <= 16;j++) {
				
					int aleatorio = random.nextInt(1 , 6);
					
					
					if(aleatorio == 1) {
						
						int aleatorioMin = random.nextInt(0 , minuscula.length);
						
						claves[i].append(minuscula[aleatorioMin]);
						tieneMin = true;
						
						} //Cierre del "if" que asigna minusculas.
					
					
					if(aleatorio == 2) {
						
						int aleatorioMay = random.nextInt(0 , mayuscula.length);
						
						claves[i].append(mayuscula[aleatorioMay]);
						tieneMay = true;
	
						} //Cierre del "if" que asigna mayusculas.
					
					
					if(aleatorio == 3) {
	
						int aleatorioNum = random.nextInt(0 , numeros.length);
	
						claves[i].append(numeros[aleatorioNum]);
						tieneNum = true;
	
						} //Cierre del "if" que asinga números.
					
					
					if(aleatorio == 4) {
						
						int aleatorioCar = random.nextInt(0 , caracterEspecial.length);
						
						claves[i].append(caracterEspecial[aleatorioCar]);
						tieneCar = true;
	
						} //Cierre del "if" que asigna caracteres especiales.
					
					
					if(aleatorio == 5) {
						
						if(claves[i].length() >= 8 || 16 <= claves[i].length()) {	
							if(tieneMin && tieneMay && tieneNum && tieneCar) {
								break;
								}
							} //Cierre del "if" que verifica la cantidad de caracteres.
						
						} //Cierre del "if" si "aleatorio" da 5.
					
					
					} //Cierre bucle "for" que asigna caracteres.
			
				System.out.println(tieneMin);
				System.out.println(tieneMay);
				System.out.println(tieneNum);
				System.out.println(tieneCar);
				
			} //Cierre del "do" que asegura que las contraseñas tengan al menos, un caracter de cada categoria.
			while(tieneMin = true && tieneMay = true && tieneNum = true && tieneCar = true);
		
			
			System.out.println("La clave de la posición " + i + " es: " + claves[i]); //Imprimir clave.
			
			
			} //Cierre bucle "for" para cada contraseña
		
		
		/* A. Insertar nueva clave válida: Busca la primera posición libre (null). Antes de insertarla, el usuario introduce la clave y el algoritmo debe validar obligatoriamente que cumpla todas las siguientes condiciones (sin usar expresiones regulares complejas, usando métodos de String y bucles):
		 * 		- Longitud mínima de 8 caracteres y máxima de 16.
		 * 		- Debe contener al menos una letra mayúscula y una letra minúscula.
		 * 		- Debe contener al menos un dígito numérico.
		 * 		- Debe contener al menos un carácter especial del conjunto: @, #, $, %, &.
		 *		- No puede contener espacios en blanco.
		 */
		
		
		
			

	}
}
