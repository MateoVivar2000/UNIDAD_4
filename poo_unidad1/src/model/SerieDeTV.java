package model;

import java.util.ArrayList;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual

//ATRIBUTOS
public class SerieDeTV extends ContenidoAudiovisual {
    private int numTemporadas;
    private ArrayList<Temporada> temporadas;
    
//CONSTRUCTOR
    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int numTemporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.numTemporadas = numTemporadas;
        this.temporadas = new ArrayList<>();
    }
    
 //METODOS
    public void agregarTemporada(Temporada temporada) {
        this.temporadas.add(temporada);
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }
    
    //SOBRESCRITURA DE METODOS
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); 
        System.out.println("Número de temporadas: " + this.numTemporadas);
        System.out.println("Detalle de temporadas:");
        for (Temporada temp : temporadas) {
            temp.mostrarInfo();
        }
    }
}