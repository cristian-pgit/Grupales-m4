package grupalEvaluacion;

public class Huevo {
	
	private String ubicacionX;
	private String ubicacionY;
	
	public Huevo(String ubicacionX, String ubicacionY) {
		this.ubicacionX = ubicacionX;
		this.ubicacionY = ubicacionY;
	}

	public String getUbicacionX() {
		return ubicacionX;
	}

	public String getUbicacionY() {
		return ubicacionY;
	}

	public void setUbicacionX(String ubicacionX) {
		this.ubicacionX = ubicacionX;
	}

	public void setUbicacionY(String ubicacionY) {
		this.ubicacionY = ubicacionY;
	}
	
	
	public void mostrarDatos() {
		System.out.println("El Huevo ha caido en: "+getUbicacionX()+" "+getUbicacionY());
	}
	

}
