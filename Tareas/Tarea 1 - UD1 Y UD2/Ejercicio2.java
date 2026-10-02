package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//EJERCICIO 2.
		
		
		/*
		 * El VIN o Vehicle Identification Number (Número de Identificación del Vehículo) es el carnet de identidad del coche. Es un código alfanumérico
		 * de 17 caracteres alfanuméricos(no aparecen la I, O, Q ni Ñ), que contiene toda la información sobre las características de un vehículo.
		 * 
		 * 
		 * Los 17 elementos están clasificados en tres partes:
		 * WMI: datos de fabricación.
		 * 1º caracter: continente de fabricación.
		 * 2º caracter: país de fabricación.
		 * 3º caracter: fabricante del vehículo.
		 * 
		 * 
		 * VDS: homologaciones del vehículo.
		 * 4º caracter: modelo de coche.
		 * 5º-8º caracter: tipo de motor.
		 * 9º caracter: tipo de transmisión.
		 * 
		 * 
		 * VIS: número de serie del vehículo e información de fabricación. Son los ocho dígitos restantes que se corresponden con el número de chasis o bastidor.
		 * 10º caracter: año de fabricación.
		 * 11º caracter: planta de producción.
		 * 12º - 17ºcaracter: número de producción del fabricante.
		 * 
		 * 
		 * EJEMPLO:
		 * LJCPCBLCX11000430 ---> LJC(WMI)PCBLCX(VDS)11000430(VIS)
		 */
		
		/*
		 * Crear un programa que, utilizando la clase Scanner, solicite al usuario el número de bastidor (VIN) de un vehículo (debe introducirse
		 * como una única cadena de 17 caracteres en mayúsculas), por ejemplo: 1HGCR2F83HA000123.
		 *
		 *
		 * El programa debe procesar la cadena y mostrar mediante mensajes claros por consola:
		 * 
		 * A. Número de caracteres introducidos.
		 * 
		 * B. Mostrar posición de carácter I, O, Q y Ñ , si no están mostrará el valor -1.
		 * 
		 * C. El WMI , el VDS y el VIS.
		 * 
		 * D. Validación de EEUU: Mostrar true si la cadena comienza por "1", y false si no es así.
		 * 
		 * E. Nº de producción del fabricante.
		 *
		 */
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce el VIN de tu vehículo.");
		
		String vin = lector.next();
		String numerosVin = vin.substring(11 , 17);
		
		
		
		
		System.out.println(numerosVin);
		System.out.println(vin);
		
		while(vin.length() != 17){
			System.out.println("Error. Introduce tu VIN de la forma adecuada");
			vin = lector.next();
		}
		System.out.println("VIN introducido correctamente.");
		
		
		
		// A. Número de caracteres introducidos.
		
			int caracteresIntroducidos = vin.length();
			System.out.println("Tu VIN se compone de " + caracteresIntroducidos + " caracteres.");
		
		
		
		// B. Mostrar posición de carácter I, O, Q y Ñ , si no están mostrará el valor -1.
		
		
			int posicionCaracter = vin.indexOf("I");
			int posicionCaracter1 = vin.indexOf("O");
			int posicionCaracter2 = vin.indexOf("Q");
			int posicionCaracter3 = vin.indexOf("Ñ");
	
			System.out.println("Posición letra \"I\": " + posicionCaracter);
			System.out.println("Posición letra \"O\": " + posicionCaracter1);
			System.out.println("Posición letra \"Q\": " + posicionCaracter2);
			System.out.println("Posición letra \"Ñ\": " + posicionCaracter3);
		
		
		
		// C. El WMI , el VDS y el VIS.
		
			String wmi = vin.substring(0 , 3);
			System.out.println("El WMI de tu vehículo es: " + wmi);
		
			String vds = vin.substring(3 , 9);
			System.out.println("El VDS de tu vehículo es: " + vds);
			
			String vis = vin.substring(9 , 17);
			System.out.println("El VIS de tu vehículo es: " + vis);
			
		
			
		// D. Validación de EEUU: Mostrar true si la cadena comienza por "1", y false si no es así.
			
			boolean esEeuu = false;
			
			if(vin.startsWith("1")){
				esEeuu = true;
				System.out.println("El resultado del calculo es: " + esEeuu + ". Tu vehículo es de Estados Unidos.");
			}
			else {
				System.out.println("El resultado del calculo es: " + esEeuu + ". Tu vehículo NO es de Estados Unidos.");
			}
			
			
			
		// E. Nº de producción del fabricante.
			
			
			
	}

}
