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
	
	
	public void analizarUsuario() {
		for (Asesoria a:ase) {
			a.analizarUsuario();
		}
		
	}
	
	
	
	
}
