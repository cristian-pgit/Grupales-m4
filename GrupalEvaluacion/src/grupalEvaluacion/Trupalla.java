package grupalEvaluacion;

public class Trupalla extends Carro{
	
	private int armadura;
	private String conductor;
	private int size = 1;
	
	public Trupalla(int cOcupantes, String fechaIngreso, String ubicacionX, String ubicacionY, int armadura, String conductor) {
		super(cOcupantes, fechaIngreso, ubicacionX, ubicacionY);
		this.armadura = armadura;
		this.conductor = conductor;
	}

	public int getArmadura() {
		return armadura;
	}

	public String getConductor() {
		return conductor;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	public void setConductor(String conductor) {
		this.conductor = conductor;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println();
	}

	@Override
	public String toString() {
		return "Armadura del vehiculo: "+getArmadura()+
				"\nPersona que Manipula (Conduce): "+getConductor()+
				"\nTamano:"+getSize();

	}

	
	
	
	
	

}
