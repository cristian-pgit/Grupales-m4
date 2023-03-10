/*
 * 
 */
package grupalEvaluacion;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Carro.
 */
//Clase Carro implementa interfaz de superintendencia
public class Carro implements SuperIntendencia{
	
	/** The c ocupantes. */
	//Atributos de Carro
	private int cOcupantes;
	
	/** The fecha ingreso. */
	protected String fechaIngreso;
	
	/** The ubicacion X. */
	protected int ubicacionX;
	
	/** The ubicacion Y. */
	protected int ubicacionY;
	
	/** The posiciones. */
	protected static List<Posiciones>posiciones = new ArrayList<Posiciones>();
	
	/**
	 * Gets the c ocupantes.
	 *
	 * @return devuelve el valor de cantidad Ocupantes
	 */
	public int getcOcupantes() {
		return cOcupantes;
	}
	
	/**
	 * Gets the fecha ingreso.
	 *
	 * @return devuelve el valor de Fecha de Ingreso
	 */
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	
	/**
	 * Gets the ubicacion X.
	 *
	 * @return devuelve el valor de Ubicacion X
	 */
	public int getUbicacionX() {
		return ubicacionX;
	}
	
	/**
	 * Gets the ubicacion Y.
	 *
	 * @return devuelve el valor de Ubicacion Y
	 */
	public int getUbicacionY() {
		return ubicacionY;
	}
	
	/**
	 * Gets the posiciones.
	 *
	 * @return devuelve el valor de la Lista de Posiciones
	 */
	public List<Posiciones> getPosiciones () {
		return posiciones;
	}
	
	/**
	 * Mostrar pos.
	 */
	// muestra posiciones ...en trabajo
	public static void mostrarPos() {
		System.out.print(posiciones);
	}
	
	
	
	/**
	 * Instantiates a new carro.
	 *
	 * @param cOcupantes the c ocupantes
	 * @param fechaIngreso the fecha ingreso
	 * @param ubicacionX the ubicacion X
	 * @param ubicacionY the ubicacion Y
	 */
	//Constructor de clase Carro
	public Carro(int cOcupantes, String fechaIngreso, int ubicacionX, int ubicacionY) {
		this.cOcupantes = cOcupantes;
		this.fechaIngreso = fechaIngreso;
		this.ubicacionX = ubicacionX;
		this.ubicacionY = ubicacionY;
	}
	
	/**
	 * Gets the posiciones.
	 *
	 * @param posiciones the posiciones
	 * @return the posiciones
	 */
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

	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	// Metodo to string imprime cantidad de  ocupantes, fecha de ingreso de la institucion, ubicacion eje x e Y
	@Override
	public String toString() {
	    return "Cantidad de Ocupantes: " + getcOcupantes() +
	           "\nFecha de ingreso a la Institucion: " + getFechaIngreso() +
	           "\nUbicacion en Eje X: " + getUbicacionX() +
	           "\nUbicacion en Eje Y: " + getUbicacionY();
	}

	/**
	 * Inspeccionar.
	 */
	// Sobreescribir metodo inspeccionar 	
	@Override
	public void inspeccionar() {
		System.out.println(this.toString());
		
	}
	
	
	
	

}
