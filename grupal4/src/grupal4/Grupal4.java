package grupal4;

import java.util.Scanner;

public class Grupal4 {

	public static void main (String[]Args) {
		  //Arreglo/Matriz para ingreso y almacenamiento de los datos
		String userData[][] = new String [100][10];
		Scanner sc = new Scanner(System.in);
				
		boolean activo = true; // boolean para servir de interruptor de ciclo while
		while(activo){ //Inicia ciclo while para mantener en repeticion el menu de opciones.
			System.out.println(" ");
			System.out.println("Bienvenido");
			System.out.println("Ingrese opción");
			System.out.println("1 - Registrar Usuario");
			System.out.println("2 - Mostrar Usuarios");
			System.out.println("3 - Contar Usuarios por Categoria");
			System.out.println("4 - Modificar Usuario");
			System.out.println("5 - Eliminar Usuario");
			System.out.println("6 - Salir");
			//Scanner sc = new Scanner(System.in); //abre Scanner para recibir input de consola y recibir la opcion del menu que se desea
			int index = 0;
			try{										//Try and Catch, Intenta recibir el index(opcion), en caso de recibir un ingreso que cause error
				index = Integer.parseInt(sc.nextLine());//sino intenta atrapar el error y lanzar un mensaje al usuario de que la opcion no es valida.
			} catch (Exception e){						//de ahi volveria al loop donde muestra el menu, hasta que eliga una de las opciones validas.
				System.out.println("OPCIÓN NO VALIDA");
			}

			switch(index){					//Switch permite derivar al usuario a ejecutar un grupo de acciones en especifico, determinadas por su case
			case 1: // Crear alumno

				break;
			case 2: //Mostrar Usuarios


				break;
			case 3: //Contar Usuarios por Categoria

				break;
			case 4: //Modificar Usuario
				//modificarUsuario(userData, sc);
				break;
			case 5: //Eliminar Usuario

				break;                    
			case 6: //Terminar
				activo = false;
				break;
			default:
				System.out.println("OPCIÓN NO VALIDA");
			}
			sc.close(); //cierra el scanner.
		}

	}
	public static int recArray() {
		int i;
		for (i=0; i<100; i++);
		for (int j= 0; j <10; j++);
		return i;
	}
	

	// Datos Generales
	public static void Pgeneral(String userData[][], Scanner sc, int i) {   
		System.out.println("Registro de usuario cliente");
		System.out.print("Nombre: ");
		String nom = sc.nextLine();
		while (userData[i][0].isEmpty()) {
			System.out.println("Por favor ingrese nombre");
			nom = sc.nextLine();
			userData[i][0] = nom;
		}
		
		

		System.out.print("Fecha de nacimiento (DD/MM/AAAA): ");
		userData[i][1] = sc.nextLine();
		while (userData[i][1].isEmpty()) {
			System.out.println("Por favor ingrese (DD/MM/AAAA):");
			userData[i][1] = sc.nextLine();
		}
		System.out.print("Ingrese Rut: ");
		userData[i][2] = sc.nextLine();
		while (userData[i][2].isEmpty()) {
			System.out.println("Por favor ingrese Rut:");
			userData[i][2] = sc.nextLine();
		}
	}


	public static void pECliente(String userData[][], int i) { // RELLENADO DE DATOS CLIENTE
		System.out.println("Por favor, ingrese la direccion del cliente");
		Scanner sc = new Scanner(System.in);
		userData[i][3] = sc.nextLine();
		while (userData[i][3].isEmpty()) {					
			System.out.println("Por favor, ingrese una direccion:");
			userData[i][3] = sc.nextLine();
		}
		System.out.println("Telefono:");
		while (userData[i][4].isEmpty()) {
			System.out.println("Por favor, ingrese un telefono:");
			userData[i][4]=sc.nextLine();
		}
		System.out.println("Cantidad de empleados:");
		userData[i][5]=sc.nextLine();
		sc.close();
	}
	public static void pEProfesional(String userData[][], int i) {  // RELLENADO DE DATOS PROFESIONAL 
		System.out.println("Anios de experiencia");
		Scanner sc = new Scanner(System.in);
		userData[i][6] = sc.nextLine();
		System.out.println("Departamento:");
		userData[i][7] = sc.nextLine();
		while (userData[i][7].isEmpty()) {
			System.out.println("Por favor, ingrese un Departamento de trabajo:");
			userData[i][7]=sc.nextLine();
			sc.close();
		}
	}
	public static void pEAdministrativo(String userData[][], int i) {  // RELLENADO DE DATOS ADMIN
		System.out.println("Funcion");
		Scanner sc = new Scanner(System.in);
		userData[i][8] = sc.nextLine();
		System.out.println("Departamento:");
		userData[i][9] = sc.nextLine();
		while (userData[i][9].isEmpty()) {
			System.out.println("Por favor, ingrese un Departamento de trabajo:");
			userData[i][9]=sc.nextLine();
		}
	}

