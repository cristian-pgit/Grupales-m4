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
	            cliente.setNombreCliente(ingresarNomCliente());
	            cliente.setRutCliente(ingresarRutCliente());
	            cliente.setDirCliente(ingresarDirCliente());
	            cliente.setComunaCliente(ingresarComCliente());
	            cliente.setTelefonoCliente(ingresarTelefono());
	            System.out.println("CLIENTE CREADO EXITOSAMENTE");
	            return cliente;
	        } catch(Exception e){
	            System.out.println("HUBO UN ERROR. INTENTE DE NUEVO");
	            e.printStackTrace();
	            return null;
	        }
	}
	
	public static Capacitacion crearCapacitacion(List<Capacitacion> capacitaciones) {
		Capacitacion capacitacion = new Capacitacion();
		Scanner sc = new Scanner(System.in);
	        try {
	        	capacitacion.setNombreCapacitacion(ingresarNomCap());
	        	capacitacion.setDiaCapacitacion(ingresarDiaCap());
	        	capacitacion.setHoraCapacitacion(ingresarHoraCap());
	        	capacitacion.setLugarCapacitacion(ingresarLugarCap());
	        	capacitacion.setDuracionCapacitacion(ingresarDurCap());
	        	capacitacion.setCantAsistCapacitacion(ingresarCantAsist());
	        	capacitacion.setNombreAsistenteCap(ingresarNomAsist());
	        	capacitacion.setEdadAsistenteCap(ingresarEdadAsist());
	            System.out.println("ALUMNO CREADO EXITOSAMENTE");
	            return capacitacion;
	        } catch(Exception e){
	            System.out.println("HUBO UN ERROR. INTENTE DE NUEVO");
	            e.printStackTrace();
	            return null;
	        }
	}
	
	
	//ingresar Nombre
			public static String ingresarNomCliente() {
				boolean ok = false;
				String nombre = null;
				while ( ok == false) {
					System.out.print("Favor ingresar Nombre del Cliente");
					Scanner pr = new Scanner(System.in);
					nombre = pr.nextLine();
					if(nombre == null || nombre.equals("") || nombre.length()<3) {
						System.out.println("Nombre no puede estar vacio");
					} else { 
						ok = true;
					}
				}
				return nombre;
			}
			
			public static int ingresarRutCliente() {
				boolean ok = false;
				int rut = 0;
				while ( ok == false) {
					Scanner pr = new Scanner(System.in);
					boolean esDigito = false;
					String rutS = pr.nextLine();
					if(rutS.matches("[0-9]+") && rutS.length() >8){
		                esDigito = true;
		            } else {
		            	System.out.println("Rut no puede estar vacio, ingresar Rut del Cliente sin puntos ni guion");
						System.out.println("Ingresar RUT:");
		            }
					if(esDigito == true) {
						rut = Integer.parseInt(rutS);
						if(rut > 11111111 && rut > 999999999) {
							System.out.println("Rut no puede estar vacio, ingresar Rut del Cliente sin puntos ni guion");
							System.out.print("Ingresar RUT:");
						} else { 		
							ok = true;
						}
					}
					
				} 
				return rut;
			}
			
			public static String ingresarDirCliente() {
				boolean ok = false;
				String nombre = null;
				while ( ok == false) {
					Scanner pr = new Scanner(System.in);
					nombre = pr.nextLine();
					if(nombre == null || nombre.equals("")) {
						System.out.println("Direccion no puede estar vacio");
						System.out.print("Ingresar direccion: ");
					} else { 
						ok = true;
					}
				}
				return nombre;
			}
			
			public static String ingresarComCliente() {
				boolean ok = false;
				String nombre = null;
				while ( ok == false) {
					Scanner pr = new Scanner(System.in);
					nombre = pr.nextLine();
					if(nombre == null || nombre.equals("")) {
						System.out.println("Comuna no puede estar vacio");
						System.out.print("Ingresar Comuna: ");
					} else { 
						ok = true;
					}
				}
				return nombre;
			}
			
			//ingresar Telefono
			public static String ingresarTelefono() throws IOException{
			       boolean ok = false;
			       String fono = null;
			       while (!ok) {
			           boolean largo = false;
			           boolean esDigito = false;
			           Scanner pr = new Scanner(System.in);
			           fono = pr.nextLine();
			           if(fono.matches("[0-9]+")){
			               esDigito = true;
			           }
			           if(fono.length() >8 && fono.length() <16){
			               largo = true;
			           }
			           ok = esDigito && largo;
			       }
			       return fono;
			}
		
		
		public static void crearCliente() {
			
			System.out.println("Favor ingresar Rut del Cliente sin puntos ni guion");
			System.out.println("Favor ingresar Direccion del Cliente");
			System.out.println("Favor ingresar Comuna");
			System.out.println("Favor ingresar Telefono de contacto del Cliente");
			
		
			
		}
		public static String ingresarNomCap() {
			boolean ok = false;
			String nombrec = null;
			while ( ok == false) {
				System.out.print("Favor ingresar Nombre del Cliente");
				Scanner pr = new Scanner(System.in);
				nombrec = pr.nextLine();
				if(nombrec == null || nombrec.equals("") || nombrec.length()<3) {
					System.out.println("Nombre no puede estar vacio");
				} else { 
					ok = true;
				}
			}
			return nombrec;
		}
		
		public static String ingresarDiaCap() {
			boolean ok = false;
			String dia = null;
			while ( ok == false) {
				System.out.println("Ingresar dia de la Capacitacion: ");
				Scanner pr = new Scanner(System.in);
				dia = pr.nextLine();
				if(dia == null || dia.equals("")) {
					System.out.println("El Dia no puede estar vacio");
				} else { 
					ok = true;
				}
			}
			return dia;
		}
		
		public static String ingresarHoraCap() {
			boolean ok = false;
			String nombre = null;
			while ( ok == false) {
				System.out.println("Ingresar hora de la Capacitacion: ");
				Scanner pr = new Scanner(System.in);
				nombre = pr.nextLine();
				if(nombre == null || nombre.equals("")) {
					System.out.println("Hora no puede estar vacio");
				} else { 
					ok = true;
				}
			}
			return nombre;
		}
		
		public static String ingresarLugarCap() {
			boolean ok = false;
			String nombre = null;
			while ( ok == false) {
				System.out.print("Ingresar lugar donde se realizara la Capacitacion");
				Scanner pr = new Scanner(System.in);
				nombre = pr.nextLine();
				if(nombre == null || nombre.equals("")) {
					System.out.println("Lugar no puede estar vacio");
				} else { 
					ok = true;
				}
			}
			return nombre;
		}
		
		public static int ingresarDurCap() {
			boolean ok = false;
			int dur = 0;
			while ( ok == false) {
				System.out.println("Ingresar la duraccion de la Capacitacion");
				Scanner pr = new Scanner(System.in);
				boolean esDigito = false;
				String durS = pr.nextLine();
				if(durS.matches("[0-9]+") && durS.length() >8){
	                esDigito = true;
	            } else {
	            	System.out.println("La duracion no puede estar vacio");
	            }
				if(esDigito == true) {
					dur = Integer.parseInt(durS);
					if(dur > 11111111 && dur > 999999999) {
						System.out.println("La duracion no puede estar vacio");
					} else { 		
						ok = true;
					}
				}
				
			} 
			return dur;
		}
		
		public static int ingresarCantAsist() {
			boolean ok = false;
			int casis = 0;
			while ( ok == false) {
				System.out.print("Ingresar la Cantidad de Asistentes");
				Scanner pr = new Scanner(System.in);
				boolean esDigito = false;
				String cantA = pr.nextLine();
				if(cantA.matches("[0-9]+")){
					casis = Integer.parseInt(cantA);
	            } else {
	            	System.out.println("la Cantidad de Asistentes no puede estar vacio");
					System.out.println("Ingresar Cantidad de Asistentes:");
	            }
					ok = true;
				}
			return casis;
		}
		
		public static List<String> ingresarNomAsist() {
			boolean ok = false;
			List<String> nombreAs = null;
			String nombreA = null;
			while ( ok == false) {
				System.out.print("Favor ingresar Nombre del Asistente");
				Scanner pr = new Scanner(System.in);
				nombreA = pr.nextLine();
				if(nombreA == null || nombreA.equals("") || nombreA.length()<3) {
					System.out.println("Nombre del asistente no puede estar vacio");
				} else { 
					ok = true;
					nombreAs.add(nombreA);
				}
			}
			return nombreAs;
		}
		
		public static List<Integer> ingresarEdadAsist() {
			boolean ok = false;
			List<Integer> edads = null;
			int edad = 0;
			while ( ok == false) {
				System.out.print("Favor ingresar la edad del Asistente");
				Scanner pr = new Scanner(System.in);
				boolean esDigito = false;
				String edadS = pr.nextLine();
				if(edadS.matches("[0-9]+")){
					edad = Integer.parseInt(edadS);
					esDigito = true;
	            } else {
	            	System.out.println("la edad del Asistentes no puede estar vacio");
					System.out.print("Ingresar edad del Asistente:");
	            }
					
					ok = true;
				}
			return edads;
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
