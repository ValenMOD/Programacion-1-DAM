package ejercicio2;

import java.util.Scanner;

/* Crea una clase que permita almacenar la información de los estadios en los que se celebrará una competición deportiva. De cada estadio se precisa saber:
 * Nombre
 * Capacidad
 * Ciudad
 */

public class Estadio {

	private String nombre = "stadium";
	private int capacidad = 0;
	private String ciudad = "ciudad";
	
	
	
	//A. Añade un constructor que permita instanciar un objeto Estadio con nombre, capacidad y ciudad.

	public Estadio (String nombre , int capacidad , String ciudad) {
		
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.ciudad = ciudad;
		
		}
	
	public Estadio() {};
	
	
	//B. Añade los métodos de acceso para cada atributo.

	public String getNombre() {
		return nombre;
		}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		}


	
	public int getCapacidad() {
		return capacidad;
		}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
		}	


	
	public String getCiudad() {
		return ciudad;
		}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
		}
	
	
	
	//C. Añade el método toString para volcar a un String toda la información de un Estadio.

	@Override
	public String toString() {
		return "El estadio " + getNombre() + " tiene capacidad para " + getCapacidad() + " espectadores y se ubica en la ciudad de " + getCiudad();
	}

	
	
	
	
	
	
	public void setNombre(Scanner lector) {
		// TODO Auto-generated method stub
		
	}
	
	public void setCapacidad(Scanner lector) {
		// TODO Auto-generated method stub
		
	}
	
	public void setCiudad(Scanner lector) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
//	public void addGrupo(Estadio estadio) {
//		
//		for(int i = 0; i < PruebaMatrizEstadios.estadios.length;i++) {
//			
//			if(PruebaMatrizEstadios.estadios[i] == null) {
//				
//				estadio = PruebaMatrizEstadios.estadios[i];
//				
//				}
//			
//			}
//		
//		}
//	
//	
//	
//	public void mostrarEstadios(Estadio estadio) {
//			
//			for(int i = 0; i < PruebaMatrizEstadios.estadios.length;i++) {
//				
//				if(PruebaMatrizEstadios.estadios[i] != null) {
//					
//					System.out.println(PruebaMatrizEstadios.estadios[i]);
//					
//					}
//				
//				}
//			
//		}
}
