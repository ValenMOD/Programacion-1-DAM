package ejerciciosPropuestos;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa que calcula la letra del DNI según las siguientes instrucciones:
		//a. Tomamos el número completo de hasta 8 cifras de nuestro DNI, lo dividimos entre 23 y nos quedamos con el resto de dicha división.
		//b. El resultado anterior es un número entre 0 y 22. A cada uno de estos posibles números le corresponde una letra

		
		char letra[] = {'T' , 'R' , 'W' , 'A' , 'G' , 'M' , 'Y' , 'F' , 'P' , 'D' , 'X' , 'B' , 'N' , 'J' , 'Z' , 'S' , 'Q' , 'V' , 'H' , 'L' , 'C' , 'K' , 'E'};
		
		int dni;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce tu DNI sin la letra.");
		dni = lector.nextInt();
		lector.close();
		
		int restoDni = (char) (dni%23);
		char letraDni = letra[restoDni];
		System.out.println("A tu DNI le corresponde la letra: " + letraDni);
		
	}

}
