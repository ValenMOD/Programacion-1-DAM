package ejerciciosPropuestos;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Escribir un programa que calcule el área de un triángulo a partir de la base y la altura cuyos valores
		  se introducen por código. La salida del programa debe de ser un mensaje informando del valor del área.*/
		
		
		//Utilizamos la varible de tipo "float" por un tema de precisión en el resultado. Haciendo que nuestro resultado
		//pueda verse en decimal.
		
		float base = 3.8f;
		float altura = 4;
		
		float resultado = (base * altura) / 2;
		System.out.println("El áre de tu triángulo es de: " + resultado + " metros.");
		

	}

}
