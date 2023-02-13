package grupal2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grupal2 {

	public static void main(String[] args) {
		
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		boolean power = true;
		while (power == true) {
			System.out.println("Bienvenido al Sistema de Capacitaciones de la Empresa ''Piquer Dans Les Yeux''");
			System.out.println();
			System.out.println("Que Desea hacer?");
			System.out.println("1 - Crear Cliente");
			System.out.println("2 - Crear Capacitacion");
			System.out.println("3 - Consultar Clientes");
			System.out.println("4 - Consultar Capacitaciones");
			System.out.println("5 - Salir");
			Scanner sc = new Scanner(System.in);
			int opciones = 5;
			try{
                opciones = Integer.parseInt(sc.nextLine());
            } catch (Exception e){
                System.out.println("OPCIÓN NO VALIDA");
            }
			Cliente cliente = null;
			switch (opciones) {
				case 1: //Crear Cliente
					clientes.add(crearCliente(cliente));
					
					break;
				case 2: //Crear Capacitacion
					
					
					break;
				case 3: // Consultar Clientes
					
					
					break;
				case 4: // Consultar Capacitaciones
					
					
					break;
				case 5:
					System.out.println("Un gusto haberlo ayudado.... Hasta luego");
					power = false;
				default:
                    System.out.println("OPCIÓN NO VALIDA");
                    
					
			}
		
			
		}
		
				
		
		
		
		
		
		System.out.println("Favor, ingrese Nombre del Asistente");
		System.out.println("Favor, ingrese la edad del Asistente");
		
		
	
		
		
		
		
		

	}
	
	public static Cliente crearCliente(List<Cliente> clientes) {
		Cliente cliente = new Cliente();
		Scanner sc = new Scanner(System.in);
	        try {
	            cliente.setNombreCliente(Cliente.ingresarNomCliente());
	            cliente.setComunaCliente(Cliente.ingresarRutCliente());
	            cliente.setDirCliente(Cliente.ingresarDirCliente());
	            cliente.setComunaCliente(Cliente.ingresarComCliente());
	            cliente.setTelefonoCliente(Cliente.ingresarTelefono());
	            System.out.println("ALUMNO CREADO EXITOSAMENTE");
	            return cliente;
	        } catch(Exception e){
	            System.out.println("HUBO UN ERROR. INTENTE DE NUEVO");
	            e.printStackTrace();
	            return null;
	        }
	}
	
	public static Capacitacion crearCapacitacion(List<Capacitacion> capacitacion) {
		Capacitacion capacitacion = new capacitacion();
		Scanner sc = new Scanner(System.in);
	        try {
	            capacitacion.setNomCapacitacion(Cliente.ingresarNomCap());
	            capacitacion.setDiaCapacitacion(Cliente.ingresarDiaCap());
	            capacitacion.setHoraCapacitacion(Cliente.ingresarHoraCap());
	            capacitacion.setLugarCapacitacion(Cliente.ingresarLugarCap());
	            capacitacion.setDuracionCapacitacion(Capacitacion.ingresarDurCap());
	            capacitacion.setCantAsistCapacitacion(Capacitacion.ingresarCantAsist());
	            capacitacion.setNombreAsistente(Capacitacion.ingresarNomAsist());
	            capacitacion.setEdadAsistCapacitacion(Capacitacion.ingresarEdadAsist());
	            System.out.println("ALUMNO CREADO EXITOSAMENTE");
	            return capacitacion;
	        } catch(Exception e){
	            System.out.println("HUBO UN ERROR. INTENTE DE NUEVO");
	            e.printStackTrace();
	            return null;
	        }
	}
	
	
	
	
	
	//public static String ingresarAsistentes() throws IOException {
		//boolean ok = false;
		//int rut = 0;
	//for ()
	//	while ( ok == false) {
	//		Scanner pr = new Scanner(System.in);
	//		String NomAsis = pr.nextLine();
	//	}	
	//	return rut;
	//}
	
	
	

}
