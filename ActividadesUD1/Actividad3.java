package actividades;

public class Actividad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Actividad 3: Identifica los 5 errores cometidos en el siguiente fragmento de código.
		 * 
		 * 
		 		int n1,n2,resultado;		
				n1 = 5;
				resultado = (n2 - n1 + 9)/5;
					
				float media = 7.5;
					
				final byte ERROR = 150;
					
				char final ='e';
					
				int nota = 4;
					
				System.out.println("La nota es : " , nota);

		 * 
		 * */
		
		
		
		//SOLUCIÓN
		
		/*	int n1,n2,resultado;		
			n1 = 5;
			resultado = (n2 - n1 + 9)/5; <-- 1. La variable n2 no está inicializada.*/
		
				int n1,n2,resultado;		
				n1 = 5;
				n2 = 16; //Aquí podremos incializarla y asignarle un valor.
				resultado = (n2 - n1 + 9)/5;
				
				System.out.println(resultado);
			
			
			//float media = 7.5; <-- 2. Falta el sufijo f luego de asignarle valor a la variable ya que es de tipo "float".
			
				float media = 7.5f;
			
				System.out.println(media);
	
				
			//final byte ERROR = 150; <-- 3. El tipo de variable "byte" no admite ese número ya que excede el 127.
				
				final short ERROR = 150; //Aquí también podríamos usar "int" o "long" pero no tiene mucho sentido asumiendo
										//que la variable no va a cambiar de valor nunca.
				
				System.out.println(ERROR);
				
				
			//char final ='e'; <--  4. "final" es una palabra reservada y no se puede utilizar como nombre de una variable.	
			
				char Final = 'e'; //En este caso, la variable empieza por mayúscula.
				System.out.println(Final);
			
				char final1 = 'e'; //En este otro, la variable empieza por minúscula pero lleva un número al final.
				System.out.println(final1);
			
			
			//int nota = 4; <-- Este está bien.
				
				int nota = 4;
				
				
			//System.out.println("La nota es : " , nota); ← 5. Para que muestre la variable nota hay que agregar un + después del texto.
	
				System.out.println("La nota es : " + nota);
		
	}

}
