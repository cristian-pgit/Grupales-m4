package grupalEvaluacion;


public class Huevo {
	
	/* atributos de tipo entero del atributo privado llamado x e Y */
	private int x;
	private int y;
	
	// constructor de Huevo
	public Huevo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//sobreescribe el metodo toString de las coordenadas del huevo lanzado
	@Override
	public String toString() {
		return "Huevo cayo en (x)" + x + ", (y) " + y;
	}

	/**@return devulve el valor de X*/
	public int getX() {
		return x;
	}

	/**@return devulve el valor de Y*/
	public int getY() {
		return y;
	}

	/**@param modifica el valor de X*/
	public void setX(int x) {
		this.x = x;
	}

	/**@param modifica el valor de Y*/
	public void setY(int y) {
		this.y = y;
	}
	
	//metodo para mostrar la info de Huevo
	public void mostrarHuevo() {
		System.out.println(toString());
	}
}
