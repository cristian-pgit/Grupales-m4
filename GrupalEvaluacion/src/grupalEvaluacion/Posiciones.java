/*
 * 
 */
package grupalEvaluacion;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Posiciones.
 */
//Clase en trabajo...
public class Posiciones {
	
	/** The x 1. */
	//atributos
	private int x1;
	
	/** The x 2. */
	private int x2;
	
	/** The x 3. */
	private int x3;
	
	/** The y 1. */
	private int y1;
	
	/** The y 2. */
	private int y2;
	
	/**
	 * return devuelve X1.
	 *
	 * @return the x1
	 */
	public int getX1() {
		return x1;
	}
	
	/**
	 * return devuelve X2.
	 *
	 * @return the x2
	 */
	public int getX2() {
		return x2;
	}
	
	/**
	 * return devuelve X3.
	 *
	 * @return the x3
	 */
	public int getX3() {
		return x3;
	}
	
	/**
	 * return devuelve Y1.
	 *
	 * @return the y1
	 */
	public int getY1() {
		return y1;
	}
	
	/**
	 * return devuelve Y2.
	 *
	 * @return the y2
	 */
	public int getY2() {
		return y2;
	}
	
	/**
	 * param setea X1.
	 *
	 * @param x1 the new x1
	 */
	public void setX1(int x1) {
		this.x1 = x1;
	}
	
	/**
	 * param setea X2.
	 *
	 * @param x2 the new x2
	 */
	public void setX2(int x2) {
		this.x2 = x2;
	}
	
	/**
	 * param setea X3.
	 *
	 * @param x3 the new x3
	 */
	public void setX3(int x3) {
		this.x3 = x3;
	}
	
	/**
	 * param setea Y1.
	 *
	 * @param y1 the new y1
	 */
	public void setY1(int y1) {
		this.y1 = y1;
	}
	
	/**
	 * param setea Y2.
	 *
	 * @param y2 the new y2
	 */
	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	/**
	 * Instantiates a new posiciones.
	 */
	//metodo constructor
	public Posiciones() {
		
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	//reescribe metodo
	@Override
	public String toString() {
		return "x1:" + x1 + ", x2:" + x2 + ", x3: " + x3 + ", y1:" + y1 + ", y2:" + y2;
	}
	
	/**
	 * Mostrar kromis.
	 *
	 * @return the int
	 */
	//metodo para mostrar valores de posociones de kromi
	public int mostrarKromis() {
		return x1+x2+x3+y1;
	}
	
	/**
	 * Mostrar caguano.
	 *
	 * @return the int
	 */
	//metodo para mostrar valores de posociones de caguano
	public int mostrarCaguano() {
		return x1+y1+y2;
	}
	
	/**
	 * Mostrar trupalla.
	 *
	 * @return the int
	 */
	//metodo para mostrar valores de posociones de Trupalla
	public int mostrarTrupalla() {
		return x1+y1;
	}

	
//	public static void mostrarPosiciones(List<Posiciones> posiciones) {
//		int i = 1;
//		for (Posiciones p:posiciones) {
//			System.out.println(ANSI_WHITE+"----------------- Vehiculo: "+i+" -----------------------"+ANSI_RESET);
//			if (tablero[][])
//			p.toString(); 
//			i++;
//			System.out.println(ANSI_PURPLE+"----------------------------------------------------"+ANSI_RESET);
//		}
//		
//	}
	

}
