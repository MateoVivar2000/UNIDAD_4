package videoMusical;
import java.util.ArrayList;
import poo.ContenidoAudiovisual;

public class VideoMusical extends ContenidoAudiovisual {
	
	//ATRIBUTOS
	private String disquera;
	private ArrayList <Artista> artistas; 

	
	//CONSTRUCTOR
	public VideoMusical(String titulo, int duracionEnMinutos, String genero,String disquera) {
		super(titulo, duracionEnMinutos, genero);
		this.disquera = disquera;
		this.artistas = new ArrayList<>();
	}
	
	//METODOS
	public void agregarArtista (Artista artista) {
		this.artistas.add(artista);
	}

	public String getDisquera() {
		return disquera;
	}

	public void setDisquera(String disquera) {
		this.disquera = disquera;
	}

	//SOBRESCRITURA DE METODO DE LA CLASE PADRE (CONTENIDO AUDIOVISUAL)
    @Override
    public void mostrarDetalles() {
        //LLAMA AL METODO DE LA CLASE PADRE
    	super.mostrarDetalles();
    	//AÑADE INFORMACION DE LA CLASE 
        System.out.println("Disquera: " + this.disquera);
        //RECORRE TODO EL ARRAY DE ACTOTRES
        for (Artista artista : artistas) {
            artista.mostrarInfo();
        }
	
	
}
}
