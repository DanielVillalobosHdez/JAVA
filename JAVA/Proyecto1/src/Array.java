import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Un array es una lista de elementos del mismo tipo
		// a.	Lo creamos vacío añadiendo la capacidad
		String [] contactos = new String[6];
		// b.	Lo creamos con los elementos incluidos
		int [] edades = {19, 20, 26, 21};
		
		// Para añadir valores por teclado
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0; i<contactos.length; i++) {
			System.out.println("Introduzca un contacto en la posicion: "+i);
			contactos[i]=teclado.next();
		}
		
		//mostrar contactos
		for(int i=0; i<contactos.length; i++) {
			System.out.println(contactos[i]);
		}

	}

}
