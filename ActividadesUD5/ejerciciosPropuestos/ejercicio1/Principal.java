package ejercicio1;

		//F. Crear una clase Principal y en ella crear 3 jugadores.

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jugador j1 = new Jugador("I0" , "Iago Aspas");
		Jugador j2 = new Jugador("M0" , "Leo Messi");
		Jugador j3 = new Jugador("C7", "Cristiano Ronaldo");
		
		System.out.println(j1);
		System.out.println(j2);
		System.out.println(j3);
		
		System.out.println();
		
		
		
		//G. Prueba todos los métodos de acceso

		j1.setCodigo("I1");
		System.out.println("El código de j1 es: " + j1.getCodigo());
		
		j2.setNombre("Leonel Messi");
		System.out.println("El nombre de j2 es: " + j2.getNombre());
		
		j3.actualizarPuntos(4);
		System.out.println("Los puntos de j3 son: " + j3.getPuntos());
		j3.actualizarPuntos(3);
		System.out.println("Los puntos de j3 son: " + j3.getPuntos());

		
		j1.setCompeticion("La Liga");
		System.out.println("La competición de j1 es " + j1.getCompeticion());
		
		System.out.println();
		
		
		
		//H. Muestra la información por pantalla utilizando el método toString.

		System.out.println(j1);
		System.out.println(j2);
		System.out.println(j3);
	}

}
