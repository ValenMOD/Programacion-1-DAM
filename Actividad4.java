package actividades;

public class Actividad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Actividad 4. Indica que tipo de valor devuelven las siguientes expresiones:

			a)	int x = 5;
				long y = 33;
				x * y ??
			
			
			b)	double x = 39.21;
				float y = 2.1;
				x + y ??
			
			
			c)	short x = 10;
				short y = 3;
				x / y ?? */


		
		//SOLUCIÓN
		
		/*	a)	int x = 5;
				long y = 33;
				x * y ??*/
		
			int x = 5;
			long y = 33;
			
			long resultado1 = x * y;
			System.out.println("Solución \"a)\" " + resultado1);
			
			
		/*	b)	double x1 = 39.21;
				float y1 = 2.1;
				x1 + y1 ??*/
			
			double x1 = 39.21;
			float y1 = 2.1f; //OJO! Hay que poner una "f" al final del valor de esta variable ya que es un "float".
			
			double resultado2 = x1 + y1; //En este caso, cambié el nombre de las variables porque ya estaban declaradas en el ejemplo anterior.
			System.out.println("Solución \"b)\" " + resultado2);
			
			
		/*	c)	short x = 10;
				short y = 3;
				x / y ?? */
			
			short x2 = 10;
			short y2 = 3;
			
			float resultado3 = (float)x2 / y2; //El resultado de la operación de las varibles "x2" y "y2" da un número decimal
											  //por lo que la varibale que muestre el resultado debe ser de tipo "float"
											  //al mismo tiempo que una de las variables ("x2" o "y2") debe covertirse en decimal
											  //para que muestre el resultado exacto.
			System.out.println("Solución \"c)\" " + resultado3);
	}

}
