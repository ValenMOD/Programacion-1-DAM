package ejerciciosPropuestos;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crear un programa que solicite dos veces el password al usuario y muestre true si contiene los mismos caracteres.

		Scanner lector = new Scanner(System.in);
		
		String contraseña1;
		System.out.println("Introduce tu contraseña.");
		contraseña1 = lector.next();
		
		String contraseña2;
		System.out.println("Introduce tu contraseña otra vez.");
		contraseña2 = lector.next();
		lector.close();
		
		boolean comprobar = contraseña1.equals(contraseña2);
		System.out.println("El resultado de tu contraseña es: " + comprobar);
	}

}
