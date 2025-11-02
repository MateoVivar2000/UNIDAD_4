package videoMusical;

public class Artista {
//ATRIBUTOS
	private String nombre;
	private int edad;
	
//CONSTRUCTOR
	public Artista (String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
//METODO
	public void mostrarInfo () {
		System.out.println ("Artista: "+ nombre +" Edad: "+ edad);
	}
}
	