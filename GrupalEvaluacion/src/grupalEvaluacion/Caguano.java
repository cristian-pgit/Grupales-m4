/*
 * 
 */
package grupalEvaluacion;

// TODO: Auto-generated Javadoc
/**
 * The Class Caguano.
 */
//Clase Caguano hereda de Carro
public class Caguano extends Carro {
	
	/** The alcance tiro. */
	//Atributos de clase Caguano
	private int alcanceTiro;
	
	/** The color confeti. */
	private String colorConfeti;
	
	/** The size. */
	private int size = 2;
	
	/** The y 2. */
	private int y2;
	
	/**
	 * Instantiates a new caguano.
	 *
	 * @param cOcupantes the c ocupantes
	 * @param fechaIngreso the fecha ingreso
	 * @param ubicacionX the ubicacion X
	 * @param ubicacionY the ubicacion Y
	 * @param y2 the y 2
	 * @param alcanceTiro the alcance tiro
	 * @param colorConfeti the color confeti
	 */
	//Constructor de clase Caguano
	public Caguano (int cOcupantes, String fechaIngreso, int ubicacionX, int ubicacionY, int y2, int alcanceTiro, String colorConfeti) {
		super(cOcupantes, fechaIngreso, ubicacionX, ubicacionY);
		this.alcanceTiro = alcanceTiro;
		this.colorConfeti = colorConfeti;
	}
	
	/**
	 * Gets the alcance tiro.
	 *
	 * @return devulve el valor de Alcance de Tiro
	 */
	public int getAlcanceTiro() {
		return alcanceTiro;
	}

	/**
	 * Gets the color confeti.
	 *
	 * @return devulve el valor de Color de Confeti
	 */
	public String getColorConfeti() {
		return colorConfeti;
	}
	
	/**
	 * Sets the alcance tiro.
	 *
	 * @param alcanceTiro the new alcance tiro
	 */
	public void setAlcanceTiro(int alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}

	/**
	 * Sets the color confeti.
	 *
	 * @param colorConfeti the new color confeti
	 */
	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	}
	
	/**
	 * Gets the size.
	 *
	 * @return devulve el valor tamano
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
	 * To string.
	 *
	 * @return the string
	 */
	//Metodo to String donde imprime lo de super carro y alcance de tiro, color confeti y tamanio
	@Override
	public String toString() {
		return 	super.toString()+"\nUbicacion en Eje Y2: "+ getY2()+
				"\nAlcance de Tiro: "+getAlcanceTiro()+
				"\nColor de Confeti: "+getColorConfeti()+
				"\nTamano: " + getSize()+"m";
	}

	/**
	 * Gets the y2.
	 *
	 * @return devulve el valor y2
	 */
	public int getY2() {
		return y2;
	}

	/**
	 * Sets the y2.
	 *
	 * @param y2 the new y2
	 * @return devulve el valor de y2
	 */
	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	
	

}
