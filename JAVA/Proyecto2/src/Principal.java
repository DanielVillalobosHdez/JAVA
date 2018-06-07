
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creación de objeto COCHE
		Coche cocheEric = new Coche("1234JVL", "Seat", "Leon", 2013, "Negro", 15624.99, 'G', true);
		Coche cocheAntonio = new Coche("3287CDR", "BMW", "Serie 3", 2017, "Rojo", 35145.86, 'D', false);
		
		System.out.println(cocheEric.precioIva());
		System.out.println("El coche de Antonio tiene:"+cocheAntonio.añoCoche()+" años");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*System.out.println(cocheEric.toString());
		System.out.println(cocheAntonio.toString());
		
		System.out.println("El coche de Eric vale:"+cocheEric.getPrecio());
		System.out.println("El color del coche de Antonio es:"+cocheAntonio.getColor());
		
		cocheEric.setColor("Verde fosforito");
		cocheAntonio.setPrecio(18313.25);
		cocheAntonio.setItv(true);
		
		System.out.println("El color del coche de Eric es:"+cocheEric.getColor());
		System.out.println("El precio del coche de Antonio es:"+cocheAntonio.getPrecio());*/
		
	}

}
