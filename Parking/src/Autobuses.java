public class Autobuses extends Vehiculos{
	
	String Compania;
	int Plazas;
	
	public Autobuses(String modelo, String matricula, String marca, String Compania, int Plazas) {
		super(modelo, matricula, marca);
			this.Compania = Compania;
			this.Plazas = Plazas;
	}

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

	@Override
	public String toString() {
		return "Autobuses [Compania=" + Compania + ", Plazas=" + Plazas + ", Modelo=" + Modelo + ", Matricula="
				+ Matricula + ", Marca=" + Marca + "]";
	}
	
		
}
