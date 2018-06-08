public class Coches extends Vehiculos {

	String DNI;
	boolean Elec;
	
	public Coches(String modelo, String matricula, String marca, String DNI,
	boolean Elec) {
		super(modelo, matricula, marca);
	}

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
	public String toString() {
		return "Coches [DNI=" + DNI + ", Electrico=" + Elec + ", Modelo=" + Modelo + ", Matricula=" + Matricula
				+ ", Marca=" + Marca + "]";
	}
	
	
}
