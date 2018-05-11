package proyecto1;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// tipos de variebles más conocidas
		
		//int numero = 7;
		//int numero2 = 10;
		//double decimal = 9.5;
		//char caracter = 'a';
		//String palabra = "achus";
		//boolean soyhumano = true;
		String alumno = "villalobos";
/*		
		System.out.println("El decimal es:\n" + decimal);
		System.out.println("\n");
		System.out.println("Oscar ha hecho:\t\t" + palabra);
*/
		
/*
		if (numero > 0) {
			System.out.println("Numero mayor que cero");
		} else {
			if (numero == 0) {
				System.out.println("Numero es cero");
			} else {
				System.out.println("Numero menor a cero");
			} 
		} 
*/	
		
/*		
	switch (numero) {
		case 0:
			System.out.println("Es cero");
			break;
		case 1:
			System.out.println("Es uno");
			break;
		case 2: 
			System.out.println("Es dos");
		default:
			System.out.println("Es otro");
			break;
	}	
*/	

/*
	if (numero > 5 && numero2 <= 13) {
		System.out.println("Numero mayor que cero");
	} else {
		System.out.println("El numero es igual o menor que cero");
	}
*/

		
		for(int i = alumno.length()-1; i >= 0; i--) {
			char letra = alumno.charAt(i);
			System.out.println(letra);
		}
  }
}