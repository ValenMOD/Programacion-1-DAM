package actividades;

public class Actividad5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Actividad 5: Indica el valor que almacenaría la variable x en los siguientes ejemplos de código:


			a.	int x = 0;
				int y = 5;			           
				x = 5 /2;
	
				Valor de x : 
			
	
			b.	int x = 0;
				x-=3;					
				int y = x++;
	
				Valor de x : 
			
	
			c.	int x = 10;
				int y = 5;			
				x = 10 + 2*y/5;
	
				Valor de x : 
	
	
			d.	int y = 5;
				int x = y % 2; 
	
				Valor de x : 
			 	*/
		
		
		
		//SOLUCIÓN
		
		/*	a.	int x = 0;
				int y = 5;			           
				x = 5 /2;

				Valor de x : */
			
			int x = 0;
			int y = 5;			           
			x = 5 /2;
			
			System.out.println("Valor de X en \"a.\": " + x);
			//Valor de "x" : 2. Esto se debe a que el resultado de la operación es un número decimal pero su valor se guarda en un "int".

			
		/*	b.	int x = 0;
				x-=3;					
				int y = x++;

				Valor de x : */
		
			int x2 = 0; //"x" empieza valiendo 0.
			x2-=3; //Esto es lo mismo que escribir: x = x - 3. Por lo que el valor de "x" es -3.					
			int y2 = x2++;//Aquí se le suma 1 al valor de "x" haciendo que pase a valer -2.
			
			System.out.println("Valor de X en \"b.\": " + x2);
			//Valor de "x" : -2.

		/*	c.	int x = 10;
				int y = 5;			
				x = 10 + 2*y/5;

				Valor de x : */

			int x3 = 10;
			int y3 = 5;			
			x3 = 10 + 2*y3/5;

			System.out.println("Valor de X en \"c.\": " + x3);
			//Valor de "x" : 12. Esto se debe a que el producto y el cociente tienen prioridad sobre la suma y la resta.
			//La operación sería: x3 = 10 + 2*5/5 --> x3 = 10 + 10/5 --> x3 = 10 + 2	--> x3 = 12				
			
		/*	d.	int y = 5;
				int x = y % 2; 

				Valor de x : */
			
			int y4 = 5;
			int x4 = y4 % 2; 
			
			System.out.println("Valor de X en \"d.\": " + x4);
			//Valor de "x" : 1. El resto de la operacion da 1.
	}

}
