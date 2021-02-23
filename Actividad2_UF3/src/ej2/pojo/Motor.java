package ej2.pojo;

public class Motor {
	private int id;
	private String tipoMotor;
	private String potencia;
	public int cilindrada;
	public Motor(int id, String tipoMotor, String potencia, int cilindrada) {
	//cambios
		this.id = id;
		this.tipoMotor = tipoMotor;
		this.potencia = potencia;
		this.cilindrada = cilindrada;
		
	}
	
	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
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
