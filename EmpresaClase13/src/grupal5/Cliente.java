package grupal5;
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

public class Cliente { /** Clase Cliente */
	
	private int rut; 			/** Atributo del tipo Ingreseo rut */
	private String nombres; 	/** Atributo del tipo String nombres */
	private String apellidos;	/** Atributo del tipo String apellidos */
	private String telefono;	/** Atributo del tipo String telefono */
	private String afp;			/** Atributo del tipo String afp */
	private int sds;			/** Atributo del tipo int sds */
	private String direccion;	/** Atributo del tipo String duraccion */
	private String comuna;		/** Atributo del tipo String comuna */
	private int edad;			/** Atributo del tipo int edad */
	/**
	 * @return el rut
	 */
	public int getRut() {
		return rut;
	};
	/**
	 * @param rut para setear el rut
	 */
	public void setRut(int rut) {
		this.rut = rut;
	};
	/**
	 * @return el valor de nombres
	 */
	public String getNombres() {
		return nombres;
	};
	/**
	 * @param nombre para setear nombre
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	};
	/**
	 * @return el valor de apellido
	 */
	public String getApellidos() {
		return apellidos;
	};
	/**
	 * @param apellidos para setear apellido
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	};
	/**
	 * @return el valor de telefono
	 */
	public String getTelefono() {
		return telefono;
	};
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	};
	/**
	 * @return valor de afp
	 */
	public String getAfp() {
		return afp;
	};
	/**
	 * @param afp para setear el valor de afp
	 */
	public void setAfp(String afp) {
		this.afp = afp;
	};
	/**
	 * @return el valor de sds
	 */
	public int getSds() {
		return sds;
	};
	/**
	 * @param sds para setear valor de sds
	 */
	public void setSds(int sds) {
		this.sds = sds;
	};
	/**
	 * @return valor de direccion
	 */
	public String getDireccion() {
		return direccion;
	};
	/**
	 * @param direccion para setear direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	};
	/**
	 * @return el valor de comuna
	 */
	public String getComuna() {
		return comuna;
	};
	/**
	 * @param comuna para setear valor de comuna
	 */
	public void setComuna(String comuna) {
		this.comuna = comuna;
	};
	/**
	 * @return valor de edad
	 */
	public int getEdad() {
		return edad;
	};
	/**
	 * @param edad para setear el valor de edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	};
	
	/**
	 * Constructor basico del objeto Cliente
	 *   
	 */
	public Cliente() {
		
	};
	
	/**
	 * Construye un nuevo objeto Cliente con la información personal y de contacto especificada.
	 * @param rut el número de RUT del cliente
	 * @param nombres los nombres y apellidos del cliente
	 * @param apellidos los apellidos del cliente
	 * @param telefono el número de teléfono del cliente
	 * @param afp la AFP (Administradora de Fondos de Pensiones) del cliente
	 * @param sds el identificador del Sistema de Salud del cliente
	 * @param direccion la dirección del cliente
	 * @param comuna la comuna del cliente
	 * @param edad la edad del cliente
	 * 
	 */
	
	public Cliente(int rut, String nombres, String apellidos, String telefono, String afp, int sds, String direccion, String comuna, int edad) {
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sds = sds;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	};
	
	public String obtenerNombre(String nombres, String apellidos) {
		return nombres + apellidos;

	}
	public void obtenerSds (int sds) {
		if (sds == 1) {
			System.out.println("Su Sistema de Salud es Fonasa");
		} else {
			System.out.println("Su Sistema de Salud es Isapre");
		}
	}

	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", afp=" + afp + ", sds=" + sds + ", direccion=" + direccion + ", comuna=" + comuna + ", edad=" + edad + "]";
	}

	

}