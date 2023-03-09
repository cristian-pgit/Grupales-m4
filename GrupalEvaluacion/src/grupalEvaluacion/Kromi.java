package grupalEvaluacion;

//herencia kromi hereda de la clase carro
public class Kromi extends Carro{
	
	//Atributos de la clase 
	private String feFabricacion;
	private String marca;
	private int size = 3;
	private int x2;
	private int x3;
	
	/**@retun metodo accesadores get devuelve lo guardado en la variable fecha de fabricacion*/
	public int getX2() {
		return x2;
	}
	
	/**@retun metodo accesadores get devuelve lo guardado en la variable fecha de fabricacion*/
	public int getX3() {
		return x3;
	}
	/**@param FeFrabricacion modifica el valor x2*/
	public void setX2(int x2) {
		this.x2 = x2;
	}
	/**@param FeFrabricacion modifica el valor X3*/
	public void setX3(int x3) {
		this.x3 = x3;
	}
	
	/**@retun metodo accesadores get devuelve lo guardado en la variable FeFabricacion*/
	public String getFeFabricacion() {
		return feFabricacion;
	}
	
	/**@retun metodo accesadores get devuelve lo guardado en la variable Marca*/
	public String getMarca() {
		return marca;
	}
	
	/**@param FeFrabricacion modifica el valor FeFabricacion*/
	public void setFeFabricacion(String feFabricacion) {
		this.feFabricacion = feFabricacion;
	}
	
	/**@param FeFrabricacion modifica el valor Marca*/
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	/**@retun metodo accesadores get devuelve lo guardado en la variable Size*/
	public int getSize() {
		return size;
	}
	
	/**@param FeFrabricacion modifica el valor Size*/
	public void setSize(int size) {
		this.size = size;
	}
	
	/**metodo mostrar toString, Super imprime lo de carro y ademas fecha de fabricacion, marca y */
	@Override
	public String toString() {
		return super.toString()+"\nUbicacion en Eje X2: "+ getX2()+
				"\nUbicacion en Eje X3: " + getX3()
				+"\nFecha de Fabricacion: "+getFeFabricacion()+
				"\nMarca: "+getMarca()+
				"\nTamano:"+getSize()+"m";
	}
	
	//Constructor de clase kromi
	public Kromi(int cOcupantes, String fechaIngreso, int ubicacionX, int ubicacionY, int x2, int x3, String feFabricacion, String marca) {
		super(cOcupantes, fechaIngreso, ubicacionX, ubicacionY);
		this.feFabricacion = feFabricacion;
		this.marca = marca;
	}
	
	


	
	
	

}
