package grupalEvaluacion;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Tablero {
	
		private static List<Carro> pks = new ArrayList<Carro>(18);
		private static  List<Huevo> huevos = new ArrayList<Huevo>();
		static Random random = new Random();
		public static  int puntaje = 0;
		static Scanner scanner = new Scanner(System.in);
		
		
		//Grilla de tablero
	
		
			
		public String[][] tablero = new String[15][15];
		public void generarTablero() {
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 15; j++) {
					tablero[i][j] = "[-]"; // inicializar y dejar en valor blanc en ves que esten null.
				}
			}
		}
			

		public String[][] tableroH = new String[15][15];
		public void genenrartableroH() {
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 15; j++) {
					tableroH[i][j] = "[-]"; // inicializar y dejar en valor blanc en ves que esten null.
			}
			}
		}
		
	public static void victroria() {
		System.out.println();
			System.out.println(ANSI_YELLOW+"F"+ANSI_RESET+ANSI_BLUE+"E"+ANSI_RESET+ANSI_RED+"L"+ANSI_CYAN+"I"+ANSI_RESET+ANSI_GREEN+
					"C"+ANSI_RESET+ANSI_YELLOW+"I"+ANSI_RESET+ANSI_PURPLE+"D"+ANSI_RESET+ANSI_YELLOW+"A"+ANSI_RESET+ANSI_BLUE+
					"D"+ANSI_RESET+ANSI_RED+"E"+ANSI_RESET+ANSI_CYAN+"S"+ANSI_RESET+"\n"
					+ "HAS DERROTADO A LA TROPA PKS\n"
					+ "LA ANARQUIA SE EXIENDE POR OSCARILANDIA FINALMENTE"); ;		
	}
	
	public void graficoVictoria() {
		System.out.println(ANSI_RED+"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣧⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣾⣿⣿⣿⣿⡿⢿⣿⣿⣷⣦⣄⡀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⢀⣴⣿⡿⠟⠋⣿⣿⠙⢿⣿⣆⠀⠈⠙⠻⢿⣿⣦⡀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⣰⣿⡿⠋⠀⠀⢰⣿⡇⠀⠈⢻⣿⣧⠀⠀⠀⠀⠙⢿⣿⣆⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⢰⣿⡟⠁⠀⠀⢀⣿⡿⠀⠀⠀⠀⠻⣿⣷⡀⠀⠀⠀⠈⢻⣿⡆⠀⠀⠀\r\n"
				+ "⠀⠀⠀⣿⣿⠀⠀⠀⠀⣼⣿⠇⠀⠀⠀⠀⠀⠙⣿⣷⣀⣀⣤⣤⣴⣿⣿⣿⠀⠀\r\n"
				+ "⠀⠀⠀⣿⡇⠀⠀⠀⢰⣿⣿⣀⣀⣤⣤⣴⣶⣾⣿⣿⣿⣿⠿⠟⠛⢻⣿⠁⠀⠀\r\n"
				+ "⠀⠀⣠⣿⣿⣤⣴⣶⣿⣿⣿⣿⠿⠿⠟⠛⠋⠉⠉⠈⢻⣿⣦⠀⠀⣿⣿⠀⠀⠀\r\n"
				+ "⠀⠀⠿⢿⣿⣿⡋⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣧⣼⣿⠇⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠹⣿⣷⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣹⣿⣿⣏⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠈⣿⣿⣷⣦⣄⡀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣾⣿⠟⢿⣿⣆⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⣸⣿⡟⠙⠻⢿⣿⣿⣷⣶⣶⣾⣿⣿⡿⠟⠋⠁⠀⠀⢻⣿⣦⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠠⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"+ANSI_RESET);
	}
		

	
	public static void ubicarKromis(String[][] tablero) {
        for (int i = 0; i < 3; i++) {
            int row = random.nextInt(15 - 3 + 1);
            int col = random.nextInt(15);
            while (!validarPosicion(tablero, row, col, 3)) {
                row = random.nextInt(15 - 3 + 1);
                col = random.nextInt(15);
            }
            for (int j = 0; j < 3; j++) {
                tablero[row + j][col] = "["+ANSI_GREEN+"K"+ANSI_RESET+"]";
            }
            int nOc = random.nextInt(20)+5;
            Carro kro1 = new Kromi (nOc, randomFecha(), row, col, randomFecha(), randomMarca());
            pks.add(kro1);
        }
    }
	
	public static void ubicarCaguano(String[][] tablero) {
        for (int i = 0; i < 5; i++) {
            int row = random.nextInt(15);
            int col = random.nextInt(15 - 2 + 1);
            while (!validarPosicion(tablero, row, col, 2)) {
                row = random.nextInt(15);
                col = random.nextInt(15 - 2 + 1);
            }
            for (int j = 0; j < 2; j++) {
            	tablero[row][col + j] = "["+ANSI_BLUE+"C"+ANSI_RESET+"]";
            }
            int nOc = random.nextInt(10)+2;
            int aT = random.nextInt(3)+1;
            Carro caguamo = new Caguano (nOc, randomFecha(), row, col,aT, randomColor());
            pks.add(caguamo);
        }
    }
	
	public static void ubicarTrupalla(String[][] tablero) {
        for (int i = 0; i < 10; i++) {
            int row = random.nextInt(15);
            int col = random.nextInt(15);
            while (!validarPosicion(tablero, row, col, 1)) {
                row = random.nextInt(15-1);
                col = random.nextInt(15-1);
            }
            for (int j = 0; j < 1; j++) {
                tablero[row + j][col] = "["+ANSI_CYAN+"T"+ANSI_RESET+"]";
            }
            int nOc = random.nextInt(2)+1;
            Carro trupalla = new Trupalla (nOc, "15/03/2003", row, col, nOc, randomName());
            pks.add(trupalla);
        }
    }

	private static boolean validarPosicion(String[][] tablero, int row, int col, int size) {
	    // Checkear si esta dentro de los limites del tablero
	    if (row < 0 || row + size > tablero.length || col < 0 || col >= tablero[0].length) {
	        return false;
	    }
	    // Ver si hay algo ya en la ubicacion designada
	    for (int i = 0; i < size; i++) {
	        if (tablero[row + i][col] != "[-]") {
	            return false;
	        }
	    }	    
	    // si no hay drama, todo ok
	    return true;
	}
	
	public static void lanzarHuevo(String tablero [][], String tableroH [][], Scanner scanner) {
	    int x;
	    int y;
	    boolean lanzamientoOk = false;
	    while (lanzamientoOk == false) {
	    	try {
	    		x = askX();
	    		y = askY();
	    		if (tableroH[x][y].equals("["+ANSI_YELLOW+"H"+ANSI_RESET+"]") || tableroH[x][y].equals("["+ANSI_RED+"H"+ANSI_RESET+"]")) {
	    			System.out.println("Ya has lanzado un huevo en esta posicion");
	    			break;
	    		}
	    		scanner.nextLine();
	    		lanzamientoOk = true;
	    		for (int i = 0; i < 10; i++) {
	    			for (int j = 0; j < 1; j++) {
	    				tableroH[x + j][y] = "["+ANSI_YELLOW+"H"+ANSI_RESET+"]";
	    			}
	    		}  
	    		Huevo huevo = new Huevo(x,y);
	    		huevos.add(huevo);
	    		if(tablero[x][y] != "[-]") {
	    			if (tablero[x][y] == "["+ANSI_CYAN+"T"+ANSI_RESET+"]" ) {
	    				System.out.println(ANSI_GREEN+"Le diste a una Trupalla y te la echaste! - 1 punto"+ANSI_RESET);
	    				tableroH[x][y] = "["+ANSI_RED+"H"+ANSI_RESET+"]";
	    				puntaje++;
	    			}
	    			if (tablero[x][y] == "["+ANSI_BLUE+"C"+ANSI_RESET+"]" ) {
	    				System.out.println(ANSI_GREEN+"Le diste a un Caguano! - 2 punto"+ANSI_RESET);
	    				tableroH[x][y] = "["+ANSI_RED+"H"+ANSI_RESET+"]";
	    				puntaje+=2;
	    			}
	    			if (tablero[x][y] == "["+ANSI_GREEN+"K"+ANSI_RESET+"]" ) {
	    				System.out.println(ANSI_GREEN+"Le diste a una Kromi! - 3 punto"+ANSI_RESET);
	    				tableroH[x][y] = "["+ANSI_RED+"H"+ANSI_RESET+"]";
	    				puntaje+=3;
	    			}
	    			mostrarTableroH(tableroH);
	    		}  else {
	    			System.out.println(ANSI_CYAN+"El huevo ha impactado simplemente contra el asfalto.... ");
	    			System.out.println("...puedes escuchar las burlas de los PKS"+ANSI_RESET);
	    			mostrarTableroH(tableroH);	
	    		}
	    	}
	    	catch (Exception e) {
	    		System.out.println("Posicion incorrecta. Debe de ser de 0 a 14");
	    	}

	    }
	}
	
	public static void mostrarTableroPks(String [][] tablero) {
		boolean consentir = false;
		while (consentir == false) {
			System.out.print("Ver el tablero te costara 10pts, desea continuar? (y/n)");
			String ans = scanner.nextLine();
			if(ans.matches("^[yn]$")){
				if (ans.equalsIgnoreCase("y")) {
					System.out.print("tramposo.... supongo te gano la angustia de no darle a nada...aqui tienes");
					System.out.print(ANSI_PURPLE+"\t10 pts han sido restados"+ANSI_RESET);
					puntaje -=10; System.out.println(ANSI_RED+"-10"+ANSI_RESET);
					System.out.println(ANSI_YELLOW+"| 0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 |"+ANSI_RESET);
					for (int x=0; x < tablero.length; x++) {
						System.out.print("|");
						for (int y=0; y < tablero[x].length; y++) {
							System.out.print (tablero[x][y]);
							if (y!=tablero[x].length-1) System.out.print("");
						}
						System.out.println("|"+ANSI_YELLOW+x+ANSI_RESET);
						consentir = true;
					}
				} else {
					if (ans.equalsIgnoreCase("n")) {
						System.out.println("Bien me parece, sin hacer trampas");
						consentir = true;
						break;
					}
				}
			}
		}
		
	}
	
	public static void mostrarTableroH(String[][] tableroH) {
		System.out.println(ANSI_YELLOW+"| 0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 |"+ANSI_RESET);
		for (int x=0; x < tableroH.length; x++) {
			  System.out.print("|");
			  for (int y=0; y < tableroH[x].length; y++) {
			    System.out.print (tableroH[x][y]);
			    if (y!=tableroH[x].length-1) System.out.print("");
			  }
			  System.out.println("|"+ANSI_YELLOW+x+ANSI_RESET);
			}
	}
	
