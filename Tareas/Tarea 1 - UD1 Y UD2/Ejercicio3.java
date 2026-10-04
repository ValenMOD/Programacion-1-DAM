package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//EJERCICIO 3
		
		/*
		 * Crear un programa que pida al usuario una dirección de correo electrónico institucional (por ejemplo: juan.perez@alumnos.universidad.es) 
		 * y muestre la siguiente información:
		 * 
		 * 
		 * A. Nombre de usuario: Todo lo que esté antes del símbolo @.
		 * 
		 * B. Dominio completo: Todo lo que esté después del símbolo @. 
		 * 
		 * C. Validación de extensión: Mostrar true si la dirección termina en .com y false en caso contrario.
		 * 
		 * D. Posición del símbolo @ y del primer punto después del @.
		 */
		
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce tu correo electrónico institucional."); //Le pedimos al usario que introduzca un correo institucional.
		String correo = lector.next(); //En la variable "correo" guardaremos lo que nos escriba el usuario.
		
		
		
		// A. Nombre de usuario: Todo lo que esté antes del símbolo @.
		
			int nombreUsuario = correo.indexOf("@"); //Identificamos en que posición se encuentra el "@".
			
			String antesArroba = correo.substring(0 , nombreUsuario); //Hacemos un String que irá desde el primer caracter introducido por el usuario hasta la posición anterior al "@".
			
			System.out.println("El nombre de usuario es: " + antesArroba);
	
		
		
		// B. Dominio completo: Todo lo que esté después del símbolo @.
			
			String dominioCompleto = correo.substring(nombreUsuario + 1); //Aprovechando la subcadena del ejemplo anterior, le indicamos al programa que todo lo que sea posterior al "@" es el dominio del correo.
			
			System.out.println("El dominio completo del correo es: " + dominioCompleto);
			
			
			
		//C. Validación de extensión: Mostrar true si la dirección termina en .com y false en caso contrario.	
			
			boolean terminaEnCom = false;
			
			if(correo.contains(".com")) { //En caso de que el correo termine en ".com", la variable booleana pasará a ser verdadera ya que se cumple la condición.
				terminaEnCom = true;
				System.out.println("Tu correo termina en \".com\". El resultado de la operación es: " + terminaEnCom);
			}
			else { //En caso de que no se cumpla la condición, la variable mantendrá su estado.
				System.out.println("Tu correo NO termina en \".com\". El resultado de la operación es: " + terminaEnCom);
			}
			
			
			
		//D. Posición del símbolo @ y del primer punto después del @.
	
			int posicionArroba = correo.indexOf("@"); //Detecta en que posición está el "@".
			System.out.println("El \"arroba\" (\"@\") está en la posición: " + posicionArroba);
			
			int posicionPuntoArroba = dominioCompleto.indexOf("."); //Tomando como inicio el "@", contará las posiciones siguientes hasta llegar al primer punto.
			System.out.println("El primer punto después del \"@\" contando después del arroba está en la posición: " + posicionPuntoArroba);
			
			int posicionPunto = posicionArroba + posicionPuntoArroba + 1; //Empieza a contar posiciones desde el inicio del String antes de llegar al primer punto después del "@".
			System.out.println("El primer punto después del \"@\" contando todo el String está en la posición: " + posicionPunto);
	}

}
