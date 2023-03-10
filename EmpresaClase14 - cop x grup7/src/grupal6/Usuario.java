package grupal6;
	/**@author Matias Calderon
	  *Cristian Carrillo
	  *Adrian
	  *Jorge Arancibia*
	  */
		 
public class Usuario {
	
	/**
	 * Atributos
	 */
	private String nombre;
	private String fecha_nacimiento;
	private int rut;
	private Cliente cliente;

	/**
	 * @return the nombre
	 */
	
	//aqui se crea el constructor/
	public Usuario () {
		cliente = new Cliente();
	}
	
	// aqui va el constructor con parametros
	public Usuario(String nombre, String fecha_nacimiento, int rut) {
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.rut = rut;
		
	}
		
	
	/**
	 * @return aqui se consigue el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return aqui se consigue la fecha de nacimiento
	 */
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	/**
	 * @return aqui se consigue el run
	 */
	public int getRut() {
		return rut;
	}
	/**
	 * @param nombre aqui se consigue el nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @param fecha_nacimiento aqui se coloca la fecha de nacimiento
	 */
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	/**
	 * @param run aqui se coloca el run
	 */
	public void setRut(int rut) {
		this.rut = rut;
	}
	
	public String mostrarEdad() {
		return "El usuario tiene: "+cliente.getEdad();
	}
	
	@Override
	public String toString() {
		return ANSI_GREEN+"Usuario [nombre=" +ANSI_RESET+ANSI_CYAN+ nombre +ANSI_RESET+ANSI_GREEN
				+ ", fecha_nacimiento=" +ANSI_RESET+ANSI_CYAN+ fecha_nacimiento +ANSI_RESET
				+ANSI_GREEN+ ", run=" +ANSI_RESET+ANSI_CYAN+ rut +ANSI_RESET+ANSI_GREEN+ "]"
				+ANSI_RESET;
	}
	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * @return the capacitacion
	 */

	/**
	 * @param cliente the cliente to set
	 */
	//public void setCliente(int i, String string, String string2, String string3, String string4, int j, String string5, String string6, int k) {
	//	this.cliente = cliente;
	//}
	
	public void mostrar(){
        System.out.println("\tNombre Usuario: "+ nombre);
        System.out.println("\tFecha de Nacimiento: "+ fecha_nacimiento);
        System.out.println("\tRUT: "+ rut);
        System.out.println("\tNombre Completo: "+ cliente.obtenerNombre(cliente.getNombres(), cliente.getApellidos()));
        System.out.println("\tNumero de cel: "+ cliente.getTelefono());
        System.out.println("\tRUT Cliente: "+ cliente.getRut());
        System.out.println("\tAFP: "+ cliente.getAfp());
        System.out.println("\tSistema de Salud: "+ cliente.obtenerSds(cliente.getSds()));
        System.out.println("\tDireccion: "+ cliente.getDireccion());
        System.out.println("\tComuna: "+ cliente.getComuna());
        System.out.println("\tEdad: "+ cliente.getEdad());
        //getCliente().mostrar();
        
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