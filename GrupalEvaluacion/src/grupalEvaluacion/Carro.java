package grupalEvaluacion;

public class Carro implements SuperIntendencia{
	
	private int cOcupantes;
	protected String fechaIngreso;
	protected int ubicacionX;
	protected int ubicacionY;
	
	
	public int getcOcupantes() {
		return cOcupantes;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public int getUbicacionX() {
		return ubicacionX;
	}
	public int getUbicacionY() {
		return ubicacionY;
	}
	
	public Carro(int cOcupantes, String fechaIngreso, int ubicacionX, int ubicacionY) {
		this.cOcupantes = cOcupantes;
		this.fechaIngreso = fechaIngreso;
		this.ubicacionX = ubicacionX;
		this.ubicacionY = ubicacionY;
	}
	
	@Override
	public String toString() {
		return "Cantidad de Ocupantes: " + getcOcupantes()+
				"\nFecha de ingreso a la Institucion: "+getFechaIngreso()+
				"\nUbicacion en Eje X: "+getUbicacionX()+
				"\nUbicacion en Eje Y: "+getUbicacionY();
	}
	
	@Override
	public void inspeccionar() {
		System.out.println(this.toString());
		
	}
	
	
	
	

}
