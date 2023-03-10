/*
 * 
 */
package grupalEvaluacion;

// TODO: Auto-generated Javadoc
/**
 * The Class Kromi.
 */
//herencia kromi hereda de la clase carro
public class Kromi extends Carro{
	
	/** The fe fabricacion. */
	//Atributos de la clase 
	private String feFabricacion;
	
	/** The marca. */
	private String marca;
	
	/** The size. */
	private int size = 3;
	
	/** The x 2. */
	private int x2;
	
	/** The x 3. */
	private int x3;
	
	/**
	 * Gets the x2.
	 *
	 * @return the x2
	 * @retun metodo accesadores get devuelve lo guardado en la variable fecha de fabricacion
	 */
	public int getX2() {
		return x2;
	}
	
	/**
	 * Gets the x3.
	 *
	 * @return the x3
	 * @retun metodo accesadores get devuelve lo guardado en la variable fecha de fabricacion
	 */
	public int getX3() {
		return x3;
	}
	
	/**
	 * Sets the x2.
	 *
	 * @param x2 the new x2
	 */
	public void setX2(int x2) {
		this.x2 = x2;
	}
	
	/**
	 * Sets the x3.
	 *
	 * @param x3 the new x3
	 */
	public void setX3(int x3) {
		this.x3 = x3;
	}
	
	/**
	 * Gets the fe fabricacion.
	 *
	 * @return the fe fabricacion
	 * @retun metodo accesadores get devuelve lo guardado en la variable FeFabricacion
	 */
	public String getFeFabricacion() {
		return feFabricacion;
	}
	
	/**
	 * Gets the marca.
	 *
	 * @return the marca
	 * @retun metodo accesadores get devuelve lo guardado en la variable Marca
	 */
	public String getMarca() {
		return marca;
	}
	
	/**
	 * Sets the fe fabricacion.
	 *
	 * @param feFabricacion the new fe fabricacion
	 */
	public void setFeFabricacion(String feFabricacion) {
		this.feFabricacion = feFabricacion;
	}
	
	/**
	 * Sets the marca.
	 *
	 * @param marca the new marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	/**
	 * Gets the size.
	 *
	 * @return the size
	 * @retun metodo accesadores get devuelve lo guardado en la variable Size
	 */
	public int getSize() {
		return size;
	}
	
	/**
	 * Sets the size.
	 *
	 * @param size the new size
	 */
	public void setSize(int size) {
		this.size = size;
	}
	
	/**
	 * metodo mostrar toString, Super imprime lo de carro y ademas fecha de fabricacion, marca y.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return super.toString()+"\nUbicacion en Eje X2: "+ getX2()+
				"\nUbicacion en Eje X3: " + getX3()
				+"\nFecha de Fabricacion: "+getFeFabricacion()+
				"\nMarca: "+getMarca()+
				"\nTamano:"+getSize()+"m";
	}
	
	/**
	 * Instantiates a new kromi.
	 *
	 * @param cOcupantes the c ocupantes
	 * @param fechaIngreso the fecha ingreso
	 * @param ubicacionX the ubicacion X
	 * @param ubicacionY the ubicacion Y
	 * @param x2 the x 2
	 * @param x3 the x 3
	 * @param feFabricacion the fe fabricacion
	 * @param marca the marca
	 */
	//Constructor de clase kromi
	public Kromi(int cOcupantes, String fechaIngreso, int ubicacionX, int ubicacionY, int x2, int x3, String feFabricacion, String marca) {
		super(cOcupantes, fechaIngreso, ubicacionX, ubicacionY);
		this.feFabricacion = feFabricacion;
		this.marca = marca;
	}
	
	


	
	
	

}
