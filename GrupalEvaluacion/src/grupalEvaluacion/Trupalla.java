package grupalEvaluacion;

//Clase Trupalla hereda de Carro
public class Trupalla extends Carro{
	
	// Atributos de clase Carro
	private int armadura;
	private String conductor;
	private int size = 1;
	
	//Constructor de clase Trupalla
	public Trupalla(int cOcupantes, String fechaIngreso, int ubicacionX, int ubicacionY, int armadura, String conductor) {
		super(cOcupantes, fechaIngreso, ubicacionX, ubicacionY);
		this.armadura = armadura;
		this.conductor = conductor;
	}
	/**@return devuelve el valor de armadura*/
	public int getArmadura() {
		return armadura;
	}
	/**@return devuelve el valor de conductor*/
	public String getConductor() {
		return conductor;
	}

	/**@param modifica el valor de armadura*/
	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	/**@param modifica el valor de conductor*/
	public void setConductor(String conductor) {
		this.conductor = conductor;
	}
	/**@return devuelve el valor de tamano*/
	public int getSize() {
		return size;
	}

	/**@param modifica el valor de tamano*/
	public void setSize(int size) {
		this.size = size;
	}
	
	// Metodo to String donde imprime lo de super carro y armadura del vehiculo, conductor y tamanio
	@Override
	public String toString() {
		return super.toString()+"\nArmadura del vehiculo: "+getArmadura()+
				"\nPersona que Manipula (Conduce): "+getConductor()+
				"\nTamano:"+getSize()+"m";
	}
	

	
}
