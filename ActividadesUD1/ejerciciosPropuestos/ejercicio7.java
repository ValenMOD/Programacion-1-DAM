package ejerciciosPropuestos;

public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Escribir un programa que defina una constante llamada IMPUESTOREVAL, la inicialize a 3.4. y permita calcular el importe
		  de la venta de un piso a partir de la siguiente fórmula:
		
			precioVenta = importe + CI + (IMPUESTOREVAL *Antiguedad/100)*precioCatastral
			
		  Donde:
			- CI : Es la comisión de la inmobiliaria que es de un 3% sobre el importe de la venta.
			- Antiguedad: Años que pasaron desde la compra del piso.
			- precioCatastral: Es el valor catastral del inmueble.*/

		
		final float IMPUESTOREVAL = 3.4f;

		int importe = 250_000;
		float ci = 3;
		float importeCi = importe + (importe * ci / 100f);
		int antiguedad = 30;
		int precioCatastral = 200_000;
		
		float precioVenta = importeCi + (IMPUESTOREVAL * antiguedad/100) * precioCatastral;
		System.out.println("El precio final del inmueble es de: " + precioVenta);
		
	}

}