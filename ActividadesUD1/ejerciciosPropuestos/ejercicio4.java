package ejerciciosPropuestos;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Intercambiar el valor de dos variables. Es decir si una variable x vale 5 y una variable “y” vale 1 ,
		//el programa debe cambiar estos valores ,esto es , x pasa a valer 1 e y pasa a valer 5.

		int x = 5;
		int y = 1;
		
		System.out.println("\"x\" antes valía " + x);
		System.out.println("\"y\" antes valía " + y);

		
		
		int x1 = x; //Creamos las variable "x1" y "y1" como auxiliares, de modo que se le asigna el valor de su variable "original"
		int y1 = y; //y luego ese mismo valor se le asigna a la variable opuesta.
		
		x = y1;
		y = x1;
		
		System.out.println("Ahora, \"x\" vale " + x);
		System.out.println("Ahora, \"y\" vale " + y);
	}

}
