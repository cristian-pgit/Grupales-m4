package grupalEvaluacion;

import java.util.List;

public class Posiciones {
	
	private int x1;
	private int x2;
	private int x3;
	private int y1;
	private int y2;
	public int getX1() {
		return x1;
	}
	public int getX2() {
		return x2;
	}
	public int getX3() {
		return x3;
	}
	public int getY1() {
		return y1;
	}
	public int getY2() {
		return y2;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public void setX3(int x3) {
		this.x3 = x3;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	public Posiciones() {
		
	}
	@Override
	public String toString() {
		return "x1:" + x1 + ", x2:" + x2 + ", x3: " + x3 + ", y1:" + y1 + ", y2:" + y2;
	}
	
	public int mostrarKromis() {
		return x1+x2+x3+y1;
	}
	public int mostrarCaguano() {
		return x1+y1+y2;
	}
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
