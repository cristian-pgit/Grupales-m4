package grupal8;

public class Administrativo extends Usuario {

	
	private String area;
	private int exPrevia;
	
	public Administrativo(String userName, String fNacimiento, int run, String area, int exPrevia) {
		super(userName, fNacimiento, run);
		this.area = area;
		this.exPrevia = exPrevia;
	}

	public String getArea() {
		return area;
	}

	public int getExPrevia() {
		return exPrevia;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setExPrevia(int exPrevia) {
		this.exPrevia = exPrevia;
	}
	
	
	
	
	
	
	@Override
	public void analizarUsuario() {
		
		super.analizarUsuario();
		System.out.println(ANSI_GREEN+"Área: "+ANSI_RESET+ANSI_CYAN+area+ANSI_RESET+ANSI_GREEN+
				"\nAños de Experiencia Previa: "+ANSI_RESET+ANSI_CYAN+exPrevia+ANSI_RESET);
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
