package grupal2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grupal2 {

	public static void main(String[] args) {
		
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		boolean power = true;
		while (power) {
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
			
			switch (opciones) {
				case 1: //Crear Cliente
					Cliente cliente = crearCliente();
					if (cliente != null) {
						clientes.add(cliente);
					}
					
					
					break;
				case 2: //Crear Capacitacion
					
					Capacitacion capacitacion = crearCapacitacion();
					if (capacitacion != null) {
						//getCapacitaciones().add(capacitacion);
					}
					
					
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
			
	}
	
	public static Cliente crearCliente() {
		Cliente cliente = new Cliente();
	        try {
	            cliente.setNombreCliente(ingresarNomCliente());
	            cliente.setRutCliente(ingresarRutCliente());
	            cliente.setDirCliente(ingresarDirCliente());
	            cliente.setComunaCliente(ingresarComCliente());
	            cliente.setTelefonoCliente(ingresarTelefono());
	            cliente.setCapacitaciones(new ArrayList<>());
	            System.out.println("CLIENTE CREADO EXITOSAMENTE");
	            return cliente;
	        } catch(Exception e){
	            System.out.println("HUBO UN ERROR. INTENTE DE NUEVO");
	            e.printStackTrace();
	            return null;
	        }
	}
	
	public static Capacitacion crearCapacitacion() {
		Capacitacion capacitacion = new Capacitacion();
		try {
        	capacitacion.setNombreCapacitacion(ingresarNomCap());
        	capacitacion.setDiaCapacitacion(ingresarDiaCap());
        	capacitacion.setHoraCapacitacion(ingresarHoraCap());
        	capacitacion.setLugarCapacitacion(ingresarLugarCap());
        	capacitacion.setDuracionCapacitacion(ingresarDurCap());
        	capacitacion.setCantAsistCapacitacion(ingresarCantAsist());
        	setInfoAsistente(capacitacion);
        	System.out.println("CAPACITACION CREADA EXITOSAMENTE");
            return capacitacion;
        } catch(Exception e){
            System.out.println("HUBO UN ERROR. INTENTE DE NUEVO");
            e.printStackTrace();
            return null;
        }
	}
	
	
	private static void setInfoAsistente(Capacitacion capacitacion) {
		//definir array para nombre asistente y edades
		List<Integer> edades = new ArrayList<Integer>();
		List<String> nombres = new ArrayList<String>();
		//declaro contadores
		int cont = 0;
		int cantAsistentes = capacitacion.getCantAsistCapacitacion();
		//se abre conexión a consola
		Scanner pr = new Scanner(System.in);
		//se inicia el blucle
		while (cont< cantAsistentes) {
			//generar bucle hasta que se  ingrese un nombre
			boolean hayNombre = false;
			while (!hayNombre) {
				System.out.println("Ingrese el nombre del asistente: ");
				String nombre = pr.nextLine();
				if(nombre == null || nombre.equals("") || nombre.length()<3) {
					System.out.println("Nombre no puede estar vacio");
				} else { 
					hayNombre = true;
					nombres.add(nombre);
				}
			}
			
			//generar bucle hasta que se  ingrese edad
			boolean hayEdad = false;
			while (!hayEdad) {
				System.out.println("Ingrese el nombre del asistente: ");
				String edad = pr.nextLine();
				if (edad ==  null || edad.isEmpty() || !edad.matches("[0-9]+"))
				{
					System.out.println("Edad no válida");
				} else if (Integer.parseInt(edad)> 120) { 
					System.out.println("Disfrute su jubilación");
				} else  {
					hayEdad = true;
					edades.add(Integer.parseInt(edad));
				}
			}
			cont++;
		}
		
		//se cierra conexión a consola
		pr.close();
		//se asigna la informaciónde los asistentes
		capacitacion.setNombreAsistenteCap(nombres);
		capacitacion.setEdadAsistenteCap(edades);
	}

	//ingresar Nombre
	public static String ingresarNomCliente() {
		boolean ok = false;
		String nombre = null;
		Scanner pr = new Scanner(System.in);
		while ( ok == false) {
			System.out.print("Favor ingresar Nombre del Cliente");
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
	
	public static List<String> ingresarNomAsist(int cantAsist) {
		boolean ok = false;
		List<String> nombres = new ArrayList<String>();
		Scanner pr = new Scanner(System.in);
		int contLocal = 0;
		while ( contLocal < cantAsist) {
			System.out.print("Favor ingresar Nombre del Asistente");
			String nombreA = pr.nextLine();
			if(nombreA == null || nombreA.equals("") || nombreA.length()<3) {
				System.out.println("Nombre del asistente no puede estar vacio");
			} else { 
				ok = true;
				nombres.add(nombreA);
			}
			contLocal++;
		}
		pr.close();
		return nombres;
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
