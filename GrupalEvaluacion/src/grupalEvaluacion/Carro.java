package grupalEvaluacion;

import java.util.ArrayList;
import java.util.List;

public class Carro implements SuperIntendencia{
	
	private int cOcupantes;
	protected String fechaIngreso;
	protected int ubicacionX;
	protected int ubicacionY;
	protected static List<Posiciones>posiciones = new ArrayList<Posiciones>();
	
	
	public int getcOcupantes() {
		return cOcupantes;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public int getUbicacionX() {
		return ubicacionX;
	}
	public int getUbicacionY() {
		return ubicacionY;
	}
	
	public List<Posiciones> getPosiciones () {
		return posiciones;
	}
	
	public static void mostrarPos() {
		System.out.print(posiciones);
	}
	
	
	
	
	public Carro(int cOcupantes, String fechaIngreso, int ubicacionX, int ubicacionY) {
		this.cOcupantes = cOcupantes;
		this.fechaIngreso = fechaIngreso;
		this.ubicacionX = ubicacionX;
		this.ubicacionY = ubicacionY;
	}
	
	public static String getPosiciones(List<Integer> posiciones) {
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < posiciones.size(); i++) {
	        sb.append(posiciones.get(i));
	        if (i < posiciones.size() - 1) {
	            sb.append(", ");
	        }
	    }
	    return sb.toString();
	}

	
	
	@Override
	public String toString() {
	    return "Cantidad de Ocupantes: " + getcOcupantes() +
	           "\nFecha de ingreso a la Institucion: " + getFechaIngreso() +
	           "\nUbicacion en Eje X: " + getUbicacionX() +
	           "\nUbicacion en Eje Y: " + getUbicacionY();
	}

		
	@Override
	public void inspeccionar() {
		System.out.println(this.toString());
		
	}
	
	
	
	

}
