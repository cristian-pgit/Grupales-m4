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
		System.out.println("Analizando el usuario: " +userName);
		
	}
	
	
	

}
