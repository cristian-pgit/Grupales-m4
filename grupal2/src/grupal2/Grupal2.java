package grupal2;

import java.io.IOException;
import java.util.Scanner;

public class Grupal2 {

	public static void main(String[] args) {
		
		
		
		
		System.out.println("Bienvenido al Sistema de Capacitaciones Piquer Dans Les Yeux");
		System.out.println("Favor ingresar Nombre del Cliente");
		System.out.println("Favor ingresar Rut del Cliente sin puntos ni guion");
		System.out.println("Favor ingresar Direccion del Cliente");
		System.out.println("Favor ingresar Comuna");
		System.out.println("Favor ingresar Telefono de contacto del Cliente");
		System.out.println("Ingresar dia de la Capacitacion");
		System.out.println("Ingresar hora de la Capacitacion");
		System.out.println("Ingresar lugar donde se realizara la Capacitacion");
		System.out.println("Ingresar la duraccion de la Capacitacion");
		System.out.println("Ingresar la Cantidad de Asistentes");
		System.out.println("Favor, ingrese Nombre del Asistente");
		System.out.println("Favor, ingrese la edad del Asistente");
		
		
	
		
		
		
		
		

	}
	//ingresar Nombre
	public static String ingresarNombre() {
		boolean ok = false;
		String nombre = null;
		while ( ok == false) {
			Scanner pr = new Scanner(System.in);
			nombre = pr.nextLine();
			if(nombre == null || nombre.equals("")) {
				System.out.println("Nombre no puede estar vacio");
				System.out.print("Ingresar Nombre: ");
			} else { 
				ok = true;
			}
		}
		return nombre;
	}
	
	public static int ingresarRut() {
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
	
	public static String ingresarDireccion() {
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
	
	public static String ingresarComuna() {
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
	
	public static String ingresarDiaCap() {
		boolean ok = false;
		String nombre = null;
		while ( ok == false) {
			Scanner pr = new Scanner(System.in);
			nombre = pr.nextLine();
			if(nombre == null || nombre.equals("")) {
				System.out.println("El Dia no puede estar vacio");
				System.out.print("Ingresar Dia de la Capacitacion: ");
			} else { 
				ok = true;
			}
		}
		return nombre;
	}
	
	public static String ingresarHoraCap() {
		boolean ok = false;
		String nombre = null;
		while ( ok == false) {
			Scanner pr = new Scanner(System.in);
			nombre = pr.nextLine();
			if(nombre == null || nombre.equals("")) {
				System.out.println("Hora no puede estar vacio");
				System.out.print("Ingresar Hora de la Capacitacion: ");
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
			Scanner pr = new Scanner(System.in);
			nombre = pr.nextLine();
			if(nombre == null || nombre.equals("")) {
				System.out.println("Lugar no puede estar vacio");
				System.out.print("Ingresar Lugar de la Capacitacion: ");
			} else { 
				ok = true;
			}
		}
		return nombre;
	}
	
	public static int ingresarCantAsist() {
		boolean ok = false;
		int rut = 0;
		while ( ok == false) {
			Scanner pr = new Scanner(System.in);
			boolean esDigito = false;
			String rutS = pr.nextLine();
			if(rutS.matches("[0-9]+")){
				rut = Integer.parseInt(rutS);
            } else {
            	System.out.println("la Cantidad de Asistentes no puede estar vacio");
				System.out.println("Ingresar Cantidad de Asistentes:");
            }
				ok = true;
			}
		return rut;
	}
	
	public static String ingresarAsistentes() throws IOException {
		boolean ok = false;
		int rut = 0;
		for ()
		while ( ok == false) {
			Scanner pr = new Scanner(System.in);
			String NomAsis = pr.nextLine();
		}	
		return rut;
	}
	
	
	

}
