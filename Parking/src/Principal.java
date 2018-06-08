import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		// Creamos las variables de las filas y las columnas
		int fil;
		int col;

		// Creamos la variable que recogera la opción del menu y la recaudación total
		int menu;
		double recaudado = 0;
		int contadorvehiculos;

		// Inicializamos las variables
		fil = 5;
		col = 10;
		menu = 0;
		contadorvehiculos = 0;

		// Creamos la matriz
		char[][] superficie = new char[fil][col];

		// creamos la entrada de texto
		Scanner teclado = new Scanner(System.in);

		// llamamos a las funciones
		CrearSuperficie(superficie, fil, col);

		// Creamos el menu
		do {
			System.out.println("______________________________________");
			System.out.println("|                                    |");
			System.out.println("|X - []      TAQUILLA/JAVA           |");
			System.out.println("|____________________________________|");
			System.out.println("|                                    |");
			System.out.println("|          ************              |");
			System.out.println("|          * TAQUILLA *              |");
			System.out.println("|          ************              |");
			System.out.println("|                                    |");
			System.out.println("|  1) Ver parking                    |");
			System.out.println("|  2) Entrada de un coche            |");
			System.out.println("|  3) Entrada de una moto            |");
			System.out.println("|  4) Entrada de un autobus          |");
			System.out.println("|  5) Salida de un vehiculo          |");
			System.out.println("|  6) Ver recaudación                |");
			System.out.println("|  7) Salir del programa             |");
			System.out.println("|____________________________________|");
			System.out.println();
			System.out.println("Por favor, introduzca una opción: ");

			menu = teclado.nextInt();

			switch (menu) {

			case 1:
				// si la opción es la 1 dibuja la matriz
				DibujarSuperficie(superficie, fil, col);
				break;
			case 2:
				// si la opción es la dos inserta un coche
				// en caso de que las 24 plazas esten cubiertas muestra un mensaje
				if (contadorvehiculos == 24) {
					System.out.println("Parking Lleno");
				} else
					// llama a la función coche y añade 5 a recaudado e incrementa el numero de
					// vehiculos
					Coche(superficie, fil, col, teclado, recaudado);
				contadorvehiculos++;
				break;
			case 3:
				// si la opción es la tres inserta una moto
				// en caso de que las 24 plazas esten cubiertas muestra un mensaje
				if (contadorvehiculos == 24) {
					System.out.println("Parking Lleno");
				} else
					// llama a la función moto y añade 3 a recaudado e incrementa el numero de
					// vehiculos
					Moto(superficie, fil, col, teclado, recaudado);
				recaudado += 3;
				contadorvehiculos++;
				break;
			case 4:
				// si la opción es la cuatro inserta un autobus
				// en caso de que las 24 plazas esten cubiertas muestra un mensaje
				if (contadorvehiculos == 24) {
					System.out.println("Parking Lleno");
				} else
					// llama a la función autobus y añade 10 a recaudado e incrementa el numero de
					// vehiculos
					Autobus(superficie, fil, col, teclado, recaudado);
				recaudado += 10;
				contadorvehiculos++;
				break;
			case 5:
				// si la opción es la cinco sale un vehiculo
				// en caso de que las 24 plazas esten libres muestra un mensaje
				if (contadorvehiculos == 0) {
					System.out.println("Parking Vacio");
				}
				// llamamos a la funcion salir y decrementamos el numero de vehiculos
				Salir(superficie, fil, col, teclado);
				contadorvehiculos--;
				break;
			case 6:
				// llamamos a la función a contabilidad
				System.out.println("La recaudación es: " + recaudado + "€");
				break;
			case 7:
				// muestra el texto y para la ejecución
				System.out.println(" Hasta luego.");
				break;
			default:
				// muestra un mensaje de error
				System.out.println(" Opcion Invalida.");

			}
		} while (menu != 7);
	}

	private static void Coche(char[][] superficie, int fil, int col, Scanner teclado, double pasta) {
		int filaint, columint;

		// Creamos la variables que se heredan y las de la clase
		String Marca, Modelo, Matricula, DNI, Si_no;
		boolean Elec;

		Marca = null;
		Modelo = null;
		Matricula = null;
		DNI = null;

		Si_no = null;

		Elec = false;

		Coches Coche = new Coches(Matricula, Marca, Modelo, DNI, Elec);
		try {
			System.out.println("Introduzca la fila: ");
			filaint = teclado.nextInt();
			System.out.println("Introduzca la fila: ");
			columint = teclado.nextInt();

			if (superficie[filaint][columint] == 'X' || superficie[filaint][columint] == 'P'
					|| superficie[filaint][columint] == 'E' || superficie[filaint][columint] == 'S'
					|| superficie[filaint][columint] == 'C' || superficie[filaint][columint] == 'M'
					|| superficie[filaint][columint] == 'A') {
				System.out.println("Posición invalida");
			} else {
				pasta += 5;
				superficie[filaint][columint] = 'C';
				System.out.println("Matricula: ");
				Coche.Matricula = teclado.next();
				System.out.println("Marca:");
				Coche.Marca = teclado.next();
				System.out.println("Modelo:");
				Coche.Modelo = teclado.next();
				System.out.println("DNI");
				Coche.DNI = teclado.next();
				System.out.println("Es electrico:");
				Si_no = teclado.next();
				if (Si_no == "Si")
					Coche.Elec = true;
				else
					Coche.Elec = false;

			}
		} catch (InputMismatchException error) {
			System.out.println("No introduzca palabras.");
		} catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("Fila o/y columna incorrecta");
		}

		DibujarSuperficie(superficie, fil, col);

	}

	private static void Salir(char[][] superficie, int fil, int col, Scanner teclado) {
		int filaint, columint;
		try {
			System.out.println("Introduzca la fila: ");
			filaint = teclado.nextInt();
			System.out.println("Introduzca la fila: ");
			columint = teclado.nextInt();

			if (superficie[filaint][columint] == 'X' || superficie[filaint][columint] == 'P'
					|| superficie[filaint][columint] == 'E' || superficie[filaint][columint] == 'S') {
				System.out.println("Posición invalida");
			} else {
				superficie[filaint][columint] = ' ';
			}
			
		} catch (InputMismatchException error) {
			System.out.println("No introduzca palabras.");
		} catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("Fila o/y columna incorrecta");
		}
		
		DibujarSuperficie(superficie, fil, col);
	}

	private static void Autobus(char[][] superficie, int fil, int col, Scanner teclado, double pasta) {
		int filaint, columint;

		String Marca, Modelo, Matricula, Compania;
		int Plazas;

		Marca = null;
		Modelo = null;
		Matricula = null;
		Compania = null;

		Plazas = 0;

		Autobuses Autobus = new Autobuses(Matricula, Marca, Modelo, Compania, Plazas);
		try {
			System.out.println("Introduzca la fila: ");
			filaint = teclado.nextInt();
			System.out.println("Introduzca la fila: ");
			columint = teclado.nextInt();

			if (superficie[filaint][columint] == 'X' || superficie[filaint][columint] == 'P'
					|| superficie[filaint][columint] == 'E' || superficie[filaint][columint] == 'S'
					|| superficie[filaint][columint] == 'C' || superficie[filaint][columint] == 'M'
					|| superficie[filaint][columint] == 'A') {
				System.out.println("Posición invalida");
			} else {
				pasta += 10;
				superficie[filaint][columint] = 'A';
				System.out.println("Matricula: ");
				Autobus.Matricula = teclado.next();
				System.out.println("Marca:");
				Autobus.Marca = teclado.next();
				System.out.println("Modelo:");
				Autobus.Modelo = teclado.next();
				System.out.println("Compañia: ");
				Autobus.Compania = teclado.next();
				try {
					System.out.println("Plazas: ");
					Autobus.Plazas = teclado.nextInt();
				} catch (InputMismatchException error) {
					System.out.println("Introduce solo numeros.");
				}

			}
		} catch (InputMismatchException error) {
			System.out.println("No introduzca palabras.");
		} catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("Fila o/y columna incorrecta");
		}

		DibujarSuperficie(superficie, fil, col);

	}

	private static void Moto(char[][] superficie, int fil, int col, Scanner teclado, double pasta) {
		int filaint, columint;

		String Marca, Modelo, Matricula;
		int Cilindrada;

		Marca = null;
		Modelo = null;
		Matricula = null;

		Cilindrada = 0;

		Moto moto = new Moto(Matricula, Marca, Modelo, Cilindrada);
		try {
			System.out.println("Introduzca la fila: ");
			filaint = teclado.nextInt();
			System.out.println("Introduzca la fila: ");
			columint = teclado.nextInt();

			if (superficie[filaint][columint] == 'X' || superficie[filaint][columint] == 'P'
					|| superficie[filaint][columint] == 'E' || superficie[filaint][columint] == 'S'
					|| superficie[filaint][columint] == 'C' || superficie[filaint][columint] == 'M'
					|| superficie[filaint][columint] == 'A') {
				System.out.println("Posición invalida");
			} else {
				pasta += 3;
				superficie[filaint][columint] = 'M';
				System.out.println("Matricula: ");
				moto.Matricula = teclado.next();
				System.out.println("Marca:");
				moto.Marca = teclado.next();
				System.out.println("Modelo:");
				moto.Modelo = teclado.next();
				try {
					System.out.println("Cilindrada: ");
					moto.Cilindrada = teclado.nextInt();
				} catch (InputMismatchException error) {
					System.out.println("Introduce solo numeros.");
				}

			}
		} catch (InputMismatchException error) {
			System.out.println("No introduzca palabras.");
		} catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("Fila o/y columna incorrecta");
		}

		DibujarSuperficie(superficie, fil, col);

	}

	public static void CrearSuperficie(char[][] Parking, int fil, int colum) {

		for (int fila = 0; fila < fil; fila++) {
			for (int columna = 0; columna < colum; columna++) {

				// genera las columnas de las esquinas
				if (fila == 0 || fila == 4) {
					if (columna == 0 || columna == 9) {
						Parking[fila][columna] = 'X';
					}
				}

				// genera la entrada la salida y la columna de la parte izquierda
				Parking[1][0] = 'E';
				Parking[2][0] = 'X';
				Parking[3][0] = 'S';

				// genera las paredes superior e inferior
				if (fila == 0 || fila == 4) {
					if (columna >= 1 && columna <= 8) {
						Parking[fila][columna] = 'P';
					}
				}

				// genero espacios en las posiciones donde van los vehiculos
				if (fila >= 1 && fila <= 3) {
					if (columna >= 1 && columna <= 8) {
						Parking[fila][columna] = ' ';

					}
				}
				// genero la pared de la derecha
				if (fila > 0 && fila < 4) {
					if (columna == 9) {
						Parking[fila][columna] = 'P';
					}
				}
			}
		}
	}

	public static void DibujarSuperficie(char[][] Parking, int fil, int colum) {
		// Imprime la matriz ya generada
		System.out.println("_____________________________________");
		System.out.println();
		for (int fila = 0; fila < fil; fila++) {
			for (int columna = 0; columna < colum; columna++) {
				System.out.print(Parking[fila][columna] + " ");
			}
			System.out.println();
		}
	}

}
