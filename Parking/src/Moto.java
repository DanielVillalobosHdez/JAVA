public class Moto extends Vehiculos {
	
	// Declaramos las variables exclusivas de la clase
	
	int Cilindrada;
	
	public Moto(String modelo, String matricula, String marca, int Cilindrada) {
		super(modelo, matricula, marca);
		this.Cilindrada = Cilindrada; // Se crea la función que hereda de la padre
	}

	// Se generan los getters and setters
	public int getCilindrada() {
		return Cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		Cilindrada = cilindrada;
	}

	// generamos la función que devuelve los valores
	@Override
	public String toString() {
		return "Moto [Cilindrada=" + Cilindrada + ", Modelo=" + Modelo + ", Matricula=" + Matricula + ", Marca=" + Marca
				+ "]";
	}
		
}
