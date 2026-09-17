package ejerciciosPropuestos;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escribir un programa que nos permita convertir una temperatura en grados Fahrenheit en su equivalente en la escala Celsius.
		
		float fahrenheit = 64.95f;
		System.out.printf("La temperatura en Fahrenheit es de %.2f grados.", fahrenheit); //"%.2f" nos permite limitar los decimales
		//a dos unidades
		System.out.println(); //Hacemos un salto de linea ya que si no, saldriían los dos mensajes en la misma línea.
		
		float celsius = (fahrenheit - 32) * 5 / 9;
		System.out.printf("La temperatura en Celsius es de %.2f grados.", celsius);
		
	}

}
