package grupal8;

public class Usuario implements Asesoria {
	
	protected String userName;
	protected String fNacimiento;
	protected int run;
	
	
	public String getUsserName() {
		return userName;
	}
	public String getfNacimiento() {
		return fNacimiento;
	}
	public int getRun() {
		return run;
	}
	
	public Usuario(String userName, String fNacimiento, int run) {
		super();
		this.userName = userName;
		this.fNacimiento = fNacimiento;
		this.run = run;
	}
	
	@Override
	public void analizarUsuario() {
		System.out.println(ANSI_GREEN+"Analizando el usuario: " +ANSI_RESET+ANSI_CYAN+userName+ANSI_RESET+ANSI_GREEN+
				"\nFecha de Nacimiento: "+ANSI_RESET+ANSI_CYAN+fNacimiento+ANSI_RESET+ANSI_GREEN+
				"\nRun: "+ANSI_RESET+ANSI_CYAN+run+ANSI_RESET);
		
	}
	
	
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_RESET = "\u001B[0m";
	
	

}
