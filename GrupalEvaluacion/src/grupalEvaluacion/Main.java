/*
 * 
 */
package grupalEvaluacion;

import java.util.InputMismatchException;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {

	/** The board. */
	public static Tablero board = new Tablero();

	/**
	 * The main method.
	 *
	 * @param Args the arguments
	 */
	//funcion main
	public static void main (String[]Args) {
		board.generarTablero(); // genera el tablero seteando el valor default del [-]
		board.genenrartableroH();  // genera el tableroH seteando el valor default del [-]



		board.ubicarKromis(board.tablero); //ubica las Kromis
		board.ubicarCaguano(board.tablero); //ubican los Caguanos
		board.ubicarTrupalla(board.tablero); //ubicar trupallas

		// Menu 
		Scanner sc = new Scanner(System.in); // invocacion del objeto scanner
		boolean keepPlaying = true;
		while (keepPlaying) {
			System.out.println();
			System.out.println(ANSI_GREEN+"Bientenido al Menu de <<Oeuf les flics>>"+"\tTu Puntaje: "+ANSI_RESET+ANSI_CYAN+board.puntaje+ANSI_GREEN);
			System.out.println("Ingrese una opción:\n"
					+ "\t1. Lanzar Huevo\n"
					+ "\t2. Lanzar Huevo a la suerte\n"
					+ "\t3. Mostrar los carros de la PKS\n"
					+ "\t4. Ver info de los Carros PKS\n"
					+ "\t5. Ver los Huevos lanzados\n"
					+ "\t6. Salir"+ANSI_RESET);
			try {
				String op = sc.nextLine();
				if(!op.matches("^[0-6]$")) {
					System.out.println("Valor incorrecto. Intente de nuevo");
					continue;
				}
				int opcion = Integer.parseInt(op);
				switch (opcion) {
				case 1:
					Tablero.lanzarHuevo(board.tablero, board.tableroH, sc);
					break;
				case 2:
					Tablero.takeALuckyShot(board.tablero, board.tableroH);
					break;
				case 3:
					Tablero.mostrarTableroPks(board.tablero);
					break;
				case 4:
					Tablero.mostrarDatos();
					break;
				case 5:
					Tablero.mostrarHuevos(board.tablero);
					break;
				case 6:
					keepPlaying = false;
					System.out.println("Hasta una proxima ocasion...");
					break;
				case 0:
					board.puntaje +=10;
					//board.mostrarTrupalla(board.tablero);
				}
				if (board.puntaje >= 122) {
					board.victroria();
					board.graficoVictoria();
					keepPlaying = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Valor incorrecto. Intente de nuevo");
			}



		}

		sc.close();
	}








	/** The Constant ANSI_WHITE. */
	public static final String ANSI_WHITE = "\u001B[37m";
	
	/** The Constant ANSI_PURPLE. */
	public static final String ANSI_PURPLE = "\u001B[35m";
	
	/** The Constant ANSI_BLUE. */
	public static final String ANSI_BLUE = "\u001B[34m";
	
	/** The Constant ANSI_CYAN. */
	public static final String ANSI_CYAN = "\u001B[36m";
	
	/** The Constant ANSI_GREEN. */
	public static final String ANSI_GREEN = "\u001B[32m";
	
	/** The Constant ANSI_YELLOW. */
	public static final String ANSI_YELLOW = "\u001B[33m";
	
	/** The Constant ANSI_RESET. */
	public static final String ANSI_RESET = "\u001B[0m";
	
	/** The Constant ANSI_RED. */
	public static final String ANSI_RED = "\u001B[31m";	   

}