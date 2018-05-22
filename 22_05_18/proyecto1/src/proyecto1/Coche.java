package proyecto1;

public class coche {
	
	//1. Definir los atributos
	
	String matricula;
	String marca;
	String modelo;
	int año;
	String color;
	double precio;
	char motor; //D-> Diesel, G-> Gasolina, H -> Hibrido, E-> Electrico
	boolean itv; // TRUE -> pasada, FALSE -> sin pasar
		
	//2. Implementar el metodo constructor
	// Público y con el mismo nombre de la clase
	
	public coche(String matricula, String marca, String modelo, int año, String color, double precio, char motor, boolean itv) {
		
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.color = color;
		this.precio = precio;
		this.motor = motor;
		this.itv = itv;
	
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public char getMotor() {
		return motor;
	}

	public void setMotor(char motor) {
		this.motor = motor;
	}

	public boolean isItv() {
		return itv;
	}

	public void setItv(boolean itv) {
		this.itv = itv;
	}

	@Override
	public String toString() {
		return "coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", color="
				+ color + ", precio=" + precio + ", motor=" + motor + ", itv=" + itv + "]";
	}
	
	coche.cocheeric = new coche("1234jvl", "Seat", "Leon", 2013, "Negro", 15624.99, "G", true);
	
	System.out.println(cocheeric.toString());
	
}
