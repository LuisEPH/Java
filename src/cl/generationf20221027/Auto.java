package cl.generationf20221027;

public class Auto {
	//atributos
	
	private float velocidad;
	private String marca;
	
	
	//Constructor
	//nos permite instanciar al objeto
	//nos permite inicializar los atributos
	
	//Metodos
	public Auto() {
		super();
	}

	public Auto(String marca, Float velocidad) {
		super();
		this.marca = marca;
		this.velocidad = velocidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Float velocidad) {
		this.velocidad = velocidad;
	}

	//Getters and setters
	
	
	
}
