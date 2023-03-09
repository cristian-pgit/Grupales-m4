package grupalEvaluacion;

import java.util.ArrayList;
import java.util.List;

//Clase Carro implementa interfaz de superintendencia
public class Carro implements SuperIntendencia{
	
	//Atributos de Carro
	private int cOcupantes;
	protected String fechaIngreso;
	protected int ubicacionX;
	protected int ubicacionY;
	protected static List<Posiciones>posiciones = new ArrayList<Posiciones>();
	
	/**@return devuelve el valor de cantidad Ocupantes*/
	public int getcOcupantes() {
		return cOcupantes;
	}
	/**@return devuelve el valor de Fecha de Ingreso*/
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	/**@return devuelve el valor de Ubicacion X*/
	public int getUbicacionX() {
		return ubicacionX;
	}
	/**@return devuelve el valor de Ubicacion Y*/
	public int getUbicacionY() {
		return ubicacionY;
	}
	/**@return devuelve el valor de la Lista de Posiciones*/
	public List<Posiciones> getPosiciones () {
		return posiciones;
	}
	
	// muestra posiciones ...en trabajo
	public static void mostrarPos() {
		System.out.print(posiciones);
	}
	
	
	
	//Constructor de clase Carro
	public Carro(int cOcupantes, String fechaIngreso, int ubicacionX, int ubicacionY) {
		this.cOcupantes = cOcupantes;
		this.fechaIngreso = fechaIngreso;
		this.ubicacionX = ubicacionX;
		this.ubicacionY = ubicacionY;
	}
	
	//metodo para conseguir posiciones ...en trabajo
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

	
	// Metodo to string imprime cantidad de  ocupantes, fecha de ingreso de la institucion, ubicacion eje x e Y
	@Override
	public String toString() {
	    return "Cantidad de Ocupantes: " + getcOcupantes() +
	           "\nFecha de ingreso a la Institucion: " + getFechaIngreso() +
	           "\nUbicacion en Eje X: " + getUbicacionX() +
	           "\nUbicacion en Eje Y: " + getUbicacionY();
	}

	// Sobreescribir metodo inspeccionar 	
	@Override
	public void inspeccionar() {
		System.out.println(this.toString());
		
	}
	
	
	
	

}
