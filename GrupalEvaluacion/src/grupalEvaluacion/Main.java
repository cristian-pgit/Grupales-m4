package grupalEvaluacion;

import java.util.Scanner;

public class Main {
	
	public static Tablero board = new Tablero();
	
	public static void main (String[]Args) {
		board.generarTablero();
		board.genenrartableroH();
		
		
				
		board.ubicarKromis(board.tablero);
		board.ubicarCaguano(board.tablero);
		board.ubicarTrupalla(board.tablero);


		Scanner sc = new Scanner(System.in);
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
			int opcion = sc.nextInt();
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
			if (board.puntaje >= 77) {
				board.victroria();
				board.graficoVictoria();
				keepPlaying = false;
			}
		}

		sc.close();
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