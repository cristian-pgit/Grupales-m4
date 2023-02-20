package grupal4;

import java.util.Scanner;

public class Grupal4 {

	public static void main (String[]Args) {
		  //Arreglo/Matriz para ingreso y almacenamiento de los datos
		String[][] userData = new String [100][10];
		Scanner sc = new Scanner(System.in);
				
		boolean activo = true; // boolean para servir de interruptor de ciclo while
		while(activo){ //Inicia ciclo while para mantener en repeticion el menu de opciones.
			System.out.println("");
			System.out.println("Bienvenido al Sistema informatico de <<Piker Dans Les Youx>>");
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
				index = 0;
			}

			switch(index){					//Switch permite derivar al usuario a ejecutar un grupo de acciones en especifico, determinadas por su case
			case 1: // Crear alumno
				recArray(userData, sc);
				
				break;
			case 2: //Mostrar Usuarios
				mostrarUsuarios(userData);

				break;
			case 3: //Contar Usuarios por Categoria
				contarUsuariosPorCategoria(userData);
				break;
			case 4: //Modificar Usuario
				int runm = buscarRun(userData, sc);
				modificarUsuario(userData, runm, sc);
				break;
			case 5: //Eliminar Usuario
				int run = buscarRun(userData, sc);
				eliminarUsuario(userData, run, sc);
				nroFila--;
				break;                    
			case 6: //Terminar
				activo = false;
				System.out.println("Un placer haberle ayudado");
				break;
			default:
				System.out.println("OPCIÓN NO VALIDA");
			}
			
		}
		sc.close(); //cierra el scanner.
	}
	static int nroFila =0;
	
	
	public static void recArray(String[][] userData, Scanner sc) {
	    //int i = 0;
	    boolean salida = false;
	    String salir = "";
	    while (!salida) {
	        System.out.print("Desea continuar? (y/n): ");//preguntar por salida.
	        System.out.println("");
	        salir = sc.nextLine();
	        if (salir.equals("y")) {
	            registroUsuario(userData, sc, nroFila);
	            asignarPerfil(userData, sc, nroFila);
	            System.out.println("");
	            System.out.println("***Usuario Creado***");
	            System.out.println("");
	            nroFila++;
	        } else {
	        	if (!isMinTipoPerfil(userData)) {
	                System.out.println("Debe crear al menos uno de cada tipo de perfil");
	                continue;
	            }
	            System.out.println("Saliendo...");
	            salida = true;
	        }
	    }
	}


	
	private static boolean isMinTipoPerfil(String[][] userData) {
		boolean hayCliente = false;
		boolean hayProfesional = false;
		boolean hayAdministrativo = false;
		for (int i=0; i<100;i++) {
			if (hayCliente == false) {
				if (userData[i][3]!= null && !userData[i][3].isEmpty()) {
					hayCliente = true;
					continue;
				}
			}
			
			if (hayProfesional == false) {
				if (userData[i][7]!= null && !userData[i][7].isEmpty()) {
					hayProfesional = true;
					continue;
				}
			}
			if (!hayAdministrativo) {
				if (userData[i][8]!= null && !userData[i][8].isEmpty()) {
					hayAdministrativo = true;
					continue;
					}
			}
			if (hayCliente && hayProfesional && hayAdministrativo) {
				break;
				}
			}
		
		return hayCliente && hayProfesional && hayAdministrativo;
	}
	
	private static int buscarRun(String[][] userData, Scanner sc) {
	    String rune = "";
	    while (true) {
	        System.out.print("Ingrese el RUN del Usuario: ");
	        rune = sc.nextLine();
	        for (int i = 0; i < 100; i++) { // RECORRE EL ARREGLO
	            if (userData[i][2] != null && userData[i][2].equals(rune)) {
	                return i;
	            }
	        }
	        System.out.println("El RUN ingresado no se encontró en el arreglo.");
	    }
	}
	
	private static void eliminarUsuario(String[][] dataUser, int filaAEliminar, Scanner sc) {
	    while (true) {
	        System.out.print("¿Está seguro que desea eliminar el usuario en la fila " + filaAEliminar + "? (y/n): ");
	        String respuesta = sc.nextLine();
	        if (respuesta.equals("y")) {
	            int resto = 100 - (filaAEliminar+1);
	            String[][] auxiliar = new String[resto][10];
	            int contAuxiliar = 0;
	            for (int i= filaAEliminar+1; i<100; i++) {
	                for (int j=0; j<10; j++) {
	                    auxiliar[contAuxiliar][j] = dataUser[i][j]; 
	                }
	                contAuxiliar++;
	            }
	            contAuxiliar = 0;
	            for (int i= filaAEliminar; i<99; i++) {
	                for (int j=0; j<10; j++) {
	                    dataUser[i][j] = dataUser[i+1][j]; 
	                }
	            }
	            for (int j=0; j<10; j++) {
	                dataUser[99][j] = null; 
	            }
	            break;
	        } else if (respuesta.equals("n")) {
	            System.out.println("Eliminación cancelada");
	            break;
	        } else {
	            System.out.println("Respuesta inválida, por favor ingrese 'y' o 'n'");
	        }
	    }
	}

	// Datos Generales
	public static void registroUsuario(String[][] userData, Scanner sc, int i) {   
		System.out.println("Bienvenido al Registro de Usuarios");
		System.out.println("Los campos con * son obligatorios");
		System.out.println("");
		String nom = "";
		boolean ok=false;
		while (!ok) {
			System.out.print("Por favor ingrese Nombre*: ");
			nom = sc.nextLine();
			if (nom.trim().length()<3) {
				System.out.println("no puede estar vacio, ni tener menos de 3 caracteres");
			} else {
				ok=true;
				userData[i][0] = nom;	
			}
		}
		String fecha = "";
		System.out.print("Ingrese Fecha de nacimiento (DD/MM/AAAA): ");
		fecha = sc.nextLine();
		userData[i][1] = fecha;
	
		String run = "";
		boolean runok = false;
		while (!runok) {
			System.out.print("Por favor ingrese RUT*: ");
			run = sc.nextLine().trim();
			if (!run.matches("[1-9]{1}[0-9]{8}")) {
				System.out.println("No puede estar vacio. Necesita tener 9 digitos");
			} else {
				runok = true;
				userData[i][2] = run;	
			}
		}
		//TODO
		/*
		 * ajustar detalles menores visuales.
		 * */
	}
	public static void asignarPerfil(String[][] userData, Scanner sc, int i) {
		boolean activo = true; // Menu para el determinar que tipo de usaurio se ingresa
		while(activo){ 
			System.out.println(" ");
			System.out.println("Favor Eliga el tipo de usuario que esta registrando");
			System.out.println("Ingrese opción");
			System.out.println("1 - Cliente");
			System.out.println("2 - Profesional");
			System.out.println("3 - Administrativo");
			
			int index = 0;
			try{										
				index = Integer.parseInt(sc.nextLine());
			} catch (Exception e){						
				index = 0;
			}
			switch(index){					
			case 1: // Cliente
				pECliente(userData, sc, i);
				activo = false;
				break;
			case 2: //Profesional
				pEProfesional(userData, sc, i);
				activo = false;
				break;
			case 3: //Administrativo
				pEAdministrativo(userData, sc, i);
				activo = false;
				break;
			default:
				System.out.println("OPCIÓN NO VALIDA");
			}
		}
	}

	public static void pECliente(String[][] userData, Scanner sc, int i) { // RELLENADO DE DATOS CLIENTE
		String dir = "";
		boolean dirok = false;
		while (!dirok) {
			System.out.println("Por favor, ingrese una direccion*: ");
			dir = sc.nextLine();
			if (dir.isEmpty() || dir.length()<=3) {
				System.out.println("No puede estar vacio");
			} else {
				dirok=true;
				userData[i][3] = dir;
			}	
		}
		String fono = "";
		boolean fonok = false;
		while (!fonok) {
			System.out.print("Por favor, ingrese un Telefono*: ");
			fono = sc.nextLine();
			if (!fono.matches("[0-9]{8}")) {
				System.out.println("No puede estar vacio. Debe tener 8 digitos");
			} else {
				fonok = true;
				userData[i][4]=fono;
			}
		}
		System.out.print("Cantidad de empleados: ");
		userData[i][5]=sc.nextLine();
	}
	public static void pEProfesional(String[][] userData, Scanner sc, int i) {  // RELLENADO DE DATOS PROFESIONAL 
		System.out.println("Años de experiencia");
		userData[i][6] = sc.nextLine();
		String dept = "";
		boolean depok = false;
		while (!depok) {
			System.out.print("Ingrese Departamento: ");
			dept = sc.nextLine();
			if (dept.length()<=3 || dept.isEmpty()) {
				System.out.println(" no Puede estar vacio");
			} else {
				depok = true;
				userData[i][7] = dept;
			}
		}
	}
	public static void pEAdministrativo(String[][] userData, Scanner sc, int i) {  // RELLENADO DE DATOS ADMIN
	    String func = "";
	    boolean funcok = false;
	    while (!funcok) {
	        System.out.print("Ingrese Funcion que cumple*: ");
	        func = sc.nextLine();
	        if (func.isEmpty() && func.length()<3) {
	            System.out.println("No puede estar vacio");
	        } else {
	        	funcok = true;
	            userData[i][8] = func;
	        }
	    }
	    System.out.println("Nombre de su Superior a cargo: ");
	    userData[i][9] = sc.nextLine();
	}


	public static void mostrarUsuarios(String[][] userData) {
	    System.out.println("Usuarios registrados:");
	    int i = 0;
	    while (i < userData.length && userData[i] != null && userData[i][0] != null && !userData[i][0].isEmpty()) {
	        System.out.println("Usuario " + (i+1) + ":");
	        System.out.println("\t" +"Nombre: "+ userData[i][0]);
	        System.out.println("\t" +"Fecha de Nacimiento: "+ userData[i][1]);
	        System.out.println("\t" +"RUN: "+ userData[i][2]);
	        if (userData[i][3] != null) {
	            System.out.println("\t" +"Direccion: "+ userData[i][3]);
	            System.out.println("\t" +"Telefono: "+ userData[i][4]);
	        }
	        if (userData[i][6] != null) {
	            System.out.println("\t" +"Anos de Experiencia: "+ userData[i][6]);
	            System.out.println("\t" +"Departamento: "+ userData[i][7]);
	        }
	        if (userData[i][8] != null) {
	            System.out.println("\t" +"Funcion: "+ userData[i][8]);
	            System.out.println("\t" +"Persona a Cargo: "+ userData[i][9]);
	        }
	        i++;
	    }
	}




	public static void contarUsuariosPorCategoria(String[][] userData) {
	    int numClientes = 0;
	    int numProfesionales = 0;
	    int numAdministrativos = 0;

	    for (int i = 0; i < userData.length; i++) {
	        if (userData[i][0] != null) { // Si el nombre está lleno, entonces hay un usuario en esta fila
	            if (userData[i][2] != null && userData[i][3] != null) { // Si los campos de dirección y teléfono están llenos, entonces es un cliente
	                numClientes++;
	            } else if (userData[i][7] != null) { // Si el campo de departamento está lleno, entonces es un profesional
	                numProfesionales++;
	            } else if (userData[i][8] != null) { // Si el campo de función está lleno, entonces es un administrativo
	                numAdministrativos++;
	            }
	        }
	    }

	    System.out.println("Resumen de usuarios:");
	    System.out.println("Clientes: " + numClientes);
	    System.out.println("Profesionales: " + numProfesionales);
	    System.out.println("Administrativos: " + numAdministrativos);
	}


	public static void modificarUsuario(String userData[][], int run, Scanner sc) {
		registroUsuario(userData, sc, run);
		asignarPerfil(userData, sc, run);
	}
	
