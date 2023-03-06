package grupalEvaluacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tablero {
	
		private static List<Carro> pks = new ArrayList<Carro>(18);
		private static  List<Huevo> huevos = new ArrayList<Huevo>();
		static Random random = new Random();
		private static  int puntaje = 0;
		static Scanner scanner = new Scanner(System.in);
		
		//Grilla de tablero
	
		public static void main (String[]Args) {
			
			String[][] tablero = new String[15][15];
			for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                tablero[i][j] = "[-]"; // inicializar y dejar en valor blanc en ves que esten null.
            }
			}
			
			ubicarKromis(tablero);
			ubicarCaguano(tablero);
			ubicarTrupalla(tablero);
			String[][] tableroH = new String[15][15];
			for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                tableroH[i][j] = "[-]"; // inicializar y dejar en valor blanc en ves que esten null.
            }
			}
		
			Scanner sc = new Scanner(System.in);
			boolean keepPlaying = true;
	    	while (keepPlaying) {
	    		System.out.println("Bientenido al Menu de <<Oeuf les flics>>"+"\tTu Puntaje: "+puntaje);
	    		System.out.println("Ingrese una opción:\n"
	                + "\t1. Lanzar Huevo\n"
	                + "\t2. Lanzar Huevo a la suerte\n"
	                + "\t3. Mostrar los carros de la PKS\n"
	                + "\t4. Ver info de los Carros PKS\n"
	                + "\t5. Ver los Huevos lanzados\n"
	                + "\t6. Salir");
	        int opcion = sc.nextInt();
	        switch (opcion) {
	            case 1:
	            	lanzarHuevo(tablero, tableroH, scanner);
	                break;
	            case 2:
	            	takeALuckyShot(tablero, tableroH);
	                break;
	            case 3:
	            	mostrarTableroPks(tablero);
	                break;
	            case 4:
	            	System.out.println(pks);
					break;
	            case 5:
	                System.out.println(huevos);
					break;
	            case 6:
	                keepPlaying = false;
					break;
			}
		}
	    
			//scanner.close();
		}
		

	
	private static void ubicarKromis(String[][] tablero) {
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
            Carro kro1 = new Kromi (15, "15/03/2003", row, col, "25/09/2002", "MegcedesBens");
            pks.add(kro1);
        }
    }
	
	private static void ubicarCaguano(String[][] tablero) {
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
            Carro caguamo = new Caguano (15, "15/03/2003", row, col, 2, "Verde Vomito");
            pks.add(caguamo);
        }
    }
	
	private static void ubicarTrupalla(String[][] tablero) {
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
            Carro trupalla = new Trupalla (15, "15/03/2003", row, col, 3, "Juan");
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
	    
	    boolean lanzamientoOk = false;
	    while (lanzamientoOk == false) {
	    	System.out.println("Ingrese la columna donde desea lanzar el huevo (de 0 a 14):");
		    int x = scanner.nextInt();
		    if (x <= 14) {
		    	System.out.println("Posicion incorrecta. Debe de ser de 0 a 14");
		    }
		    System.out.println("Ingrese la fila donde desea lanzar el huevo (de 0 a 14):");
		    int y = scanner.nextInt();   
		    if (y >= 14) {
		    	System.out.println("Posicion incorrecta. Debe de ser de 0 a 14");
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
		    		System.out.println("Le diste a una Trupalla y te la echaste! - 1 punto");
		    		tableroH[x][y] = "["+ANSI_RED+"H"+ANSI_RESET+"]";
		    		puntaje++;
		    	}
		    	if (tablero[x][y] == "["+ANSI_BLUE+"C"+ANSI_RESET+"]" ) {
		    		System.out.println("Le diste a un Caguano! - 2 punto");
		    		tableroH[x][y] = "["+ANSI_RED+"H"+ANSI_RESET+"]";
		    		puntaje+=2;
		    	}
		    	if (tablero[x][y] == "["+ANSI_GREEN+"K"+ANSI_RESET+"]" ) {
		    		System.out.println("Le diste a una Kromi! - 3 punto");
		    		tableroH[x][y] = "["+ANSI_RED+"H"+ANSI_RESET+"]";
		    		puntaje+=3;
		    	}
		        mostrarTableroH(tableroH);  
		    }  else {
		    	System.out.println("El huevo ha impactado simplemente contra el asfalto.... ");
		    	System.out.println("...puedes escuchar las burlas de los PKS");
		    	mostrarTableroH(tableroH);	
		    }
	    }
	     
	}
	
	public static void mostrarTableroPks(String [][] tablero) {
		System.out.println(ANSI_YELLOW+"| 0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 |"+ANSI_RESET);
		for (int x=0; x < tablero.length; x++) {
			  System.out.print("|");
			  for (int y=0; y < tablero[x].length; y++) {
			    System.out.print (tablero[x][y]);
			    if (y!=tablero[x].length-1) System.out.print("");
			  }
			  System.out.println("|"+ANSI_YELLOW+x+ANSI_RESET);
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
	
	public static void takeALuckyShot(String tablero [][], String tableroH [][]) {
	    
		    int x = random.nextInt(15);
		    int y = random.nextInt(15);
		    tableroH[x][y] = "["+ANSI_YELLOW+"H"+ANSI_RESET+"]";
		    Huevo huevo = new Huevo(x,y);
		    huevos.add(huevo);
		    if(tablero[x][y] != "[-]") {
		    	if (tablero[x][y] == "["+ANSI_CYAN+"T"+ANSI_RESET+"]" ) {
		    		System.out.println("Le diste a una Trupalla y te la echaste! - 1 punto");
		    		tableroH[x][y] = "["+ANSI_RED+"H"+ANSI_RESET+"]";
		    		puntaje++;
		    	}
		    	if (tablero[x][y] == "["+ANSI_BLUE+"C"+ANSI_RESET+"]" ) {
		    		System.out.println("Le diste a un Caguano! - 2 punto");
		    		tableroH[x][y] = "["+ANSI_RED+"H"+ANSI_RESET+"]";
		    		puntaje+=2;
		    	}
		    	if (tablero[x][y] == "["+ANSI_GREEN+"K"+ANSI_RESET+"]" ) {
		    		System.out.println("Le diste a una Kromi! - 3 punto");
		    		tableroH[x][y] = "["+ANSI_RED+"H"+ANSI_RESET+"]";
		    		puntaje+=3;
		    	}
		        mostrarTableroH(tableroH);  
		    }  else {
		    	System.out.println("El huevo ha impactado simplemente contra el asfalto.... ");
		    	System.out.println("...puedes escuchar las burlas de los PKS");
		    	mostrarTableroH(tableroH);	
		    }
	    }
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";	     
}

	
	
	

