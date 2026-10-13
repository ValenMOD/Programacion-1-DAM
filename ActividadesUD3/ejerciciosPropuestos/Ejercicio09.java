package ejerciciosPropuestos;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realizar un programa que solicite el DNI y compruebe que tiene la sintaxis correcta es decir 8 dígitos y una letra (no es necesario comprobar que la letra es correcta).
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce tu DNI (8 dígitos y una letra).");
		String dni = lector.next(); //Le pedimos al usuario que introduzca su DNI.
		
		
		//Variables a utilizar a lo largo del programa:
		int i = 0;
		int j = 0;
		
		int posicionDigito;
		boolean esDigito;
		boolean esLetra;
		
		boolean dniCorrecto = false;
		
		
		if(dni.length() == 9) { //Antes que nada, comprobamos que la longitud de lo que escriba el usuario coincide con un DNI (8 dígitos + 1 letra).
			for(i = 0;i < 8;i++) { //Creamos un bucle que verifique que desde la posición 0 hasta la 7 hay solo números.
				
				posicionDigito = dni.charAt(i);
				esDigito = Character.isDigit(posicionDigito); //Verificamos que la posición en la que estamos del String, sea un caracter númerico.
				
				if(!esDigito) { //En caso de que detecte que uno de los caracteres no es un número, informará al usuario de ello y finalizará el programa.
					
					System.out.println("Debes introducir 8 dígitos primero.");
					System.exit(1);;
		
					} //Cierre del "if" de los dígitos.
				
				} //Cierrre del bucle "for"
			
			
			esLetra = Character.isLetter(dni.charAt(8)); //Una vez comprobado que hay 8 dígitos primero, el sistema verá si el último caracter es una letra.
			
			if(!esLetra) { //En caso de que no sea una letra, avisará al usuario y pondrá fin al programa.
				
				System.out.println("Debes introducir una letra al final.");
				System.exit(1);
				
				} //Cierre del "if" de la letra.
			
			dniCorrecto = true; //En caso de que esté bien, cambiara de estado la booleana a "true".

			} //Cierre del "if" de comprobación de longitud del DNI.
		else {
			System.out.println("Escribe bien tu DNI. Son 8 dígitos y una letra."); //En caso de que el usuario no introduzca 9 caracteres, el programa no podrá analizar ningún DNI.
			}
		
		
		if(dniCorrecto) { //En caso de que todo esté bien, el sistema avisará al usuario que el DNI está introducido de la forma correcta.
			System.out.println("DNI leído correctamente.");
			}
		
	}

}
