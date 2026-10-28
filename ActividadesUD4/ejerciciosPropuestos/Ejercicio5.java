package ejerciciosPropuestos;

public class Ejercicio5 {

	//Programar un método que reciba un String y devuelva el número de palabras de dicho String.

	public static int numeroPalabras(String palabras) {
		return palabras.split(" ").length;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int palabras = numeroPalabras("El método funciona correctamente");
		System.out.println(palabras);
		
		
	}

}
