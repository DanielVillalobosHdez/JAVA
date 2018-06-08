public class Autobuses extends Vehiculos{
	
	// Declaramos las variables exclusivas de la clase
	String Compania;
	int Plazas;
	
	public Autobuses(String modelo, String matricula, String marca, String Compania, int Plazas) {
		super(modelo, matricula, marca);
			this.Compania = Compania;
			this.Plazas = Plazas; // Se crea la función que hereda de la padre
	}

	// Se generan los getters and setters
	public String getCompania() {
		return Compania;
	}

	public void setCompania(String compania) {
		Compania = compania;
	}

	public int getPlazas() {
		return Plazas;
	}

	public void setPlazas(int plazas) {
		Plazas = plazas;
	}

	// generamos la función que devuelve los valores
	@Override
	public String toString() {
		return "Autobuses [Compania=" + Compania + ", Plazas=" + Plazas + ", Modelo=" + Modelo + ", Matricula="
				+ Matricula + ", Marca=" + Marca + "]";
	}
	
		
}
