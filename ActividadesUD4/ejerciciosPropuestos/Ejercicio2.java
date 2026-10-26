package ejerciciosPropuestos;

public class Ejercicio2 {

	
	//Programar un método que devuelva el valor más alto de los que recibe como argumentos (una cantidad variable de argumentos).
	//Sobrecargar el método para que trabaje con enteros y con double.

	
	public static int valorMasAlto (int ...n) {
		int numMasAlto = n[0];
		
		for(int i = 0; i < n.length;i++) {
			if(n[i] > numMasAlto) {
				numMasAlto = n[i];
			}
		}
		return numMasAlto;
	}
	
	
	public static double valorMasAlto (double ...n) {
		double numMasAlto = n[0];
		
		for(int i = 0; i < n.length;i++) {
			if(n[i] > numMasAlto) {
				numMasAlto = n[i];
			}
		}
		return numMasAlto;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Método utilizado con valores de tipo "int":
		int mayorValor = valorMasAlto(4 , 8 , 5 , 0 , 3);
		System.out.println("El valor más alto de tipo \"int\" es: " + mayorValor);
		
		
		//Método utilizado con valores de tipo "double":
		double valorMayor = valorMasAlto(7.55 , 5.19 , 2.8 , 6 , 9.56);
		System.out.println("El valor más alto de tipo \"double\" es: " + valorMayor);
	}

}
