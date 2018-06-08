public class Moto extends Vehiculos {
	
	int Cilindrada;
	
	public Moto(String modelo, String matricula, String marca, int Cilindrada) {
		super(modelo, matricula, marca);
		this.Cilindrada = Cilindrada;
	}

	public int getCilindrada() {
		return Cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		Cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Moto [Cilindrada=" + Cilindrada + ", Modelo=" + Modelo + ", Matricula=" + Matricula + ", Marca=" + Marca
				+ "]";
	}
		
}
