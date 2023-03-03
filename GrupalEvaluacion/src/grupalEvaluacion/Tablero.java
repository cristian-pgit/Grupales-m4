package grupalEvaluacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tablero {
	
		private static List<Carro> pks = new ArrayList<Carro>(18);
		private List<Huevo> huevos = new ArrayList<Huevo>();
		static Random random = new Random();
		
		
	public static void main (String[]Args) {
		
		//Grilla de tablero
		String[][] tablero = new String[15][15];
		for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                tablero[i][j] = "[-]"; // inicializar y dejar en valor blanc en ves que esten null.
            }
        }
		
		
		ubicarKromis(tablero);
		ubicarCaguano(tablero);
		ubicarTrupalla(tablero);
		
		//System.out.print("| ");
		//for (int x=0; x < tablero.length; x++)
		//System.out.print(x+" ");
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

	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_RESET = "\u001B[0m";
	
	
	

}
