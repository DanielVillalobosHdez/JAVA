import java.util.Scanner;

public class MenuCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// La opcion es para la eleccion del usuario
		int opcion = 0;
		// num1 y num2 son para los valores con los que operar
		int num1 = 0;
		int num2 = 0;
		int resultado = 0;
		double numero1 = 0, numero2 = 0, resultado2 = 0;

		/*
		 * Crear un objeto de la clase Scanner Para crear un objeto: NombreClase
		 * nombreObjeto = new NombreClase()
		 */
		// Hace que aparezca la rallita parpadeante
		Scanner teclado = new Scanner(System.in);

		do {
			// Menu para elegir varias opciones
			System.out.println("MENU CALCULADORA:");
			System.out.println("------------------------------------");
			System.out.println("1. Sumar 2 numeros");
			System.out.println("2. Restar 2 numeros");
			System.out.println("3. Multiplicar 2 numeros");
			System.out.println("4. Dividir 2 numeros");
			System.out.println("5. Potencia de 2 numeros (base y exp)");
			System.out.println("6. Raiz cuadrada de un numero");
			System.out.println("7. Máximo de 2 numeros");
			System.out.println("8. Mínimo de 2 numeros");
			System.out.println("9. Salir del programa");
			System.out.print("Introduzca opcion: ");
			// Usuario introduce una opcion
			opcion = teclado.nextInt();
			System.out.println();
			// Estudiamos la opcion del usuario
			switch (opcion) {
			case 1:
				num1 = pedirNumeroI(teclado);
				num2 = pedirNumeroI(teclado);
				resultado = sumar(num1, num2);
				System.out.println();
				System.out.println("La suma es: " + resultado);
				break;

			case 2:
				num1 = pedirNumeroI(teclado);
				num2 = pedirNumeroI(teclado);
				resultado = restar(num1, num2);
				System.out.println();
				System.out.println("La resta es: " + resultado);
				break;

			case 3:
				num1 = pedirNumeroI(teclado);
				num2 = pedirNumeroI(teclado);
				resultado = multi(num1, num2);
				System.out.println();
				System.out.println("La multi es: " + resultado);
				break;

			case 4:
				num1 = pedirNumeroI(teclado);
				num2 = pedirNumeroI(teclado);
				resultado = divi(num1, num2);
				System.out.println();
				System.out.println("La divi es: " + resultado);
				break;

			case 5:
				numero1 = pedirNumeroD(teclado);
				numero2 = pedirNumeroD(teclado);
				resultado2 = potencia(numero1, numero2);
				System.out.println();
				System.out.println("El resultado es: " + resultado2);
				break;

			case 6:
				numero1 = pedirNumeroD(teclado); 
				resultado2 = raizC(numero1);
				System.out.println();
				System.out.println("El resultado es: " + resultado2);
				break;
				
			case 7:
				num1 = pedirNumeroI(teclado); 
				num2 = pedirNumeroI(teclado);
				resultado = Math.max(num1, num2);
				System.out.println();
				System.out.println("El maximo es: " + resultado);
				break;
			
			case 8:
				num1 = pedirNumeroI(teclado);
				num2 = pedirNumeroI(teclado);
				resultado = Math.min(num1, num2);
				System.out.println();
				System.out.println("El minimo es: " + resultado);
				break;

			case 9:
				System.out.println("HASTA LUEGO!");
				break;
				
			default:
				System.out.println("Opcion no valida, intente de nuevo");
				break;
			}
			System.out.println();

		} while (opcion != 9);

	}

	private static double pedirNumeroD(Scanner teclado) {
		System.out.print("Introduzca numero: ");
		double num = teclado.nextInt();
		return num;
	}

	private static int pedirNumeroI(Scanner teclado) {
		System.out.print("Introduzca numero: ");
		int num = teclado.nextInt();
		return num;
	}

	private static double raizC(double numero1) {
		return Math.sqrt(numero1);
	}

	private static double potencia(double numero1, double numero2) {
		return Math.pow(numero1, numero2);
	}

	private static int divi(int num1, int num2) {
		return num1/num2;
	}

	private static int multi(int num1, int num2) {
		return num1*num2;
	}

	private static int restar(int num1, int num2) {
		return num1-num2;
	}

	private static int sumar(int num1, int num2) {
		return num1+num2;
	}

}
