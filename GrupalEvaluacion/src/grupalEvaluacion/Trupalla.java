/*
 * 
 */
package grupalEvaluacion;

// TODO: Auto-generated Javadoc
/**
 * The Class Trupalla.
 */
//Clase Trupalla hereda de Carro
public class Trupalla extends Carro{
	
	/** The armadura. */
	// Atributos de clase Carro
	private int armadura;
	
	/** The conductor. */
	private String conductor;
	
	/** The size. */
	private int size = 1;
	
	/**
	 * Instantiates a new trupalla.
	 *
	 * @param cOcupantes the c ocupantes
	 * @param fechaIngreso the fecha ingreso
	 * @param ubicacionX the ubicacion X
	 * @param ubicacionY the ubicacion Y
	 * @param armadura the armadura
	 * @param conductor the conductor
	 */
	//Constructor de clase Trupalla
	public Trupalla(int cOcupantes, String fechaIngreso, int ubicacionX, int ubicacionY, int armadura, String conductor) {
		super(cOcupantes, fechaIngreso, ubicacionX, ubicacionY);
		this.armadura = armadura;
		this.conductor = conductor;
	}
	
	/**
	 * Gets the armadura.
	 *
	 * @return devuelve el valor de armadura
	 */
	public int getArmadura() {
		return armadura;
	}
	
	/**
	 * Gets the conductor.
	 *
	 * @return devuelve el valor de conductor
	 */
	public String getConductor() {
		return conductor;
	}

	/**
	 * Sets the armadura.
	 *
	 * @param armadura the new armadura
	 */
	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	/**
	 * Sets the conductor.
	 *
	 * @param conductor the new conductor
	 */
	public void setConductor(String conductor) {
		this.conductor = conductor;
	}
	
	/**
	 * Gets the size.
	 *
	 * @return devuelve el valor de tamano
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
	// Metodo to String donde imprime lo de super carro y armadura del vehiculo, conductor y tamanio
	@Override
	public String toString() {
		return super.toString()+"\nArmadura del vehiculo: "+getArmadura()+
				"\nPersona que Manipula (Conduce): "+getConductor()+
				"\nTamano:"+getSize()+"m";
	}
	

	
}
