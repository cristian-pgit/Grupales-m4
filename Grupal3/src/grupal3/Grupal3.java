package grupal3;

import java.util.Scanner;

public class Grupal3 {
	
	public static void main(String[] args) {
	
		Scanner scan= new Scanner (System.in);	
		
		//Datos de la capacitacion
		String dia="";
		String diaC="";
        while (diaC.isEmpty()) {
        	System.out.println("Introduzca el dia: ");
        	diaC= scan.nextLine();
			if (diaC.isEmpty() || diaC.length()<3){
				System.out.println("Input no válido");
			} else  {
				dia=diaC;
		}
		
		String horaC="";
		String hora="";
		while (horaC.isEmpty()) {
			System.out.println("Introduzca el Hora: ");
        	horaC= scan.nextLine();
			if (horaC.isEmpty() || horaC.length()<3){
				System.out.println("Input no válido");
			} else  {
				 hora=horaC;
			}
		}
		
		String lugarC="";
		String lugar="";
		while (lugarC.isEmpty()) {
			System.out.println("Introduzca el lugar: ");
        	lugarC= scan.nextLine();
			if (horaC.isEmpty() || lugarC.length()<3 ){
				System.out.println("Input no válido");
			} else  {
				 hora=lugarC;
			}
		}
		
		int duracion=0;
		String dur ="";
		while (dur.isEmpty()) {
			System.out.println("Introduzca el duracion: ");
        	dur= scan.nextLine();
			if (dur.isEmpty() && !dur.matches("[1-9]+")){
				System.out.println("Input no válido");
			} else  {
				 duracion=Integer.parseInt(dur);
			}
		}
		
		
		int cantasist=0;
		String cant ="";
		while (cant.isEmpty()) {
			System.out.println("Introduzca cantidad de asistentes: ");
        	cant= scan.nextLine();
			if (cant.isEmpty() || !cant.matches("[1-9]+")){
				System.out.println("Input no válido");
			} else  {
				 cantasist=Integer.parseInt(cant);
			}
		}
		
		// matriz de calificacion
		
		String[] nombres = new String[cantasist];
        int[] calificaciones = new int[cantasist];
		
        System.out.println(""); // Consumir el salto de línea del input anterior
        // Solicitar datos de los asistentes y sus calificaciones
        for (int i = 0; i < cantasist; i++) {
        	System.out.print("Ingrese el nombre del asistente " + (i + 1) + ": ");
        	String nombre = scan.nextLine();
        	String nombreValidado = validateNombre(nombre, scan, i);
        	nombres[i] = nombreValidado;
        	
		    System.out.print("Ingrese la calificación del asistente " + nombres[i] + ": ");
			String	nota = scan.nextLine();
				if (nota.isEmpty() || !nota.matches("[1-9]") || nota.length()>1){
					System.out.println("Input no válido");
					System.out.print("Ingrese la calificación del asistente " + nombres[i] + ": ");
				} else  { 
					calificaciones[i] = Integer.parseInt(nota);
				}
	
        }
        
	
		        // Calcular promedio, calificación mayor y calificación menor
        
	        int sumaCalificaciones = 0;
	        int calificacionMayor = calificaciones[0];
	        int calificacionMenor = calificaciones[0];
	        for (int i = 0; i < cantasist; i++) {
	            sumaCalificaciones += calificaciones[i];
	            if (calificaciones[i] > calificacionMayor) {
	                calificacionMayor = calificaciones[i];
	            }
	            if (calificaciones[i] < calificacionMenor) {
	                calificacionMenor = calificaciones[i];
	            }
	        }
	        double promedio = (double) sumaCalificaciones / cantasist;

	        // Mostrar resultados
	        System.out.println("Datos de la capacitación:");
	        System.out.println("- Día: " + dia);
	        System.out.println("- Hora: " + hora);
	        System.out.println("- Lugar: " + lugar);
	        System.out.println("- Duración: " + duracion + " horas");

	        System.out.println("Calificaciones:");
	        for (int i = 0; i < cantasist; i++) {
	            System.out.println("- " + nombres[i] + ": " + calificaciones[i]);
	        }

	        System.out.println("Promedio de notas: " + promedio);
	        System.out.println("Calificación mayor: " + calificacionMayor);
	        System.out.println("Calificación menor: " + calificacionMenor);
	  }
	scan.close();
				
	}

	private static String  validateNombre(String nombre, Scanner scan, int posicion) {
		boolean exito = false;
		while (!exito) {
	    	if (nombre == null || nombre.isEmpty() || nombre.length()<3){
					System.out.println("Input no válido");
					System.out.print("Ingrese el nombre del asistente " + (posicion + 1) + ": ");
					nombre = scan.nextLine();
				} else  { 
					exito = true;
				}	
		}
		return nombre;
		
    	
		
	}			

}
