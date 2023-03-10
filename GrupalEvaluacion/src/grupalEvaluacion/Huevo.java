/*
 * 
 */
package grupalEvaluacion;


// TODO: Auto-generated Javadoc
/**
 * The Class Huevo.
 */
public class Huevo {
	
	/** The x. */
	/* atributos de tipo entero del atributo privado llamado x e Y */
	private int x;
	
	/** The y. */
	private int y;
	
	/**
	 * Instantiates a new huevo.
	 *
	 * @param x the x
	 * @param y the y
	 */
	// constructor de Huevo
	public Huevo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	//sobreescribe el metodo toString de las coordenadas del huevo lanzado
	@Override
	public String toString() {
		return "Huevo cayo en (x)" + x + ", (y) " + y;
	}

	/**
	 * Gets the x.
	 *
	 * @return devulve el valor de X
	 */
	public int getX() {
		return x;
	}

	/**
	 * Gets the y.
	 *
	 * @return devulve el valor de Y
	 */
	public int getY() {
		return y;
	}

	/**
	 * Sets the x.
	 *
	 * @param x the new x
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Sets the y.
	 *
	 * @param y the new y
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * Mostrar huevo.
	 */
	//metodo para mostrar la info de Huevo
	public void mostrarHuevo() {
		System.out.println(toString());
	}
}
