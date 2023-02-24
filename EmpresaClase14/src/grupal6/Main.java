package grupal6;

import java.io.IOException;
import java.util.List;
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
        cliente1.setNombres("Manso ");
        cliente1.setApellidos("Pato");
        cliente1.setTelefono("12341234");
        cliente1.setAfp("Cuprum");
        cliente1.setSds(1);
        cliente1.setDireccion("Las Rejas");
        cliente1.setComuna("Vina");
        cliente1.setEdad(22);
		
		System.out.println(cliente1);
		System.out.println();
			
		Cliente cliente2 = new Cliente(222222222, "Enrique", "Cienfuegos", "12341234", "Habitat", 2, "Los Ricachones","Las Condes", 45);
		
        
        System.out.println(cliente2);
        System.out.println();
    

               
		//crear instancia de User
		Usuario user1 = new Usuario();
		user1.setNombre("PDLY");
		user1.setFecha_nacimiento("12/12/1990");
		user1.setRut(111111111);
		user1.getCliente().setEdad(25);
		user1.getCliente().setNombres("El Alan");
		user1.getCliente().setApellidos("Brito Delgado");
		user1.getCliente().setAfp("PlanVital");
		
		
		
		System.out.println(user1);
		System.out.println();
		
		
		Usuario user2 = new Usuario("RichBoy", "21/12/78", 1245000);

		
		System.out.println(user2);
		System.out.println();
		
		//crear instancia de Capacitacion
		Capacitacion capa1 = new Capacitacion();
		capa1.setIdcap(21);
		capa1.setRut("111111111-1");
		capa1.setDia("Lunes");
		capa1.setHora("19:00");
		capa1.setLugar("vina");
		capa1.setDuracion(30);
		capa1.setCantAsist(3);
		
		System.out.println(capa1);
		System.out.println();
		
		Capacitacion capa2 = new Capacitacion(12, "1.245.000-3", "Martes", "12:00", "Sala 302, UDD", 180, 15);
	
		System.out.println(capa2);
		System.out.println();
		
		
		 Scanner sc = new Scanner(System.in);
	     System.out.println(ANSI_RED+"[ADVERTECIA]"+ANSI_RESET+ANSI_YELLOW+" Nos indican que el cliente1 ha cambiado de Sexo"+ANSI_RESET);
	     System.out.print(ANSI_CYAN+"Favor rectifique nombre: "+ANSI_RESET);
	     cliente1.setNombres(sc.nextLine());
	     System.out.println(ANSI_GREEN+"**Gracias**"+ANSI_RESET);
	     System.out.println(cliente1);
	     System.out.println();
	     System.out.println(ANSI_RED+"[ADVERTECIA]"+ANSI_RESET+ANSI_YELLOW+" Nos indican que el usuario ha cambiado su fecha de nacimiento"+ANSI_RESET);
	     System.out.print(ANSI_CYAN+"Favor ingresar fecha de defuncion-digo nacimiento: "+ANSI_RESET);
	     user1.setFecha_nacimiento(sc.nextLine());
	     System.out.println(ANSI_GREEN+"**Gracias**"+ANSI_RESET);
	     System.out.println(user1);
	     System.out.println();
	     System.out.println(ANSI_RED+"[ADVERTECIA]"+ANSI_RESET+ANSI_YELLOW+" Nos informan que el relator esta en un taco"+ANSI_RESET);
	     System.out.print(ANSI_CYAN+"Favor ingrese nuevo dia para la capacitacion: "+ANSI_RESET);
	     capa1.setDia(sc.nextLine());
	     System.out.println(ANSI_GREEN+"**Gracias**"+ANSI_RESET);
	     System.out.println(capa1);
	     System.out.println();
		
	     
	   Capacitacion capa3 = new Capacitacion();
	    capa3.setIdcap(12);
	    capa3.setRut("111111111-1");
		capa3.setDia("Lunes");
		capa3.setHora("19:00");
		capa3.setLugar("vina");
		capa3.setDuracion(30);
		capa3.setCantAsist(2);
		Usuario asis1 = new Usuario();
		asis1.setFecha_nacimiento("12/12/1990");
		asis1.setNombre("El Gordo Luie");
		asis1.setRut(111111111);
		asis1.getCliente().setEdad(25);
		asis1.getCliente().setNombres("El Alan");
		asis1.getCliente().setApellidos("Brito Delgado");
		asis1.getCliente().setAfp("PlanVital");
		asis1.getCliente().setSds(2);
		asis1.getCliente().setRut(444444444);
		asis1.getCliente().setDireccion("La Villa Rica");
		asis1.getCliente().setComuna("La Dehesa");
		asis1.getCliente().setTelefono("12341234");
		
		Usuario asis2 = new Usuario();
		asis2.setFecha_nacimiento("01/01/1995");
		asis2.setRut(222222222);
		asis2.setNombre("El J");
		asis2.getCliente().setEdad(30);
		asis2.getCliente().setNombres("Juan");
		asis2.getCliente().setApellidos("Perez");
		asis2.getCliente().setAfp("Cuprum");
		asis2.getCliente().setSds(3);
		asis2.getCliente().setRut(555555555);
		asis2.getCliente().setDireccion("Av. Providencia 123");
		asis2.getCliente().setComuna("Providencia");
		asis2.getCliente().setTelefono("56785678");
		
		capa3.getCantasis().add(asis1);
		capa3.getCantasis().add(asis2);
		
		capa3.morstrar(capa3.cantasis);
		
	     
	     System.out.println(ANSI_GREEN+"El usuario 1 se se llama: "+ANSI_RESET+ANSI_CYAN+user1.getCliente().obtenerNombre(user1.getCliente().getNombres(), 
	    		 user1.getCliente().getApellidos()) +ANSI_RESET+ANSI_GREEN+"\n su fecha de nacimiento es: " +ANSI_RESET+ANSI_CYAN+ user1.getFecha_nacimiento() 
	    		 +ANSI_RESET+ANSI_GREEN + " y su run es: " +ANSI_RESET+ANSI_CYAN+ user1.getRut() +ANSI_RESET+ANSI_GREEN+". " +ANSI_RESET+ANSI_CYAN
	    		 + user1.mostrarEdad() +ANSI_RESET+ANSI_GREEN+ " años de edad. Pertenece a la AFP: " +ANSI_RESET+ANSI_CYAN+ user1.getCliente().getAfp() 
	    		 +ANSI_RESET+ANSI_GREEN+ " y su Sistema de Salud es: " +ANSI_RESET+ANSI_CYAN+ user1.getCliente().obtenerSds(user1.getCliente().getSds()) 
	    		 +ANSI_RESET+ANSI_GREEN+ "\n . y  " +ANSI_RESET+ANSI_CYAN+ capa2.mostrarDetalle()+ANSI_RESET);
	     System.out.println("");
		
		sc.close();
		
		
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
