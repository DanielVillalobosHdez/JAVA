public class Coches extends Vehiculos {

	// Declaramos las variables exclusivas de la clase
	
	String DNI;
	boolean Elec;
	
	public Coches(String modelo, String matricula, String marca, String DNI,
	boolean Elec) {
		super(modelo, matricula, marca);  // Se crea la función que hereda de la padre
	}

	
	// Se generan los getters and setters
	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public boolean isElectrico() {
		return Elec;
	}

	public void setElectrico(boolean electrico) {
		Elec = electrico;
	}

	@Override
	
	// generamos la función que devuelve los valores
	public String toString() {
		return "Coches [DNI=" + DNI + ", Electrico=" + Elec + ", Modelo=" + Modelo + ", Matricula=" + Matricula
				+ ", Marca=" + Marca + "]";
	}
	
	
}
