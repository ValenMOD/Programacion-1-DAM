package actividades;

import java.util.Arrays;

public class Actividad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Actividad 2. Indica lo que veríamos por pantalla en los siguientes casos.
		int m[] = new int[4];
		     int n[] = {0,9,2,-1};
		System.out.println(m[0]);
		System.out.println(n[5]);
		System.out.println(m.length);
		System.out.println(Arrays.equals(n,m));*/
		
		
		//SOLUCIÓN
		
		int m[] = new int[4];
	    int n[] = {0,9,2,-1};
	    
	    
	    System.out.println(m[0]); //Da como resultado 0 ya que no está definida esa posición del array.
	    
	    //System.out.println(n[5]); //Nos va a dar una excepción ya que no existe esa posición en el array
	    
		System.out.println(m.length); //Indica el tamaño del array
		
		System.out.println(Arrays.equals(n,m)); //El array "m" tienes sus posiciones inicializadas a "0" ya que no se le asignó
											   //ningún valor. El array "n" tiene asignadas sus posiciones por lo que nos devuelve
											   //un mensaje de tipo "false".
		
		
	}

}
