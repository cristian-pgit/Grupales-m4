package grupal2;

import java.util.List;

public class Capacitacion {
	
	private String nombreCapacitacion;
	private String diaCapacitacion;
	private String horaCapacitacion;
	private String lugarCapacitacion;
	private int duracionCapacitacion;
	private int cantAsistCapacitacion = 0;
	private List<String> nombreAsistente;
	private List<Integer> edadAsistente;
	
	public String getCapacitacion() {
		return nombreCapacitacion;
	}
	public void setCapacitacion(String nombreCapacitacion) {
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
	
	
	
	


}
