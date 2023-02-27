package grupal8;

import java.util.ArrayList;
import java.util.List;

public class Listado {

	private List<Asesoria> ase = new ArrayList<Asesoria>();

	public Listado() {
		
	}
	
	public void addUsuario(Asesoria a) {
		ase.add(a);
	}
	
	
	public void mostrarDatos() {
		int i = 1;
		for (Asesoria a:ase) {
			System.out.println(ANSI_WHITE+"----------------- Usuario: "+i+" -----------------------"+ANSI_RESET);
			a.analizarUsuario();
			i++;
			System.out.println(ANSI_PURPLE+"----------------------------------------------------"+ANSI_RESET);
		}
		
	}
	
	public static final String ANSI_WHITE = "\u001B[37m";
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	
}
