package grupalEvaluacion;

public class Caguano extends Carro {
	
	private int alcanceTiro;
	private String colorConfeti;
	private int size = 2;
	private int y2;
	
	public Caguano (int cOcupantes, String fechaIngreso, int ubicacionX, int ubicacionY, int y2, int alcanceTiro, String colorConfeti) {
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
	

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return 	super.toString()+"\nUbicacion en Eje Y2: "+ getY2()+
				"\nAlcance de Tiro: "+getAlcanceTiro()+
				"\nColor de Confeti: "+getColorConfeti()+
				"\nTamano: " + getSize()+"m";
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	
	

}
