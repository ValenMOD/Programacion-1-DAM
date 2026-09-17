package ejerciciosPropuestos;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calcular un programa que a partir del precio de un producto le aplique un descuento del 15% y muestre 
		//por pantalla el precio inicial y el precio rebajado.
		
		float precioInicial = 100;
		float descuento = 15; 
		
		System.out.println("El precio inicial es de " + precioInicial);
		System.out.println("Se te aplicó un descuento del " + descuento + "%.");
		
		
		float precioRebajado = precioInicial * (1 - descuento/100);
		
		System.out.printf("Tu producto ahora cuesta %.2f " ,precioRebajado);
		
		
	}

}
