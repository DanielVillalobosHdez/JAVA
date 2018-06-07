import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int filas = 10;
		int columnas = 10;
		int [][] matriz = new int[filas][columnas];	
		
		int fila=0, columna=0;
		Scanner teclado = new Scanner(System.in);
		
		//inicializar matriz con butacas a 0 y pasillo a 8
		inicializarMatriz(matriz, filas, columnas);
		
		//imprimir la sala del cine (matriz)
		imprimirMatriz(matriz, filas, columnas);
		System.out.println();
		
		//comprar una entrada, es necesario decir fila/columna de la butaca
		comprarEntrada(matriz, fila, columna, teclado);
		
		//imprimir la sala del cine (matriz)
		imprimirMatriz(matriz, filas, columnas);
	}

	private static void comprarEntrada(int[][] matriz, int fila, int columna, Scanner teclado) {
		// Pedir fila/columna al usuario
		try {
			System.out.print("Introduzca fila: ");
			fila = teclado.nextInt();
			System.out.print("Introduzca columna: ");
			columna = teclado.nextInt();
			
			// si la j NO es 8 NI 1
			if ((matriz[fila][columna]==8) || (matriz[fila][columna]==1)) {
				if (matriz[fila][columna]==8) {
					System.out.println("No hay butaca, es pasillo");
				}
				else {
					System.out.println("Esa butaca ya está ocupada");
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
