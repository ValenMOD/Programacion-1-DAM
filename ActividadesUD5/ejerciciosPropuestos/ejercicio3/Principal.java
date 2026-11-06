package ejercicio3;

//Crear una clase principal en la que se instancian 5 objetos de tipo Municipio. A continuación mostrar por pantalla el DC y el nombre de los 5 municipios creados.

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Municipio m1 = new Municipio("Vigo", "36", "17");
		Municipio m2 = new Municipio("Madrid", "6", "8");
		Municipio m3 = new Municipio("Barcelona", "89", "13");
		Municipio m4 = new Municipio("Sevilla", "3", "7");
		Municipio m5 = new Municipio("Bilbao", "67", "5");

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		
		
		
		//Crear una matriz de municipios
		
		Municipio[] array = new Municipio[10];
		
		array[0] = m1;
		array[1] = m2;
		array[2] = m3;
		array[3] = m4;
		array[4] = m5;
		
	}

}
