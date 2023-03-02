package grupalEvaluacion;

public class Carro {
	
	private int cOcupantes;
	protected String fechaIngreso;
	protected String ubicacionX;
	protected String ubicacionY;
	
	
	public int getcOcupantes() {
		return cOcupantes;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public String getUbicacionX() {
		return ubicacionX;
	}
	public String getUbicacionY() {
		return ubicacionY;
	}
	
	public Carro(int cOcupantes, String fechaIngreso, String ubicacionX, String ubicacionY) {
		this.cOcupantes = cOcupantes;
		this.fechaIngreso = fechaIngreso;
		this.ubicacionX = ubicacionX;
		this.ubicacionY = ubicacionY;
	}
	
	public void mostrarDatos() {
		System.out.println("Cantidad de Ocupantes: " + getcOcupantes()+
				"\nFecha de ingreso a la Institucion: "+getFechaIngreso()+
				"\nUbicacion en Eje X: "+getUbicacionX()+
				"\nUbicacion en Eje Y: "+getUbicacionY());
				
	}
	
	
	
	

}
