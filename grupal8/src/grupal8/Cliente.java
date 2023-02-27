package grupal8;

public class Cliente extends Usuario{
	
	
	
	private int rut;
	private String nombres;
	private String apellidos;
	private int telefono;
	private String afp;
	private int sds;
	private String direccion;
	private String comuna;
	private int edad;
	
	public Cliente(String userName, String fNacimiento, int run, int rut, String nombres, String apellidos, 
			int telefono, String afp, int sds, String direccion, String comuna, int edad) {
		super(userName, fNacimiento, run);
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sds = sds;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	public int getRut() {
		return rut;
	}

	public String getNombres() {
		return nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getTelefono() {
		return telefono;
	}

	public String getAfp() {
		return afp;
	}

	public int getSds() {
		return sds;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public int getEdad() {
		return edad;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public void setSds(int sds) {
		this.sds = sds;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String SS() {
		if (sds == 1) {
			return "Fonasa";
		} else {
			return "Isapre";
		}
	}
	
	@Override
	public void analizarUsuario() {
		System.out.println(ANSI_GREEN+"Analizando el usuario: " +ANSI_RESET+ANSI_CYAN+userName+ANSI_RESET+ANSI_GREEN+
				"\nFecha de Nacimiento: "+ANSI_RESET+ANSI_CYAN+fNacimiento+ANSI_RESET+ANSI_GREEN+
				"\nRun: "+ANSI_RESET+ANSI_CYAN+run+ANSI_RESET+ANSI_GREEN+
				"\nRUT Cliente: "+ANSI_RESET+ANSI_CYAN+rut+ANSI_RESET+ANSI_GREEN+
				"\nNombres: "+ANSI_RESET+ANSI_CYAN+nombres+ANSI_RESET+ANSI_GREEN+
				"\nApellidos: "+ANSI_RESET+ANSI_CYAN+apellidos+ANSI_RESET+ANSI_GREEN+
				"\nTelefono: "+ANSI_RESET+ANSI_CYAN+telefono+ANSI_RESET+ANSI_GREEN+
				"\nAFP: "+ANSI_RESET+ANSI_CYAN+afp+ANSI_RESET+ANSI_GREEN+
				"\nSistema de Salud: "+ANSI_RESET+ANSI_CYAN+SS()+ANSI_RESET+ANSI_GREEN+
				"\nDireccion: "+ANSI_RESET+ANSI_CYAN+direccion+ANSI_RESET+ANSI_GREEN+
				"\nComuna: "+ANSI_RESET+ANSI_CYAN+comuna+ANSI_RESET+ANSI_GREEN+
				"\nEdad: "+ANSI_RESET+ANSI_CYAN+edad+ANSI_RESET);
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
