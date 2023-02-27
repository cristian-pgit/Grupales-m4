package grupal8;

public class Main {
	
	public static void main (String[]Args) {
		
		Cliente cli1 = new Cliente("Franco", "12/12/1990", 111111111, 222222222, "Franco ElDesaparecido", "Marchant NoMeAcuerdo", 12341234, "ProVida", 1, "Lo Desconosco N999", "RepartidorPErdido", 21);
		Profesional pro1 = new Profesional("Alan Brito", "01/02/1956", 100000000, "Chef Internacional", "23/03/2001");
		Administrativo adm1 = new Administrativo("Lola Mento", "17/02/1996", 333333333, "Recepcion", 3);
		Administrativo adm2 = new Administrativo("Elza Pato", "27/06/1976", 444444444, "Zapateria", 10);
		Administrativo adm3 = new Administrativo("Armando Casas", "30/07/1986", 555555555, "Construccion", 15);
		
		
		
		
		
		Listado lis = new Listado();
		lis.addUsuario(cli1);
		lis.addUsuario(pro1);
		lis.addUsuario(adm1);
		lis.addUsuario(adm2);
		lis.addUsuario(adm3);
		
		
		lis.analizarUsuario();
	}

}
