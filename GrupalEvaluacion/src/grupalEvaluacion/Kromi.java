package grupalEvaluacion;

public class Kromi extends Carro{
	
	private String feFabricacion;
	private String marca;
	private int size = 3;
	
	public String getFeFabricacion() {
		return feFabricacion;
	}
	public String getMarca() {
		return marca;
	}
	public void setFeFabricacion(String feFabricacion) {
		this.feFabricacion = feFabricacion;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
		public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
	@Override
	public String toString() {
		return "Fecha de Fabricacion: "+getFeFabricacion()+
				"\nMarca: "+getMarca()+
				"\nTamano:"+getSize();
	}
	public Kromi(int cOcupantes, String fechaIngreso, String ubicacionX, String ubicacionY, String feFabricacion, String marca, int size) {
		super(cOcupantes, fechaIngreso, ubicacionX, ubicacionY);
		this.feFabricacion = feFabricacion;
		this.marca = marca;
	}
	
	


	
	
	

}
