package serieDeTv;

public class Temporada {
	//ATRIBUTOS
	private int numeroTemporada;
	private int cantidadEpisodios;
	
	//Constructor
	public Temporada (int numeroTemporada, int cantidadEpisodios) {
		this.numeroTemporada = numeroTemporada;
		this.cantidadEpisodios = cantidadEpisodios;
	}
	
	//Métodos
	public void mostrarInfo() {
		System.out.println("Temporada " + numeroTemporada + ":" + cantidadEpisodios + "episodios.");
	}
	

}
