package grupalEvaluacion;

public class Caguano extends Carro {
	
	private int alcanceTiro;
	private String colorConfeti;
	private int size = 2;
	
	public Caguano (int cOcupantes, String fechaIngreso, int ubicacionX, int ubicacionY, int alcanceTiro, String colorConfeti) {
		super(cOcupantes, fechaIngreso, ubicacionX, ubicacionY);
		this.alcanceTiro = alcanceTiro;
		this.colorConfeti = colorConfeti;
		
	}

	public int getAlcanceTiro() {
		return alcanceTiro;
	}

	public String getColorConfeti() {
		return colorConfeti;
	}

	public void setAlcanceTiro(int alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}

	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	}
	
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println();
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Alcance de Tiro: "+getAlcanceTiro()+
				"\nColor de Confeti: "+getColorConfeti()+
				"\nTamano: " + getSize()+"m";
	}
	
	
	

}
