package ejerciciosPropuestos;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realizar un programa que calcule el módulo de un vector
		//donde a , b y c son 3 valores introducidos por el usuario.

		float a; //Creamos las tres variables que corresponden con los numeros de la operación.
		float b;
		float c;
		
		
		Scanner lector = new Scanner(System.in); //Indicamos que queremos que en algún punto de nuestro sistema,
												//el usuario introduzca datos manualmente.
		
		System.out.println("Indica el valor \'a\': ");
		a = lector.nextFloat();//El valor que introduzca el usuario se guardará en la variable "a".
		
		System.out.println("Indica el valor \'b\': ");
		b = lector.nextFloat();//El valor que introduzca el usuario se guardará en la variable "b".
		
		System.out.println("Indica el valor \'c\': ");
		c = lector.nextFloat();//El valor que introduzca el usuario se guardará en la variable "c".
		lector.close();//Es una buena práctica cerrar la lectura por teclado ya que no la vamos a seguir utilizando en este programa.
		
		a*=a;//Elevamos cada número a su raíz cuadrada
		b*=b;
		c*=c;
		
		System.out.println("\'a\' ahora vale " + a);//Mostramos el valor de cada varible para verificar de que hace bien la conversión.
		System.out.println("\'b\' ahora vale " + b);
		System.out.println("\'c\' ahora vale " + c);

		
		float d = a + b + c; //Creamos una cuarta variable donde se sumarán los valores de las tres varibles.
		
		double moduloVector;

		moduloVector = Math.sqrt(d);//Aquí hacemos la raíz cuadrada de la suma de las tres variables. Dando con el módulo del vector.
		System.out.println("El módulo de tu vector es de " + moduloVector);
	}

}
