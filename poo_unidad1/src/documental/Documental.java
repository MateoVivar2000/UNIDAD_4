package documental;
import java.util.ArrayList;

import poo.ContenidoAudiovisual;

public class Documental extends ContenidoAudiovisual {
	//ATRIBUTOS DE LA CLASE DOCUMENTAL
    private String tema;
    private ArrayList<Investigador> investigadores;

    //CONSTRUCTOR
    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigadores = new ArrayList<>();
    }
    
    //METODOS
    public void agregarInvestigador(Investigador investigador) {
        this.investigadores.add(investigador);
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
        for (Investigador inv : investigadores) {
            inv.mostrarInfo();
        }
    }
}