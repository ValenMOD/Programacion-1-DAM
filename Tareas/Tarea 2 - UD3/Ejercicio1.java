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
		
		
		StringBuilder claves[] = new StringBuilder[15]; //Creamos el array con los 15 Strings y los inicializamos de modo que podamos trabajar con ellos.		
		
		int i = 0;
		
		for(i = 0; i < 4;i++) {
			
			claves[i] = new StringBuilder();
			
			}
		
		
		//Creamos los arrays que contienen los caracteres necesarios para hacer la clave. Creamos tambien las variables que nos van a servir a generar las credenciales.
		
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
		
		boolean longitud = false;
		boolean caracteres = false;
		
		
		for(i = 0; i < 4;i++) { //Entramos en este bucle cada vez que queramos crear una nueva clave teniendo como limite la cuarta clave generada de forma automática.
			
			
			
			do { //Mientras alguna de las condiciones no se cumplan (que tenga entre 8 y 16 carcteres y que contenga al menos una minúscula/mayúscula/número/caracter especial), el bucle se ejecutará una y otra vez hasta que la contraseña sea adecuada a lo que se pide.
				
				tieneMin = false;
				tieneMay = false;
				tieneNum = false;
				tieneCar = false;
				
				longitud = false;
				caracteres = false;
				
				claves[i].delete(0, 17); //Para evitar que la contraseña se sobrecargue y exceda el límite de caracteres, cuando entre en el bucle, se borrará lo que contenga dentro (en este caso no contiene nada).
				
				for(j = 0;j < 16;j++) { //Nos aseguramos de que el bucle asignará como máximo 16 caracteres.
					
					//Una vez definida la posición del array, inicializadas las booleanas y asegurandonos de que la contraseña no contiene nada, entraremos en este bucle que va a ir posición por posición asignando un caracter.
					
				
					if(claves[i].length() < 16) { //En caso de que la clave tenga menos de 16 caracteres, le podremos asignar un nuevo carcter.
					
						
						int aleatorio = random.nextInt(1 , 6);
						//Se va a seleccionar un número aleatorio entre 1 y 5 y se guardará en la variable "aleatorio". Según lo que guarde esa variable el programa hará una cosa o la otra. Las opciones son:
						
						
						if(aleatorio == 1) { //En caso de que "aleatorio" sea 1, irá a la matríz de letras minúsculas y de forma aleatoria va a elegir un número. El caracter que esté en la posición de ese número elegido se le asignará a la posición correspondiente de la clave.
							
							//Por ejemplo: si aleatorio vale 6, el programa se va a dirigir a la posición 6 del array de letras minúsculas. En este caso, la posición 6 coincide con el caracter 'g' por lo que 'g' se sumará como un valor de la clave en la posición que le corresponda en ese momento.
							
							
							int aleatorioMin = random.nextInt(0 , minuscula.length); 
							
								claves[i].append(minuscula[aleatorioMin]);
								tieneMin = true; //Una vez que se agrega el caracter a la clave, cambiamos el estado de la booleana a "true" ya que, independientemente de que luego se sumen nuevas minúsculas a la clave, sabemos que por lo menos hay una.
							
							} //Cierre del "if" que asigna minusculas.
						
						
						//Hacemos lo mismo con las mayúsculas, números y caracteres especiales:
						
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
						
						
						//En caso de que "aleatorio" valga 5 la cosa cambia ya que se puede dar que no todas las credenciales sean de 16 caracteres si cumplen con lo necesario.
						//En esta situación el programa va a entrar a ver las conidicones descritas más abajo:
						
						if(aleatorio == 5) {
							
							//En caso de que la clave tenga entre 8 y 16 caracteres, sabemos que cumple con la regla de la longitud de la misma, por lo que la booleana de "longitud" pasa a ser "true".
							if(claves[i].length() >= 8 && 16 >= claves[i].length()) {	
								
								longitud = true;
								
								//En caso de que esto se cumpla, el programa verá si contiene al menos un caracter de cada tipo. En caso de que si, su booleana pasará a "true" y saldrá del programa.
								if(tieneMin && tieneMay && tieneNum && tieneCar) {
									
									caracteres = true;
									break;
									} //Cierre del "if" que evalúa que la credencial contenga todos los tipos de caracteres.
								} //Cierre del "if" que verifica el intervalo de la cantidad de caracteres.
							
							} //Cierre del "if" si "aleatorio" da 5.
						
						}//Cierre del "if" que evalúa que hayan 16 caracteres o menos.
					
					
					//En caso de que "aleatorio" nunca valga 5, se comprobarán las condiciones para que la clave de 16 caracteres sea válida.
					if(claves[i].length() >= 8 && 16 >= claves[i].length()) {
						longitud = true;
						
						
						if(tieneMin && tieneMay && tieneNum && tieneCar) {
							caracteres = true;
							break;
							}
						}
					
					} //Cierre bucle "for" que asigna caracteres.
			
				
				
				} //Cierre del "do" que asegura que las contraseñas tengan al menos, un caracter de cada categoria.
			while(!longitud || !caracteres);
		
			
			System.out.println("La clave de la posición " + i + " es: " + claves[i]); //Imprimir clave.
			
			} //Cierre bucle "for" para cada contraseña.
		
		

		
		/* A. Insertar nueva clave válida: Busca la primera posición libre (null). Antes de insertarla, el usuario introduce la clave y el algoritmo debe validar obligatoriamente que cumpla todas las siguientes condiciones (sin usar expresiones regulares complejas, usando métodos de String y bucles):
		 * 		- Longitud mínima de 8 caracteres y máxima de 16.
		 * 		- Debe contener al menos una letra mayúscula y una letra minúscula.
		 * 		- Debe contener al menos un dígito numérico.
		 * 		- Debe contener al menos un carácter especial del conjunto: @, #, $, %, &.
		 *		- No puede contener espacios en blanco.
		 *
		 *		En caso de que no la cumpla deberá avisar al usuario y solicitar que vuelva a introducir la clave. Después de 3 intentos sale y vuelve a mostrar el menú principal.
		 * 		En caso de que el array esté lleno también debe informar que ya no se pueden almacenar más claves.
		 */
		
		Scanner lector = new Scanner(System.in);
		
		int intentos = 3;
		
		boolean claveEncontrada = false;
		
		boolean claveCorrecta = false;
		do {
			
			System.out.println();
			System.out.println("Seleccione una opción:");
			System.out.println("1. Insertar nueva clave/credencial.");
			System.out.println("2. Mostrar clave/credencial de forma segura.");
			System.out.println("3. Calcular Índice de Fortaleza Promedio.");
			
			int aux = 0;
			
			tieneMin = false;
			tieneMay = false;
			tieneNum = false;
			tieneCar = false;
			
			longitud = false;
			caracteres = false;
			
			
			boolean sitioArray = false;
			
			int opcion = lector.nextInt();

			switch(opcion) {
			
				case 1: //Insertar nueva clave/credencial.
					
					intentos = 3;
					
					while(intentos > 0 && (!longitud || !caracteres)) {						
						
						
						for(i = 0;i < claves.length;i++) {
							
							if(claves[i] == null) {
								
								sitioArray = true;
								aux = i;
								break;
								}
							}
						if(!sitioArray) {
							System.out.println("Memoria llena. No se puede guardar una nueva credencial.");
							break;
							}
						
						
						System.out.println("CUIDADO! Tu clave debe tener una minúscula, una mayúscula, un número y un caracter especial. No puede contener espacios.");
						System.out.print("Introduce tu nueva clave/credencial:");
						
						String clave = lector.next();

						tieneMin = false;
						tieneMay = false;
						tieneNum = false;
						tieneCar = false;
						
						longitud = false;
						caracteres = false;
						
						if(clave.length() >= 8 && 16 >= clave.length()) {
							
							longitud = true;
							System.out.println("Tu clave cumple con la longitud requerida.");
							
							for(i = 0;i < clave.length();i++) {
								
								
								for(j = 0;j < minuscula.length;j++) {
									
									if(clave.charAt(i) == minuscula[j]) {
										
										tieneMin = true;
										
										} //Cierre del "if" que evalúa que la clave contenga al menos una minúscula.
									
									} //Cierre del bucle que recorre el array de las minúsculas.
								
									
								
								
								for(j = 0;j < mayuscula.length;j++) {
									
									if(clave.charAt(i) == mayuscula[j]) {
										
										tieneMay = true;
										
										} //Cierre del "if" que evalúa que la clave contenga al menos una mayúscula.
									
									} //Cierre del bucle que recorre el array de las mayúsculas.
								
								
								
								for(j = 0;j < numeros.length;j++) {
									
									if(clave.charAt(i) == numeros[j]) {
										
										tieneNum = true;
										
										} //Cierre del "if" que evalúa que la clave contenga al menos una mayúscula.
									
									} //Cierre del bucle que recorre el array de las mayúsculas.
								
								
								
								for(j = 0;j < caracterEspecial.length;j++) {
									
									if(clave.charAt(i) == caracterEspecial[j]) {
										
										tieneCar = true;
										
										} //Cierre del "if" que evalúa que la clave contenga al menos una mayúscula.
									
									} //Cierre del bucle que recorre el array de las mayúsculas.
								
								
								
								} //Cierre del bucle que recorre caracter por caracter de la credencial.
							
							
							
							} //Cierre del "if" que evalúa que se cumpla la norma de longitud de la clave.
						else {
							System.out.println("Tu clave/credencial debe tener entre 8 y 16 caracteres.");
							intentos--;
							System.out.println("Te quedan " + intentos + " intentos.");
							} //Cierre del "else" en caso de que la clave no contenga entre 8 y 16 caracteres.
						
						
						if(longitud) {
							if(tieneMin && tieneMay && tieneNum && tieneCar) {
								caracteres = true;
								System.out.println("Tu clave cumple con los caracteres requeridos.");
								}
							else {
								System.out.println("Tu clave debe contener al menos una minúscula, una mayúscula, un número y un caracter especial (@, #, $, %, &).");
								intentos--;
								System.out.println("Te quedan " + intentos + " intentos.");
								}
							}
						
						
						if(longitud && caracteres) {
							
							claveCorrecta = true;
							StringBuilder claveSB = new StringBuilder(clave);
							claves[aux] = claveSB;
							System.out.println("Tu clave/credencial se guardó correctamente en la posición " + aux);
							}
						
						
						} //Cierre del bucle "while" que administra los intentos.
				break;
					
					
					
				case 2: //Mostrar clave/credencial de forma segura.
					
					
		// B. Búsqueda y Máscara de Seguridad: El usuario introduce una palabra o clave. El programa debe buscar en la matriz si existe dicha clave (o si coincide de forma insensible a mayúsculas/minúsculas).
		// 	  Si la encuentra, debe mostrar en qué índice está e imprimir por pantalla la clave cifrada/oculta (reemplazando por asteriscos * todos los caracteres excepto el primero y el último).
					
					
					System.out.println("Inserte la clave/credencial que desea ver.");
					String claveABuscar = lector.next();
					
					aux = 0;
					
					for(i = 0; i < claves.length;i++) { //El bulce recorre todas las posiciones del array para ver cuales están vacías y cuales no.
						
						if(claves[i] != null) { //Guardará las posiciones no vacías. La última posición no vacía se guardará en "aux".
							
							aux = i;
							}
						
						}
					
					for(i = 0;i <= aux;i++) { //El bucle recorrerá solo los indicés que no estén vacíos
						
						String original = claves[i].toString(); //Convertimos en un String a cada una de las claves para poder comparar si los Strings coinciden.
												
						if(claveABuscar.equalsIgnoreCase(original)) { //Se evaluará una condición donde si lo que escribimos coincide con una clave del array (siendo insensible a mayúsculas/minúsculas), esta se mostrará de forma segura, reemplazando todo el contenido por asteriscos (*) menos el primer y el último caracter.
							
							claveEncontrada = true; //En caso de que se encuentre la clave, la booleana cambiará su estado.
							
							System.out.println("Clave encontrada en la posición " + i + " de " + aux);
							StringBuilder sbClaveABuscar = new StringBuilder(claveABuscar); //Necesitamos pasar la variable a StringBuilder para hacer uso del método ".replace".
							
							char ultimoCaracter = sbClaveABuscar.charAt(sbClaveABuscar.length() - 1); //Guardamos el último caracter de la clave original.
							int tamanho = sbClaveABuscar.length() - 1; //Guardamos tambien su posición original.
							
							
							for(j = 1;j < sbClaveABuscar.length();j++) { //El bucle irá reemplazando los caracteres de la clave desde la segunda posición hasta la última (ambas incluidas).
								
								sbClaveABuscar.replace(j, j+1, "*");
								
								}
							
							sbClaveABuscar.append(ultimoCaracter); //Una vez reemplazados todos los caracteres, agregamos el último caracter que habíamos guardado antes de entrar en el bucle.
							sbClaveABuscar.deleteCharAt(tamanho); //Borramos el último caracter cifrado (que al final es el mismo que vamos a mostrar en la última posición).
							
							System.out.println("Tu clave mostrada de forma segura es: " + sbClaveABuscar);
							
							} //Cierre del bucle que evalúa que coincidan la clave con lo que introduce el usuario.
						
						
				
						} //Cierre del bucle que recorre los índices no vacíos.
						
					if(!claveEncontrada) { //En caso de que la clave no esté registrada previamente en el sistema, se informará al usuario.
						System.out.println("No tenemos ningún registro de esa clave/credencial.");
						}
					break;
					
				case 3: //Calcular Índice de Fortaleza Promedio.
		
					
	   /* C. Análisis de Fortaleza Global: El programa recorre todas las claves almacenadas y calcula un "Índice de Fortaleza Promedio".
		*		- Por cada clave, asigna puntos: +1 por cada dígito, +2 por cada carácter especial, +1 si tiene más de 10 caracteres.
		*		- Muestra por pantalla la clave más fuerte (la de mayor puntuación), la posición en la que está y el porcentaje de claves que superan una puntuación de 5 puntos respecto al total de claves almacenadas.		
		*/			
					
					for(i = 0; i < claves.length;i++) { //El bucle irá viendo si las posiciones del array no están vacías. "aux" tomará como valor la última posición no vacía.
						
						if(claves[i] != null) {
							
							aux = i;
							}
						
						}
					
					int k;
					
					StringBuilder claveMasFuerte = new StringBuilder(); //Clave con mayor puntuación en el índice.
					int indiceMasFuerte = 0; //Puntos de la clave más fuerte.
					int posicionMasFuerte = 0; //Posición de la clave más fuerte.
					
					int clavesMayoresACinco = 0; //Número de claves cuyos puntos en el índice son superiores a 5.
					
					for(i = 0; i <= aux;i++) { //El bucle recorrerá todas las posiciones donde hay una clave almacenada.
						
						int indiceFortaleza = 0;
						
						
						for(j = 0; j < claves[i].length();j++) { //Dentro de cada clave, recorrerá cada caracter.
							
							char posicion = claves[i].charAt(j);
							
							
							for(k = 0; k < numeros.length;k++) { //Se sumará un punto por cada número que contenga la clave.
								
								if(posicion == numeros[k]) {
									
									indiceFortaleza++;
									
									}
								}
								
							for(k = 0; k < caracterEspecial.length;k++) { //En caso de que contenga caracteres especiales, se sumarán dos puntos por cada uno que tenga.
								
								if(posicion == caracterEspecial[k]) {
									
									indiceFortaleza = indiceFortaleza + 2;
									
									}
								
								}
							
							
							} //Bucle que recorre cada caracter de cada clave almacenada.
						
						if(claves[i].length() > 10) { //Si la clave contiene más de 10 caracteres, se sumará un punto adicional.
							indiceFortaleza++;
							}
						
						System.out.println("En la posición " + i + ", el Índice de Fortaleza de la clave: " + claves[i] + " es de: " + indiceFortaleza);
						

						
						if(indiceMasFuerte < indiceFortaleza) { //En cada paso del bucle, se evaluará la condición de que si el índice de fortaleza en ese momento es mayor a la variable "indiceMasFuerte" (inicializada en "0".), esta tomará su valor. De igual modo con las variables "claveMasFuerte" y "posicionMasFuerte".
							
							claveMasFuerte = claves[i];
							indiceMasFuerte = indiceFortaleza;
							posicionMasFuerte = i;
							
							}
						
						if(indiceFortaleza > 5) { //En caso de que el índice actual sea mayor que 5, la variable clavesMayoresACinco pasará a valer su valor anterior más uno.
							
							clavesMayoresACinco++;
							
							}
						
						} //Bucle que recorre cada clave almacenada.
					
					System.out.println("La clave más fuerte es: \"" + claveMasFuerte + "\" con un índice de fortaleza de \'" + indiceMasFuerte + "\' y que se encuentra en la posición: " + posicionMasFuerte);
					
					aux++; //Aumentamos en uno la variable auxiliar ya que el valor que contenía antes eran las posiciones no vacías (con 4 posiciones NO VACÍAS, su valor era de 3 ya que empezaba a contar desde 0). Cambiamos esto para poder hacer el cálculo de cuantas posiciones superan los 5 puntos del índice respecto a las posiciones almacenadas.
					
					float porcentaje = (clavesMayoresACinco / (float)aux) * 100;
					
					System.out.println("El porcentaje de claves que superan una puntuación de 5 puntos respecto al total de claves almacenadas es de: " + porcentaje + "%.");
					break;
					
					} //Cierre del "switch"
			
			} //Cierre del "do" que muestra las opciones.
		while(intentos == 0 || claveCorrecta || !claveEncontrada);
	
			
	}
	
}