//	boolean encontrado = false;
//	// buscar el usuario por RUN
//	for (int i = 0; i < userData.length; i++) {
//		if (userData[i][0] != null && userData[i][3].equals(run)) {
//			// usuario encontrado, pedir sus nuevos datos
//			Scanner scanner = new Scanner(System.in);
//			System.out.print("Nombre: ");
//			userData[i][0]= sc.nextLine();
//			System.out.print("Fecha de nacimiento: ");
//			userData[i][1]= sc.nextLine();
//			System.out.print("RUN: ");
//			userData[i][3]= sc.nextLine();
//			System.out.print("Dirección: ");
//			userData[i][4]= sc.nextLine();
//			System.out.print("Teléfono: ");
//			userData[i][5]= sc.nextLine();
//			System.out.print("Cantidad de empleados: ");
//			userData[i][6]= sc.nextLine();
//			System.out.print("Años de experiencia: ");
//			userData[i][7]= sc.nextLine();
//			System.out.print("Departamento: ");
//			userData[i][8]= sc.nextLine();
//			System.out.print("Función: ");
//			userData[i][9]= sc.nextLine();
//			System.out.print("Nombre superior: ");
//			userData[i][10]= sc.nextLine();
//
//			encontrado = true;
//			break;
//		}
//	}
//
//	if (!encontrado) {
//		System.out.println("Usuario no encontrado");
//	}
}






