package ej2.pojo;

public class Motor {
	private int id;
	private String tipoMotor;
	private String potencia;
	//Ultimo cambio
	private String marca;
	
	public String getMarca() {
		return marca;
	}

	public Motor(int id, String tipoMotor, String potencia, String marca) {
		this.id = id;
		this.tipoMotor = tipoMotor;
		this.potencia = potencia;
		this.marca = marca;
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipoMotor() {
		return tipoMotor;
	}
	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}
	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	
	
}
