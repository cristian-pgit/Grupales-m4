package grupalEvaluacion;

public class Kromi extends Carro{
	
	private String feFabricacion;
	private String marca;
	private int size = 3;
	private int x2;
	private int x3;
	
	public int getX2() {
		return x2;
	}
	public int getX3() {
		return x3;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public void setX3(int x3) {
		this.x3 = x3;
	}
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
		return super.toString()+"\nUbicacion en Eje X2: "+ getX2()+
				"\nUbicacion en Eje X3: " + getX3()
				+"\nFecha de Fabricacion: "+getFeFabricacion()+
				"\nMarca: "+getMarca()+
				"\nTamano:"+getSize()+"m";
	}
	
	public Kromi(int cOcupantes, String fechaIngreso, int ubicacionX, int ubicacionY, int x2, int x3, String feFabricacion, String marca) {
		super(cOcupantes, fechaIngreso, ubicacionX, ubicacionY);
		this.feFabricacion = feFabricacion;
		this.marca = marca;
	}
	
	


	
	
	

}
