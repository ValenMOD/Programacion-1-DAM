package ejerciciosPropuestos;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Se desea calcular el salario neto semanal de los trabajadores de una empresa de acuerdo a las siguientes normas:
		
		// a. Si las horas semanales trabajadas son <= 38, el salario bruto será igual a las horas trabajadas por la tasa a la que se paga la hora.
		// b. Horas extras (38 o más), a una tasa 50 por 100 superior a la ordinaria.
		// c. Impuestos 0%, si el salario bruto es menor o igual a 300 euros.
		// d. Impuestos del 10 %, si el salario bruto es mayor a 300 euros.

		//Realizar un programa que solicite la tasa por hora y las horas trabajadas y calcule el  salario neto y el bruto. 


		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce la tasa por hora.");
		
		float tasaHora = lector.nextFloat();
		
		System.out.println("Introduce las horas trabajadas.");

		float horasTrabajadas = lector.nextFloat();
		System.out.println();
		
		System.out.println("Tasa por hora: " + tasaHora);
		System.out.println("Horas trabajadas: " + horasTrabajadas);
		System.out.println();
		
		
		float sueldoSinExtra = horasTrabajadas * tasaHora;
		System.out.printf("Tu sueldo sin extras es de: %.2f" , sueldoSinExtra);
		System.out.println();
		System.out.println();
		
		float sueldoBruto = sueldoSinExtra;
		
		
		
		if(horasTrabajadas > 38) {
			
			float horasExtra = horasTrabajadas - 38;
			System.out.printf("Horas extra: %.2f" , horasExtra);
			System.out.println();
			
			float tasaExtra = tasaHora * 1.50f;
			System.out.printf("Tasa extra: %.2f" , tasaExtra);
			System.out.println();
			
			float sueldoExtra = horasExtra * tasaExtra;
			System.out.printf("El extra de las horas trabajadas es de: %.2f" , sueldoExtra);
			System.out.println();
			System.out.println();
			
			sueldoBruto = sueldoSinExtra + sueldoExtra;
			System.out.printf("Tu sueldo bruto es de: %.2f" , sueldoBruto);
			System.out.println();
			
		}
		
		
		
		float impuesto = 0.90f;
		
		
		if(sueldoBruto <= 300) {
			System.out.printf("Tu sueldo neto es de: %.2f" , sueldoBruto);
		}
		else {
			
			System.out.println();
			System.out.println("Tu sueldo, al superar los 300€, debe pagar un 10% de impuestos sobre la diferencia.");
			System.out.println();
			
			
			float diferencia = sueldoBruto - 300;
			System.out.printf("La diferencia es de: %.2f" , diferencia);
			System.out.println();
			
			float sueldoNeto = 300 + (diferencia * impuesto);
			System.out.printf("Tu sueldo neto es de: %.2f" , sueldoNeto);
			System.out.println();
		}
		
		
		
		
		
	}

}
