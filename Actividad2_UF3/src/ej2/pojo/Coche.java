package ej2.pojo;

public class Coche {
	private int id;
	private String matricula;
	private String modelo;
	private String marca;
	private int km;
	private double precio;
	private double antiguedad;
//cambios
	Motor potencia;
	
	public Coche(int id, String matricula, String modelo, String marca, int km, double precio, double antiguedad) {
		this.id = id;
		this.matricula = matricula;
		this.modelo = modelo;
		this.marca = marca;
		this.km = km;
		this.precio = precio;
		this.antiguedad = precio;
	}

	public double getAntiguedad() {
		return antiguedad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public Motor getPotencia() {
		return potencia;
	}

	public void setPotencia(Motor potencia) {
		this.potencia = potencia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}

