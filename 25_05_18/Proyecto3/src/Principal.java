import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int fil = 10;
		int cols = 10;
		int [][] matriz = new int[fil][cols];
		int opcion = 0;
		
		int fila=0, columna=0;
		Scanner teclado = new Scanner(System.in);
		
		inicializarMatriz(matriz, fil, cols);
		
		do {
			System.out.println("Menú cines");
			System.out.println("__________________________________");
			System.out.println("1. Ver sala de cine");
			System.out.println("2. Comprar entradas");
			System.out.println("3. Cambiar entradas");
			System.out.println("4. Salir");
			System.out.print("Introduzca opción: ");
			opcion = teclado.nextInt();
			
			switch (opcion) {
			case 1:
				imprimirMatriz(matriz, fil, cols);
				break;
			case 2:
				comprarEntrada(matriz, fila, columna, teclado);
				imprimirMatriz(matriz, fil, cols);
				break;
			case 3:
				devolverEntrada(matriz, fila, columna, teclado);
				imprimirMatriz(matriz, fil, cols);
				break;
			}
		} while (opcion != 4);
	}

	private static void comprarEntrada(int[][] matriz, int fila, int columna, Scanner teclado) {

		try {
			System.out.print("Introduzca fila: ");
			fila = teclado.nextInt();
			System.out.print("Introduzca columna: ");
			columna = teclado.nextInt();
			
			if ((matriz[fila][columna]==8) || (matriz[fila][columna]==1)) {
				if (matriz[fila][columna]==8) {
					System.out.println("No hay butaca, es pasillo");
				}
				else {
					System.out.println("Esa butaca ya esta ocupada");
				}
			}
			else {
				matriz[fila][columna]=1;
			}
		}catch (InputMismatchException error) {
			System.out.println("Ha introducido un valor incorrecto");
		}catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("El valor introducido no es correco");
		}
	}
	
	private static void devolverEntrada(int[][] matriz, int fila, int columna, Scanner teclado) {

		try {
			System.out.print("Introduzca fila: ");
			fila = teclado.nextInt();
			System.out.print("Introduzca columna: ");
			columna = teclado.nextInt();
			
			if ((matriz[fila][columna]==8) || (matriz[fila][columna]==1)) {
				if (matriz[fila][columna]==8) {
					System.out.println("No hay butaca, es pasillo");
				}
				else {
					matriz[fila][columna]=0;
				}
			}
			else {
				System.out.println("Butaca vacia");
			}
		}catch (InputMismatchException error) {
			System.out.println("Ha introducido un valor incorrecto");
		}catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("El valor introducido no es correco");
		}
	}

	private static void imprimirMatriz(int[][] matriz, int filas, int columnas) {
		for(int i=0; i<filas; i++) {
			for (int j=0; j<columnas; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
		
	}

	private static void inicializarMatriz(int[][] matriz, int filas, int columnas) {
		for(int i=0; i<filas; i++) {
			for (int j=0; j<columnas; j++) {
				if ((j==4) || (j==5)) matriz[i][j]=8;
				else matriz[i][j]=0;
			}
		}
	}

	
}
