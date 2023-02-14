package grupal2;

import java.util.List;

public class Cliente {
	
	
	private int rutCliente;
	private String nombreCliente;
	private String dirCliente;
	private String comunaCliente;
	private String telefonoCliente;
	private List<Capacitacion> capacitaciones;
	
	public int getRutCliente() {
		return rutCliente;
	}
	public void setRutCliente(int rutCliente) {
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
	
	
	public List<Capacitacion> getCapacitaciones() {
		return capacitaciones;
	}
	public void setCapacitaciones(List<Capacitacion> capacitaciones) {
		this.capacitaciones = capacitaciones;
	}
	public Cliente() {
		
	}
	
	
	
	
	
	


}
