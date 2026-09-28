package ejerciciosPropuestos;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realizar un programa que solicite una dirección de correo e indique a qué dominio pertenece:gmail,outlook,yahoo...
		
		try {
			Scanner lector = new Scanner(System.in);
			
			String correo;
			System.out.println("Introudce tu dirección de correo:");
		
			correo = lector.next();//Le pedimos al usuario que introduzca su correo.
			lector.close();
			
			int dominio = correo.indexOf("@");//Le pedimos al programa que busque donde está el "arroba" para conocer el dominio.
			int finDominio = correo.indexOf(".com");//Le pedimos al programa donde está el ".com" para saber donde termina el dominio.
			
			
			String dominioPerteneciente = correo.substring(dominio + 1, finDominio);//El programa mostrará en pantalla la posición siguiente del "@" para que nos muestre
																				   //el dominio sin el ".com".
	
			
			System.out.println("Tu correo pertenece al dominio de: " + dominioPerteneciente);
		}
		
		catch (Exception e) {
			System.out.println("Error en el sistema. Asegúrate de introducir una dirección de correo válida.");
		}
	}

}