package grupal1;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class GestorUsuario {
	
	public static void main (String[]Args) throws IOException {
		
		int rut=0;
		String nombre=null;
		String apellido=null;
		String telefono=null;
		int edad = 0;
		String afp =null;
		int sistemaSalud;
		String direccion = null;
		String comuna = null;
		
		System.out.print("Ingresar RUT:");
		rut = ingresarRut();
				
		System.out.print("Ingresar Nombre:");
		nombre = ingresarNombre();
		
		System.out.print("Ingresar Apellido:");
		apellido = ingresarApellido();
		
		System.out.print("Ingresar Fono:");
		telefono = ingresarTelefono();
		
		System.out.print("Ingresar AFP:");
		afp = ingresarAfp();
		
		System.out.print("Ingresar Sistema de Salud:");
		sistemaSalud = ingresarSisSal();
		
		System.out.print("Ingresar Direccion:");
		direccion = ingresarDireccion();
		
		System.out.print("Ingresar Comuna:");
		comuna = ingresarComuna();
		
		System.out.print("Ingresar Edad:");
		edad = ingresarEdad();
		
		String sisSalud;
		
		if (sistemaSalud == 1) {
			sisSalud = "Fonasa";
		} else {
			sisSalud = "Isapre";
		}
		
		System.out.println(" ");
		System.out.println("***Procesando***");
		System.out.println(" ");
		
		System.out.println("Hola, "+nombre+" "+apellido+" tu Rut es: "+rut+" tienes: "+edad+" años "+"tu telefono es: "+telefono);
		System.out.println("Vives en: "+direccion+", en la comuna de: "+comuna);
		
		System.out.println("Tu AFP es: "+afp+" "+"y tu sistema de salud es: "+sisSalud);
		
	}
	// validar rut
	
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
            	System.out.println("Rut no puede estar vacio");
				System.out.println("Ingresar RUT:");
            }
			if(esDigito == true) {
				rut = Integer.parseInt(rutS);
				if(rut > 11111111 && rut > 999999999) {
					System.out.println("Rut no puede estar vacio");
					System.out.println("Ingresar RUT:");
				} else { 		
					ok = true;
				}
			}
			
		} 
		return rut;
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
		
	//ingresar apellido
	public static String ingresarApellido() {
		boolean ok = false;
		String apellido = null;
		while ( ok == false) {
			Scanner pr = new Scanner(System.in);
			apellido = pr.nextLine();
			if(apellido == null || apellido.equals("")) {
				System.out.println("Apellido no puede estar vacio");
				System.out.print("Ingresar Apellido: ");
			} else { 
				ok = true;
			}
		}
		return apellido;
		
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

	
				
				
		//ingresar afp
	public static String ingresarAfp() {
		boolean ok = false;
		String afp = null;
		while ( ok == false) {
			Scanner pr = new Scanner(System.in);
			afp = pr.nextLine();
			if(afp == null || afp.equals("")) {
				System.out.println("Afp no puede estar vacio");
				System.out.print("Ingresar Afp: ");
			} else { 
				ok = true;
			}
		}
		return afp;
	}
		
	//ingresar direccion
	public static String ingresarDireccion() {
		boolean ok = false;
		String direccion = null;
		while ( ok == false) {
			Scanner pr = new Scanner(System.in);
			direccion = pr.nextLine();
			if(direccion == null || direccion.equals("") || direccion.length()>50) {
				System.out.println("Apellido no puede estar vacio");
				System.out.print("Ingresar Apellido: ");
			} else { 
				ok = true;
			}
		}
		return direccion;
		
	}			
			
	//ingresar apellido
	public static String ingresarComuna() {
		boolean ok = false;
		String comuna = null;
		while ( ok == false) {
			Scanner pr = new Scanner(System.in);
			comuna = pr.nextLine();
			if(comuna == null || comuna.equals("")) {
				System.out.println("Apellido no puede estar vacio");
				System.out.print("Ingresar Apellido: ");
			} else { 
				ok = true;
			}
		}
		return comuna;
		
	}
			
	public static int ingresarSisSal() {
		boolean ok = false;
		Integer sds = 0;
		Integer[] tipos = {1,2};
		while ( ok == false) {
			Scanner pr = new Scanner(System.in);
			sds = pr.nextInt();
			if(!Arrays.asList(tipos).contains(sds) ) {
				System.out.println("Sistema de salud no puede estar vacio, 1 Fonasa - 2 Isapre");
				System.out.print("Ingresar Sistema de Salud: ");
			} else {
				ok = true;
				
			}
		}
		
		return sds;
	}		
	//ingresar edad
	public static int ingresarEdad() {
		boolean ok = false;
		int edad = 0;
		while ( ok == false) {
			Scanner pr = new Scanner(System.in);
			edad = pr.nextInt();
			if(edad >119) {
				System.out.println("Edad no puede estar vacio, ni puede ser superior a 120");
				System.out.print("Ingresar Edad: ");
			} else {
				ok = true;
				pr.close();
			}
		}
		return edad;
	}

}
