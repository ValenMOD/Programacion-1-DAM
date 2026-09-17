package ejerciciosPropuestos;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escribir un programa que calcule la superficie , el volumen y la longitud de una circunferencia a partir del radio.
		
		float radio = 2.3f;
		System.out.println("El radio de tu circunferencia es de " + radio);
		
		//Pasamos la varible de "PI" a "float" ya que funciona con "double". Esto para que no muestre tantos decimales y ahorrar
		//espacio en memoria.
		float longitud = 2 * (float)Math.PI * radio;
		float volumen = (4f/3) * (float)Math.PI * (radio * radio * radio); //Debemos pasar el "(4/3)" a tipo "float" ya que si lo dejamos
		//dejamos como antes, interpretará que el resultado es un entero.
		float superficie = (float)Math.PI * (radio * radio);
		
		System.out.println("La longitud de tu circunferencia es de " + longitud);
		System.out.println("El volumen de tu circunferencia es de " + volumen);
		System.out.print("La superficie de tu circunferencia es de " + superficie);

	}

}
