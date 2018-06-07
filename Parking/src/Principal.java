import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Creamos las variables de las filas y las columnas
		int fil;
		int col;
		
		//Creamos la variable que recogera la opción del menu y la recaudación total
		int menu;
		double recaudado = 0;
		int contadorvehiculos;
		
		//Inicializamos las variables
		fil = 5;
		col = 10;
		menu = 0;
		contadorvehiculos = 0;
		
		//Creamos la matriz
		char [][] superficie = new char [fil][col];
		
		//creamos la entrada de texto
		Scanner teclado = new Scanner(System.in);
		
		//llamamos a las funciones
		CrearSuperficie(superficie, fil, col);
		
	//Creamos el menu
		
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
		
		switch(menu) {
		
		case 1:
			DibujarSuperficie(superficie, fil, col);
			break;
		case 2:
			if(contadorvehiculos==24) {
				System.out.println("Parking Lleno");
			}
			else
			Coche(superficie, fil, col, teclado);
			recaudado+=5;
			contadorvehiculos++;
			break;
		case 3:
			if(contadorvehiculos==24) {
				System.out.println("Parking Lleno");
			}
			else
			Moto(superficie, fil, col, teclado);
			recaudado+=3;
			contadorvehiculos++;
			break;
		case 4:
			if(contadorvehiculos==24) {
				System.out.println("Parking Lleno");
			}
			else
			Autobus(superficie, fil, col, teclado);
			contadorvehiculos++;
			break;
		case 5:
			if(contadorvehiculos==0) {
				System.out.println("Parking Vacio");
			}
			Salir(superficie, fil, col, teclado);
			contadorvehiculos--;
			break;
		case 6:
			Contabilidad(recaudado);
			break;
		case 7:
			System.out.println(" Hasta luego.");
			break;
		default:
			System.out.println(" Opcion Invalida.");
			
	}
	}

	private static void Coche(char[][] superficie, int fil, int col, Scanner teclado) {
		
		
	}

	private static void Contabilidad(double recaudado) {
		
		
	}

	private static void Salir(char[][] superficie, int fil, int col, Scanner teclado) {
		
		
	}

	private static void Autobus(char[][] superficie, int fil, int col, Scanner teclado) {
		
		
	}

	private static void Moto(char[][] superficie, int fil, int col, Scanner teclado) {
		
		
	}

	public static void CrearSuperficie (char [][] Parking, int fil, int colum) {
		
		for(int fila = 0; fila < fil; fila++) {
			for(int columna = 0; columna < colum; columna++) {
				
				
				if(fila == 0 || fila == 4) {
					if(columna == 0 || columna == 9) {
						Parking [fila][columna] = 'X';
					}
				}
				
				Parking[1][0] = 'E';
				Parking[2][0] = 'X';
				Parking[3][0] = 'S';
				
				
				if(fila == 0 || fila == 4) {
					if(columna >= 1 && columna <= 8) {
						Parking [fila][columna] = 'P';
					}
				}
				
				
				if(fila >= 1 && fila <= 3) {
					if(columna >= 1 && columna <= 8) {
						Parking[fila][columna] = ' ';

					}
				}
				if(fila > 0 && fila < 4) {
					if(columna == 9) {
						Parking [fila][columna] = 'P';
					}
				}
			}
		}
	}
	
	public static void DibujarSuperficie(char [][] Parking, int fil, int colum) {
		
		System.out.println("_____________________________________");
		System.out.println();
		for(int fila = 0 ; fila<fil ; fila++) {
			for(int columna=0 ; columna<colum ; columna++) {
				System.out.print(Parking[fila][columna]+" ");
				}
				System.out.println();
			}
	}

}
