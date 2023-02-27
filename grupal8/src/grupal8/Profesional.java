package grupal8;

public class Profesional extends Usuario{

	
	private String titulo;
	private String fIngreso;
	
	public Profesional(String userName, String fNacimiento, int run, String titulo, String fIngreso) {
		super(userName, fNacimiento, run);
		this.titulo = titulo;
		this.fIngreso = fIngreso;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getfIngreso() {
		return fIngreso;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setfIngreso(String fIngreso) {
		this.fIngreso = fIngreso;
	}
	
	
	
	
	
	
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println(ANSI_GREEN+"Titulo Profesional: "+ANSI_RESET+ANSI_CYAN+titulo+ANSI_RESET+ANSI_GREEN+
				"\nFecha de Ingreso: "+ANSI_RESET+ANSI_CYAN+fIngreso+ANSI_RESET);
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
