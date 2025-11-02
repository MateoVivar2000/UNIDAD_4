package tikTok;
import java.util.ArrayList;

import poo.ContenidoAudiovisual;

//ATRIBUTOS
public class TikTok extends ContenidoAudiovisual {
	private String tema;
	private ArrayList <Influencer> influencers;


	//CONSTRUCTOR
	public TikTok (String titulo, int duracionEnMinutos, String genero, String tema){
		super(titulo, duracionEnMinutos, genero);
		this.tema = tema;
        this.influencers = new ArrayList<>();
	}
	
	//METODOS
	public void agregarInfluencer (Influencer influencer) {
		this.influencers.add(influencer);
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	//SOBRESCRITURA DE METODO DE LA CLASE PADRE
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); 
        System.out.println("Tema: " + this.tema);
        System.out.println("Influencers involucrados");
        for (Influencer inv : influencers) {
            inv.mostrarInfo();
        }
    }
}
