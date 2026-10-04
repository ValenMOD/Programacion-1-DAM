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
		
		System.out.println("Introduce tu correo electrónico institucional.");
		String correo = lector.next();
		
		
		
		// A. Nombre de usuario: Todo lo que esté antes del símbolo @.
		
			int nombreUsuario = correo.indexOf("@");
			
			String antesArroba = correo.substring(0 , nombreUsuario);
			
			System.out.println("El nombre de usuario es: " + antesArroba);
	
		
		
		// B. Dominio completo: Todo lo que esté después del símbolo @.
			
			String dominioCompleto = correo.substring(nombreUsuario + 1);
			
			System.out.println("El dominio completo del correo es: " + dominioCompleto);
			
			
			
		//C. Validación de extensión: Mostrar true si la dirección termina en .com y false en caso contrario.	
			
			boolean terminaEnCom = false;
			
			if(correo.contains(".com")) {
				terminaEnCom = true;
				System.out.println("Tu correo termina en \".com\". El resultado de la operación es: " + terminaEnCom);
			}
			else {
				System.out.println("Tu correo NO termina en \".com\". El resultado de la operación es: " + terminaEnCom);
			}
			
			
			
		//D. Posición del símbolo @ y del primer punto después del @.
	

			
	}

}
