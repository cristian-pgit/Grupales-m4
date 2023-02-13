package grupal2;

import java.util.List;
import java.util.Scanner;

public class Capacitacion {
	
	private String nombreCapacitacion;
	private String diaCapacitacion;
	private String horaCapacitacion;
	private String lugarCapacitacion;
	private int duracionCapacitacion;
	private int cantAsistCapacitacion;
	private List<String> nombreAsistente;
	private List<Integer> edadAsistente;
	
	public String getNombreCapacitacion() {
		return nombreCapacitacion;
	}
	public void setNombreCapacitacion(String nombreCapacitacion) {
		this.nombreCapacitacion = nombreCapacitacion;
	}
	public String getDiaCapacitacion() {
		return diaCapacitacion;
	}
	public void setDiaCapacitacion(String diaCapacitacion) {
		this.diaCapacitacion = diaCapacitacion;
	}
	public String getHoraCapacitacion() {
		return horaCapacitacion;
	}
	public void setHoraCapacitacion(String horaCapacitacion) {
		this.horaCapacitacion = horaCapacitacion;
	}
	public String getLugarCapacitacion() {
		return lugarCapacitacion;
	}
	public void setLugarCapacitacion(String lugarCapacitacion) {
		this.lugarCapacitacion = lugarCapacitacion;
	}
	public int getDuracionCapacitacion() {
		return duracionCapacitacion;
	}
	public void setDuracionCapacitacion(int duracionCapacitacion) {
		this.duracionCapacitacion = duracionCapacitacion;
	}
	public int getCantAsistCapacitacion() {
		return cantAsistCapacitacion;
	}
	public void setCantAsistCapacitacion(int cantAsistCapacitacion) {
		this.cantAsistCapacitacion = cantAsistCapacitacion;
	}
	public List<String> getNombreAsistente() {
		return nombreAsistente;
	}
	public void setNombreAsistente(List<String> nombreAsistente) {
		this.nombreAsistente = nombreAsistente;
	}
	public List<Integer> getEdadAsistente() {
		return edadAsistente;
	}
	public void setEdadAsistente(List<Integer> edadAsistente) {
		this.edadAsistente = edadAsistente;
	}
	
	
	public Capacitacion() {
		
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
	
	public static String ingresarNomAsist() {
		boolean ok = false;
		String nombreA = null;
		while ( ok == false) {
			System.out.print("Favor ingresar Nombre del Asistente");
			Scanner pr = new Scanner(System.in);
			nombreA = pr.nextLine();
			if(nombreA == null || nombreA.equals("") || nombreA.length()<3) {
				System.out.println("Nombre del asistente no puede estar vacio");
			} else { 
				ok = true;
			}
		}
		return nombreA;
	}
	
	public static int ingresarEdadAsist() {
		boolean ok = false;
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
		return edad;
	}
	
	


}
