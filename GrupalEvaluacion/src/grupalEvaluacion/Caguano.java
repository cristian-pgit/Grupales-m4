package grupalEvaluacion;

//Clase Caguano hereda de Carro
public class Caguano extends Carro {
	
	//Atributos de clase Caguano
	private int alcanceTiro;
	private String colorConfeti;
	private int size = 2;
	private int y2;
	
	//Constructor de clase Caguano
	public Caguano (int cOcupantes, String fechaIngreso, int ubicacionX, int ubicacionY, int y2, int alcanceTiro, String colorConfeti) {
		super(cOcupantes, fechaIngreso, ubicacionX, ubicacionY);
		this.alcanceTiro = alcanceTiro;
		this.colorConfeti = colorConfeti;
	}
	/**@return devulve el valor de Alcance de Tiro*/
	public int getAlcanceTiro() {
		return alcanceTiro;
	}

	/**@return devulve el valor de Color de Confeti*/
	public String getColorConfeti() {
		return colorConfeti;
	}
	/**@param modifica el valor de alcance de tiro*/
	public void setAlcanceTiro(int alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}

	/**@param modifica el valor de color conferi*/
	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	}
	
	/**@return devulve el valor tamano*/
	public int getSize() {
		return size;
	}

	/**@param modifica el valor de tamano*/
	public void setSize(int size) {
		this.size = size;
	}
	
	//Metodo to String donde imprime lo de super carro y alcance de tiro, color confeti y tamanio
	@Override
	public String toString() {
		return 	super.toString()+"\nUbicacion en Eje Y2: "+ getY2()+
				"\nAlcance de Tiro: "+getAlcanceTiro()+
				"\nColor de Confeti: "+getColorConfeti()+
				"\nTamano: " + getSize()+"m";
	}

	/**@return devulve el valor y2*/
	public int getY2() {
		return y2;
	}

	/**@return devulve el valor de y2*/
	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	
	

}
