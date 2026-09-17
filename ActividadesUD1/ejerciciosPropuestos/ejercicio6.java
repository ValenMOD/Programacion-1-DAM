package ejerciciosPropuestos;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escribir  un programa que permita calcular la media de 5 variables.

		byte variable1 = 99;
		short variable2 = 25;
		int variable3 = 7;
		float variable4 = 45.78f;
		double variable5 = 8.2;
		
		float media = (float)(variable1 + variable2 + variable3 + variable4 + variable5); //Pasamos el resultado de la operación a tipo "float" para que la variable "media" lo pueda procesar.
		System.out.println("La media de los números " + variable1 + ", " + variable2 + ", " + variable3 + ", " + variable4 + " y " + variable5 + " es: " + media);
		
	}

}