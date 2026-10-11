package ejerciciosPropuestos;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realizar un programa que resuelva una ecuación de segundo grado.

		float a; //Creamos las variables donde se van a guardar los números y los valores de "x".
		float b;
		float c;
		
		float x1;
		float x2;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce el valor de \"a\":");
		a = lector.nextInt();
		
		System.out.println("Introduce el valor de \"b\":");
		b = lector.nextInt();
		
		System.out.println("Introduce el valor de \"c\":");
		c = lector.nextInt();
		
		
		//En las ecuaciones de segundo grado, el método para encontrar "x" cambia según los datos que tenemos.
		//Analizamos los siguientes casos:
		
		
		//En estos casos, por diversos motivos no se puede realizar el cálculo de la operación:
		
		if(a == 0 && b == 0 && c == 0) { //En caso de que, las variables "a", "b" y "c" valgan 0, el programa le dirá al usuario de esto y finalizará en el momento.
			System.out.println("Infinitas soluciones.");
			System.exit(0);
		}
		
		if(a == 0 && b == 0) { //En caso de que "a" y "b" sean 0, el programa informará al usuario de que no hay solución independientemente de lo que valga "c".
			System.out.println("La ecuación no tiene solución.");
			System.exit(0); //"System.exit(0)" nos permite finalizar el programa si la condición se cumple.
		}
		
		if(c == 0 && (b == 0 || a == 0)) { //En caso de que "c" valga 0 y "a" O "b" valga 0, el valor de "x" será de 0.
			System.out.println("X vale 0.");
			System.exit(0);
		}
		
		
		//En caso de que ninguna de estas condiciones se cumplan, tenemos los siguientes casos:
		
		if(a == 0) { //Si sabemos que "a" es 0, solo tenemos una solución.
			x1 = - (c / b);
			System.out.println("El valor de \"x\" es: " + x1);
		}
		
		if(b == 0) { //Si "b" vale 0, tendremos dos soluciones; una negativa y otra positiva.
			x1 = (float) + Math.sqrt(-c / a); //"Math.sqrt" nos perimte sacar la raíz de los valores que le demos como argumentos.
			x2 = (float) - Math.sqrt(-c / a);

			if((-c / a) < 0) { //En caso de que, al calcular la raíz nos de un número negativo, sabemos que la ecuación no tiene solución.
				System.out.println("La operación no tiene solución ya que la raíz es negativa.");
			}
			else {
				System.out.println("El valor de \"x1\" es: " + x1);
				System.out.println("El valor de \"x2\" es: " + x2);

			}
		}
		
		if(c == 0) { //Si "c" es 0, sabemos que una de las soluciones es 0.
			x1 = 0;
			x2 = - (b / a);
			System.out.println("El valor de \"x1\" es: " + x1);
			System.out.println("El valor de \"x2\" es: " + x2);
		}
		
		if(a != 0 && b != 0 && c != 0) { //En caso de que ninguna de las variables sea "0", haremos la fórmula de toda la vida.
			
			x1 = (float) (-b + (Math.sqrt((b*b) - (4 * a * c)))) / 2 * a;
			x2 = (float) (-b - (Math.sqrt((b*b) - (4 * a * c)))) / 2 * a;
			
			if((b * b) - (4 * a * c) < 0) {
				System.out.println("La operación no tiene solución ya que la raíz es negativa.");
			}
			else {
				System.out.println("El valor de \"x1\" es: " + x1);
				System.out.println("El valor de \"x2\" es: " + x2);
			}
			
		}
		
		
	}

}