	public static void mostrarUsuarios(String userData[][]){  //MUESTRA TODOS LOS DATOS DE LOS USUARIOS REGISTRADOS
		//EN ORDEN 	
		System.out.println("Usuarios registrados:");
		int i;
		for (i=0;i<100;i++) {		// SE RECORRE EL ARREGLO MIENTRAS SE IMPRIME INFO EN TERMINAL
			int j;
			for (j=0; j<10;j++) {
				if (userData[j][i].isEmpty()) {
				}else{
					System.out.println(userData[i][j]);
				}
			}
		}
	}

	public static void contarUsuariosPorCategoria(String userData[][]) { //CUENTA LOS USUARIOS QUE HAY EN CADA CATEGORIA INGRESADA
		System.out.println("Ingrese un numero, segun corresponda, para contar usuarios con ese criterio:");
		System.out.println("1.- Cliente");
		System.out.println("2.- Profesional");
		System.out.println("3.- Administrativo");
		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();
		int clientes=0;
		int profesionales=0;
		int administrativos=0;
		for (int i=0;i<100;i++) {  //RECORRE EL ARREGLO
			for (int j=0; j<10;j++) {
				if (userData[j][i].isEmpty()) {
				}else{
					if ((j>=3) && (j<=5)){  // CUENTA CLIENTES
						clientes = clientes +1;
					}
					if ((j>=6) && (j<=7)) {  // CUENTA PROFESIONALES
						profesionales=profesionales+1;
					}
					if ((j>=8) && (j<=9)) { // CUENTA ADMINISTRATIVOS
						administrativos=administrativos+1;
					}	
				}
			}
		}
		switch (opcion) {
		case 1:
			System.out.println("Hay"+clientes+" cliente/s ingresado/s");

		case 2:
			System.out.println("Hay"+profesionales+" profesional/es ingresado/s");

		case 3:
			System.out.println("Hay"+administrativos+" administrativo/s ingresado/s");

		}	
		sc.nextLine();
		sc.close();
	}
	public void modificarUsuario(String userData[][], String run, Scanner sc) {
		boolean encontrado = false;
		// buscar el usuario por RUN
		for (int i = 0; i < userData.length; i++) {
			if (userData[i][0] != null && userData[i][3].equals(run)) {
				// usuario encontrado, pedir sus nuevos datos
				Scanner scanner = new Scanner(System.in);
				System.out.print("Nombre: ");
				userData[i][0]= sc.nextLine();
				System.out.print("Fecha de nacimiento: ");
				userData[i][1]= sc.nextLine();
				System.out.print("RUN: ");
				userData[i][3]= sc.nextLine();
				System.out.print("Dirección: ");
				userData[i][4]= sc.nextLine();
				System.out.print("Teléfono: ");
				userData[i][5]= sc.nextLine();
				System.out.print("Cantidad de empleados: ");
				userData[i][6]= sc.nextLine();
				System.out.print("Años de experiencia: ");
				userData[i][7]= sc.nextLine();
				System.out.print("Departamento: ");
				userData[i][8]= sc.nextLine();
				System.out.print("Función: ");
				userData[i][9]= sc.nextLine();
				System.out.print("Nombre superior: ");
				userData[i][10]= sc.nextLine();

				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("Usuario no encontrado");
		}
	}
}






