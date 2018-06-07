import java.util.ArrayList;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<String>();
		// Para añadir valores por teclado
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < 6; i++) {
			System.out.println("Introduzca un contacto en la posicion: " + i);
			lista.add(teclado.next());
		}
		
		lista.remove(5);
		System.out.println();
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

	}

}
