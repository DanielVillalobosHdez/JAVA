public class Vehiculos {
	
	
	// declaramos las variables que se heredan
	String Modelo;
	String Matricula;
	String Marca;
	
	
	
	public Vehiculos(String modelo, String matricula, String marca) {
		this.Modelo = modelo;
		this.Matricula = matricula;
		this.Marca = marca;
	}
	
	// realizamos los getters and setters
	
	public String getModelo() {
		return Modelo;
	}
	
	public void setModelo(String modelo) {
		this.Modelo = modelo;
	}
	
	public String getMatricula() {
		return Matricula;
	}
	
	public void setMatricula(String matricula) {
		this.Matricula = matricula;
	}
	
	public String getMarca() {
		return Marca;
	}
	
	public void setMarca(String marca) {
		this.Marca = marca;
	}
	
}
