package grupal2;

import java.io.IOException;
import java.util.Scanner;

public class Cliente {
	
	
	private int rutCliente;
	private String nombreCliente;
	private String dirCliente;
	private String comunaCliente;
	private String telefonoCliente;
	
	public int getRutCliente() {
		return rutCliente;
	}
	public void setRutcliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}	
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getDirCliente() {
		return dirCliente;
	}
	public void setDirCliente(String dirCliente) {
		this.dirCliente = dirCliente;
	}
	public String getComunaCliente() {
		return comunaCliente;
	}
	public void setComunaCliente(String comunaCliente) {
		this.comunaCliente = comunaCliente;
	}
	public String getTelefonoCliente() {
		return telefonoCliente;
	}
	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}
	
	
	public Cliente() {
		
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
	
	
	


}
