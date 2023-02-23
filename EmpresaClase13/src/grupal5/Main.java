package grupal5;

import java.io.IOException;
import java.util.Scanner;

/**
 * <h1>Grupal 5 : POO_ABPRO5_</h1>
 * 
 * @author	Cristian Carrillo
 * 			Adrian Fredes
 * 			Matias Claderon
 * 			Jorge Arancibia
 * 
 * <p> Aqui el JAVADOC de este grupal </p> 
 * 
 * @version 1.0. 
 * 
 */

public class Main {
		
	/** Metodo principal y ejecutante del programa */
	public static void main (String []Args) throws IOException {
        
        // Crear nueva instancia de objeto Cliente
        Cliente cliente1 = new Cliente();
        cliente1.setRut(111111111);
        cliente1.setNombres("Elsa ");
        cliente1.setApellidos("Pato");
        cliente1.setTelefono("12341234");
        cliente1.setAfp("Cuprum");
        cliente1.setSds(1);
        cliente1.setDireccion("Las Rejas");
        cliente1.setComuna("Vina");
        cliente1.setEdad(22);
        //print de cliente1 mediante ToString
		System.out.println(cliente1);
		System.out.println();
              
		//crear instancia de User
		Usuario user1 = new Usuario();
		user1.setNombre("PDLY");
		user1.setFecha_nacimiento("12/12/1990");
		user1.setRut(24500);
		//print de user 1 mediante ToString
		System.out.println(user1);
		System.out.println();
		
		//crear instancia de Capacitacion
		Capacitacion capa1 = new Capacitacion();
		capa1.setIdcap(21);
		capa1.setRut("111111111-1");
		capa1.setDia("Lunes");
		capa1.setHora("19:00");
		capa1.setLugar("vina");
		capa1.setDuracion(30);
		capa1.setCantaSist(3);
		//print de capa1 mediante ToString
		System.out.println(capa1);
		System.out.println();
		
		System.out.println();
		
		

		
		
		
		
	}
	
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	public static final String ANSI_RESET = "\u001B[0m";
	


}