//	public static void mostrarTrupalla(String[][] tablero) {
//	    System.out.println(ANSI_YELLOW+"| 0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 |"+ANSI_RESET);
//	    for (int x=0; x < tablero.length; x++) {
//	        System.out.print("|");
//	        for (int y=0; y < tablero[x].length; y++) {
//	            if (tablero[x][y].contains("T")) {
//	                System.out.print (tablero[x][y]);
//	            } else {
//	                System.out.print ("[ ]");
//	            }
//	            if (y!=tablero[x].length-1) System.out.print("");
//	        }
//	        System.out.println("|"+ANSI_YELLOW+x+ANSI_RESET);
//	    }
//	}
	
	public static void takeALuckyShot(String tablero [][], String tableroH [][]) {
		int x = 0;
		int y= 0;
		while(tableroH[x][y].equals("["+ANSI_YELLOW+"H"+ANSI_RESET+"]") || tableroH[x][y].equals("["+ANSI_RED+"H"+ANSI_RESET+"]"))
			x = random.nextInt(15);
		y = random.nextInt(15);
		tableroH[x][y] = "["+ANSI_YELLOW+"H"+ANSI_RESET+"]";
		Huevo huevo = new Huevo(x,y);
		huevos.add(huevo);
		if(tablero[x][y] != "[-]") {
			if (tablero[x][y] == "["+ANSI_CYAN+"T"+ANSI_RESET+"]" ) {
				System.out.println(ANSI_GREEN+"Le diste a una Trupalla y te la echaste! - 1 punto"+ANSI_RESET);
				tableroH[x][y] = "["+ANSI_RED+"H"+ANSI_RESET+"]";
				puntaje++;
			}
			if (tablero[x][y] == "["+ANSI_BLUE+"C"+ANSI_RESET+"]" ) {
				System.out.println(ANSI_GREEN+"Le diste a un Caguano! - 2 punto"+ANSI_RESET);
				tableroH[x][y] = "["+ANSI_RED+"H"+ANSI_RESET+"]";
				puntaje+=2;
			}
			if (tablero[x][y] == "["+ANSI_GREEN+"K"+ANSI_RESET+"]" ) {
				System.out.println(ANSI_GREEN+"Le diste a una Kromi! - 3 punto"+ANSI_RESET);
				tableroH[x][y] = "["+ANSI_RED+"H"+ANSI_RESET+"]";
				puntaje+=3;
			}
			mostrarTableroH(tableroH);  
			
		}  else {
			System.out.println(ANSI_CYAN+"El huevo ha impactado simplemente contra el asfalto.... ");
			System.out.println("...puedes escuchar las burlas de los PKS"+ANSI_RESET);
			mostrarTableroH(tableroH);	
		}
	}


	
	public static void mostrarDatos() {
		int i = 1;
		for (Carro c:pks) {
			System.out.println(ANSI_WHITE+"----------------- Vehiculo: "+i+" -----------------------"+ANSI_RESET);
			c.inspeccionar();
			i++;
			System.out.println(ANSI_PURPLE+"----------------------------------------------------"+ANSI_RESET);
		}
		
	}
	public static void mostrarHuevos(String tablero [][]) {
		int i = 1;
		for (Huevo h:huevos) {
			System.out.println(ANSI_WHITE+"----------------- Huevo: "+i+" -----------------------"+ANSI_RESET);
			h.mostrarHuevo();
			if (tablero[h.getX()][h.getY()] == "["+ANSI_CYAN+"T"+ANSI_RESET+"]" ) {
	    		System.out.println("Le dio a una Trupalla y se la echo!");
	    		}
	    	if (tablero[h.getX()][h.getY()] == "["+ANSI_BLUE+"C"+ANSI_RESET+"]" ) {
	    		System.out.println("Le dio a un Caguano");
	    	}
	    	if (tablero[h.getX()][h.getY()] == "["+ANSI_GREEN+"K"+ANSI_RESET+"]" ) {
	    		System.out.println("Le dio a una Kromi");
	    	}
			i++;
			System.out.println(ANSI_PURPLE+"----------------------------------------------------"+ANSI_RESET);
		}
		
	}
	
	public static int askX() {
	    int x=-1;
	    boolean preguntaOk = false;
	    while (!preguntaOk) {
	        try {
	            System.out.println("Ingrese la fila (" + ANSI_YELLOW + "--" + ANSI_RESET + ") donde desea lanzar el huevo (de 0 a 14):");
	            String ax = scanner.nextLine();
	            if (!ax.matches("^(1?[0-4]|[0-9])$")) {
	                throw new Exception();
	            }
	            x = Integer.parseInt(ax);
	            preguntaOk = true;
	        } catch (Exception e) {
	            System.out.println("Debe ser un número de 0 a 14, sin letras ni caracteres.");
	            continue;
	        }
	    }
	    return x;
	}
	public static int askY() {
	    int y=-1;
	    boolean preguntaOk = false;
	    while (!preguntaOk) {
	        try {
	            System.out.println("Ingrese la fila (" + ANSI_YELLOW + "--" + ANSI_RESET + ") donde desea lanzar el huevo (de 0 a 14):");
	            String ay = scanner.nextLine();
	            if (!ay.matches("^(1?[0-4]|[0-9])$")) {
	                throw new Exception();
	            }
	            y = Integer.parseInt(ay);
	            preguntaOk = true;
	        } catch (Exception e) {
	            System.out.println("Debe ser un número de 0 a 14, sin letras ni caracteres.");
	            continue;
	        }
	    }
	    return y;
	}
	
	public static String randomName() {
		List<String>names = new ArrayList<String>();
		names.add("Alan Brito Delgado");
		names.add("Marc Ciano");
		names.add("Elmento Lathum");
		names.add("Elza Pato Roto");
		names.add("Lola Mento Mucho");
		
		int randomIndex = random.nextInt(names.size());
		String randomName = names.get(randomIndex);
		
		return randomName;
	}
	
	public static String randomMarca() {
		List<String>marcas = new ArrayList<String>();
		marcas.add("Megcedes Bens");
		marcas.add("Torolla");
		marcas.add("Mitsu Bushi");
		marcas.add("Great GUAL");
		marcas.add("Susuki");
		
		int randomIndex = random.nextInt(marcas.size());
		String randomMarca = marcas.get(randomIndex);
		
		return randomMarca;
	}
	
	public static String randomFecha() {
		List<String>fechas = new ArrayList<String>();
		fechas.add("11/09/78");
		fechas.add("05/04/89");
		fechas.add("21/04/02");
		fechas.add("07/07/93");
		fechas.add("02/10/04");
		fechas.add("02/02/06");
		fechas.add("02/03/12");
		
		int randomIndex = random.nextInt(fechas.size());
		String randomFecha = fechas.get(randomIndex);
		
		return randomFecha;
	}
	
	public static String randomColor() {
		List<String>color = new ArrayList<String>();
		color.add("Verde Vomito");
		color.add("Fanta Devuelta");
		color.add("Amarillo Pus");
		color.add("Negro NoPreguntes");
		color.add("Purpura Venesoso");
		
		int randomIndex = random.nextInt(color.size());
		String randomColor = color.get(randomIndex);
		
		return randomColor;
	}
	


	
	public static final String ANSI_WHITE = "\u001B[37m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";	     
}

	
	
	

