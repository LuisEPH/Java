package cl.generationf20221027;

public class Cliente {
	
	//Atributos
	
	private String Nombre;
	private String Apellido;
	private int Edad;
	private String Rubro;
	private String Idioma;
	
	public Cliente() {
		super();
	}

	public Cliente(String nombre, String apellido, int edad, String rubro, String idioma) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		Edad = edad;
		Rubro = rubro;
		Idioma = idioma;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public String getRubro() {
		return Rubro;
	}

	public void setRubro(String rubro) {
		Rubro = rubro;
	}

	public String getIdioma() {
		return Idioma;
	}

	public void setIdioma(String idioma) {
		Idioma = idioma;
	}

	@Override
	public String toString() {
		return "Cliente [Nombre=" + Nombre + ", Apellido=" + Apellido + ", Edad=" + Edad + ", Rubro=" + Rubro
				+ ", Idioma=" + Idioma + "]";
	}
	
	
	
}
