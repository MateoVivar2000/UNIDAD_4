/**
 * Class Pelicula
 */
package pelicula;

import java.util.ArrayList;
import poo.ContenidoAudiovisual;

// Subclase Pelicula extendida de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
	
	//ATRIBUTOS
    private String estudio;
    private ArrayList <Actor> actores; /*private ArrayList -LISTA DE LA CLASE--ACTOR <Actor> actores --NOMBRE DE  LA LISTA;*/
    
//CONSTRUCTOR
    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        //SE LLAMA A LOS ATRIBUTOS DE LA CLASE PADRE (CONTENIDO AUDIOVISUAL)
    	super(titulo, duracionEnMinutos, genero);
    	//INICIALIZA ATRIBUTOS PROPIOS D ELA CLASE PELICULA
        this.estudio = estudio;
        this.actores = new ArrayList<>(); /* INICIALIZA LA LISTA ACTORES*/
    }
    
 //METODOS
    
    //METODO PARA AÑADIR ACTORES
    public void agregarActor (Actor actor) {
    	this.actores.add(actor);
    }

    
    //GETTER Y SETTERS
    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    
    
    //SOBRESCRITURA DE METODO DE LA CLASE PADRE (CONTENIDO AUDIOVISUAL)
    @Override
    public void mostrarDetalles() {
        //LLAMA AL METODO DE LA CLASE PADRE
    	super.mostrarDetalles();
    	//AÑADE INFORMACION D ELA CLASE PELICULA
        System.out.println("Estudio: " + this.estudio);
        //RECORRE TODO EL ARRAY DE ACTOTRES
        for (Actor actor : actores) {
            actor.mostrarInfo();
        }
    }
}