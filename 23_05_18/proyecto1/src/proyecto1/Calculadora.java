package proyecto1;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		int opcion = 0;

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		double numero1, numero2;

		do {
			System.out.println("Menú calculadora");
			System.out.println("__________________________________");
			System.out.println("1. Sumar dos numeros");
			System.out.println("2. Restar dos numeros");
			System.out.println("3. Multiplicar dos numeros");
			System.out.println("4. Dividir dos numeros");
			System.out.println("5. Potencia dos numeros");
			System.out.println("6. Raiz cuadrada de un numeros");
			System.out.println("7. Minimo dos numeros");
			System.out.println("8. Maximo dos numeros");
			System.out.println("9. salir");
			System.out.print("Introduzca opción: ");
			opcion = teclado.nextInt();

			System.out.println("");
			System.out.println("");

			switch (opcion) {
			case 1:
				System.out.print("Introduzca el primer número: ");
				numero1 = teclado.nextDouble();
				System.out.print("Introduzca el segundo número: ");
				numero2 = teclado.nextDouble();
				System.out.println();
				System.out.println("La suma de " + numero1 + "+" + numero2 + " = " + (numero1 + numero2));
				break;
			case 2:
				System.out.print("Introduzca el primer número: ");
				numero1 = teclado.nextDouble();
				System.out.print("Introduzca el segundo número: ");
				numero2 = teclado.nextDouble();
				System.out.println();
				System.out.println("La resta de " + numero1 + "-" + numero2 + " = " + (numero1 - numero2));
				break;
			case 3:
				System.out.print("Introduzca el primer número: ");
				numero1 = teclado.nextDouble();
				System.out.print("Introduzca el segundo número: ");
				numero2 = teclado.nextDouble();
				System.out.println();
				System.out.println("La multiplicación de " + numero1 + "x" + numero2 + " = " + (numero1 * numero2));
				break;
			case 4:
				System.out.print("Introduzca el primer número: ");
				numero1 = teclado.nextDouble();
				System.out.print("Introduzca el segundo número: ");
				numero2 = teclado.nextDouble();
				System.out.println();
				System.out.println("La division de " + numero1 + "/" + numero2 + " = " + (numero1 / numero2));
				break;
			case 5:
				System.out.print("Introduzca el primer número: ");
				numero1 = teclado.nextDouble();
				System.out.print("Introduzca el segundo número: ");
				numero2 = teclado.nextDouble();
				System.out.println();
				System.out.println(numero1 + " elevado a " + numero2 + " = " + Math.pow(numero1, numero2));
				break;
			case 6:
				System.out.print("Introduzca el número: ");
				numero1 = teclado.nextDouble();
				System.out.println();
				System.out.println("La raiz cuadrada de " + numero1 + " es " + Math.sqrt(numero1));
				break;
			case 7:
				System.out.print("Introduzca el primer número: ");
				numero1 = teclado.nextDouble();
				System.out.print("Introduzca el segundo número: ");
				numero2 = teclado.nextDouble();
				System.out.println();
				if(numero1 == numero2)
					System.out.println("Los dos numeros son iguales");
				else
					System.out.println("El menor de " + numero1 + " y " + numero2 + " es " + Math.min(numero1, numero2));
				break;
			case 8:
				System.out.print("Introduzca el primer número: ");
				numero1 = teclado.nextDouble();
				System.out.print("Introduzca el segundo número: ");
				numero2 = teclado.nextDouble();
				System.out.println();
				if(numero1 == numero2)
					System.out.println("Los dos números son iguales");
				else
					System.out.println("El mayor de " + numero1 + " y " + numero2 + " es " + Math.max(numero1, numero2));
				break;
			case 9:
				System.out.println();
				System.out.println("Hasta Luego");
				break;
			default:
				System.out.println();
				System.out.println("Opcíon no valida");
			}

			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();


		} while (opcion != 9);
	}
}
