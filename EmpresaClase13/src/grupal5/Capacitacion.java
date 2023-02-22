package grupal5;

/* Clase que representa la capacitacion */
/*@author Jorge Arancibia
 * 		  Cristian Carrillo
 * 		  Adrian
 * 		  Matias			*/

public class Capacitacion {
	// atributos
	private int idcap;
	private String rut;
	private String dia;
	private String hora;
	private String lugar;
	private int duracion;
	private int cantasist;
	
	
	public Capacitacion () {} 
	
	//constructor completo/	
	public Capacitacion (int idcap, String rut, String dia, String hora,String lugar,int duracion,int cantasist) {
		this.idcap = idcap;
		this.rut = rut;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantasist = cantasist;
	} 
	
	
	 //@param se setea el id de capacitacion/
	public void setIdcap(int idcap) {			
		this.idcap = idcap;
		
		 
		
	}
	/* @return el id de capacitacion */	
	public int getidcap(){
		return idcap;
		
		
	}
	/* @param se setea el rut */
	public void setRut(String rut) {
		this.rut = rut;	
		
		
		
	}
	/* @return el rut */
	public String getRut() {
		return rut;
			
		
	}
	//@param te setea el dia/
	public void setDia(String dia) {
		this.dia = dia;
		
		
	}
	/* @return retorna el dia*/
	public String getDia() {
		return dia;
	
	}
	//@param se setea la hora/
	public void setHora(String hora) {
		this.hora = hora;
		
		
	}
	/* @return retorna hora */
	public String getHora() {
		return hora;
		
		
	}
	/*@param se setea el Lugar */
	public void setLugar(String lugar) {
		this.lugar = lugar;
		
	}
	//@return retorna lugar/	
	public String getLugar() {
		return lugar;
	
	}
	//@param setea duracion/
	public void setDuracion(int duracion) {
		this.duracion = duracion;
		
	}
	//@return se retorna duracion/
	public int getDuracion() {
		return duracion;
		
	}
	//@param set cantidad de asistentes/
	public void setCantaSist(int cantasist) {
		this.cantasist = cantasist;
		
	}
	//@return retorna cantidad de asistente/
	public int getCantAsist() {
		return cantasist;
		
	}
	
	public String mostrarDetalle() {
		return "La Capacitacion sera en"+lugar+"a las: "+hora+"del dia, y durara"+duracion+" minutos";
	}
	
	
     /* Metodo ToString*/
	
	public String toString() {
        return "Capacitacion{" + "id=" + idcap + ", rutCliente=" + rut + ", dia=" + dia + ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantAsistentes=" + cantasist + '}';
	
    }
	
}